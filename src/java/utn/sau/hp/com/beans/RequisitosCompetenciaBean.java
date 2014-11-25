package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import utn.sau.hp.com.dao.RequisitosCompetenciaDao;
import utn.sau.hp.com.modelo.Requisitoscompetencias;

/**
 *
 * @author christian
 */
@ManagedBean(name = "requisitosCompetenciaBean")
@SessionScoped
public class RequisitosCompetenciaBean implements Serializable {
    
    private List<Requisitoscompetencias> listaRequisitosCompetencia;
    private RequisitosCompetenciaDao dao;
    private String idOferta;

    public RequisitosCompetenciaBean() {
        this.dao = new RequisitosCompetenciaDao();
        this.listaRequisitosCompetencia = new ArrayList<Requisitoscompetencias>();
        this.idOferta = "";
    }

    public List<Requisitoscompetencias> getListaRequisitosCompetencia() {  
//        ELContext context = FacesContext.getCurrentInstance().getELContext();	
//        Application apli = FacesContext.getCurrentInstance().getApplication();
//        ExpressionFactory ef = apli.getExpressionFactory( );
//        ValueExpression ve = ef.createValueExpression(context, "#{ofertaBean}",OfertaBean.class);
//        OfertaBean bean = (OfertaBean) ve.getValue(context);             
//        listaRequisitosCompetencia = dao.findByOferta(bean.getOfertaSelec().getId().toString());
        
        //Obtengo el contexto de la aplicación
        ExternalContext contexto = FacesContext.getCurrentInstance().getExternalContext();
        //Referencia de un bean de Session scoped
        OfertaBean of = (OfertaBean) contexto.getSessionMap().get("ofertaBean");
        listaRequisitosCompetencia = dao.findByOferta(of.getOfertaSelec().getId().toString());
        return listaRequisitosCompetencia;
    }

    public void setListaRequisitosCompetencia(List<Requisitoscompetencias> listaRequisitosCompetencia) {
        this.listaRequisitosCompetencia = listaRequisitosCompetencia;
    }  

    public String getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(String idOferta) {
        this.idOferta = idOferta;
    }
    
}

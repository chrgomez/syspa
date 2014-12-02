package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;
import utn.sau.hp.com.dao.RequisitosCompetenciaDao;
import utn.sau.hp.com.modelo.Ofertas;
import utn.sau.hp.com.modelo.Requisitoscompetencias;

/**
 *
 * @author christian
 */
@Named(value = "requisitosCompetenciaBean")
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
        listaRequisitosCompetencia = dao.findByOferta(idOferta);
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
    
    public void onRowSelect(SelectEvent event) {
        idOferta = ((Ofertas) event.getObject()).getId().toString(); 
        //PARA QUE MUESTRE EL MSJ AGREGAR EN EL AJAX rowSeleted update=":formOfertas:msgs"
        FacesMessage msg = new FacesMessage("Oferta ID ", ((Ofertas) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    
}

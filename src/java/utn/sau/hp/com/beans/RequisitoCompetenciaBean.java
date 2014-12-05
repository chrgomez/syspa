package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import utn.sau.hp.com.dao.RequisitosCompetenciaDao;
import utn.sau.hp.com.modelo.Requisitoscompetencias;

/**
 *
 * @author christian
 */
@Named(value = "requisitoCompetenciaBean")
@SessionScoped
public class RequisitoCompetenciaBean implements Serializable {
    
    private List<Requisitoscompetencias> listaRequisitosCompetencia;
    private RequisitosCompetenciaDao dao;
    @Inject
    private OfertaBean oferta;
    
    public RequisitoCompetenciaBean() {
        this.dao = new RequisitosCompetenciaDao();
        this.listaRequisitosCompetencia = new ArrayList<>();
    }

     public List<Requisitoscompetencias> getListaRequisitosCompetencia() {                              
        System.out.println("OFERTA_ID SELECCIONADA "+oferta.getOfertaSelec().getId());
        if(oferta.getOfertaSelec().getId() != null){
            listaRequisitosCompetencia = dao.findByOferta(oferta.getOfertaSelec().getId().toString());        
        }else{
            listaRequisitosCompetencia = new ArrayList<>();
        }
            
        return listaRequisitosCompetencia;
        
    }

    public void setListaRequisitosCompetencia(List<Requisitoscompetencias> listaRequisitosCompetencia) {
        this.listaRequisitosCompetencia = listaRequisitosCompetencia;
    }  
    
}

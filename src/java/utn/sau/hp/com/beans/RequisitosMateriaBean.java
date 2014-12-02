package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;
import utn.sau.hp.com.dao.RequisitosMateriaDao;
import utn.sau.hp.com.modelo.Ofertas;
import utn.sau.hp.com.modelo.Requisitosmaterias;

/**
 *
 * @author christian
 */
@Named(value = "requisitosMateriaBean")
@SessionScoped
public class RequisitosMateriaBean implements Serializable {
    
    private List<Requisitosmaterias> listaRequisitosMateria;
    private RequisitosMateriaDao dao;
    private String idOferta;

    public RequisitosMateriaBean() {
        this.dao = new RequisitosMateriaDao();
        this.listaRequisitosMateria = new ArrayList<Requisitosmaterias>();
        this.idOferta = "";        
    }

    public List<Requisitosmaterias> getListaRequisitosMateria() {                  
        listaRequisitosMateria = dao.findByOferta(idOferta);
        return listaRequisitosMateria;
    }

    public void setListaRequisitosMateria(List<Requisitosmaterias> listaRequisitosCompetencia) {
        this.listaRequisitosMateria = listaRequisitosCompetencia;
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

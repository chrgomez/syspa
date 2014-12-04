package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import utn.sau.hp.com.dao.CarreraDao;
import utn.sau.hp.com.dao.RequisitosMateriaDao;
import utn.sau.hp.com.modelo.Requisitosmaterias;

/**
 *
 * @author christian
 */
@ManagedBean
@Named(value = "requisitoMateriaBean")
@SessionScoped
public class RequisitoMateriaBean implements Serializable {
    
    private List<Requisitosmaterias> listaRequisitosMateria;
    private RequisitosMateriaDao dao;
    private CarreraDao daoCarrera;
    @Inject
    private OfertaBean oferta;
    
    public RequisitoMateriaBean() {
        this.dao = new RequisitosMateriaDao();
        this.listaRequisitosMateria = new ArrayList<Requisitosmaterias>();
    }

     public List<Requisitosmaterias> getListaRequisitosMateria() {                  
        listaRequisitosMateria = dao.findByOferta("1");
        return listaRequisitosMateria;
        
    }

    public void setListaRequisitosMateria(List<Requisitosmaterias> listaRequisitosMaterias) {
         this.listaRequisitosMateria = listaRequisitosMaterias;
    } 
    
    public String findCarreraById(Integer id){
        return daoCarrera.findById(id).getCarrera();
    }
    
}

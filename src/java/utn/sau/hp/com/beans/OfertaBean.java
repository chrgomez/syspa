package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import utn.sau.hp.com.dao.OfertaDao;
import utn.sau.hp.com.modelo.Ofertas;

/**
 *
 * @author christian
 */
@ManagedBean
@Named(value = "ofertaBean")
@SessionScoped
public class OfertaBean implements Serializable {
    
    private Ofertas ofertaSelec;
    private List<Ofertas> listaOfertas;
    private OfertaDao dao;
    private String carreraFilter;
    private String competenciaFilter;
    @Inject
    private LoginBean alumno;
    
    public OfertaBean() {
        this.dao = new OfertaDao();
        this.carreraFilter = "";
        this.competenciaFilter = "";
        this.listaOfertas = new ArrayList<Ofertas>();
        if(this.ofertaSelec == null){
            this.ofertaSelec = new Ofertas();
        }
    }

    public Ofertas getOfertaSelec() {
        return ofertaSelec;
    }

    public void setOfertaSelec(Ofertas ofertaSelec) {
        this.ofertaSelec = ofertaSelec;
    }

    public List<Ofertas> getListaOfertas() {      
        listaOfertas.clear();
        if(carreraFilter.isEmpty() & competenciaFilter.isEmpty()){
            //NO HAY FILTROS
            listaOfertas = dao.findByAll();
        }else{
            //FILTRA POR CARRERA
            if(!carreraFilter.isEmpty() & competenciaFilter.isEmpty()){
                listaOfertas.addAll(dao.findByIdCarrera(carreraFilter));
            }else{
                //FILTRA POR COMPETENCIA
                if(carreraFilter.isEmpty() & !competenciaFilter.isEmpty()){
                    listaOfertas.addAll(dao.findByIdCompetencia(competenciaFilter));
                }else{
                    //FILTRA POR CARRERA Y POR COMPETENCIA
                }
            }
        }
        return listaOfertas;
    }

    public void setListaOfertas(List<Ofertas> listaOfertas) {
        this.listaOfertas = listaOfertas;
    }
    
    public String getCarrerasIdOferta(String id){
        return dao.findByCarrerasIdOferta(id);
    }
    
    public String getCarreraFilter() {
        return carreraFilter;
    }

    public void setCarreraFilter(String carreraFilter) {
        this.carreraFilter = carreraFilter;
    }

    public String getCompetenciaFilter() {
        return competenciaFilter;
    }

    public void setCompetenciaFilter(String competenciaFilter) {
        this.competenciaFilter = competenciaFilter;
    }
    
    public void doFiltrar(String id){
        getListaOfertas();
    }
    
}

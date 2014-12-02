package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import utn.sau.hp.com.dao.OfertaDao;
import utn.sau.hp.com.modelo.Ofertas;

/**
 *
 * @author christian
 */
@Named(value = "ofertaBean")
@SessionScoped
public class OfertaBean implements Serializable {
    
    private Ofertas ofertaSelec;
    private List<Ofertas> listaOfertas;
    private OfertaDao dao;
    private String carreraFilter;
    private String competenciaFilter;
    
    public OfertaBean() {
        this.dao = new OfertaDao();
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
        listaOfertas = dao.findByAll();
//        for (int i = 0; i < listaOfertas.size(); i++) {
//            System.out.println("OFERTA ID: "+listaOfertas.get(i).getId());
//            dao.findByCarrerasIdOferta(listaOfertas.get(i).getId().toString());
//        }
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
    
    public void doFiltrarOfertas(){
        
    }
    
}

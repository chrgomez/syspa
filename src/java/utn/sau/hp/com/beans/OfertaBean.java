package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import utn.sau.hp.com.dao.OfertaDao;
import utn.sau.hp.com.modelo.Ofertas;

/**
 *
 * @author christian
 */
@ManagedBean(name = "ofertaBean")
@SessionScoped
public class OfertaBean implements Serializable {
    
    private Ofertas ofertaSelec;
    private List<Ofertas> listaOfertas;
    private OfertaDao dao;
    
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
        return listaOfertas;
    }

    public void setListaOfertas(List<Ofertas> listaOfertas) {
        this.listaOfertas = listaOfertas;
    }
    
}

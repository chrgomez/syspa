package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import utn.sau.hp.com.dao.LocalidadDao;
import utn.sau.hp.com.dao.OfertaDao;
import utn.sau.hp.com.modelo.Localidades;
import utn.sau.hp.com.modelo.Ofertas;

/**
 *
 * @author christian
 */
@ManagedBean
@Named(value = "localidadBean")
@SessionScoped
public class LocalidadBean implements Serializable {
    
    private Localidades localidad;
    private LocalidadDao dao;
    private List<Localidades> listaLocalidades;
    @Inject
    private LoginBean alumno;
    
     public LocalidadBean() {
        this.localidad = alumno.getUserLoggedIn().getLocalidades();
        this.dao = new LocalidadDao();
        this.listaLocalidades = new ArrayList<Localidades>();
    }

    public Localidades getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidades localidad) {
        this.localidad = localidad;
    }

    public List<Localidades> getListaLocalidades() {
        this.listaLocalidades = dao.selectItems();
        return listaLocalidades;
    }
    
    public void setListaPostulaciones(List<Localidades> listaLocalidades) {
        this.listaLocalidades = listaLocalidades;
    }
    
}

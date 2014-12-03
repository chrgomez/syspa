package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import utn.sau.hp.com.dao.ConvenioDao;
import utn.sau.hp.com.dao.OfertaDao;
import utn.sau.hp.com.modelo.Conveniosparticulares;
import utn.sau.hp.com.modelo.Ofertas;

/**
 *
 * @author christian
 */
@Named(value = "convenioBean")
@SessionScoped
public class ConvenioBean implements Serializable {
    
    private List<Conveniosparticulares> listaConvenios;
    private ConvenioDao dao;
    @Inject
    private LoginBean alumno;

    public ConvenioBean() {
        this.listaConvenios = new ArrayList<Conveniosparticulares>();
        this.dao = new ConvenioDao();
    }

    public List<Conveniosparticulares> getListaConvenios() {
        System.out.println(alumno.getUserLoggedIn().getId().toString());
        this.listaConvenios = dao.findByAlumno(alumno.getUserLoggedIn().getId().toString());
        return listaConvenios;
    }

    public void setListaConvenios(List<Conveniosparticulares> listaConvenios) {
        this.listaConvenios = listaConvenios;
    }
    
    
   
    
 
}

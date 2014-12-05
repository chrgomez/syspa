package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import utn.sau.hp.com.dao.ConvenioDao;
import utn.sau.hp.com.modelo.Conveniosparticulares;

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
    private String fechaFilter;

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

    public String getFechaFilter() {
        return fechaFilter;
    }

    public void setFechaFilter(String fechaFilter) {
        this.fechaFilter = fechaFilter;
    }
    
    public void doFiltrar(){
        getListaConvenios();
    }
}

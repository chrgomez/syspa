/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utn.sau.hp.com.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import utn.sau.hp.com.dao.ConvenioparticularDao;
import utn.sau.hp.com.modelo.Conveniosparticulares;

/**
 *
 * @author Cecilia
 */
@Named (value = "convenioParticularBean")
@SessionScoped
public class ConvenioParticularBean {

    private List<Conveniosparticulares> listaConvenios;
    private ConvenioparticularDao dao;
    private LoginBean alumno;
    
    public ConvenioParticularBean() {
        this.dao = new ConvenioparticularDao();
        this.listaConvenios = new ArrayList<Conveniosparticulares>();
    }

    public List<Conveniosparticulares> getListaConvenios() {
        this.listaConvenios = dao.findByAlumno(alumno.getUserLoggedIn().getId().toString());
        System.out.println(alumno.getUserLoggedIn().getId().toString());
        return listaConvenios;
    }

    public void setListaConvenios(List<Conveniosparticulares> listaConvenios) {
        this.listaConvenios = listaConvenios;
    }
    
    
    
}

package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import utn.sau.hp.com.dao.AlumnoDao;
import utn.sau.hp.com.dao.OfertaDao;
import utn.sau.hp.com.modelo.Alumnos;
import utn.sau.hp.com.modelo.Ofertas;

/**
 *
 * @author christian
 */
@Named(value = "alumnoBean")
@SessionScoped
public class AlumnoBean implements Serializable {
    
    @Inject
    private LoginBean login;
    private Alumnos alumno;
    private AlumnoDao dao;

    public AlumnoBean() {
        this.alumno = new Alumnos();
        this.dao = new AlumnoDao();
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public void doActualizarAlumno(){
        FacesMessage messages;
        if(login.getUserLoggedIn().getApellido().equals("ANONIMO")){
            messages = new FacesMessage(FacesMessage.SEVERITY_INFO, "Advertencia" ,"Usuario no registrado.");
            System.out.println("Usuario no registrado.");
        }else{
            messages = new FacesMessage(FacesMessage.SEVERITY_INFO, "Notificación" ,"Datos actualizados exitosamente.");
            alumno = new Alumnos();
            alumno = login.getUserLoggedIn();
            System.out.println(""+alumno.toString());
            alumno.setTelefono("45");
            dao.actualizarAlumno(alumno);
        }
        FacesContext.getCurrentInstance().addMessage(null, messages);        
    }
    
}
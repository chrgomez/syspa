package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.security.Principal;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;
import utn.sau.hp.com.dao.AlumnoDao;
import utn.sau.hp.com.modelo.Alumnos;

/**
 *
 * @author christian
 */
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable{

    private Alumnos alumno;
    private AlumnoDao dao;
    private static Logger log = Logger.getLogger(LoginBean.class.getName());
    
    public LoginBean() {
        this.dao = new AlumnoDao();
        if(this.alumno == null){
            this.alumno = new Alumnos();
        }
    }       

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }
   
    public void login(ActionEvent event) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message;
        boolean loggedIn;
        
        this.alumno = this.dao.login(this.alumno);
         
        if(this.alumno != null) {
            loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", this.alumno.getApellido()+", "+this.alumno.getNombre());
        } else {
            loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Credensiales Incorrectas");
            if(this.alumno == null){
                this.alumno = new Alumnos();
            }
        }
         
        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);    
    }
    
    public Alumnos getUserLoggedIn() {
        Principal usuP = FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal();
        Alumnos usu = null;
        if (usuP != null) {
            usu = this.dao.login(this.alumno);
        }
        if (usu == null) {
            usu = new Alumnos();
            usu.setApellido("ANONYMOUS");
        }
        return usu;
    }
}

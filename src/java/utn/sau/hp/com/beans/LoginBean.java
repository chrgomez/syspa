package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;
import utn.sau.hp.com.dao.AlumnoDao;
import utn.sau.hp.com.modelo.Alumnos;
import utn.sau.hp.com.util.Routing;

/**
 *
 * @author christian
 */
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable{

    private static Alumnos alumno;
    private AlumnoDao dao;
    private static Logger log = Logger.getLogger(LoginBean.class.getName());
    
    public LoginBean() {
        this.dao = new AlumnoDao();
        if(this.alumno == null){
            this.alumno = new Alumnos();
            this.alumno.setApellido("ANONIMO");
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
        FacesMessage messages;
        boolean loggedIn;
        String ruta = "";
        
        this.alumno = this.dao.login(this.alumno);
         
        if(this.alumno != null) {
            loggedIn = true;
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", this.alumno.getNroLegajo());
            messages = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", this.alumno.getApellido()+", "+this.alumno.getNombre());
            ruta += Routing.baseurl()+"inicio.xhtml";  
            getUserLoggedIn();
        } else {
            loggedIn = false;
            messages = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Credenciales Incorrectas");
            if(this.alumno == null){
                this.alumno = new Alumnos();
            }
        }
         
        FacesContext.getCurrentInstance().addMessage(null, messages);
        context.addCallbackParam("loggedIn", loggedIn);
        context.addCallbackParam("ruta", ruta);
    }
    
    public Alumnos getUserLoggedIn() {
//        Principal alumnoP = FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal();
//        Alumnos usu = null;
//        if (usuP != null) {
//            usu = this.dao.login(this.alumno);
//            System.out.println("USUARIO "+this.alumno.getApellido()+", "+this.alumno.getNombre());
//        }
//        if (usu == null) {
//            usu = new Alumnos();
//            usu.setApellido("ANONYMOUS");
//            System.out.println("ENTRA POR USUARIO NULO!");
//        }
        return alumno;
    }
}

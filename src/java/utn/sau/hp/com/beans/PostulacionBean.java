package utn.sau.hp.com.beans;

import java.io.Serializable;
import java.util.GregorianCalendar;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import utn.sau.hp.com.dao.PostulacionDao;
import utn.sau.hp.com.modelo.Postulaciones;

/**
 *
 * @author christian
 */
@Named(value = "postulacionBean")
@SessionScoped
public class PostulacionBean implements Serializable{
    
    private Postulaciones postulacion;
    @Inject
    private OfertaBean oferta;
    @Inject
    private LoginBean alumno;
    private PostulacionDao dao;

    public PostulacionBean() {
        this.postulacion = new Postulaciones();
        this.dao = new PostulacionDao();
    }

    public Postulaciones getPostulacion() {
        return postulacion;
    }

    public void setPostulacion(Postulaciones postulacion) {
        this.postulacion = postulacion;
    }
    
    public void doNuevaPostulacion(){
        FacesMessage messages;
        if(alumno.getUserLoggedIn().getApellido().equals("ANONIMO")){
            messages = new FacesMessage(FacesMessage.SEVERITY_INFO, "Advertencia" ,"Usuario no registrado.");
            System.out.println("Usuario no registrado.");
        }else{
            messages = new FacesMessage(FacesMessage.SEVERITY_INFO, "Notificación" ,"Postulación registrada exitosamente.");
            postulacion.setAlumnos(alumno.getUserLoggedIn());
            postulacion.setOfertas(oferta.getOfertaSelec());
            postulacion.setFechaPostulacion(GregorianCalendar.getInstance().getTime());
            postulacion.setFechaSeleccion(GregorianCalendar.getInstance().getTime());
            postulacion.setCumpleRequisitosAcademicos(Byte.MIN_VALUE);
            dao.nuevaPostulacion(postulacion);
        }
        FacesContext.getCurrentInstance().addMessage(null, messages);        
    }
    
}

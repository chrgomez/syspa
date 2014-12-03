package utn.sau.hp.com.beans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author christian
 */
@Named(value = "fileUploadBean")
@SessionScoped
public class FileUploadBean implements Serializable {

    private UploadedFile cv;
    
    public FileUploadBean() {
    }   
 
    public UploadedFile getFile() {
        return cv;
    }
 
    public void setFile(UploadedFile file) {
        this.cv = file;
    }
     
    public void upload() {
        if(cv != null) {
            FacesMessage message = new FacesMessage("Exitosamente a actualizado su CV. ", cv.getFileName());
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
}

package utn.sau.hp.com.beans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.primefaces.model.menu.MenuModel;
/**
 *
 * @author christian
 */
@Named(value = "menuBarBean")
@SessionScoped
public class MenuBarBean implements Serializable {
    
    private MenuModel model;
    
    public MenuBarBean() {       
   }
    
    public MenuModel getModel() {
       return model;
   }
        
}

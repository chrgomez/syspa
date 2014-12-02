package utn.sau.hp.com.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import utn.sau.hp.com.util.Routing;

/**
 *
 * @author christian
 */
@Named(value = "appBean")
@ApplicationScoped
public class AppBean {

    public AppBean() {
    }
    
    public String getBaseURL(){
        return Routing.baseurl();
    }
    
}

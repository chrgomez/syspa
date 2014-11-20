package utn.sau.hp.com.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import utn.sau.hp.com.util.Routing;

/**
 *
 * @author christian
 */
@ManagedBean(name = "appBean")
@ApplicationScoped
public class AppBean {

    public AppBean() {
    }
    
    public String getBaseURL(){
        return Routing.baseurl();
    }
    
}

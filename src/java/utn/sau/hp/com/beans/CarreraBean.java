package utn.sau.hp.com.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import utn.sau.hp.com.dao.CarreraDao;
import utn.sau.hp.com.dao.EmpresaDao;
import utn.sau.hp.com.modelo.Carreras;
import utn.sau.hp.com.modelo.Empresas;


/**
 *
 * @author christian
 */
@ManagedBean
@RequestScoped
public class CarreraBean {

    private List<SelectItem> selectOneItemCarrera ;
    private Carreras selectCarrera;

    public CarreraBean() {
    }

    public List<SelectItem> getSelectOneItemCarrera() {
        this.selectOneItemCarrera = new ArrayList<SelectItem>();
        CarreraDao dao = new CarreraDao();
        List<Carreras> carreras = dao.selectItems();
        for(Carreras e : carreras){
            SelectItem s = new SelectItem(e.getId(), e.getCarrera());
            this.selectOneItemCarrera.add(s);
        }
        return selectOneItemCarrera;
    }

    public Carreras getSelectCarrera() {
        return selectCarrera;
    }
    
}

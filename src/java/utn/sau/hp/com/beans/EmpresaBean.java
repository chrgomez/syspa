package utn.sau.hp.com.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import utn.sau.hp.com.dao.EmpresaDao;
import utn.sau.hp.com.modelo.Empresas;


/**
 *
 * @author christian
 */
@ManagedBean
@RequestScoped
public class EmpresaBean {

    private List<SelectItem> selectOneItemEmpresa ;
    private Empresas selectEmpresa;

    public EmpresaBean() {
    }

    public List<SelectItem> getSelectOneItemEmpresa() {
        this.selectOneItemEmpresa = new ArrayList<SelectItem>();
        EmpresaDao dao = new EmpresaDao();
        List<Empresas> empresas = dao.selectItems();
        for(Empresas e : empresas){
            SelectItem s = new SelectItem(e.getId(), e.getEmpresaRazonSocial());
            this.selectOneItemEmpresa.add(s);
        }
        return selectOneItemEmpresa;
    }

    public Empresas getSelectEmpresa() {
        return selectEmpresa;
    }
    
}

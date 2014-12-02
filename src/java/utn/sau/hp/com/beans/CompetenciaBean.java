package utn.sau.hp.com.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import utn.sau.hp.com.dao.CompetenciaDao;
import utn.sau.hp.com.dao.EmpresaDao;
import utn.sau.hp.com.modelo.Competencias;
import utn.sau.hp.com.modelo.Empresas;


/**
 *
 * @author christian
 */
@ManagedBean
@RequestScoped
public class CompetenciaBean {

    private List<SelectItem> selectOneItemCompetencia ;
    private Competencias selectCompetencia;

    public CompetenciaBean() {
    }

    public List<SelectItem> getSelectOneItemCompetencia() {
        this.selectOneItemCompetencia = new ArrayList<SelectItem>();
        CompetenciaDao dao = new CompetenciaDao();
        List<Competencias> competencias = dao.selectItems();
        for(Competencias e : competencias){
            SelectItem s = new SelectItem(e.getId(), e.getCompetenciaNombre());
            this.selectOneItemCompetencia.add(s);
        }
        return selectOneItemCompetencia;
    }

    public Competencias getSelectCompetencia() {
        return selectCompetencia;
    }
    
}

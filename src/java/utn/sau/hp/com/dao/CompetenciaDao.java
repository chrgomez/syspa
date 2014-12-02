package utn.sau.hp.com.dao;

import java.util.List;
import org.hibernate.Session;
import utn.sau.hp.com.modelo.Competencias;
import utn.sau.hp.com.util.HibernateUtil;

/**
 *
 * @author christian
 */
public class CompetenciaDao {
    
    public List<Competencias> selectItems(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Competencias";
        try{
            List<Competencias> listado = s.createQuery(sql).list();
            return listado;
        }catch(Exception e){
            return null;
        }
    }
    
}

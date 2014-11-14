package utn.sau.hp.com.dao;

import java.util.List;
import org.hibernate.Session;
import utn.sau.hp.com.modelo.Empresas;
import utn.sau.hp.com.util.HibernateUtil;

/**
 *
 * @author christian
 */
public class EmpresaDao {
    
    public List<Empresas> selectItems(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Empresas";
        try{
            List<Empresas> listado = s.createQuery(sql).list();
            return listado;
        }catch(Exception e){
            return null;
        }
    }
    
}

package utn.sau.hp.com.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import utn.sau.hp.com.modelo.Empresas;
import utn.sau.hp.com.modelo.Localidades;
import utn.sau.hp.com.util.HibernateUtil;

/**
 *
 * @author M-Cecilia
 */
public class LocalidadDao {
    
    public List<Localidades> selectItems(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Localidades";
        try{
            List<Localidades> listado = s.createQuery(sql).list();
            return listado;
        }catch(HibernateException e){
            System.out.println("Error LocolidadDao"+e);
            return null;
        }
    }
    
}

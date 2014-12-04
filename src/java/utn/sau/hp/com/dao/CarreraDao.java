package utn.sau.hp.com.dao;

import java.util.List;
import org.hibernate.Session;
import utn.sau.hp.com.modelo.Carreras;
import utn.sau.hp.com.util.HibernateUtil;

/**
 *
 * @author christian
 */
public class CarreraDao {
    
    public List<Carreras> selectItems(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM Carreras";
        try{
            List<Carreras> listado = s.createQuery(sql).list();
            return listado;
        }catch(Exception e){
            return null;
        }
    }
    
    public Carreras findById(Integer id){
        Session s = HibernateUtil.getSessionFactory().openSession();        
        try{            
            return (Carreras) s.get(Carreras.class, id);
        }catch(Exception e){
            return null;
        }
    }
    
}

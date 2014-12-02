package utn.sau.hp.com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import utn.sau.hp.com.modelo.Postulaciones;
import utn.sau.hp.com.util.HibernateUtil;

/**
 *
 * @author christian
 */
public class PostulacionDao {
   
    public void nuevaPostulacion(Postulaciones p) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        try{            
            s.save(p);
        }catch(HibernateException he){
            System.out.println("Error PostulacionDao nuevaPostulacion " +he);
        }finally{
            s.close();
        }
    }
    
}

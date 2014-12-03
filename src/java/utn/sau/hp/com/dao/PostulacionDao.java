package utn.sau.hp.com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
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
            Transaction tx = s.beginTransaction();
            s.save(p);            
            tx.commit();
        }catch(HibernateException he){
            System.out.println("Error PostulacionDao nuevaPostulacion " +he);
        }finally{
            s.close();
        }
    }
    
}

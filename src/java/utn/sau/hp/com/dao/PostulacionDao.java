package utn.sau.hp.com.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utn.sau.hp.com.modelo.Alumnos;
import utn.sau.hp.com.modelo.Ofertas;
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
    
    public boolean checkPostulacion(Alumnos a, Ofertas o) {
        List<Postulaciones> lista = new ArrayList();
        Session s = HibernateUtil.getSessionFactory().openSession();
        String consulta = "SELECT p FROM Postulaciones p "
                + "INNER JOIN p.alumnos a "
                + "INNER JOIN p.ofertas o "
                + "WHERE a.id = "+a.getId()+" AND "+"o.id = "+o.getId();
        try {           
            lista = s.createQuery(consulta).list();                       
        } catch (Exception e) {
            System.out.println("Error OfertaDao checkPostulacion "+e);
        }finally{
            s.close();
        }
        if(lista.isEmpty()){
                return false;                
            }else{
                return true;
            }
    }
    
}

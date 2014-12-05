package utn.sau.hp.com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utn.sau.hp.com.modelo.Alumnos;
import utn.sau.hp.com.util.HibernateUtil;

/**
 *
 * @author christian
 */
public class AlumnoDao {
    
    public Alumnos findByLegajo(Alumnos alu){
        Alumnos a = new Alumnos();
        Session s = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Alumnos a left join fetch a.localidades l "
                + "WHERE nroLegajo = "+alu.getNroLegajo();
        try {           
            a = (Alumnos) s.createQuery(consulta).uniqueResult();           
            if(a==null){
                System.out.println("NO ENCONTRO UN ALUMNO");                
            }
        } catch (Exception e) {
            System.out.println("Error findByLegajo "+e);
        }finally{
            s.close();
        }
        return a;
    }
    
    public Alumnos login(Alumnos alu){
        Alumnos alumno = new Alumnos();
        alumno = findByLegajo(alu);
        if(alumno != null){
            System.out.println(alumno.getApellido()+", "+alumno.getNombre());
            if(!alumno.getPassword().equals(alu.getPassword())){
                alumno = null; 
            }                
        }        
        return alumno;
    }
    public void actualizarAlumno(Alumnos a) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        try{  
            Transaction tx = s.beginTransaction();
            s.merge(a);
            tx.commit();
        }catch(HibernateException he){
            System.out.println("Error AlumnoDao ActualizarAlumno " +he);
        }finally{
            s.close();
        }
    }
}

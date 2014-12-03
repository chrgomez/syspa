package utn.sau.hp.com.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import utn.sau.hp.com.modelo.Carreras;
import utn.sau.hp.com.modelo.Ofertas;
import utn.sau.hp.com.util.HibernateUtil;

/**
 *
 * @author christian
 */
public class OfertaDao {
    
    public List<Ofertas> findByAll(){
        List<Ofertas> lista = new ArrayList();
        Session s = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Ofertas o left join fetch o.empresas";
        try {           
            lista = s.createQuery(consulta).list();                       
        } catch (Exception e) {
            System.out.println("Error OfertaDao findByAll "+e);
        }finally{
            s.close();
        }
        if(lista.isEmpty()){
                return null;                
            }else{
                return lista;
            }
    }
    
    public String findByCarrerasIdOferta(String id){
        List<Carreras> lista = new ArrayList();
        Session s = HibernateUtil.getSessionFactory().openSession();
        String consulta = "SELECT c " +
            "FROM  Ofertascarreras oc " +
            "INNER JOIN oc.ofertas o " +
            "INNER JOIN oc.carreras c " +
            "WHERE o.id = "+id;
        try {           
            lista = s.createQuery(consulta).list();                       
        } catch (Exception e) {
            System.out.println("Error OfertaDao findByCarrerasIdOferta "+e);
        }finally{
            s.close();
        }
        if(lista.isEmpty()){
                return null;                
            }else{
                String carreras = "";
                for (int i = 0; i < lista.size(); i++) {
                    carreras += lista.get(i).getCarrera()+" - " ;                                    
                }
                System.out.println("CARRERAS: "+carreras.substring(0, carreras.length()-3));
                return carreras.substring(0, carreras.length()-3);
            }
    }
    
    public List<Ofertas> findByIdCarrera(String id){
        List<Ofertas> lista = new ArrayList();
        Session s = HibernateUtil.getSessionFactory().openSession();
        String consulta = "SELECT o " +
            "FROM  Ofertascarreras oc " +
            "INNER JOIN oc.ofertas o " +
            "INNER JOIN oc.carreras c " +
            "WHERE c.id = "+id;
        try {           
            lista = s.createQuery(consulta).list();                       
        } catch (Exception e) {
            System.out.println("Error OfertaDao findByIdCarrera "+e);
        }finally{
            s.close();
        }
        if(lista.isEmpty()){
                return null;                
            }else{
                return lista;
            }
    }
    
    
}

package utn.sau.hp.com.dao;

import java.util.ArrayList;
import java.util.GregorianCalendar;
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
            for (int i = 0; i < lista.size(); i++) {
               if (lista.get(i).getOfertaVigenciaHasta().before(GregorianCalendar.getInstance().getTime())) 
                    lista.remove(i);
            }
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
        if (id != null) {
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
        }
        if(lista.isEmpty()){
                return "Todas las carreras";                
            }else{
                String carreras = "";
                for (int i = 0; i < lista.size(); i++) {
                   carreras += lista.get(i).getCarrera()+" - " ;                                    
                }
//                System.out.println("CARRERAS: "+carreras.substring(0, carreras.length()-3));
                return carreras.substring(0, carreras.length()-3);
            }
    }

    public List<Ofertas> findByIdCarrera(String id){
        List<Ofertas> lista = new ArrayList();
        Session s = HibernateUtil.getSessionFactory().openSession();
        String consulta = "SELECT o " +
            "FROM  Ofertascarreras oc " +
            "INNER JOIN oc.ofertas o " +
            "INNER JOIN oc.carreras c left join fetch o.empresas " +
            "WHERE c.id = "+id;
        try {           
            lista = s.createQuery(consulta).list();
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getOfertaVigenciaHasta().before(GregorianCalendar.getInstance().getTime())) 
                    lista.remove(i);
            }
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
    
    public List<Ofertas> findByIdCompetencia(String id){
        List<Ofertas> lista = new ArrayList();
        Session s = HibernateUtil.getSessionFactory().openSession();
        String consulta = "SELECT o " +
            "FROM Requisitoscompetencias rc " +
            "INNER JOIN rc.ofertas o " +
            "INNER JOIN rc.competencias c left join fetch o.empresas " +
            "WHERE c.id = "+id;
        try {           
            lista = s.createQuery(consulta).list(); 
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getOfertaVigenciaHasta().before(GregorianCalendar.getInstance().getTime())) 
                    lista.remove(i);
            }
        } catch (Exception e) {
            System.out.println("Error OfertaDao findByIdCompetencia "+e);
        }finally{
            s.close();
        }
        if(lista.isEmpty()){
                System.out.println("findByIdCompetencia lista null o vacia");
                return null;                
            }else{
                System.out.println("findByIdCompetencia size "+lista.size());
                return lista;
            }
    }
    
}

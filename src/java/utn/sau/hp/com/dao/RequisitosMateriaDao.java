package utn.sau.hp.com.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import utn.sau.hp.com.modelo.Requisitosmaterias;
import utn.sau.hp.com.util.HibernateUtil;

/**
 *
 * @author christian
 */
public class RequisitosMateriaDao {
    
    public List<Requisitosmaterias> findByOferta(String idOferta){
        List<Requisitosmaterias> lista = new ArrayList();
        Session s = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Requisitosmaterias r left join fetch r.materias m "
                + "left join fetch r.ofertascarreras oc left join fetch oc.carreras c "
                + "WHERE r.ofertascarreras.ofertas.id = "+idOferta;
        try {           
            lista = s.createQuery(consulta).list();                       
        } catch (Exception e) {
            System.out.println("Error RequisitosMateriaDao findByOferta "+e);
        }finally{
            s.close();
        }
        if(lista.isEmpty()){
                System.out.println("No se encontraron materias para la oferta seleccionada");
                return null;                
            }else{                
                System.out.println("cant materias requeridas: "+lista.size());
                return lista;
            }
    }
    
}

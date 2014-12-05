package utn.sau.hp.com.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import utn.sau.hp.com.modelo.Requisitoscompetencias;
import utn.sau.hp.com.util.HibernateUtil;

/**
 *
 * @author christian
 */
public class RequisitosCompetenciaDao {
    
    public List<Requisitoscompetencias> findByOferta(String idOferta){
        List<Requisitoscompetencias> lista = new ArrayList();
        Session s = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Requisitoscompetencias r left join fetch r.competencias c left join fetch c.areas "
                + " WHERE r.ofertas.id = "+idOferta;
        try {              
            lista = s.createQuery(consulta).list();                       
        } catch (Exception e) {
            System.out.println("Error RequisitosCompetenciaDao findByOferta "+e);
        }finally{
            s.close();
        }
        if(lista.isEmpty()){
                return null;                
            }else{
                System.err.println("CONSULTA "+consulta);
                System.out.println("Cant Requisitos Competencia OFERTA ID "+idOferta+" CANTIDAD "+lista.size());
                System.out.println("cant competencias requeridas: "+lista.size());
                return lista;
            }
    }
    
}

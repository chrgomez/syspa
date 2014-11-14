package utn.sau.hp.com.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
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
            System.out.println("Error findByAll "+e);
        }finally{
            s.close();
        }
        if(lista.isEmpty()){
                System.out.println("NO HAY OFERTAS");
                return null;                
            }else{
                System.out.println("LISTAR OFERTAS");
//                for(int i=0; i<lista.size(); i++){
//                    Hibernate.initialize(lista.get(i).getEmpresas());
//                }
                return lista;
            }
    }
    
}

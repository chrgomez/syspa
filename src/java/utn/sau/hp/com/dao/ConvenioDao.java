/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utn.sau.hp.com.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import utn.sau.hp.com.modelo.Conveniosparticulares;
import utn.sau.hp.com.util.HibernateUtil;

/**
 *
 * @author Cecilia
 */
public class ConvenioDao {
    
    
       public List<Conveniosparticulares> findByAlumno(String id){
        List<Conveniosparticulares> lista = new ArrayList();
        Session s = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Conveniosparticulares c left join fetch c.alumnos a left join fetch c.empresas e "
                + "WHERE a.id ="+id;
        try {           
            lista = s.createQuery(consulta).list();
        } catch (HibernateException e) {
            System.out.println("Error ConvenioDao findByAlumno "+e);
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

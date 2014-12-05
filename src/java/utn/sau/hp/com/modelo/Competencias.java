package utn.sau.hp.com.modelo;
// Generated 04/12/2014 23:31:51 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Competencias generated by hbm2java
 */
public class Competencias  implements java.io.Serializable {


     private Integer id;
     private Areas areas;
     private String competenciaNombre;
     private Set requisitoscompetenciases = new HashSet(0);

    public Competencias() {
    }

	
    public Competencias(Areas areas, String competenciaNombre) {
        this.areas = areas;
        this.competenciaNombre = competenciaNombre;
    }
    public Competencias(Areas areas, String competenciaNombre, Set requisitoscompetenciases) {
       this.areas = areas;
       this.competenciaNombre = competenciaNombre;
       this.requisitoscompetenciases = requisitoscompetenciases;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Areas getAreas() {
        return this.areas;
    }
    
    public void setAreas(Areas areas) {
        this.areas = areas;
    }
    public String getCompetenciaNombre() {
        return this.competenciaNombre;
    }
    
    public void setCompetenciaNombre(String competenciaNombre) {
        this.competenciaNombre = competenciaNombre;
    }
    public Set getRequisitoscompetenciases() {
        return this.requisitoscompetenciases;
    }
    
    public void setRequisitoscompetenciases(Set requisitoscompetenciases) {
        this.requisitoscompetenciases = requisitoscompetenciases;
    }




}



package utn.sau.hp.com.modelo;
// Generated 04/12/2014 23:31:51 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Carreras generated by hbm2java
 */
public class Carreras  implements java.io.Serializable {


     private int id;
     private String carrera;
     private Set materiases = new HashSet(0);
     private Set areases = new HashSet(0);
     private Set ofertascarrerases = new HashSet(0);
     private Set conveniosparticulareses = new HashSet(0);

    public Carreras() {
    }

	
    public Carreras(int id, String carrera) {
        this.id = id;
        this.carrera = carrera;
    }
    public Carreras(int id, String carrera, Set materiases, Set areases, Set ofertascarrerases, Set conveniosparticulareses) {
       this.id = id;
       this.carrera = carrera;
       this.materiases = materiases;
       this.areases = areases;
       this.ofertascarrerases = ofertascarrerases;
       this.conveniosparticulareses = conveniosparticulareses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getCarrera() {
        return this.carrera;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public Set getMateriases() {
        return this.materiases;
    }
    
    public void setMateriases(Set materiases) {
        this.materiases = materiases;
    }
    public Set getAreases() {
        return this.areases;
    }
    
    public void setAreases(Set areases) {
        this.areases = areases;
    }
    public Set getOfertascarrerases() {
        return this.ofertascarrerases;
    }
    
    public void setOfertascarrerases(Set ofertascarrerases) {
        this.ofertascarrerases = ofertascarrerases;
    }
    public Set getConveniosparticulareses() {
        return this.conveniosparticulareses;
    }
    
    public void setConveniosparticulareses(Set conveniosparticulareses) {
        this.conveniosparticulareses = conveniosparticulareses;
    }




}



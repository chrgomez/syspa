package utn.sau.hp.com.modelo;
// Generated 04/12/2014 23:31:51 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Localidades generated by hbm2java
 */
public class Localidades  implements java.io.Serializable {


     private Integer id;
     private Departamentos departamentos;
     private String nombre;
     private Set empresases = new HashSet(0);
     private Set firmanteses = new HashSet(0);
     private Set alumnoses = new HashSet(0);

    public Localidades() {
    }

	
    public Localidades(Departamentos departamentos) {
        this.departamentos = departamentos;
    }
    public Localidades(Departamentos departamentos, String nombre, Set empresases, Set firmanteses, Set alumnoses) {
       this.departamentos = departamentos;
       this.nombre = nombre;
       this.empresases = empresases;
       this.firmanteses = firmanteses;
       this.alumnoses = alumnoses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Departamentos getDepartamentos() {
        return this.departamentos;
    }
    
    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getEmpresases() {
        return this.empresases;
    }
    
    public void setEmpresases(Set empresases) {
        this.empresases = empresases;
    }
    public Set getFirmanteses() {
        return this.firmanteses;
    }
    
    public void setFirmanteses(Set firmanteses) {
        this.firmanteses = firmanteses;
    }
    public Set getAlumnoses() {
        return this.alumnoses;
    }
    
    public void setAlumnoses(Set alumnoses) {
        this.alumnoses = alumnoses;
    }




}



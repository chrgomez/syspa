package utn.sau.hp.com.modelo;
// Generated 13/11/2014 15:37:16 by Hibernate Tools 3.6.0



/**
 * Requisitosmaterias generated by hbm2java
 */
public class Requisitosmaterias  implements java.io.Serializable {


     private Integer id;
     private Materias materias;
     private Ofertascarreras ofertascarreras;
     private String requisitoMateriaCondicion;

    public Requisitosmaterias() {
    }

    public Requisitosmaterias(Materias materias, Ofertascarreras ofertascarreras, String requisitoMateriaCondicion) {
       this.materias = materias;
       this.ofertascarreras = ofertascarreras;
       this.requisitoMateriaCondicion = requisitoMateriaCondicion;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Materias getMaterias() {
        return this.materias;
    }
    
    public void setMaterias(Materias materias) {
        this.materias = materias;
    }
    public Ofertascarreras getOfertascarreras() {
        return this.ofertascarreras;
    }
    
    public void setOfertascarreras(Ofertascarreras ofertascarreras) {
        this.ofertascarreras = ofertascarreras;
    }
    public String getRequisitoMateriaCondicion() {
        return this.requisitoMateriaCondicion;
    }
    
    public void setRequisitoMateriaCondicion(String requisitoMateriaCondicion) {
        this.requisitoMateriaCondicion = requisitoMateriaCondicion;
    }




}



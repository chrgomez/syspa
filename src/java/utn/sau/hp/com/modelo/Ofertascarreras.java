package utn.sau.hp.com.modelo;
// Generated 13/11/2014 15:37:16 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Ofertascarreras generated by hbm2java
 */
public class Ofertascarreras  implements java.io.Serializable {


     private int id;
     private Carreras carreras;
     private Ofertas ofertas;
     private Set requisitosmateriases = new HashSet(0);

    public Ofertascarreras() {
    }

	
    public Ofertascarreras(int id, Carreras carreras, Ofertas ofertas) {
        this.id = id;
        this.carreras = carreras;
        this.ofertas = ofertas;
    }
    public Ofertascarreras(int id, Carreras carreras, Ofertas ofertas, Set requisitosmateriases) {
       this.id = id;
       this.carreras = carreras;
       this.ofertas = ofertas;
       this.requisitosmateriases = requisitosmateriases;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Carreras getCarreras() {
        return this.carreras;
    }
    
    public void setCarreras(Carreras carreras) {
        this.carreras = carreras;
    }
    public Ofertas getOfertas() {
        return this.ofertas;
    }
    
    public void setOfertas(Ofertas ofertas) {
        this.ofertas = ofertas;
    }
    public Set getRequisitosmateriases() {
        return this.requisitosmateriases;
    }
    
    public void setRequisitosmateriases(Set requisitosmateriases) {
        this.requisitosmateriases = requisitosmateriases;
    }




}



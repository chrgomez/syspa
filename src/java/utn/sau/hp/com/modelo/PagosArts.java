package utn.sau.hp.com.modelo;
// Generated 04/12/2014 23:31:51 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * PagosArts generated by hbm2java
 */
public class PagosArts  implements java.io.Serializable {


     private Integer id;
     private Conveniosparticulares conveniosparticulares;
     private Date periodo;
     private Date fechapago;

    public PagosArts() {
    }

    public PagosArts(Conveniosparticulares conveniosparticulares, Date periodo, Date fechapago) {
       this.conveniosparticulares = conveniosparticulares;
       this.periodo = periodo;
       this.fechapago = fechapago;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Conveniosparticulares getConveniosparticulares() {
        return this.conveniosparticulares;
    }
    
    public void setConveniosparticulares(Conveniosparticulares conveniosparticulares) {
        this.conveniosparticulares = conveniosparticulares;
    }
    public Date getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }
    public Date getFechapago() {
        return this.fechapago;
    }
    
    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }




}



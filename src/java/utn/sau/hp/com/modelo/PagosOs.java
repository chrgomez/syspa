package utn.sau.hp.com.modelo;
// Generated 04/12/2014 23:31:51 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * PagosOs generated by hbm2java
 */
public class PagosOs  implements java.io.Serializable {


     private Integer id;
     private Conveniosparticulares conveniosparticulares;
     private Date fechapago;
     private Date periodo;

    public PagosOs() {
    }

    public PagosOs(Conveniosparticulares conveniosparticulares, Date fechapago, Date periodo) {
       this.conveniosparticulares = conveniosparticulares;
       this.fechapago = fechapago;
       this.periodo = periodo;
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
    public Date getFechapago() {
        return this.fechapago;
    }
    
    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }
    public Date getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }




}



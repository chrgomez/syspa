package utn.sau.hp.com.modelo;
// Generated 04/12/2014 23:31:51 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Estadocuentas generated by hbm2java
 */
public class Estadocuentas  implements java.io.Serializable {


     private Integer id;
     private Empresas empresas;
     private Date periodo;
     private Long nroMovimiento;
     private Character tipoMovimiento;
     private Long importe;
     private Date fecha;

    public Estadocuentas() {
    }

	
    public Estadocuentas(Empresas empresas, Date periodo) {
        this.empresas = empresas;
        this.periodo = periodo;
    }
    public Estadocuentas(Empresas empresas, Date periodo, Long nroMovimiento, Character tipoMovimiento, Long importe, Date fecha) {
       this.empresas = empresas;
       this.periodo = periodo;
       this.nroMovimiento = nroMovimiento;
       this.tipoMovimiento = tipoMovimiento;
       this.importe = importe;
       this.fecha = fecha;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Empresas getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }
    public Date getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }
    public Long getNroMovimiento() {
        return this.nroMovimiento;
    }
    
    public void setNroMovimiento(Long nroMovimiento) {
        this.nroMovimiento = nroMovimiento;
    }
    public Character getTipoMovimiento() {
        return this.tipoMovimiento;
    }
    
    public void setTipoMovimiento(Character tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
    public Long getImporte() {
        return this.importe;
    }
    
    public void setImporte(Long importe) {
        this.importe = importe;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}



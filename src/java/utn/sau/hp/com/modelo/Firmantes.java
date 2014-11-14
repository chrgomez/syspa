package utn.sau.hp.com.modelo;
// Generated 13/11/2014 15:37:16 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Firmantes generated by hbm2java
 */
public class Firmantes  implements java.io.Serializable {


     private Integer id;
     private Anexos anexos;
     private Empresas empresas;
     private long firmanteCuil;
     private long empresaCuit;
     private String firmanteNombre;
     private String firmanteApellido;
     private String firmanteTelefono;
     private String firmanteDireccion;
     private String firmanteCorreo;
     private String firmanteCargo;
     private Date firmanteFechaBaja;
     private Integer firmanteDni;

    public Firmantes() {
    }

	
    public Firmantes(Anexos anexos, Empresas empresas, long firmanteCuil, long empresaCuit, String firmanteNombre, String firmanteApellido) {
        this.anexos = anexos;
        this.empresas = empresas;
        this.firmanteCuil = firmanteCuil;
        this.empresaCuit = empresaCuit;
        this.firmanteNombre = firmanteNombre;
        this.firmanteApellido = firmanteApellido;
    }
    public Firmantes(Anexos anexos, Empresas empresas, long firmanteCuil, long empresaCuit, String firmanteNombre, String firmanteApellido, String firmanteTelefono, String firmanteDireccion, String firmanteCorreo, String firmanteCargo, Date firmanteFechaBaja, Integer firmanteDni) {
       this.anexos = anexos;
       this.empresas = empresas;
       this.firmanteCuil = firmanteCuil;
       this.empresaCuit = empresaCuit;
       this.firmanteNombre = firmanteNombre;
       this.firmanteApellido = firmanteApellido;
       this.firmanteTelefono = firmanteTelefono;
       this.firmanteDireccion = firmanteDireccion;
       this.firmanteCorreo = firmanteCorreo;
       this.firmanteCargo = firmanteCargo;
       this.firmanteFechaBaja = firmanteFechaBaja;
       this.firmanteDni = firmanteDni;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Anexos getAnexos() {
        return this.anexos;
    }
    
    public void setAnexos(Anexos anexos) {
        this.anexos = anexos;
    }
    public Empresas getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }
    public long getFirmanteCuil() {
        return this.firmanteCuil;
    }
    
    public void setFirmanteCuil(long firmanteCuil) {
        this.firmanteCuil = firmanteCuil;
    }
    public long getEmpresaCuit() {
        return this.empresaCuit;
    }
    
    public void setEmpresaCuit(long empresaCuit) {
        this.empresaCuit = empresaCuit;
    }
    public String getFirmanteNombre() {
        return this.firmanteNombre;
    }
    
    public void setFirmanteNombre(String firmanteNombre) {
        this.firmanteNombre = firmanteNombre;
    }
    public String getFirmanteApellido() {
        return this.firmanteApellido;
    }
    
    public void setFirmanteApellido(String firmanteApellido) {
        this.firmanteApellido = firmanteApellido;
    }
    public String getFirmanteTelefono() {
        return this.firmanteTelefono;
    }
    
    public void setFirmanteTelefono(String firmanteTelefono) {
        this.firmanteTelefono = firmanteTelefono;
    }
    public String getFirmanteDireccion() {
        return this.firmanteDireccion;
    }
    
    public void setFirmanteDireccion(String firmanteDireccion) {
        this.firmanteDireccion = firmanteDireccion;
    }
    public String getFirmanteCorreo() {
        return this.firmanteCorreo;
    }
    
    public void setFirmanteCorreo(String firmanteCorreo) {
        this.firmanteCorreo = firmanteCorreo;
    }
    public String getFirmanteCargo() {
        return this.firmanteCargo;
    }
    
    public void setFirmanteCargo(String firmanteCargo) {
        this.firmanteCargo = firmanteCargo;
    }
    public Date getFirmanteFechaBaja() {
        return this.firmanteFechaBaja;
    }
    
    public void setFirmanteFechaBaja(Date firmanteFechaBaja) {
        this.firmanteFechaBaja = firmanteFechaBaja;
    }
    public Integer getFirmanteDni() {
        return this.firmanteDni;
    }
    
    public void setFirmanteDni(Integer firmanteDni) {
        this.firmanteDni = firmanteDni;
    }




}



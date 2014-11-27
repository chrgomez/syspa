package utn.sau.hp.com.modelo;
// Generated 13/11/2014 15:37:16 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Empresas generated by hbm2java
 */
public class Empresas  implements java.io.Serializable {


     private Integer id;
     private long empresaCuit;
     private int idLocalidade;
     private Date convenioFecha;
     private Integer porcentajeGasto;
     private String empresaRazonSocial;
     private String empresaActividad;
     private String empresaDireccion;
     private String empresaCorreo;
     private String empresaTelefono;
     private String contactoNombre;
     private String contactoTelefono;
     private String contactoCorreo;
     private String representanteNombre;
     private Long representanteDni;
     private boolean pagaObraSocial;
     private boolean pagaSeguroTrabajo;
     private boolean pagaAsignacionEstimulo;
     private Date convenioFechaBaja;
     private String motivoBaja;
     private String password;
     private byte[] archivoCm;
     private Set estadocuentases = new HashSet(0);
     private Set ofertases = new HashSet(0);
     private Set anexoses = new HashSet(0);
     private Set conveniosparticulareses = new HashSet(0);
     private Set firmanteses = new HashSet(0);

    public Empresas() {
    }

	
    public Empresas(long empresaCuit, int idLocalidade, Date convenioFecha, String empresaRazonSocial, boolean pagaObraSocial, boolean pagaSeguroTrabajo, boolean pagaAsignacionEstimulo) {
        this.empresaCuit = empresaCuit;
        this.idLocalidade = idLocalidade;
        this.convenioFecha = convenioFecha;
        this.empresaRazonSocial = empresaRazonSocial;
        this.pagaObraSocial = pagaObraSocial;
        this.pagaSeguroTrabajo = pagaSeguroTrabajo;
        this.pagaAsignacionEstimulo = pagaAsignacionEstimulo;
    }
    public Empresas(long empresaCuit, int idLocalidade, Date convenioFecha, Integer porcentajeGasto, String empresaRazonSocial, String empresaActividad, String empresaDireccion, String empresaCorreo, String empresaTelefono, String contactoNombre, String contactoTelefono, String contactoCorreo, String representanteNombre, Long representanteDni, boolean pagaObraSocial, boolean pagaSeguroTrabajo, boolean pagaAsignacionEstimulo, Date convenioFechaBaja, String motivoBaja, String password, byte[] archivoCm, Set estadocuentases, Set ofertases, Set anexoses, Set conveniosparticulareses, Set firmanteses) {
       this.empresaCuit = empresaCuit;
       this.idLocalidade = idLocalidade;
       this.convenioFecha = convenioFecha;
       this.porcentajeGasto = porcentajeGasto;
       this.empresaRazonSocial = empresaRazonSocial;
       this.empresaActividad = empresaActividad;
       this.empresaDireccion = empresaDireccion;
       this.empresaCorreo = empresaCorreo;
       this.empresaTelefono = empresaTelefono;
       this.contactoNombre = contactoNombre;
       this.contactoTelefono = contactoTelefono;
       this.contactoCorreo = contactoCorreo;
       this.representanteNombre = representanteNombre;
       this.representanteDni = representanteDni;
       this.pagaObraSocial = pagaObraSocial;
       this.pagaSeguroTrabajo = pagaSeguroTrabajo;
       this.pagaAsignacionEstimulo = pagaAsignacionEstimulo;
       this.convenioFechaBaja = convenioFechaBaja;
       this.motivoBaja = motivoBaja;
       this.password = password;
       this.archivoCm = archivoCm;
       this.estadocuentases = estadocuentases;
       this.ofertases = ofertases;
       this.anexoses = anexoses;
       this.conveniosparticulareses = conveniosparticulareses;
       this.firmanteses = firmanteses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public long getEmpresaCuit() {
        return this.empresaCuit;
    }
    
    public void setEmpresaCuit(long empresaCuit) {
        this.empresaCuit = empresaCuit;
    }
    public int getIdLocalidade() {
        return this.idLocalidade;
    }
    
    public void setIdLocalidade(int idLocalidade) {
        this.idLocalidade = idLocalidade;
    }
    public Date getConvenioFecha() {
        return this.convenioFecha;
    }
    
    public void setConvenioFecha(Date convenioFecha) {
        this.convenioFecha = convenioFecha;
    }
    public Integer getPorcentajeGasto() {
        return this.porcentajeGasto;
    }
    
    public void setPorcentajeGasto(Integer porcentajeGasto) {
        this.porcentajeGasto = porcentajeGasto;
    }
    public String getEmpresaRazonSocial() {
        return this.empresaRazonSocial;
    }
    
    public void setEmpresaRazonSocial(String empresaRazonSocial) {
        this.empresaRazonSocial = empresaRazonSocial;
    }
    public String getEmpresaActividad() {
        return this.empresaActividad;
    }
    
    public void setEmpresaActividad(String empresaActividad) {
        this.empresaActividad = empresaActividad;
    }
    public String getEmpresaDireccion() {
        return this.empresaDireccion;
    }
    
    public void setEmpresaDireccion(String empresaDireccion) {
        this.empresaDireccion = empresaDireccion;
    }
    public String getEmpresaCorreo() {
        return this.empresaCorreo;
    }
    
    public void setEmpresaCorreo(String empresaCorreo) {
        this.empresaCorreo = empresaCorreo;
    }
    public String getEmpresaTelefono() {
        return this.empresaTelefono;
    }
    
    public void setEmpresaTelefono(String empresaTelefono) {
        this.empresaTelefono = empresaTelefono;
    }
    public String getContactoNombre() {
        return this.contactoNombre;
    }
    
    public void setContactoNombre(String contactoNombre) {
        this.contactoNombre = contactoNombre;
    }
    public String getContactoTelefono() {
        return this.contactoTelefono;
    }
    
    public void setContactoTelefono(String contactoTelefono) {
        this.contactoTelefono = contactoTelefono;
    }
    public String getContactoCorreo() {
        return this.contactoCorreo;
    }
    
    public void setContactoCorreo(String contactoCorreo) {
        this.contactoCorreo = contactoCorreo;
    }
    public String getRepresentanteNombre() {
        return this.representanteNombre;
    }
    
    public void setRepresentanteNombre(String representanteNombre) {
        this.representanteNombre = representanteNombre;
    }
    public Long getRepresentanteDni() {
        return this.representanteDni;
    }
    
    public void setRepresentanteDni(Long representanteDni) {
        this.representanteDni = representanteDni;
    }
    public boolean isPagaObraSocial() {
        return this.pagaObraSocial;
    }
    
    public void setPagaObraSocial(boolean pagaObraSocial) {
        this.pagaObraSocial = pagaObraSocial;
    }
    public boolean isPagaSeguroTrabajo() {
        return this.pagaSeguroTrabajo;
    }
    
    public void setPagaSeguroTrabajo(boolean pagaSeguroTrabajo) {
        this.pagaSeguroTrabajo = pagaSeguroTrabajo;
    }
    public boolean isPagaAsignacionEstimulo() {
        return this.pagaAsignacionEstimulo;
    }
    
    public void setPagaAsignacionEstimulo(boolean pagaAsignacionEstimulo) {
        this.pagaAsignacionEstimulo = pagaAsignacionEstimulo;
    }
    public Date getConvenioFechaBaja() {
        return this.convenioFechaBaja;
    }
    
    public void setConvenioFechaBaja(Date convenioFechaBaja) {
        this.convenioFechaBaja = convenioFechaBaja;
    }
    public String getMotivoBaja() {
        return this.motivoBaja;
    }
    
    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public byte[] getArchivoCm() {
        return this.archivoCm;
    }
    
    public void setArchivoCm(byte[] archivoCm) {
        this.archivoCm = archivoCm;
    }
    public Set getEstadocuentases() {
        return this.estadocuentases;
    }
    
    public void setEstadocuentases(Set estadocuentases) {
        this.estadocuentases = estadocuentases;
    }
    public Set getOfertases() {
        return this.ofertases;
    }
    
    public void setOfertases(Set ofertases) {
        this.ofertases = ofertases;
    }
    public Set getAnexoses() {
        return this.anexoses;
    }
    
    public void setAnexoses(Set anexoses) {
        this.anexoses = anexoses;
    }
    public Set getConveniosparticulareses() {
        return this.conveniosparticulareses;
    }
    
    public void setConveniosparticulareses(Set conveniosparticulareses) {
        this.conveniosparticulareses = conveniosparticulareses;
    }
    public Set getFirmanteses() {
        return this.firmanteses;
    }
    
    public void setFirmanteses(Set firmanteses) {
        this.firmanteses = firmanteses;
    }




}



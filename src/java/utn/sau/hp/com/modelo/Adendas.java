package utn.sau.hp.com.modelo;
// Generated 04/12/2014 23:31:51 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Adendas generated by hbm2java
 */
public class Adendas  implements java.io.Serializable {


     private Integer id;
     private Conveniosparticulares conveniosparticulares;
     private Tutores tutores;
     private Date fechaFirmaConvenioAnterior;
     private String adendaDescripcion;
     private String adendaArchivoAdjunto;
     private String nombreArtAnterior;
     private String nombreObraSocialAnterior;
     private int importeObraSocialAnterior;
     private int importeAsignacionEstimuloAnterior;
     private Date fechaAltaObraSocialAnterior;
     private byte pagaAsignacionEstimuloAnterior;
     private Date fechaAltaArtanterior;
     private int importeArtanterior;

    public Adendas() {
    }

	
    public Adendas(Conveniosparticulares conveniosparticulares, Date fechaFirmaConvenioAnterior, String nombreArtAnterior, String nombreObraSocialAnterior, int importeObraSocialAnterior, int importeAsignacionEstimuloAnterior, Date fechaAltaObraSocialAnterior, byte pagaAsignacionEstimuloAnterior, int importeArtanterior) {
        this.conveniosparticulares = conveniosparticulares;
        this.fechaFirmaConvenioAnterior = fechaFirmaConvenioAnterior;
        this.nombreArtAnterior = nombreArtAnterior;
        this.nombreObraSocialAnterior = nombreObraSocialAnterior;
        this.importeObraSocialAnterior = importeObraSocialAnterior;
        this.importeAsignacionEstimuloAnterior = importeAsignacionEstimuloAnterior;
        this.fechaAltaObraSocialAnterior = fechaAltaObraSocialAnterior;
        this.pagaAsignacionEstimuloAnterior = pagaAsignacionEstimuloAnterior;
        this.importeArtanterior = importeArtanterior;
    }
    public Adendas(Conveniosparticulares conveniosparticulares, Tutores tutores, Date fechaFirmaConvenioAnterior, String adendaDescripcion, String adendaArchivoAdjunto, String nombreArtAnterior, String nombreObraSocialAnterior, int importeObraSocialAnterior, int importeAsignacionEstimuloAnterior, Date fechaAltaObraSocialAnterior, byte pagaAsignacionEstimuloAnterior, Date fechaAltaArtanterior, int importeArtanterior) {
       this.conveniosparticulares = conveniosparticulares;
       this.tutores = tutores;
       this.fechaFirmaConvenioAnterior = fechaFirmaConvenioAnterior;
       this.adendaDescripcion = adendaDescripcion;
       this.adendaArchivoAdjunto = adendaArchivoAdjunto;
       this.nombreArtAnterior = nombreArtAnterior;
       this.nombreObraSocialAnterior = nombreObraSocialAnterior;
       this.importeObraSocialAnterior = importeObraSocialAnterior;
       this.importeAsignacionEstimuloAnterior = importeAsignacionEstimuloAnterior;
       this.fechaAltaObraSocialAnterior = fechaAltaObraSocialAnterior;
       this.pagaAsignacionEstimuloAnterior = pagaAsignacionEstimuloAnterior;
       this.fechaAltaArtanterior = fechaAltaArtanterior;
       this.importeArtanterior = importeArtanterior;
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
    public Tutores getTutores() {
        return this.tutores;
    }
    
    public void setTutores(Tutores tutores) {
        this.tutores = tutores;
    }
    public Date getFechaFirmaConvenioAnterior() {
        return this.fechaFirmaConvenioAnterior;
    }
    
    public void setFechaFirmaConvenioAnterior(Date fechaFirmaConvenioAnterior) {
        this.fechaFirmaConvenioAnterior = fechaFirmaConvenioAnterior;
    }
    public String getAdendaDescripcion() {
        return this.adendaDescripcion;
    }
    
    public void setAdendaDescripcion(String adendaDescripcion) {
        this.adendaDescripcion = adendaDescripcion;
    }
    public String getAdendaArchivoAdjunto() {
        return this.adendaArchivoAdjunto;
    }
    
    public void setAdendaArchivoAdjunto(String adendaArchivoAdjunto) {
        this.adendaArchivoAdjunto = adendaArchivoAdjunto;
    }
    public String getNombreArtAnterior() {
        return this.nombreArtAnterior;
    }
    
    public void setNombreArtAnterior(String nombreArtAnterior) {
        this.nombreArtAnterior = nombreArtAnterior;
    }
    public String getNombreObraSocialAnterior() {
        return this.nombreObraSocialAnterior;
    }
    
    public void setNombreObraSocialAnterior(String nombreObraSocialAnterior) {
        this.nombreObraSocialAnterior = nombreObraSocialAnterior;
    }
    public int getImporteObraSocialAnterior() {
        return this.importeObraSocialAnterior;
    }
    
    public void setImporteObraSocialAnterior(int importeObraSocialAnterior) {
        this.importeObraSocialAnterior = importeObraSocialAnterior;
    }
    public int getImporteAsignacionEstimuloAnterior() {
        return this.importeAsignacionEstimuloAnterior;
    }
    
    public void setImporteAsignacionEstimuloAnterior(int importeAsignacionEstimuloAnterior) {
        this.importeAsignacionEstimuloAnterior = importeAsignacionEstimuloAnterior;
    }
    public Date getFechaAltaObraSocialAnterior() {
        return this.fechaAltaObraSocialAnterior;
    }
    
    public void setFechaAltaObraSocialAnterior(Date fechaAltaObraSocialAnterior) {
        this.fechaAltaObraSocialAnterior = fechaAltaObraSocialAnterior;
    }
    public byte getPagaAsignacionEstimuloAnterior() {
        return this.pagaAsignacionEstimuloAnterior;
    }
    
    public void setPagaAsignacionEstimuloAnterior(byte pagaAsignacionEstimuloAnterior) {
        this.pagaAsignacionEstimuloAnterior = pagaAsignacionEstimuloAnterior;
    }
    public Date getFechaAltaArtanterior() {
        return this.fechaAltaArtanterior;
    }
    
    public void setFechaAltaArtanterior(Date fechaAltaArtanterior) {
        this.fechaAltaArtanterior = fechaAltaArtanterior;
    }
    public int getImporteArtanterior() {
        return this.importeArtanterior;
    }
    
    public void setImporteArtanterior(int importeArtanterior) {
        this.importeArtanterior = importeArtanterior;
    }




}



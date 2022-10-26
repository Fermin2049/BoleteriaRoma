package Control;

public class Sala {

    private int idSala;

    private String ubicacion;

    private String tipoSala;
    
    private String localidad;

    private boolean estadoSal;

    public Sala(int idSala, String ubicacion, String tipoSala, String lacalidad, boolean estadoSal) {
        this.idSala = idSala;
        this.ubicacion = ubicacion;
        this.tipoSala = tipoSala;
        this.localidad = lacalidad;
        this.estadoSal = estadoSal;
    }

    public Sala(String ubicacion, String tipoSala, String lacalidad, boolean estadoSal) {
        this.ubicacion = ubicacion;
        this.tipoSala = tipoSala;
        this.localidad = lacalidad;
        this.estadoSal = estadoSal;
    }

    public Sala() {
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String lacalidad) {
        this.localidad = lacalidad;
    }

    public boolean isEstadoSal() {
        return estadoSal;
    }

    public void setEstadoSal(boolean estadoSal) {
        this.estadoSal = estadoSal;
    }

    @Override
    public String toString() {
        return "Sala{" + "idSala=" + idSala + ", ubicacion=" + ubicacion + ", tipoSala=" + tipoSala + ", lacalidad=" + localidad + ", estadoSal=" + estadoSal + '}';
    }

    
    
    
}

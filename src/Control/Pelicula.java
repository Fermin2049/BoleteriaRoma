package Control;

public class Pelicula {

    private int idPelicula;

    private String nombrePel;

    private boolean estadoPel;

    public Pelicula(int idPelicula, String nombrePel, boolean estadoPel) {
        this.idPelicula = idPelicula;
        this.nombrePel = nombrePel;
        this.estadoPel = estadoPel;
    }

    public Pelicula(String nombrePel, boolean estadoPel) {
        this.nombrePel = nombrePel;
        this.estadoPel = estadoPel;
    }

    public Pelicula() {
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombrePel() {
        return nombrePel;
    }

    public void setNombrePel(String nombrePel) {
        this.nombrePel = nombrePel;
    }

    public boolean isEstadoPel() {
        return estadoPel;
    }

    public void setEstadoPel(boolean estadoPel) {
        this.estadoPel = estadoPel;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + idPelicula + ", nombrePel=" + nombrePel + ", estadoPel=" + estadoPel + '}';
    }
    
    
}

package Control;


import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Proyeccion {

    private int idProyeecion;

    private Sala idSala;

    private Pelicula idPelicula;

    private Timestamp incioProy;

    private Timestamp finProy;

    private boolean estadoProy;

    public Proyeccion(int idProyeecion, Sala idSala, Pelicula idPelicula, Timestamp incioProy, Timestamp finProy, boolean estadoProy) {
        this.idProyeecion = idProyeecion;
        this.idSala = idSala;
        this.idPelicula = idPelicula;
        this.incioProy = incioProy;
        this.finProy = finProy;
        this.estadoProy = estadoProy;
    }

    public Proyeccion(Sala idSala, Pelicula idPelicula, Timestamp incioProy, Timestamp finProy, boolean estadoProy) {
        this.idSala = idSala;
        this.idPelicula = idPelicula;
        this.incioProy = incioProy;
        this.finProy = finProy;
        this.estadoProy = estadoProy;
    }

    public Proyeccion() {
    }

    public int getIdProyeecion() {
        return idProyeecion;
    }

    public void setIdProyeecion(int idProyeecion) {
        this.idProyeecion = idProyeecion;
    }

    public Sala getIdSala() {
        return idSala;
    }

    public void setIdSala(Sala idSala) {
        this.idSala = idSala;
    }

    public Pelicula getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Pelicula idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Timestamp getIncioProy() {
        return incioProy;
    }

    public void setIncioProy(Timestamp incioProy) {
        this.incioProy = incioProy;
    }

    public Timestamp getFinProy() {
        return finProy;
    }

    public void setFinProy(Timestamp finProy) {
        this.finProy = finProy;
    }

    public boolean isEstadoProy() {
        return estadoProy;
    }

    public void setEstadoProy(boolean estadoProy) {
        this.estadoProy = estadoProy;
    }

    @Override
    public String toString() {
        return idSala + ", incio=" + incioProy + ", fin=" + finProy ;
    }

    
    
    
}

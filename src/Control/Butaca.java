package Control;

public class Butaca {

    private int idButaca;

    private Sala sala;

    private String fila;

    private int columna;

    public Butaca(int idButaca, Sala sala, String fila, int columna) {
        this.idButaca = idButaca;
        this.sala = sala;
        this.fila = fila;
        this.columna = columna;
    }

    public Butaca(Sala sala, String fila, int columna) {
        this.sala = sala;
        this.fila = fila;
        this.columna = columna;
    }

    public Butaca() {
    }

    public int getIdButaca() {
        return idButaca;
    }

    public void setIdButaca(int idButaca) {
        this.idButaca = idButaca;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Butaca{" + "idButaca=" + idButaca + ", sala=" + sala + ", fila=" + fila + ", columna=" + columna + '}';
    }


    
    
    
}

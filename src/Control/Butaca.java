package Control;

public class Butaca {

    private int idButaca;

    private Sala idSala;

    private String fila;

    private int columna;

    public Butaca(int idButaca, Sala idSala, String fila, int columna) {
        this.idButaca = idButaca;
        this.idSala = idSala;
        this.fila = fila;
        this.columna = columna;
    }

    public Butaca(Sala idSala, String fila, int columna) {
        this.idSala = idSala;
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

    public Sala getIdSala() {
        return idSala;
    }

    public void setIdSala(Sala idSala) {
        this.idSala = idSala;
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
        return " sala=" + idSala + ", fila=" + fila + ", columna=" + columna;
    }


    
    
    
}

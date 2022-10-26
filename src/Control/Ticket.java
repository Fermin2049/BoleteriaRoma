package Control;



import java.sql.Timestamp;


public class Ticket {

    private int idTicket;

    private Cliente idCliente;

    private Proyeccion idProyeccion;

    private Butaca idButaca;

    private Timestamp fechaCompra;
    
    private double precioTicket;

    private String fomaDePago;

    private boolean estadoTic;

    public Ticket(int idTicket, Cliente idCliente, Proyeccion idProyeccion, Butaca idButaca, Timestamp fechaCompra, double precioTicket, String fomaDePago, boolean estadoTic) {
        this.idTicket = idTicket;
        this.idCliente = idCliente;
        this.idProyeccion = idProyeccion;
        this.idButaca = idButaca;
        this.fechaCompra = fechaCompra;
        this.precioTicket = precioTicket;
        this.fomaDePago = fomaDePago;
        this.estadoTic = estadoTic;
    }

    public Ticket(Cliente idCliente, Proyeccion idProyeccion, Butaca idButaca, Timestamp fechaCompra, double precioTicket, String fomaDePago, boolean estadoTic) {
        this.idCliente = idCliente;
        this.idProyeccion = idProyeccion;
        this.idButaca = idButaca;
        this.fechaCompra = fechaCompra;
        this.precioTicket = precioTicket;
        this.fomaDePago = fomaDePago;
        this.estadoTic = estadoTic;
    }

    public Ticket() {
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Proyeccion getIdProyeccion() {
        return idProyeccion;
    }

    public void setIdProyeccion(Proyeccion idProyeccion) {
        this.idProyeccion = idProyeccion;
    }

    public Butaca getIdButaca() {
        return idButaca;
    }

    public void setIdButaca(Butaca idButaca) {
        this.idButaca = idButaca;
    }

    public Timestamp getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Timestamp fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getPrecioTicket() {
        return precioTicket;
    }

    public void setPrecioTicket(double precioTicket) {
        this.precioTicket = precioTicket;
    }

    public String getFomaDePago() {
        return fomaDePago;
    }

    public void setFomaDePago(String fomaDePago) {
        this.fomaDePago = fomaDePago;
    }

    public boolean isEstadoTic() {
        return estadoTic;
    }

    public void setEstadoTic(boolean estadoTic) {
        this.estadoTic = estadoTic;
    }

    @Override
    public String toString() {
        return "Ticket{" + "idTicket=" + idTicket + ", idCliente=" + idCliente + ", idProyeccion=" + idProyeccion + ", idButaca=" + idButaca + ", fechaCompra=" + fechaCompra + ", precioTicket=" + precioTicket + ", fomaDePago=" + fomaDePago + ", estadoTic=" + estadoTic + '}';
    }

    
    
    
}

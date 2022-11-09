package Control;

public class Cliente {

    private int IdCliente;

    private String nombreCli;

    private String apellidoCli;

    private int dniCli;

    private boolean estadoCli;

    public Cliente(int IdCliente, String nombreCli, String apellidoCli, int dniCli, boolean estadoCli) {
        this.IdCliente = IdCliente;
        this.nombreCli = nombreCli;
        this.apellidoCli = apellidoCli;
        this.dniCli = dniCli;
        this.estadoCli = estadoCli;
    }

    public Cliente(String nombreCli, String apellidoCli, int dniCli, boolean estadoCli) {
        this.nombreCli = nombreCli;
        this.apellidoCli = apellidoCli;
        this.dniCli = dniCli;
        this.estadoCli = estadoCli;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public String getApellidoCli() {
        return apellidoCli;
    }

    public void setApellidoCli(String apellidoCli) {
        this.apellidoCli = apellidoCli;
    }

    public int getDniCli() {
        return dniCli;
    }

    public void setDniCli(int dniCli) {
        this.dniCli = dniCli;
    }

    public boolean isEstadoCli() {
        return estadoCli;
    }

    public void setEstadoCli(boolean estadoCli) {
        this.estadoCli = estadoCli;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombreCli + " " + apellidoCli + " " + dniCli + '}';
    }
    
    
}

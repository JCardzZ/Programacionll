package Modelo;

public class ModelClientes {

    private int idCliente;
    private String cliNomnbre;
    private String CliDireccion;
    private String CliBarrio;
    private String CliCiudad;
    private String CliUf;
    private String CliCep;
    private String CliTelefono;

    public ModelClientes() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCliNomnbre() {
        return cliNomnbre;
    }

    public void setCliNomnbre(String cliNomnbre) {
        this.cliNomnbre = cliNomnbre;
    }

    public String getCliDireccion() {
        return CliDireccion;
    }

    public void setCliDireccion(String CliDireccion) {
        this.CliDireccion = CliDireccion;
    }

    public String getCliBarrio() {
        return CliBarrio;
    }

    public void setCliBarrio(String CliBarrio) {
        this.CliBarrio = CliBarrio;
    }

    public String getCliCiudad() {
        return CliCiudad;
    }

    public void setCliCiudad(String CliCiudad) {
        this.CliCiudad = CliCiudad;
    }

    public String getCliUf() {
        return CliUf;
    }

    public void setCliUf(String CliUf) {
        this.CliUf = CliUf;
    }

    public String getCliCep() {
        return CliCep;
    }

    public void setCliCep(String CliCep) {
        this.CliCep = CliCep;
    }

    public String getCliTelefono() {
        return CliTelefono;
    }

    public void setCliTelefono(String CliTelefono) {
        this.CliTelefono = CliTelefono;
    }

    @Override
    public String toString() {
        return "ModelClientes{" + "idCliente=" + idCliente + ", cliNomnbre=" + cliNomnbre + ", CliDireccion=" + CliDireccion + ", CliBarrio=" + CliBarrio + ", CliCiudad=" + CliCiudad + ", CliUf=" + CliUf + ", CliCep=" + CliCep + ", CliTelefono=" + CliTelefono + '}';
    }

}

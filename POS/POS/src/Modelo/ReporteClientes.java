package Modelo;

public class ReporteClientes {

    private int IDRegistro;
    private int IDCliente;
    private int SaldoActual;
    private int FechaActual;
    private int UltimoPago;
    private int FechaPPago;
    private int ID;

    public ReporteClientes() {
    }

    public ReporteClientes(int IDRegistro, int IDCliente, int SaldoActual, int FechaActual, int UltimoPago, int FechaPPago, int ID) {
        this.IDRegistro = IDRegistro;
        this.IDCliente = IDCliente;
        this.SaldoActual = SaldoActual;
        this.FechaActual = FechaActual;
        this.UltimoPago = UltimoPago;
        this.FechaPPago = FechaPPago;
        this.ID = ID;
    }

    public int getIDRegistro() {
        return IDRegistro;
    }

    public void setIDRegistro(int IDRegistro) {
        this.IDRegistro = IDRegistro;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public int getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public int getFechaActual() {
        return FechaActual;
    }

    public void setFechaActual(int FechaActual) {
        this.FechaActual = FechaActual;
    }

    public int getUltimoPago() {
        return UltimoPago;
    }

    public void setUltimoPago(int UltimoPago) {
        this.UltimoPago = UltimoPago;
    }

    public int getFechaPPago() {
        return FechaPPago;
    }

    public void setFechaPPago(int FechaPPago) {
        this.FechaPPago = FechaPPago;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}

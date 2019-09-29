package Modelo;

public class ModelProductos {

    private int IdProductos;
    private String Descripcion;
    private double ProValor;
    private int ProStock;

    public int getIdProductos() {
        return IdProductos;
    }

    public void setIdProductos(int IdProductos) {
        this.IdProductos = IdProductos;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getProValor() {
        return ProValor;
    }

    public void setProValor(double ProValor) {
        this.ProValor = ProValor;
    }

    public int getProStock() {
        return ProStock;
    }

    public void setProStock(int ProStock) {
        this.ProStock = ProStock;
    }


}

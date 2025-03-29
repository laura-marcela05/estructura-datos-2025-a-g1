package model;

public class Cliente extends Persona{
    private int numeroCliente;
    private String historialCompras;

    public Cliente(String nombre, int eddad, String dirreccion, int numeroCliente, String historialCompras){
        super(nombre, eddad, dirreccion);
        this.numeroCliente=numeroCliente;
        this.historialCompras=historialCompras;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(String historialCompras) {
        this.historialCompras = historialCompras;
    }
}

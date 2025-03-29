package model;
import model.Persona;
public class Empleado extends Persona {
    private int codigoEmpleado;
    private String cargo;
    private float salarioMensual;

    public Empleado(String nombre, int edad, String dirrecion, int codigoEmpleado, String cargo, float salarioMensual) {
        super(nombre, edad, dirrecion);
        this.codigoEmpleado=codigoEmpleado;
        this.cargo=cargo;
        this.salarioMensual=salarioMensual;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public float getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(float salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

}
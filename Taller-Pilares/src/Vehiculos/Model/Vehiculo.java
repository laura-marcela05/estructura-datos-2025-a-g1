package Vehiculos.Model;

public abstract class Vehiculo {
    private int capacidad;
    private int velocidad;
    //Set
    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }

    public void setVelocidad(int velocidad){
        this.velocidad=velocidad;
    }

    //Get
    public int getCapacidad(){
        return this.capacidad;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    //Methods Implementations
    public void Mostrar(){
        System.out.println("Capacidad: "+this.capacidad+" Personas \n" +
                "Velocidad: "+this.velocidad+"Km/h \n"
        );
    }

}

package Reservas_de_Hotel.Model;

public abstract class Habitacion {
    private String nombreCliente;
    private int dias;
    private int precioNoche;
    private int capacidadPersonas;
    //Set
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente=nombreCliente;
    }
    public void setDias (int dias){
        this.dias=dias;
    }
    public void setPrecioNoche(int precioNoche){
        this.precioNoche=precioNoche;
    }
    public void setCapacidadPersonas(int capacidadPersonas){
        this.capacidadPersonas=capacidadPersonas;
    }

    //Get
    public String getNombreCliente(){
        return this.nombreCliente;
    }
    public int getDias(){
        return this.dias;
    }
    public int getPrecioNoche(){
        return this.precioNoche;
    }
    public int getCapacidadPersonas(){
        return  this.capacidadPersonas;
    }

    //Mthods Implementations
    public void Mostrar(){
        System.out.println("Nombre del cliente: "+this.nombreCliente+ "\n" +
                "Días de estancia: "+this.dias+" Días\n" +
                "Precio Por noche: $"+this.precioNoche+ " Mil\n" +
                "Capacidad maxima de la habitación: "+this.capacidadPersonas+" Personas\n"
        );

    }
}

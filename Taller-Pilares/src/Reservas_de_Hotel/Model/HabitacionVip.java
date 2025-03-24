package Reservas_de_Hotel.Model;

public class HabitacionVip extends Habitacion{
    private String jacuzziProvado;

    public String getjacuzziProvado() {
        return jacuzziProvado;
    }

    public void setJacuzziProvado(String jacuzziProvado){
        this.jacuzziProvado=jacuzziProvado;
    }

    public double precioTotal(){
        return getDias()*getPrecioNoche()*1.25;
    }

    @Override
    public void Mostrar(){
        System.out.println("Nombre del cliente: "+this.getNombreCliente()+"\n" +
                "Días de estancia: "+this.getDias()+ " Días\n" +
                "Precio por noche: $"+this.getPrecioNoche()+" Mil\n" +
                "Capacidad de la habitación: "+this.getCapacidadPersonas()+" Personas\n" +
                "Precio Total(Con adicional del 25%): $"+this.precioTotal()+"\n" +
                "¿Incluye jacuzzi privado? "+this.getjacuzziProvado()+"\n");
    }
}

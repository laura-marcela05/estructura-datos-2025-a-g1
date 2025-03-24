package Reservas_de_Hotel.Model;

public class HabitacionDoble extends Habitacion{
    private String vistaMar;

    public String getVistaMar(){
        return vistaMar;
    }
    public void setVistaMar(String vistaMar){
        this.vistaMar=vistaMar;
    }

    public double precioTotal(){
        return getDias()*getPrecioNoche()*1.10;
    }
    @Override
    public void Mostrar(){
        System.out.println("Nombre del cliente: "+this.getNombreCliente()+ "\n" +
                "Días de estancia: "+this.getDias()+" Días\n" +
                "Precio por noce: $"+this.getPrecioNoche()+" Mil\n" +
                "Capacidad de la habitación: "+this.getCapacidadPersonas()+" Personas\n" +
                "Precio Total (Con adicional 10%): $"+this.precioTotal()+"\n" +
                "¿Incluye vista al mar? "+this.getVistaMar()+"\n");
    }
}

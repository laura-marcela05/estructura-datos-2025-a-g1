package Reservas_de_Hotel.Model;

public class HabitacionSencilla extends Habitacion{
    private String desayuno;

    public String getDesayuno(){
        return desayuno;
    }
    public void setDesayuno(String desayuno){
        this.desayuno=desayuno;
    }
    public  double precioTotal(){
        return getDias()*getPrecioNoche();
    }

    @Override
    public void Mostrar(){
        System.out.println("Nombre del cliente: "+this.getNombreCliente()+ "\n" +
                "Días de estancia: "+this.getDias()+" Días\n" +
                "Precio por noche: $"+this.getPrecioNoche()+ " Mil\n" +
                "Capadidad de la habitación: "+this.getCapacidadPersonas()+" Personas\n" +
                "Precio Total: $"+this.precioTotal()+"\n" +
                "¿Incluye desayuno? "+this.getDesayuno()+"\n");
    }

}

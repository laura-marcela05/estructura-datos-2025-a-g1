package Vehiculos.Model;

public class Bicicleta extends Vehiculo{
    private String cambios;
    public String getCambios(){
        return cambios;
    }
    public void setCambios(String cambios){
        this.cambios=cambios;
    }
    @Override
    public void Mostrar() {
        System.out.println("Capacidad: " + this.getCapacidad() + " Personas\n" +
                "Velocidad: " + this.getVelocidad() + " km/h\n" +
                "Tiene Cambios? "+this.getCambios()+"\n");
    }
}

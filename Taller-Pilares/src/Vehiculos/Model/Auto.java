package Vehiculos.Model;

public class Auto extends Vehiculo{
    private String combustible;
    public String getCombustible(){
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public void Mostrar(){
        System.out.println("Capacidad: "+this.getCapacidad()+" Personas\n" +
                "Velocidad: "+this.getVelocidad()+ " Km/h\n" +
                "Tipo de conbustible: "+this.getCombustible()+"\n");
    }
}

package Vehiculos.Model;

public class Bus extends Vehiculo{
    private int numeroRutas;
    public int getNumeroRutas(){
        return numeroRutas;
    }

    public void setNumeroRutas(int numeroRutas){
        this.numeroRutas=numeroRutas;
    }

    @Override
    public void Mostrar(){
        System.out.println("Capacidad: "+this.getCapacidad()+" Personas\n" +
                "Velocidad: "+this.getVelocidad()+" km/h\n" +
                "Números de rutas: "+this.getNumeroRutas()+"\n");
    }
}

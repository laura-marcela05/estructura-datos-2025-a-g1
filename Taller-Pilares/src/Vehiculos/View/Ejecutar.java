package Vehiculos.View;
import Vehiculos.Model.Auto;
import Vehiculos.Model.Bicicleta;
import Vehiculos.Model.Vehiculo;
import Vehiculos.Model.Bus;


public class Ejecutar {
    public static void main(String []args){

        //Mostrar data

        System.out.println("Clase Bus");
        Bus bus =new Bus();
        bus.setCapacidad(50);
        bus.setVelocidad(80);
        bus.setNumeroRutas(10);
        bus.Mostrar();

        System.out.println("Clase Bicicleta");
        Bicicleta bicicleta =new Bicicleta();
        bicicleta.setCapacidad(1);
        bicicleta.setVelocidad(30);
        bicicleta.setCambios("Si");
        bicicleta.Mostrar();

        System.out.println("Clase Auto");
        Auto auto=new Auto();
        auto.setCapacidad(5);
        auto.setVelocidad(200);
        auto.setCombustible("Gasolina");
        auto.Mostrar();

    }
}

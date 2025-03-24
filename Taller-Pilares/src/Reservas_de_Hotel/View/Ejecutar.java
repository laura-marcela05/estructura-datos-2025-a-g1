package Reservas_de_Hotel.View;

import Reservas_de_Hotel.Model.Habitacion;
import Reservas_de_Hotel.Model.HabitacionDoble;
import Reservas_de_Hotel.Model.HabitacionSencilla;
import Reservas_de_Hotel.Model.HabitacionVip;

public class Ejecutar {
    public static void main(String[]args){
        //Mostrar data

        System.out.println("Habitación Sencilla");
        HabitacionSencilla habitacionSencilla=new HabitacionSencilla();
        habitacionSencilla.setNombreCliente("Maria de la Rosa");
        habitacionSencilla.setDias(3);
        habitacionSencilla.setPrecioNoche(100);
        habitacionSencilla.setCapacidadPersonas(2);
        habitacionSencilla.setDesayuno("Si");
        habitacionSencilla.Mostrar();

        System.out.println("Habitación Doble");
        HabitacionDoble habitacionDoble=new HabitacionDoble();
        habitacionDoble.setNombreCliente("Julian Nuñez");
        habitacionDoble.setDias(7);
        habitacionDoble.setPrecioNoche(150);
        habitacionDoble.setCapacidadPersonas(4);
        habitacionDoble.setVistaMar("Si");
        habitacionDoble.Mostrar();

        System.out.println("Habitación VIP");
        HabitacionVip habitacionVip=new HabitacionVip();
        habitacionVip.setNombreCliente("Nikolai Romanov");
        habitacionVip.setDias(5);
        habitacionVip.setPrecioNoche(200);
        habitacionVip.setCapacidadPersonas(3);
        habitacionVip.setJacuzziProvado("Si");
        habitacionVip.Mostrar();
    }
}

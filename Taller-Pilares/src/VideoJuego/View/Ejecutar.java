package VideoJuego.View;

import VideoJuego.Model.Mago;
import VideoJuego.Model.Guerrero;
import VideoJuego.Model.Personaje;

public class Ejecutar {
    public static void main(String[]args){
        //Mostrar Data

        System.out.println("Clase Hija Mago");
        Mago mago=new Mago();
        mago.setNombre("Mago");
        mago.setHabilidad("Rayo Congelador");
        mago.setSalud(100);
        mago.setAtaque(80);
        mago.Mostrar();

        System.out.println("Clase Hija Guerrero");
        Guerrero guerrero= new Guerrero();
        guerrero.setNombre("Guerrero");
        guerrero.setArma("Espada");
        guerrero.setSalud(80);
        guerrero.setAtaque(100);
        guerrero.Mostrar();
        }
    }

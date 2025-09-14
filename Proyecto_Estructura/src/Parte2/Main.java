package Parte2;

//Importaciones de la clase
import Parte2.Model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        //Lista de películas usando ArrayList
        ArrayList<Pelicula>peliculas=new ArrayList<>();
        ArrayList<Sala>salas=new ArrayList<>();

        //Creación de películas
        Pelicula animada=new PeliculaAnimada("Cómo entrenar a tu dragón",98,"DreamWorks");
        Pelicula terror=new PeliculaTerror("El conjuro",112,true);

        //Agregar a la lista
        peliculas.add(animada);
        peliculas.add(terror);

        //Creación de salas asignando películas a cada una
        salas.add(new Sala(1,60,animada));
        salas.add(new Sala(2,60,terror));

        //Opción
        int opcion;

        //Menú interactivo
        do {
            System.out.println("\n---Bienvenido al menú del cine Royal---\n" +
                    "1. Ver películas\n" +
                    "2. Ver salas\n" +
                    "3. Salir\n" +
                    "Por favor seleccione una opción: ");
            opcion=scanner.nextInt();

            switch (opcion){
                case 1:
                    //Opción para mostrar la lista de películas
                    System.out.println("\n--Lista de películas--\n");
                    for (Pelicula p:peliculas){
                        p.mostrarInfo();
                    }
                    break;
                case 2:
                    //Lista de salas disponibles
                    System.out.println("\n--Salas disponibles:");
                    for (Sala s:salas){
                        s.mostrarInfoSala();
                    }
                    break;
                case 3:
                    //Salir del sistema
                    System.out.println("Saliendo...¡Gracias por utilizar el sistema!");
                    break;
                default:
                    //Opción invalida
                    System.out.println("Opción inválida.");
            }

        }while (opcion!=3);
    }
}

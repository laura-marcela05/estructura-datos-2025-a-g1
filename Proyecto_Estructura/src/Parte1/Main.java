package Parte1;

import Parte1.Model.*;

import  java.util.Scanner;

public class Main {

    public static void main(String[]args){

        JugueteService service=new JugueteService();

        //Productos pre-registrados
        Peluches p1=new Peluches("Gominola", 19.00, 8,"0-3","Oso");
        Electronicos e1=new Electronicos("Piano", 59.99, 5,"8-12",true);
        Educativos ed1=new Educativos("Abecedario Puzzle", 20.00, 10,"4-7", "Lenguaje");
        service.productoExistente(p1);
        service.productoExistente(e1);
        service.productoExistente(ed1);

        //Se inicializa el scanner para capturar los datos dados por el usuario
        Scanner scanner=new Scanner(System.in);

        int opcion;

        //Menú
        do {
            System.out.println("════════ Bienvido a Happy Toys ════════\n" +
                    "1. Registrar un nuevo juguete\n" +
                    "2. Mostrar Inventarios\n" +
                    "3. Ordenar inventario por precio\n" +
                    "4. Buscar juguete\n" +
                    "5. Mostrar nombre de juguetes ordenados\n" +
                    "6. Simular pedido\n" +
                    "8. Salir del sistema\n" +
                    "Seleccionar una opción: ");
            opcion=scanner.nextInt();

            switch (opcion){
                case 1:
                    service.registrarJuguete();
                    break;
                case 2:
                    service.mostrarInventario();
                    break;
                case 3:
                    service.ordenarBurbuja();
                    break;
                case 4:
                    service.buscarJuguete();
                    break;
                case 5:
                    service.mostrarNombres();
                    break;
                case 6:
                    service.simularPedido();
                    break;
                case 7:
                    service.mostrarHistorial();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida..Intente de nuevo");

            }

        }while (opcion!=8);

        scanner.close();
    }
}

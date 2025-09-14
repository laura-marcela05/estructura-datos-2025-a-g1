package Parte1;

import Parte1.Model.*;
import java.util.*;

public class JugueteService {

    //ArrayList lista donde guardamos todos los jugetes registrados
    private ArrayList<Juguetes>inventario=new ArrayList<>();

    //Mapa para buscar juguetes por nombre
    private HashMap<String,Juguetes>mapaJuguetes= new HashMap<>();

    //Árbol con nombres ordenados de juguetes
    private TreeSet<String>arbolNombres=new TreeSet<>();

    //Pila para historial de acciones (último primero)
    private Stack<String>pilaHistorial= new Stack<>();

    //Cola para pedidos (primero en entrar, primero en salir)
    private Queue<String> colaPedidos= new LinkedList<>();

    //scanner para capturar la entrada del usuario por la consola
    private Scanner scanner=new Scanner(System.in);

    //Vector clasificaciones por edad
    private String[]clasificaciones={"Niños","Adolescentes","Adultos"};


    //Agrega el objeto jugetes existente al inventario
    public void productoExistente(Juguetes j){
        inventario.add(j);
        mapaJuguetes.put(j.getNombre().toLowerCase(),j);
        arbolNombres.add(j.getNombre().toLowerCase());
    }

    //Metodo para registrar nuevo juguete
    public void registrarJuguete(){
        System.out.print("Tipo(peluche/electronico/educativo): ");
        String tipo=scanner.nextLine().toLowerCase();

        System.out.print("Nombre: ");
        String nombre=scanner.nextLine();

        System.out.print("Precio: ");
        double precio;
        try {
            precio=Double.parseDouble(scanner.nextLine());
        } catch(NumberFormatException e){
            System.out.println("Precio inválido");
            return;
        }

        System.out.print("Cantidad en stock: ");
        int stock;
        try {
            stock=Integer.parseInt(scanner.nextLine());
        } catch(NumberFormatException e){
            System.out.println("Stock inválido");
            return;
        }

        System.out.println("Clasificaciones:");
        for (int i = 0; i < clasificaciones.length; i++) {
            System.out.println((i + 1)+" "+clasificaciones[i]);
        }

        System.out.print("Selecciona clasificación: ");
        int c;
        try {
            c=Integer.parseInt(scanner.nextLine());
        } catch(NumberFormatException e){
            System.out.println("Entrada inválida. Se seleccionará por defecto la opción 1");
            c=1;
        }

        if (c<1||c>clasificaciones.length) {
            System.out.println("Selección fuera de rango. Se usará por defecto la opción 1");
            c=1;
        }

        String clasificacion=clasificaciones[c-1];
        Juguetes nuevo=null;

        switch(tipo){
            case"peluche":
                System.out.print("¿Qué animal representa el peluche?: ");
                String animal=scanner.nextLine();
                nuevo=new Peluches(nombre, precio, stock, clasificacion, animal);
                break;
            case"electronico":
                System.out.print("¿Tiene garantía de 6 meses? (true/false): ");
                boolean garantia;
                try {
                    garantia=Boolean.parseBoolean(scanner.nextLine());
                } catch(Exception e){
                    System.out.println("Entrada inválida para garantía");
                    return;
                }
                nuevo=new Electronicos(nombre, precio, stock, clasificacion, garantia);
                break;
            case "educativo":
                System.out.print("Tema educativo (Matemáticas, Lenguaje, Ciencia, Inglés): ");
                String tema=scanner.nextLine();
                nuevo=new Educativos(nombre, precio, stock, clasificacion, tema);
                break;
            default:
                System.out.println("Tipo no válido.");
                return;
        }

        inventario.add(nuevo);
        mapaJuguetes.put(nombre.toLowerCase(),nuevo);
        arbolNombres.add(nombre.toLowerCase());
        pilaHistorial.push("Agregado: "+nombre);
        System.out.println("Juguete agregado");
    }

    //Ordenar inventario por precio (Burbuja)
    public void ordenarBurbuja(){
        for(int i = 0; i < inventario.size() - 1; i++){
            for(int j = 0; j < inventario.size() - 1 - i; j++){
                if(inventario.get(j).getPrecio()>inventario.get(j + 1).getPrecio()){
                    Juguetes temp=inventario.get(j);
                    inventario.set(j, inventario.get(j+1));
                    inventario.set(j + 1, temp);
                }
            }
        }
        pilaHistorial.push("Inventario ordenado por precio");
        System.out.println("Inventario ordenado por precio");
    }

    //Buscar juguete por nombre
    public void buscarJuguete(){
        System.out.print("Nombre a buscar: ");
        String nombre=scanner.nextLine().toLowerCase();
        if(mapaJuguetes.containsKey(nombre)) {
            System.out.print("Encontrado: ");
            mapaJuguetes.get(nombre).mostrarInformacion();
            pilaHistorial.push("Buscado: "+nombre);
        } else{
            System.out.println("Juguete no encontrado");
        }
    }

    //Mostrar nombres ordenados
    public void mostrarNombres(){
        System.out.println("Nombres ordenados:");
        for(String n:arbolNombres) {
            System.out.println("-"+n);
        }
    }

    //Mostrar inventario completo
    public void mostrarInventario(){
        if(inventario.isEmpty()){
            System.out.println("Inventario vacío");
            return;
        }
        System.out.println("Inventario completo:");
        for(Juguetes j:inventario){
            j.mostrarInformacion();
        }
    }

    //Agregar pedido a la cola
    public void simularPedido(){
        System.out.print("Nombre del juguete para pedido: ");
        String pedido=scanner.nextLine().toLowerCase();
        if (mapaJuguetes.containsKey(pedido)) {
            colaPedidos.offer(pedido);
            pilaHistorial.push("Pedido agregado: "+pedido);
            System.out.println("Pedido agregado a la cola");
        } else {
            System.out.println("Juguete no existe");
        }

        System.out.println("Pedidos en cola: ");
        for (String p:colaPedidos) {
            System.out.println("-"+p);
        }
    }

    //Mostrar historial de acciones
    public void mostrarHistorial(){
        if(pilaHistorial.isEmpty()){
            System.out.println("No hay historial de acciones");
            return;
        }
        System.out.println("Historial de acciones (último al primero): ");
        Stack<String>copia=(Stack<String>)pilaHistorial.clone();
        while(!copia.isEmpty()){
            System.out.println(copia.pop());
        }
    }
}
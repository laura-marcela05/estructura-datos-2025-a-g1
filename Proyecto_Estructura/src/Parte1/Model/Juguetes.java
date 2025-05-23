package Parte1.Model;

public abstract class Juguetes {
    //Atributos
    private  String nombre;
    private double precio;
    private  int stock;
    private String clasificacionEdad;

    //Constructor
    public Juguetes(String nombre, double precio, int stock, String clasificacionEdad) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.clasificacionEdad = clasificacionEdad;
    }

    //Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getClasificacionEdad() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(String clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método para mostrar los datos de los juguetes
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre+ "\n" +
                "Precio: "+precio+ "\n" +
                "Stock: "+stock+ "\n" +
                "Clasificación por edad: "+clasificacionEdad);
    }

}

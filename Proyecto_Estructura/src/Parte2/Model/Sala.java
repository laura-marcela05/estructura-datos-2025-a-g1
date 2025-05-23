package Parte2.Model;

public class Sala {

    //Atributo de la sala
    private int numero;
    private int capacidad;
    private Pelicula pelicula; //Película asignada a la sala, puede ser de cualquier tipo (Polimorfismo)

    //Construtor
    public Sala(int numero, int capacidad, Pelicula pelicula) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.pelicula = pelicula;
    }

    //Get y Set
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    //Método para mostrar información de la sala
    public void mostrarInfoSala(){
        System.out.println("\n sala N°"+numero+"\n" +
                "Capacidad: "+capacidad);
        pelicula.mostrarInfo();
    }
}

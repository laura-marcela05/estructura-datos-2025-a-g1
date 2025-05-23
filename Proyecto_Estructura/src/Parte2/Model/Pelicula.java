package Parte2.Model;

public abstract class Pelicula{

    //Atributos
    private String titulo;
    private int duracion; //En minutos

    //Constructor
    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    // Métodos Getter y Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Método para mostrar la información
    public void mostrarInfo(){
        System.out.println("Título: "+getTitulo()+"\n" +
                "Duración: "+getDuracion()+" minutos");
    }
}

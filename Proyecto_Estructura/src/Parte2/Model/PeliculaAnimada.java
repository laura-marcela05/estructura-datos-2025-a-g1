package Parte2.Model;

public class PeliculaAnimada extends Pelicula{

    //Atributo para esta clase
    private String estudioAnimacion;

    //Constructor
    public PeliculaAnimada(String titulo, int duracion, String estudioAnimacion) {
        super(titulo, duracion);
        this.estudioAnimacion = estudioAnimacion;
    }

    //Métodos Getter y Setter
    public String getEstudioAnimacion() {
        return estudioAnimacion;
    }

    public void setEstudioAnimacion(String estudioAnimacion) {
        this.estudioAnimacion = estudioAnimacion;
    }

    //Sobrescritura del método para mostrar la información
    @Override
    public void mostrarInfo(){
        System.out.println("Pelicula Animada");
        super.mostrarInfo();
        System.out.println("Estudio de animación: "+estudioAnimacion);
    }
}

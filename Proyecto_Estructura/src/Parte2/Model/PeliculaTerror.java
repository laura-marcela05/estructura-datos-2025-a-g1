package Parte2.Model;

public class PeliculaTerror extends Pelicula{

    //Atributo para esta clase
    private boolean esParaMayores;

    //Costructor
    public PeliculaTerror(String titulo, int duracion, boolean esParaMayores) {
        super(titulo, duracion);
        this.esParaMayores = esParaMayores;
    }

    //Métodos Getter y Setter
    public boolean isEsParaMayores() {
        return esParaMayores;
    }

    public void setEsParaMayores(boolean esParaMayores) {
        this.esParaMayores = esParaMayores;
    }

    //Sobrescritura del método para mostrar la información
    @Override
    public void mostrarInfo(){
        System.out.println("\n\"Película de Terror");
        super.mostrarInfo();
        System.out.println("Clasificación por edad: "+(esParaMayores?"Mayores de edad":"Todo público"));
    }
}

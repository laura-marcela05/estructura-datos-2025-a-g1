package Parte1.Model;

public class Educativos extends Juguetes {

    //Atributo para saber de que tema educativo es el juguete (Matemáticas, lenguaje, ciencia, inglés)
    private String tema;

    //Constructor
    public Educativos(String nombre, double precio, int stock, String clasificacionEdad, String tema) {
        super(nombre, precio, stock, clasificacionEdad);
        this.tema = tema;
    }

    //Get y Set
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    //Muestra la información general y específicos del juguete
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tema educativo: "+tema);

    }
}

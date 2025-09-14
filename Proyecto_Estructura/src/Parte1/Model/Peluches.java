package Parte1.Model;

public class Peluches extends Juguetes {
    //Atributo para saber el tipo de animal
    private String animal;

    //Constructor
    public Peluches(String nombre, double precio, int stock, String clasificacionEdad, String animal) {
        super(nombre, precio, stock, clasificacionEdad);
        this.animal = animal;
    }

    //Get y Set
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    //Muestra la información principal y los específicos del peluche
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); //Muestra los atributos de la clase padres
        System.out.println("¿Que animal es el peluche?: "+animal);
    }
}

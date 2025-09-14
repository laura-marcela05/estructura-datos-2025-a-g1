package Parte1.Model;

public class Electronicos extends Juguetes {
    private boolean garantia; //La garantía es de 6 meses

    //Costructor
    public Electronicos(String nombre, double precio, int stock, String clasificacionEdad, boolean garantia) {
        super(nombre, precio, stock, clasificacionEdad);
        this.garantia = garantia;
    }

    //Get y Set
    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    //Muestra la información general y específica del juguete
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("¿Tiene garantía de 6 meses? " +(garantia? "Sí":"No"));
    }
}

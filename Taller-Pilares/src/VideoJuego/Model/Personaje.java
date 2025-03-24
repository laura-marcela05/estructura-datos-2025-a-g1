package VideoJuego.Model;

public abstract class Personaje {
    private int salud;
    private String nombre;
    private int ataque;

    //Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    //Get
    public String getNombre() {
        return this.nombre;
    }

    public int getSalud() {
        return this.salud;
    }

    public int getAtaque() {
        return this.ataque;
    }

    //Methods Implementations
    public void Mostrar() {
        System.out.println(
                "Nombre: " + this.nombre + "\n" +
                "Salud: " + this.salud + "\n" +
                "Ataque:" + this.ataque + "\n"
        );
    }
}



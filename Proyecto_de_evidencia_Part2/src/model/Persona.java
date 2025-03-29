package model;

public abstract class Persona {
    private String nombre;
    private int eddad;
    private String dirreccion;

    public Persona(String nombre, int eddad, String dirreccion){
        this.nombre=nombre;
        this.eddad=eddad;
        this.dirreccion=dirreccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEddad() {
        return eddad;
    }

    public void setEddad(int eddad) {
        this.eddad = eddad;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

}

package model;

public abstract class Animal {
    private String nombre;
    private int eddad;
    private float peso;

    public Animal(String nombre, int eddad, float peso){
        this.nombre=nombre;
        this.eddad=eddad;
        this.peso=peso;
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public abstract void comer();
    public abstract void dormir();
    public abstract void desplazarse();
}

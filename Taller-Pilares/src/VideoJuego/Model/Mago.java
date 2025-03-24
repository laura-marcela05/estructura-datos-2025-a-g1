package VideoJuego.Model;

public class Mago extends Personaje{

    private String habilidad;
    public String getHabilidad(){
        return habilidad;
    }
    public void setHabilidad(String habilidad){
        this.habilidad= habilidad;
    }

    @Override
    public void Mostrar(){
        System.out.println("Nombre: "+this.getNombre()+ "\n"+
                "Habilidad: "+this.getHabilidad()+ "\n"+
                "Salud: "+this.getSalud()+ "\n"+
                "Ataque: "+this.getAtaque()+"\n"
        );
    }
}



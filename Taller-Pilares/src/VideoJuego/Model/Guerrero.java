package VideoJuego.Model;

public class Guerrero extends Personaje{

    private String arma;
    public String getArma(){
        return arma;
    }
    public void setArma(String arma){
        this.arma=arma;
    }

    @Override
    public void Mostrar() {
        System.out.println("Nombre: "+this.getNombre()+"\n"+
                "Arma: "+this.getArma()+ "\n"+
                "Salud: "+this.getSalud()+ "\n"+
                "Ataque: "+this.getAtaque()+"\n"
        );
    }
}

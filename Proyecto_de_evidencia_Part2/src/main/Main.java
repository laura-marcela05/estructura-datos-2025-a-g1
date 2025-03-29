package main;
import model.Cliente;
import model.Empleado;
import view.PersonaService;

public class Main {
    public static void main(String[]args){
        PersonaService service=new PersonaService();

        service.agregarPersona(new Cliente("Juan Gutierrrez", 30,"Calle 15 #30-60", 1001,"Computadore lenovo, Monitor ultra, Foro de computador"));
        service.agregarPersona(new Empleado("Liliana Amanda Curuba", 20, "Callle 99 #20-71",101, "Cajero", 500));
        service.mostrarPersonas();


    }
}

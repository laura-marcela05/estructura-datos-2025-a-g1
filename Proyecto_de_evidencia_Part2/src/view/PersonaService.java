package view;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Empleado;
import model.Persona;

public class PersonaService {
    private List<Persona> personas = new ArrayList<>();

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public void mostrarPersonas() {
        for (Persona a : personas) {
            System.out.println("Nombre: " + a.getNombre() + "\n" +
                    "Edad: " + a.getEddad() + "\n" +
                    "Dirreción: " + a.getDirreccion());

            if (a instanceof Cliente) {
                Cliente cliente = (Cliente) a;
                System.out.println("Número cliente: " + cliente.getNumeroCliente());
                System.out.println("Historial de compras: " + cliente.getHistorialCompras()+"\n");
            } else if (a instanceof Empleado) {
                Empleado empleado = (Empleado) a;
                System.out.println("Código de Empleado: " + empleado.getCodigoEmpleado());
                System.out.println("Cargo: " + empleado.getCargo());
                System.out.println("Salario Mensual: $" + empleado.getSalarioMensual());
            }
        }
    }

}

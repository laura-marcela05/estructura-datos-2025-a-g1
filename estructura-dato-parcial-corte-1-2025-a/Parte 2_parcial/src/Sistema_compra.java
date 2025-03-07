import java.util.Scanner;

public class Sistema_compra {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        /*Variables*/
        String nombreCliente;
        String nombreProducto;
        double valorUnitario;
        int cantidad;
        double valorBruto;
        double descuento=0;
        double valorNeto;

        //Mensaje de bienvenida
        System.out.println("¡Bienvenido al sistema de compra!");

        /*Solicitud de datos*/

        //nombre
        System.out.println("Por favor digite su nombre: ");
        nombreCliente= leer.nextLine(); //Lee una línea completa

        //producto
        System.out.println("Por favor digite el nombre del producto: ");
        nombreProducto= leer.nextLine();

        //valr unitario
        System.out.println("Por favor digite el valor unitario (mayor a 0): ");
        valorUnitario= leer.nextDouble();

        //Verificación del valor para que sea mayor a cero
        if (valorUnitario<=0){
            System.out.println("¡Ha habido un error!\n" +
                    "Por favor digite un valor valido.");
            return; // el return termina el sistema si hay un error
        }

        //Cantidad que desea solicitar
        System.out.println("Por favor digite la cantidad (mayor a cero) que neceita: ");
        cantidad= leer.nextInt();

        //Verificar que su sea mayor a cero
        if (cantidad <=0){
            System.out.println("¡Ha habido un error!\n" +
                    "Por favor digite un valor valido");
            return;
        }

        //Calculo del valor bruto
        valorBruto=valorUnitario*cantidad;

        /*Descuentos*/
        if (cantidad>=10 && cantidad<=19){
            descuento= valorBruto * 0.05; //5% de descuento
        } else if (cantidad>=20) {
            descuento= valorBruto *0.07; //7% de descuento

        }

        //Calculo del valor neto
        valorNeto=valorBruto-descuento;


        //Mostarle los resultados al cliente
        System.out.println("Resumen de su compra: ");
        System.out.println("Cliente: "+nombreCliente);
        System.out.println("Producto: " +nombreProducto);
        System.out.println("Valor Unitario: "+valorUnitario);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Valor Bruto: "+valorBruto);
        System.out.println("Descuento: " +descuento);
        System.out.println("Valor Neto: "+valorNeto);

        //Cierre del escaner
        leer.close();


    }
}
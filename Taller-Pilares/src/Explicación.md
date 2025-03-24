*****Bienvenido!*****

He hecho este archivo para ser más claros con los ejercicios. Como verá, 
este archivo cumplirá la función de documentar de manera más adecuada la realización de los ejercicios, 
cumpliendo un rol similar al de POO.md.
Gracias por la comprensión.

***1.Videojuegos***

  **1.1. Herencia**
  
  *Personaje*

    package VideoJuego.Model;

    public class Personaje {
        private int salud;
        private String nombre;
        private int ataque;
        //Set
        //Get
        //Methods Implementations
        public void Mostrar(){
            this.nombre="Noob";
            this.salud= 60;
            this.ataque= 40;
            System.out.println(
                    "Nombre: "+this.nombre+"\n" +
                    "Salud: "+this.salud+"\n" +
                    "Ataque:"+this.ataque+"\n"
            );
        }
    }
	
  *Mago*

	package VideoJuego.Model;

    public class Mago {
        //Here atribute
        //Here methods
    }
	
  *Guerrero*

	package VideoJuego.Model;

    public class Guerrero {
        //Here atribute
        //Here methods
    }
	
  *Ejecutar*

	package VideoJuego.View;
	import VideoJuego.Model.Mago;
    import VideoJuego.Model.Guerrero;
    import VideoJuego.Model.Personaje;

    public class Ejecutar {
        public static void main(String[]args){
            //Mostrar Data
            System.out.println("Probando escenario 1.");
        
            Personaje personaje= new Personaje();
            personaje.Mostrar();
        
            Mago mago=new Mago();
            mago.Mostrar();
			
			Guerrero guerrero=new Guerrero();
        	guerrero.Mostrar();
            }
        }

  **1.2. Encapsulamiento**
  
  *Personaje*

    package VideoJuego.Model;

    public class Personaje {
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

  *Mago*

	package VideoJuego.Model;

    public class Mago {
        System.out.println("Nombre: "+this.getNombre()+
                "Salud: "+this.getSalud()+
                "Ataque: "+this.getAtaque()+"\n"
        );
    }
	
  *Guerrero*

	package VideoJuego.Model;

    public class Guerrero {
		System.out.println("Nombre: "+this.getNombre()+
                "Salud: "+this.getSalud()+
                "Ataque: "+this.getAtaque()+"\n"
        );
    }
	
  *Ejecutar*

	package VideoJuego.View;

    import VideoJuego.Model.Mago;
    import VideoJuego.Model.Guerrero;
    import VideoJuego.Model.Personaje;

    public class Ejecutar {
    public static void main(String[]args){
            //Mostrar Data
            Personaje personaje=new Personaje();
            personaje.setNombre("Noob");
            personaje.setSalud (60);
            personaje.setAtaque(40);
            personaje.Mostrar();

            System.out.println("Clase Hija Mago");
            Mago mago=new Mago();
            mago.setNombre("Mago");
            mago.setSalud(100);
            mago.setAtaque(80);
            mago.Mostrar();

            System.out.println("Clase Hija Guerrero");
            Guerrero guerrero= new Guerrero();
            guerrero.setNombre("Guerrero");
            guerrero.setSalud(80);
            guerrero.setAtaque(100);
            guerrero.Mostrar();
        }
    }


  **1.3. Polimorfismo**
  
  *Personaje*

    package VideoJuego.Model;

    public class Personaje {
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
	
  *Mago*

	package VideoJuego.Model;

    public class Mago extends Personaje{

        @Override
        public void Mostrar(){
            System.out.println("Nombre: "+this.getNombre()+ "\n"+
                    "Salud: "+this.getSalud()+ "\n"+
                    "Ataque: "+this.getAtaque()+"\n"
            );
        }
    }
	
  *Guerrero*

    package VideoJuego.Model;

    public class Guerrero extends Personaje{

        @Override
        public void Mostrar() {
            System.out.println("Nombre: "+this.getNombre()+"\n"+
                    "Salud: "+this.getSalud()+ "\n"+
                    "Ataque: "+this.getAtaque()+"\n"
            );
        }
    }
	
  *Ejecutar*

	package VideoJuego.View;

    import VideoJuego.Model.Mago;
    import VideoJuego.Model.Guerrero;
    import VideoJuego.Model.Personaje;

    public class Ejecutar {
        public static void main(String[]args){
            //Mostrar Data
            Personaje personaje=new Personaje();
            personaje.setNombre("Noob");
            personaje.setSalud (60);
            personaje.setAtaque(40);
            personaje.Mostrar();

            System.out.println("Clase Hija Mago");
            Mago mago=new Mago();
            mago.setNombre("Mago");
            mago.setSalud(100);
            mago.setAtaque(80);
            mago.Mostrar();

            System.out.println("Clase Hija Guerrero");
            Guerrero guerrero= new Guerrero();
            guerrero.setNombre("Guerrero");
            guerrero.setSalud(80);
            guerrero.setAtaque(100);
            guerrero.Mostrar();
        }
    }


  **1.4. Abstracción**

  *Personaje*

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

  *Mago*

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
  
  *Guerrero*

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
  
  *Ejecutar*

    package VideoJuego.View;

    import VideoJuego.Model.Mago;
    import VideoJuego.Model.Guerrero;
    import VideoJuego.Model.Personaje;

    public class Ejecutar {
        public static void main(String[]args){
            //Mostrar Data

            System.out.println("Clase Hija Mago");
            Mago mago=new Mago();
            mago.setNombre("Mago");
			mago.setHabilidad("Rayo Congelador");
            mago.setSalud(100);
            mago.setAtaque(80);
            mago.Mostrar();

            System.out.println("Clase Hija Guerrero");
            Guerrero guerrero= new Guerrero();
            guerrero.setNombre("Guerrero");
			guerrero.setArma("Espada");
            guerrero.setSalud(80);
            guerrero.setAtaque(100);
            guerrero.Mostrar();
        }
    }



***2.Vehículos***

  **2.1. Herencia**

  *Vehículo*

    package Vehiculos.Model;

    public class Vehiculo {
        private int capacidad;
        private int velocidad;
        //Set
        //Get
        //Methods Implementations
        public void Mostrar(){
            this.capacidad=5;
            this.velocidad=10;
            System.out.println("Capacidad: "+this.capacidad+" Personas \n" +
                    "Velocidad: "+this.velocidad+"Km/h \n"
            );
        }

    }


  *Bus*

    package Vehiculos.Model;

    public class Bus extends Vehiculo {
    }

  
  *Bicicleta*

    package Vehiculos.Model;

    public class Bicicleta extends Vehiculo {
    }

  *Auto*

    package Vehiculos.Model;

    public class Auto extends Vehiculo {
    }

  *Ejecutar*

    package Vehiculos.View;
    import Vehiculos.Model.Auto;
    import Vehiculos.Model.Bicicleta;
    import Vehiculos.Model.Vehiculo;
    import Vehiculos.Model.Bus;
    

    public class Ejecutar {
    public static void main(String []args){

            //Mostrar data
            System.out.println("Promando escenario 1");
            Vehiculo vehiculo =new Vehiculo();
            vehiculo.Mostrar();

            Bus bus =new Bus();
            bus.Mostrar();

            Bicicleta bicicleta =new Bicicleta();
            bicicleta.Mostrar();

            Auto auto=new Auto();
            auto.Mostrar();

        }
    }
	
  
  **2.2. Encapsulamiento**

  *Vehiculo*

    package Vehiculos.Model;

    public class Vehiculo {
        private int capacidad;
        private int velocidad;
        //Set
        public void setCapacidad(int capacidad){
            this.capacidad=capacidad;
        }

        public void setVelocidad(int velocidad){
            this.velocidad=velocidad;
        }

        //Get
        public int getCapacidad(){
            return this.capacidad;
        }

       public int getVelocidad() {
            return this.velocidad;
        }

        //Methods Implementations
        public void Mostrar(){
            System.out.println("Capacidad: "+this.capacidad+" Personas \n" +
                    "Velocidad: "+this.velocidad+"Km/h \n"
            );
        }

    }

  *Bus*

    package Vehiculos.Model;

    public class Bus extends Vehiculo{
    }

  *Bicicleta*

    package Vehiculos.Model;

    public class Bicicleta extends Vehiculo{
    }

  *Auto*

    package Vehiculos.Model;

    public class Auto extends Vehiculo{
    }

  *Ejecutar*

    package Vehiculos.View;
    import Vehiculos.Model.Auto;
    import Vehiculos.Model.Bicicleta;
    import Vehiculos.Model.Vehiculo;
    import Vehiculos.Model.Bus;
    
    public class Ejecutar {
        public static void main(String []args){

            //Mostrar data
            System.out.println("Clase Padre Vehículo");
            Vehiculo vehiculo =new Vehiculo();
            vehiculo.setCapacidad(5);
            vehiculo.setVelocidad(100);
            vehiculo.Mostrar();

            System.out.println("Clase Bus");
            Bus bus =new Bus();
            bus.setCapacidad(50);
            bus.setVelocidad(80);
            bus.Mostrar();

            System.out.println("Clase Bicicleta");
            Bicicleta bicicleta =new Bicicleta();
            bicicleta.setCapacidad(1);
            bicicleta.setVelocidad(30);
            bicicleta.Mostrar();

            System.out.println("Clase Auto");
            Auto auto=new Auto();
            auto.setCapacidad(5);
            auto.setVelocidad(200);
            auto.Mostrar();

        }
    }

  
  **2.3. Polimorfismo**

  *Vehiculo*

    package Vehiculos.Model;

    public class Vehiculo {
        private int capacidad;
        private int velocidad;
        //Set
        public void setCapacidad(int capacidad){
            this.capacidad=capacidad;
        }

        public void setVelocidad(int velocidad){
            this.velocidad=velocidad;
        }

        //Get
        public int getCapacidad(){
            return this.capacidad;
        }

       public int getVelocidad() {
            return this.velocidad;
        }

        //Methods Implementations
        public void Mostrar(){
            System.out.println("Capacidad: "+this.capacidad+" Personas \n" +
                    "Velocidad: "+this.velocidad+"Km/h \n"
            );
        }

    }

  *Bus*

    package Vehiculos.Model;

    public class Bus extends Vehiculo{
	@Override
    public void Mostrar(){
        System.out.println("Capacidad: "+this.getCapacidad()+" Personas\n" +
                "Velocidad: "+this.getVelocidad()+" km/h\n");
    }

  *Bicicleta*

    package Vehiculos.Model;

    public class Bicicleta extends Vehiculo{
	@Override
    public void Mostrar(){
        System.out.println("Capacidad: "+this.getCapacidad()+" Personas\n" +
                "Velocidad: "+this.getVelocidad()+" km/h\n");
    }

  *Auto*

    package Vehiculos.Model;

    public class Auto extends Vehiculo{
	@Override
    public void Mostrar(){
        System.out.println("Capacidad: "+this.getCapacidad()+" Personas\n" +
                "Velocidad: "+this.getVelocidad()+" km/h\n");
    }

  *Ejecutar*

    package Vehiculos.View;
    import Vehiculos.Model.Auto;
    import Vehiculos.Model.Bicicleta;
    import Vehiculos.Model.Vehiculo;
    import Vehiculos.Model.Bus;
    
    public class Ejecutar {
        public static void main(String []args){

            //Mostrar data
            System.out.println("Clase Padre Vehículo");
            Vehiculo vehiculo =new Vehiculo();
            vehiculo.setCapacidad(5);
            vehiculo.setVelocidad(100);
            vehiculo.Mostrar();

            System.out.println("Clase Bus");
            Bus bus =new Bus();
            bus.setCapacidad(50);
            bus.setVelocidad(80);
            bus.Mostrar();

            System.out.println("Clase Bicicleta");
            Bicicleta bicicleta =new Bicicleta();
            bicicleta.setCapacidad(1);
            bicicleta.setVelocidad(30);
            bicicleta.Mostrar();

            System.out.println("Clase Auto");
            Auto auto=new Auto();
            auto.setCapacidad(5);
            auto.setVelocidad(200);
            auto.Mostrar();

        }
    }
  
  
  
  **2.4. Abstracción**

  *Vehiculo*

    package Vehiculos.Model;

    public abstract class Vehiculo {
        private int capacidad;
        private int velocidad;
        //Set
        public void setCapacidad(int capacidad){
            this.capacidad=capacidad;
        }

        public void setVelocidad(int velocidad){
            this.velocidad=velocidad;
        }

        //Get
        public int getCapacidad(){
            return this.capacidad;
        }

       public int getVelocidad() {
            return this.velocidad;
        }

        //Methods Implementations
        public void Mostrar(){
            System.out.println("Capacidad: "+this.capacidad+" Personas \n" +
                    "Velocidad: "+this.velocidad+"Km/h \n"
            );
        }

    }
  
  *Bus*

    package Vehiculos.Model;

    public class Bus extends Vehiculo{
        private int numeroRutas;
        public int getNumeroRutas(){
            return numeroRutas;
        }

        public void setNumeroRutas(int numeroRutas){
            this.numeroRutas=numeroRutas;
        }

        @Override
        public void Mostrar(){
            System.out.println("Capacidad: "+this.getCapacidad()+" Personas\n" +
                    "Velocidad: "+this.getVelocidad()+" km/h\n" +
                    "Números de rutas: "+this.getNumeroRutas()+"\n");
        }
    }

  *Bicicleta*

    package Vehiculos.Model;

    public class Bicicleta extends Vehiculo{
        private String cambios;
        public String getCambios(){
            return cambios;
        }
        public void setCambios(String cambios){
            this.cambios=cambios;
        }
        @Override
        public void Mostrar() {
            System.out.println("Capacidad: " + this.getCapacidad() + " Personas\n" +
                    "Velocidad: " + this.getVelocidad() + " km/h\n" +
                    "Tiene Cambios? "+this.getCambios()+"\n");
        }
    }

  *Auto*

    package Vehiculos.Model;

    public class Auto extends Vehiculo{
        private String combustible;
        public String getCombustible(){
            return combustible;
        }

        public void setCombustible(String combustible) {
            this.combustible = combustible;
        }

        @Override
        public void Mostrar(){
            System.out.println("Capacidad: "+this.getCapacidad()+" Personas\n" +
                    "Velocidad: "+this.getVelocidad()+ " Km/h\n" +
                    "Tipo de conbustible: "+this.getCombustible()+"\n");
        }
    }

  *Ejecutar*

    package Vehiculos.View;
    import Vehiculos.Model.Auto;
    import Vehiculos.Model.Bicicleta;
    import Vehiculos.Model.Vehiculo;
    import Vehiculos.Model.Bus;

    public class Ejecutar {
        public static void main(String []args){

            //Mostrar data

            System.out.println("Clase Bus");
            Bus bus =new Bus();
            bus.setCapacidad(50);
            bus.setVelocidad(80);
            bus.setNumeroRutas(10);
            bus.Mostrar();

            System.out.println("Clase Bicicleta");
            Bicicleta bicicleta =new Bicicleta();
            bicicleta.setCapacidad(1);
            bicicleta.setVelocidad(30);
            bicicleta.setCambios("Si");
            bicicleta.Mostrar();

            System.out.println("Clase Auto");
            Auto auto=new Auto();
            auto.setCapacidad(5);
            auto.setVelocidad(200);
            auto.setCombustible("Gasolina");
            auto.Mostrar();

        }
    }



***3.Reservación de Hotel***

  **3.1. Herencia**

  *Habitación*

    package Reservas_de_Hotel.Model;

    public class Habitacion {
        private String nombreCliente;
        private int dias;
        private double precioNoche;
       private int capacidadPersonas;
        //Set
        //Get
        //Mthods Implementations
        public void Mostrar(){
           this.nombreCliente ="Pablo";
            this.dias=5;
            this.precioNoche=15.000;
            this.capacidadPersonas=5;
            System.out.println("Nombre del cliente: "+this.nombreCliente+ "\n" +
                    "Días de estancia: "+this.dias+"\n" +
                    "Precio Por noche: "+this.precioNoche+ "\n" +
                    "Cantidad de personas en la habitación: "+this.capacidadPersonas+"\n"
            );

        }
    }

  *Habitación Sencilla*

    package Reservas_de_Hotel.Model;

    public class HabitacionSencilla extends Habitacion{

    }

  *Habitación Doble*

    package Reservas_de_Hotel.Model;

    public class HabitacionDoble extends Habitacion{
    }

  *Habitación VIP*

    package Reservas_de_Hotel.Model;

    public class HabitacionVip extends Habitacion{
    }

  *Ejecutar*

    package Reservas_de_Hotel.View;

    import Reservas_de_Hotel.Model.Habitacion;
    import Reservas_de_Hotel.Model.HabitacionDoble;
    import Reservas_de_Hotel.Model.HabitacionSencilla;
    import Reservas_de_Hotel.Model.HabitacionVip;

    public class Ejecutar {
        public static void main(String[]args){
            //Mostrar data
            System.out.println("Probando ecenario 1.");

            Habitacion habitacion=new Habitacion();
            habitacion.Mostrar();

            HabitacionSencilla habitacionSencilla=new HabitacionSencilla();
            habitacionSencilla.Mostrar();

            HabitacionDoble habitacionDoble=new HabitacionDoble();
            habitacionDoble.Mostrar();

            HabitacionVip habitacionVip=new HabitacionVip();
            habitacionVip.Mostrar();
        }
    }

  
  **3.2. Encapsulamiento**

  *Habitación*

    package Reservas_de_Hotel.Model;

    public class Habitacion {
        private String nombreCliente;
        private int dias;
        private double precioNoche;
        private int capacidadPersonas;
        //Set
        public void setNombreCliente(String nombreCliente){
            this.nombreCliente=nombreCliente;
        }
        public void setDias (int dias){
            this.dias=dias;
        }
        public void setPrecioNoche(double precioNoche){
            this.precioNoche=precioNoche;
        }
        public void setCapacidadPersonas(int capacidadPersonas){
            this.capacidadPersonas=capacidadPersonas;
        }

        //Get
        public String getNombreCliente(){
            return this.nombreCliente;
        }
        public int getDias(){
            return this.dias;
        }
        public double getPrecioNoche(){
            return this.precioNoche;
        }
        public int getCapacidadPersonas(){
            return  this.capacidadPersonas;
        }

        //Mthods Implementations
        public void Mostrar(){
            System.out.println("Nombre del cliente: "+this.nombreCliente+ "\n" +
                    "Días de estancia: "+this.dias+"\n" +
                    "Precio Por noche: "+this.precioNoche+ "\n" +
                    "Capacidad maxima de la habitación: "+this.capacidadPersonas+"\n"
            );

        }
    }

  *Habitación Sencilla*

    package Reservas_de_Hotel.Model;

    public class HabitacionSencilla extends Habitacion{

    }

  *Habitación Doble*

    package Reservas_de_Hotel.Model;

    public class HabitacionDoble extends Habitacion{
    }

  *Habitación VIP*

    package Reservas_de_Hotel.Model;

    public class HabitacionVip extends Habitacion{
    }
	
  *Ejecutar*

    package Reservas_de_Hotel.View;

    import Reservas_de_Hotel.Model.Habitacion;
    import Reservas_de_Hotel.Model.HabitacionDoble;
    import Reservas_de_Hotel.Model.HabitacionSencilla;
    import Reservas_de_Hotel.Model.HabitacionVip;

    public class Ejecutar {
        public static void main(String[]args){
            //Mostrar data
            System.out.println("Clase Padre");
            Habitacion habitacion=new Habitacion();
            habitacion.setNombreCliente("Pablo Perez");
            habitacion.setDias(5);
            habitacion.setPrecioNoche(50.000);
            habitacion.setCapacidadPersonas(5);
            habitacion.Mostrar();
    
            System.out.println("Habitación Sencilla");
            HabitacionSencilla habitacionSencilla=new HabitacionSencilla();
            habitacionSencilla.setNombreCliente("Maria de la Rosa");
            habitacionSencilla.setDias(3);
            habitacionSencilla.setPrecioNoche(100.000);
            habitacionSencilla.setCapacidadPersonas(2);
            habitacionSencilla.Mostrar();

            System.out.println("Habitación Doble");
            HabitacionDoble habitacionDoble=new HabitacionDoble();
            habitacionDoble.setNombreCliente("Julian Nuñez");
            habitacionDoble.setDias(7);
            habitacionDoble.setPrecioNoche(150.000);
            habitacionDoble.setCapacidadPersonas(4);
            habitacionDoble.Mostrar();

            System.out.println("Habitación VIP");
            HabitacionVip habitacionVip=new HabitacionVip();
            habitacionVip.setNombreCliente("Nikolai Romanov");
            habitacionVip.setDias(5);
            habitacionVip.setPrecioNoche(200.000);
            habitacionVip.setCapacidadPersonas(3);
            habitacionVip.Mostrar();
        }
    }

 
  **3.3. Polimorfismo**

  *Habitación*

    package Reservas_de_Hotel.Model;

    public class Habitacion {
        private String nombreCliente;
        private int dias;
        private int precioNoche;
        private int capacidadPersonas;
        //Set
        public void setNombreCliente(String nombreCliente){
            this.nombreCliente=nombreCliente;
        }
        public void setDias (int dias){
            this.dias=dias;
        }
        public void setPrecioNoche(int precioNoche){
            this.precioNoche=precioNoche;
        }
        public void setCapacidadPersonas(int capacidadPersonas){
            this.capacidadPersonas=capacidadPersonas;
        }

        //Get
        public String getNombreCliente(){
            return this.nombreCliente;
        }
        public int getDias(){
            return this.dias;
        }
        public int getPrecioNoche(){
            return this.precioNoche;
        }
        public int getCapacidadPersonas(){
            return  this.capacidadPersonas;
        }

        //Mthods Implementations
        public void Mostrar(){
            System.out.println("Nombre del cliente: "+this.nombreCliente+ "\n" +
                    "Días de estancia: "+this.dias+" Días\n" +
                    "Precio Por noche: $"+this.precioNoche+ " Mil\n" +
                    "Capacidad maxima de la habitación: "+this.capacidadPersonas+" Personas\n"
            );

        }
    }

  *Habitación Sencilla*

    package Reservas_de_Hotel.Model;

    public class HabitacionSencilla extends Habitacion{
        @Override
        public void Mostrar(){
            System.out.println("Nombre del cliente: "+this.getNombreCliente()+ "\n" +
                    "Días de estancia: "+this.getDias()+" Días\n" +
                    "Precio por noche: $"+this.getPrecioNoche()+ " Mil\n" +
                    "Capadidad de la habitación: "+this.getCapacidadPersonas()+" Personas\n");
        }

    }

  *Habitación Doble*

    package Reservas_de_Hotel.Model;

    public class HabitacionDoble extends Habitacion{
        @Override
        public void Mostrar(){
            System.out.println("Nombre del cliente: "+this.getNombreCliente()+ "\n" +
                    "Días de estancia: "+this.getDias()+" Días\n" +
                    "Precio por noce: $"+this.getPrecioNoche()+" Mil\n" +
                    "Capacidad de la habitación: "+this.getCapacidadPersonas()+" Personas\n");
        }
    }

  *Habitación VIP*

    package Reservas_de_Hotel.Model;

    public class HabitacionVip extends Habitacion{
        @Override
        public void Mostrar(){
            System.out.println("Nombre del cliente: "+this.getNombreCliente()+"\n" +
                    "Días de estancia: "+this.getDias()+ " Días\n" +
                    "Precio por noche: $"+this.getPrecioNoche()+" Mil\n" +
                    "Capacidad de la habitación: "+this.getCapacidadPersonas()+" Personas\n");
        }
    }

  *Ejecutar*

    package Reservas_de_Hotel.View;

    import Reservas_de_Hotel.Model.Habitacion;
    import Reservas_de_Hotel.Model.HabitacionDoble;
    import Reservas_de_Hotel.Model.HabitacionSencilla;
    import Reservas_de_Hotel.Model.HabitacionVip;

    public class Ejecutar {
        public static void main(String[]args){
            //Mostrar data
            System.out.println("Clase Padre");
            Habitacion habitacion=new Habitacion();
            habitacion.setNombreCliente("Pablo Perez");
            habitacion.setDias(5);
            habitacion.setPrecioNoche(50);
            habitacion.setCapacidadPersonas(5);
            habitacion.Mostrar();

            System.out.println("Habitación Sencilla");
            HabitacionSencilla habitacionSencilla=new HabitacionSencilla();
            habitacionSencilla.setNombreCliente("Maria de la Rosa");
            habitacionSencilla.setDias(3);
            habitacionSencilla.setPrecioNoche(100);
            habitacionSencilla.setCapacidadPersonas(2);
            habitacionSencilla.Mostrar();

            System.out.println("Habitación Doble");
            HabitacionDoble habitacionDoble=new HabitacionDoble();
            habitacionDoble.setNombreCliente("Julian Nuñez");
            habitacionDoble.setDias(7);
            habitacionDoble.setPrecioNoche(150);
            habitacionDoble.setCapacidadPersonas(4);
            habitacionDoble.Mostrar();

            System.out.println("Habitación VIP");
            HabitacionVip habitacionVip=new HabitacionVip();
            habitacionVip.setNombreCliente("Nikolai Romanov");
            habitacionVip.setDias(5);
            habitacionVip.setPrecioNoche(200);
            habitacionVip.setCapacidadPersonas(3);
            habitacionVip.Mostrar();
        }    
    }

  
  **3.4. Abstracción**

  *Habitación*

    package Reservas_de_Hotel.Model;

    public abstract class Habitacion {
        private String nombreCliente;
        private int dias;
        private int precioNoche;
        private int capacidadPersonas;
		
        //Set
        public void setNombreCliente(String nombreCliente){
            this.nombreCliente=nombreCliente;
        }
        public void setDias (int dias){
                this.dias=dias;
        }
        public void setPrecioNoche(int precioNoche){
            this.precioNoche=precioNoche;
        }
        public void setCapacidadPersonas(int capacidadPersonas){
            this.capacidadPersonas=capacidadPersonas;
        }

        //Get
        public String getNombreCliente(){
            return this.nombreCliente;
        }
        public int getDias(){
            return this.dias;
        }
        public int getPrecioNoche(){
            return this.precioNoche;
        }
        public int getCapacidadPersonas(){
            return  this.capacidadPersonas;
        }

        //Mthods Implementations
        public void Mostrar(){
            System.out.println("Nombre del cliente: "+this.nombreCliente+ "\n" +
                    "Días de estancia: "+this.dias+" Días\n" +
                    "Precio Por noche: $"+this.precioNoche+ " Mil\n" +
                   "Capacidad maxima de la habitación: "+this.capacidadPersonas+" Personas\n"
            );

        }
    }

  *Habitación Sencilla*

    package Reservas_de_Hotel.Model;

    public class HabitacionSencilla extends Habitacion{
        private String desayuno;

        public String getDesayuno(){
            return desayuno;
        }
        public void setDesayuno(String desayuno){
            this.desayuno=desayuno;
        }
        public  double precioTotal(){
            return getDias()*getPrecioNoche();
        }

        @Override
        public void Mostrar(){
            System.out.println("Nombre del cliente: "+this.getNombreCliente()+ "\n" +
                    "Días de estancia: "+this.getDias()+" Días\n" +
                    "Precio por noche: $"+this.getPrecioNoche()+ " Mil\n" +
                    "Capadidad de la habitación: "+this.getCapacidadPersonas()+" Personas\n" +
                    "Precio Total: $"+this.precioTotal()+"\n" +
                    "¿Incluye desayuno? "+this.getDesayuno()+"\n");
        }

    }

  *Habitación Doble*

    package Reservas_de_Hotel.Model;

    public class HabitacionDoble extends Habitacion{
        private String vistaMar;
    
        public String getVistaMar(){
            return vistaMar;
        }
        public void setVistaMar(String vistaMar){
            this.vistaMar=vistaMar;
        }
    
        public double precioTotal(){
            return getDias()*getPrecioNoche()*1.10;
        }
        @Override
        public void Mostrar(){
            System.out.println("Nombre del cliente: "+this.getNombreCliente()+ "\n" +
                    "Días de estancia: "+this.getDias()+" Días\n" +
                    "Precio por noce: $"+this.getPrecioNoche()+" Mil\n" +
                    "Capacidad de la habitación: "+this.getCapacidadPersonas()+" Personas\n" +
                    "Precio Total (Con adicional 10%): $"+this.precioTotal()+"\n" +
                    "¿Incluye vista al mar? "+this.getVistaMar()+"\n");
        }
    }

  *Habitación VIP*

    package Reservas_de_Hotel.Model;

    public class HabitacionVip extends Habitacion{
        private String jacuzziProvado;

        public String getjacuzziProvado() {
            return jacuzziProvado;
        }
    
        public void setJacuzziProvado(String jacuzziProvado){
            this.jacuzziProvado=jacuzziProvado;
        }

        public double precioTotal(){
            return getDias()*getPrecioNoche()*1.25;
        }

        @Override
        public void Mostrar(){
            System.out.println("Nombre del cliente: "+this.getNombreCliente()+"\n" +
                    "Días de estancia: "+this.getDias()+ " Días\n" +
                    "Precio por noche: $"+this.getPrecioNoche()+" Mil\n" +
                    "Capacidad de la habitación: "+this.getCapacidadPersonas()+" Personas\n" +
                    "Precio Total(Con adicional del 2    5%): $"+this.precioTotal()+"\n" +
                    "¿Incluye jacuzzi privado? "+this.getjacuzziProvado()+"\n");
        }
    }



  *Ejecutar*

    package Reservas_de_Hotel.View;

    import Reservas_de_Hotel.Model.Habitacion;
    import Reservas_de_Hotel.Model.HabitacionDoble;
    import Reservas_de_Hotel.Model.HabitacionSencilla;
    import Reservas_de_Hotel.Model.HabitacionVip;

    public class Ejecutar {
        public static void main(String[]args){
            //Mostrar data

            System.out.println("Habitación Sencilla");
            HabitacionSencilla habitacionSencilla=new HabitacionSencilla();
            habitacionSencilla.setNombreCliente("Maria de la Rosa");
            habitacionSencilla.setDias(3);
            habitacionSencilla.setPrecioNoche(100);
            habitacionSencilla.setCapacidadPersonas(2);
            habitacionSencilla.setDesayuno("Si");
            habitacionSencilla.Mostrar();
    
            System.out.println("Habitación Doble");
            HabitacionDoble habitacionDoble=new HabitacionDoble();
            habitacionDoble.setNombreCliente("Julian Nuñez");
            habitacionDoble.setDias(7);
            habitacionDoble.setPrecioNoche(150);
            habitacionDoble.setCapacidadPersonas(4);
            habitacionDoble.setVistaMar("Si");
            habitacionDoble.Mostrar();

            System.out.println("Habitación VIP");
            HabitacionVip habitacionVip=new HabitacionVip();
            habitacionVip.setNombreCliente("Nikolai Romanov");
            habitacionVip.setDias(5);
            habitacionVip.setPrecioNoche(200);
            habitacionVip.setCapacidadPersonas(3);
            habitacionVip.setJacuzziProvado("Si");
           habitacionVip.Mostrar();
        }
    }

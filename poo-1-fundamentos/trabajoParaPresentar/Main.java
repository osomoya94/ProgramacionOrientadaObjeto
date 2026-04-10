package trabajoParaPresentar;

import java.util.Scanner;

public class Main {
    public static void cargarDatos() {
        //ESTA ES LA FUNCION PARA CARGAR LAS PELICULAS QUE SE VAN A GUARDAR
        // ESTA TENEMOS QUE CARGARLA A MANO
        Scanner sc = new Scanner(System.in);
        Peliculas pelicula1 = new Peliculas();

        System.out.println("Ingrese el titulo de la pelicula: ");// ESTO SE IMPRIME EN PANTALLA
        pelicula1.setTitulo(sc.nextLine());// ESTO LO LEE, ES LO QUE EL USUARIO TIENE QUE INGRESAR
        // LOS DE STRING SON NEXTLINE, LOS DE INT SON NEXTINT, LOS DE BOOLEAN SON NEXTBOOLEAN
        System.out.println("Ingrese el director de la pelicula: ");
        pelicula1.setDirector(sc.nextLine());
        System.out.println("Ingrese el genero de la pelicula: ");
        pelicula1.setGenero(sc.nextLine());
        System.out.println("Ingrese el anio de estreno de la pelicula: ");
        pelicula1.setanioEstreno(sc.nextInt());
        System.out.println("Ingrese la duracion de la pelicula en minutos: ");
        pelicula1.setDuracion(sc.nextInt());
        System.out.println("Ingrese si la pelicula es apta para mayores de 18: ");

        pelicula1.setAptaMas18(sc.nextBoolean());
    }

    public static void peliculaCargada() {
        Peliculas pelicula2 = new Peliculas();
        // ESTA ES LA FUNCION DE MOSTRAR INFORMACION OSEA QUE AQUI SE CARGAN LAS PELICULAS
        // LOS DATOS YA FUERON CARGADOS DE ANTE MANO
        pelicula2.setTitulo("El senor de los anillos: La comunidad del anillo");
        pelicula2.setDirector("Peter Jackson");
        pelicula2.setGenero("Accion");
        pelicula2.setanioEstreno(2001);
        pelicula2.setDuracion(180);
        pelicula2.setAptaMas18(true);

        pelicula2.mostrarInformacion();
        // ESTA FUNCION ES DE MOSTRAR INFORMACION ES LA DEFINIDA EN LA CLASE PARA MOSTRAR 
        
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//ESTO NO HACE NADA ES UNA DECLARACION PERO SI LA BORRO ME DAN ERRORES
       //ESTO NO HACE NADA ES UNA DECLARACION PERO SI LA BORRO ME DAN ERRORES

        int opcion = 0;// DEFINO LA OPCION A FUERA XQ SE VA A USAR EN EL DO WHILE
        do {
            System.out.println("1. Mostrar pelicula cargada \n2. Cargar pelicula \n3. Salir");//IMPRIME LAS OPCIONESEN PANTALLA
            // \n HACEN SALTOS DE LINEA ASI SE VEA MAS LIMPIO
            opcion = sc.nextInt();// LEERA LA OPCION QUE ELEGIMOS, SI LA OPCION NO ES LA 3 EL DO WHILE SE VUELVE A EJECUTAR


            switch (opcion) {
                case 1:
                    peliculaCargada();
                    break;
                case 2:
                    cargarDatos();
                    break;
            }
            
        } while (opcion != 3);
    

    }
}

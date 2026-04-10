package ejercicio9;

import java.util.Scanner;

public class ArbolEquipo {

    public static void mostrarArbol(Equipo nodo){

        if(nodo != null){

            nodo.mostrarJugadores();

            mostrarArbol(nodo.izquierdo);
            mostrarArbol(nodo.derecho);
        }
    }


//     public static void recorridoInorden(Equipo nodo) {
//     if (nodo == null) return; // Caso base

//     recorridoInorden(nodo.izquierdo);  // 1. Voy todo a la izquierda
//     nodo.mostrarJugadores();           // 2. Muestro la Raíz
//     recorridoInorden(nodo.derecho);    // 3. Voy a la derecha
//     }

//     public static void recorridoPostorden(Equipo nodo) {
//     if (nodo == null) return; // Caso base

//     recorridoPostorden(nodo.izquierdo); // 1. Voy todo a la izquierda
//     recorridoPostorden(nodo.derecho);   // 2. Voy todo a la derecha
//     nodo.mostrarJugadores();            // 3. Muestro la Raíz al final
//     }


// public static void recorridoAnchura(Equipo raiz) {
//     if (raiz == null) return; // Si el árbol está vacío, corto acá.

//     // Creo la fila (Cola/Queue) y agrego el primer equipo (la liga)
//     Queue<Equipo> cola = new LinkedList<>();
//     cola.add(raiz);

//     // Mientras haya alguien en la fila...
//     while (!cola.isEmpty()) {
        
//         // 1. Saco al equipo que está primero en la fila
//         Equipo actual = cola.poll();
        
//         // 2. Muestro sus datos
//         actual.mostrarJugadores();
        
//         // 3. Si tiene un equipo a la izquierda, lo mando al final de la fila
//         if (actual.izquierdo != null) {
//             cola.add(actual.izquierdo);
//         }
        
//         // 4. Si tiene un equipo a la derecha, lo mando al final de la fila
//         if (actual.derecho != null) {
//             cola.add(actual.derecho);
//         }
//     }
//     }


    public static void cargarJugadores(Equipo equipo, Scanner sc)
    {
        System.out.println("Ingrese jujadores para " + equipo.getNombre());
        System.out.println("Escriba salir apra salir ");

        while (true) {
            System.out.println("jugador");
            String jugador = sc.nextLine();

            if (jugador.equalsIgnoreCase("salir")) {
                break;
            }

            equipo.agregarJugadore(jugador);
        }

    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la liga: ");
        Equipo liga = new Equipo(sc.nextLine());

        System.out.println("Ingrese el nombre del equipo izquierdo: ");
        Equipo equipo1 = new Equipo(sc.nextLine());

        System.out.println("Ingrese el nombre del equipo derecho: ");
        Equipo equipo2 = new Equipo(sc.nextLine());

        liga.izquierdo = equipo1;
        liga.derecho = equipo2;

        cargarJugadores(liga, sc);
        cargarJugadores(equipo1, sc);
        cargarJugadores(equipo2, sc);

        System.out.println("\n----- Equipos y jugadores-----");

        mostrarArbol(liga);

        sc.close();
    }
}

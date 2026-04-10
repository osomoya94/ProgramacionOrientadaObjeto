import java.util.Scanner;

public class ArbolPeliculas {
    public static void recomendar(Nodo nodo, Scanner sc) {
        if (nodo == null) {
            return;
        }

        if (nodo.resultado != null) {
            System.out.println("Te recomendamos ver: " + nodo.resultado);
            return;
        }

        System.out.println(nodo.pregunta + " (si/no)");
        String respuesta = sc.nextLine().toLowerCase();

        if (respuesta.equalsIgnoreCase("si")) {
            recomendar(nodo.derecha, sc);
        } else {
            recomendar(nodo.izquierda, sc);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nodo avengers = new Nodo("Avengers: Endgame");
        // Nodo titanic = new Nodo("Titanic");
        // Nodo toyStory = new Nodo("Toy Story");

        Nodo ingSistemas = new Nodo("ingenieria de sistemas");
        Nodo disenio = new Nodo("disenio de software");
        Nodo marketing = new Nodo("marketing digital");
        Nodo contabilida = new Nodo("contabilidad");

        
        Nodo preguntaMarketing = new Nodo("Te gusta el marketing?",marketing, contabilida); 
        Nodo preguntaDisenio = new Nodo("Te gustan el disenio",disenio, preguntaMarketing);
        Nodo raiz = new Nodo("Te gustan las matematicas?",preguntaDisenio, ingSistemas);


        recomendar(raiz, sc);
        sc.close();
    }
}

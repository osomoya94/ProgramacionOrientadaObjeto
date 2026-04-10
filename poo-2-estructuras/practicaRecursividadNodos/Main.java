package practicaRecursividadNodos;

public class Main {
    public static void main(String[] args) {
        Biblioteca miBiblio = new Biblioteca();

        // 1. Creamos la Raíz (Nivel 1)
        miBiblio.raiz = new Libro(50, "El Señor de los Anillos");

        // 2. Creamos los hijos de la raíz (Nivel 2)
        miBiblio.raiz.izquierdo = new Libro(30, "1984");
        miBiblio.raiz.derecho = new Libro(70, "Harry Potter");

        // 3. Creamos los hijos del libro 30 (Nivel 3)
        miBiblio.raiz.izquierdo.izquierdo = new Libro(20, "El Principito");
        miBiblio.raiz.izquierdo.derecho = new Libro(40, "Don Quijote");

        // ¡A probar los recorridos!
        System.out.println("--- RECORRIDO INORDEN ---");
        // Debería imprimir: 20, 30, 40, 50, 70 (¡Ordenados!)
        miBiblio.inorden(miBiblio.raiz); 
        
        System.out.println("\n--- RECORRIDO PREORDEN ---");
        miBiblio.preorden(miBiblio.raiz);
    }
}
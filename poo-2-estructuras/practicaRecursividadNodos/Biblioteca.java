package practicaRecursividadNodos;

public class Biblioteca {
    Libro raiz; // El punto de partida de nuestro árbol

    public Biblioteca() {
        this.raiz = null;
    }

    // ----------------------------------------------------
    // PREORDEN: Raíz -> Izquierdo -> Derecho
    // ----------------------------------------------------
    public void preorden(Libro nodo) {
        if (nodo == null) return; // ¡Nuestro caso base!
        
        // 1. RAÍZ: Imprimo primero
        System.out.println(nodo.codigo + " - " + nodo.titulo); 
        // 2. IZQUIERDO: Bajo por la izquierda
        preorden(nodo.izquierdo);
        // 3. DERECHO: Bajo por la derecha
        preorden(nodo.derecho);
    }

    // ----------------------------------------------------
    // INORDEN: Izquierdo -> Raíz -> Derecho (IDEAL PARA ORDENAR)
    // ----------------------------------------------------
    public void inorden(Libro nodo) {
        if (nodo == null) return; 
        
        // 1. IZQUIERDO: Bajo todo lo que pueda a la izquierda
        inorden(nodo.izquierdo);
        // 2. RAÍZ: Imprimo en el medio
        System.out.println(nodo.codigo + " - " + nodo.titulo); 
        // 3. DERECHO: Bajo por la derecha
        inorden(nodo.derecho);
    }

    // ----------------------------------------------------
    // POSTORDEN: Izquierdo -> Derecho -> Raíz
    // ----------------------------------------------------
    public void postorden(Libro nodo) {
        if (nodo == null) return; 
        
        // 1. IZQUIERDO: Bajo todo a la izquierda
        postorden(nodo.izquierdo);
        // 2. DERECHO: Bajo todo a la derecha
        postorden(nodo.derecho);
        // 3. RAÍZ: Imprimo al final (desde las hojas hacia arriba)
        System.out.println(nodo.codigo + " - " + nodo.titulo); 
    }
}
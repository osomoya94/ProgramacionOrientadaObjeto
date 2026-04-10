package coloquio;
public class Nodo {
    String dato;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(String dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Nodo(String dato, Nodo izquierdo, Nodo derecho) {
        this.dato = dato;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
}

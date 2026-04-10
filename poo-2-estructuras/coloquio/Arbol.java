package coloquio;

public class Arbol {
    Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public int contarHojas() {
        return contarHojas(this.raiz);
    }

    private int contarHojas(Nodo nodoActual) {
        if (nodoActual == null) {
            return 0;
        }

        if (nodoActual.izquierdo == null && nodoActual.derecho == null) {
            return 1;
        }

        return contarHojas(nodoActual.izquierdo) + contarHojas(nodoActual.derecho);
    }

    public void mostrarPreorden() {
        mostrarPreorden(this.raiz);
        System.out.println();
    }

    private void mostrarPreorden(Nodo nodoActual) {
        if (nodoActual == null) {
            return;
        }

        System.out.print(nodoActual.dato + " ");
        mostrarPreorden(nodoActual.izquierdo);
        mostrarPreorden(nodoActual.derecho);
    }

    /*     int suma(Nodo raiz) {
    if (raiz == null) return 0;
    return raiz.dato + suma(raiz.izq) + suma(raiz.der);
    }

    public class ejarboles {
    int contar(Nodo raiz) {
    if (raiz == null) return 0;
    return 1 + contar(raiz.izq) + contar(raiz.der);
    }

    */


}

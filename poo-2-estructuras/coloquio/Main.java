package coloquio;

public class Main {
    public static void main(String[] args) {
        Nodo ingenieria = new Nodo("Ingenieria");
        Nodo medicina = new Nodo("Medicina");
        Nodo derecho = new Nodo("Derecho");
        Nodo marketing = new Nodo("Marketing");

        Nodo ciencias = new Nodo("Ciencias", ingenieria, medicina);
        Nodo sociales = new Nodo("Sociales", derecho, marketing);
        Nodo universidad = new Nodo("Universidad", ciencias, sociales);

        Arbol arbolCarreras = new Arbol(universidad);

        System.out.println("Recorrido preorden del arbol:");
        arbolCarreras.mostrarPreorden();

        int totalHojas = arbolCarreras.contarHojas();
        System.out.println("Cantidad total de hojas: " + totalHojas);
    }
}

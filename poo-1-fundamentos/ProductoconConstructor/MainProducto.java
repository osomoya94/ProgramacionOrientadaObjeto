package ProductoconConstructor;

public class MainProducto {
    
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 1000);
        Producto p2 = new Producto("Tablet", 0);
        p1.mostrarInformacion();
        p2.mostrarInformacion();
    }
    
}

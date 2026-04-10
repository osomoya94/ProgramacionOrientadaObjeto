package ejercicioprueba;

public class Main {

    public static void main(String[] args) {
        Productos productos = new Productos();
        productos.ListaProductos(" lavandina ", " claro ",150.75);
        productos.ListaProductos(" detergente ", " brilloso ", 220.50);
        productos.ListaProductos(" limpiador de piso ", " aromax ", 185.90);
        productos.ListaProductos(" desinfectante ", " clorox ", 180.50);
        productos.ListaProductos(" quita manchas", " spotfri ", 300.00);

        productos.ordenar();
        productos.getProductos().forEach(System.out::println);

        System.err.println("-----------------------------------------------------------------------");
        productos.eliminarLavandina();
        productos.getProductos().forEach(System.out::println);
    }
}

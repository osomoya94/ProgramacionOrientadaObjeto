package ejercicioprueba;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Productos {
    ArrayList<HashMap<String, Object>> productos = new ArrayList<>();

    public void ListaProductos(String nombre, String fabricante, double precio) {
        HashMap<String, Object> producto = new HashMap<>();
        producto.put("nombre", nombre);
        producto.put("fabricante", fabricante);
        producto.put("precio", precio);
        productos.add(producto);
    }

    public void ordenar() {
    Collections.sort(productos, new Comparator<HashMap<String, Object>>() {
        @Override
        public int compare(HashMap<String, Object> p1, HashMap<String, Object> p2) {
            double precio1 = (double) p1.get("precio"); 
            double precio2 = (double) p2.get("precio"); 
            return Double.compare(precio1, precio2);
        }});}



    public ArrayList<HashMap<String, Object>> getProductos() {
        return productos;
    }

    public void eliminarLavandina(){
        productos.removeIf(producto -> producto.get("nombre").equals(" lavandina "));
    }
}


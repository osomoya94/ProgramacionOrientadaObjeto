package ProductoconConstructor;

public class Producto {
    private String nombre;
    private int precio;
    
    public Producto(String nombre, int precio){
        // this.nombre = nombre;
        // this.precio = precio;
        setNombre(nombre);
        setPrecio(precio);
    }

    public String setNombre(String nombre) {
        return this.nombre = nombre;
    }

    public int setPrecio(int precio) {
        if(precio > 0){
            this.precio = precio;
        }else{
            this.precio = 0;
        }
        return precio;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre + " Precio: " + this.precio);
    }

    
}

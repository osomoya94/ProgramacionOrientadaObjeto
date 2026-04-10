package Parcial19;
import java.util.ArrayList;

public class Sucursal {

    private String nombre;
    private ArrayList<Integer> ventas;
    Sucursal izquierda;
    Sucursal derecha;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        ventas = new ArrayList<>();
        izquierda = null;
        derecha = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarVentas(int venta) {
        ventas.add(venta);
    }

    public void mostrarSucursales() {
        System.out.println("Sucursal: " + nombre);
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            System.out.println("Ventas:");
            for (Integer venta : ventas) {
                System.out.println("- " + venta);
            }
        }
        System.out.println();
    }

    public int totalVentas() {
        int total = 0;
        for (int i = 0; i < ventas.size(); i++) {
            total = total + ventas.get(i);
        }
        return total;
    }

    public Sucursal sucursalMayorVenta() {
        int totalVentas = totalVentas();
        Sucursal mayorVentaSucursal = this;

        if (izquierda != null) {
            Sucursal izquierdaMayor = izquierda.sucursalMayorVenta();
            int totalIzquierda = izquierdaMayor.totalVentas();
            if (totalIzquierda > totalVentas) {
                mayorVentaSucursal = izquierdaMayor;
                totalVentas = totalIzquierda;
            }
        }

        if (derecha != null) {
            Sucursal derechaMayor = derecha.sucursalMayorVenta();
            int totalDerecha = derechaMayor.totalVentas();
            if (totalDerecha > totalVentas) {
                mayorVentaSucursal = derechaMayor;
            }
        }

        return mayorVentaSucursal;
    }
}

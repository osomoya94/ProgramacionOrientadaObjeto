package Parcial19;
import java.util.Scanner;

public class Main {
    public static void mostrarSucursales(Sucursal nodo){
        if (nodo == null) {
            return;
        }

        nodo.mostrarSucursales();
        mostrarSucursales(nodo.izquierda);
        mostrarSucursales(nodo.derecha);
    }

    public static void cargarSucursales(Sucursal nodo, Scanner sc){
        System.out.println("Ingrese los montos de venta para " + nodo.getNombre());
        System.out.println("Escriba salir para salir ");

        while (true) {
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                int venta = Integer.parseInt(entrada);
                nodo.agregarVentas(venta);
            } catch (Exception e) {
                System.out.println("Entrada invalida. Ingrese un numero entero.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la sucursal raiz: ");
        Sucursal raiz = new Sucursal(sc.nextLine());

        System.out.println("Ingrese el nombre de la sucursal izquierda: ");
        Sucursal izquierda = new Sucursal(sc.nextLine());

        System.out.println("Ingrese el nombre de la sucursal derecha: ");
        Sucursal derecha = new Sucursal(sc.nextLine());

        raiz.izquierda = izquierda;
        raiz.derecha = derecha;

        // cargarSucursales(raiz, sc);
        cargarSucursales(izquierda, sc);
        cargarSucursales(derecha, sc);

        System.out.println("\n----- Sucursales y ventas -----");
        mostrarSucursales(raiz);

        Sucursal mayor = raiz.sucursalMayorVenta();
        System.out.println("Sucursal con mayor venta total: " + mayor.getNombre());

        sc.close();
    }
}

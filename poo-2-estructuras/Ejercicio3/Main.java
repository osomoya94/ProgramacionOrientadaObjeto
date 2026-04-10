package Ejercicio3;

public class Main {
    
    public static void main(String[] args) {
        
        GestorDeNumero gestor = new GestorDeNumero();
        gestor.agregarNumero(2);
        gestor.agregarNumero(1);
        gestor.agregarNumero(3);
        gestor.mostrarNumeros();
        gestor.borrarNumero(1);
        gestor.mostrarNumeros();
        gestor.agregarNumero(4);
        gestor.mostrarNumeros();
    }

}
// lista 


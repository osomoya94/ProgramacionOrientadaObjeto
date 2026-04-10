package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        GestorDeNumerosPila gestor = new GestorDeNumerosPila();
        gestor.borrarNumero();
        gestor.agregarNumero(1);
        gestor.agregarNumero(2);
        gestor.agregarNumero(3);
        gestor.agregarNumero(4);
        gestor.agregarNumero(5);
        gestor.agregarNumero(6);
        gestor.indicarIndice(2);
        gestor.mostrarNumeros();
        gestor.borrarNumero();
        gestor.mostrarNumeros();
        gestor.agregarNumero(7);
        gestor.mostrarNumeros();
        gestor.motrarUltimoNumero();


    }
}
//Pila
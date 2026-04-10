package Ejercicio4;
import java.util.Stack;

public class GestorDeNumerosPila {
    private Stack<Integer> numeros;

    public GestorDeNumerosPila() {
        this.numeros = new Stack<>();
    }

    public void agregarNumero(int numero) {
        this.numeros.push(numero);
    }

    public void borrarNumero() {
        if (this.numeros.isEmpty()) {
            System.out.println("No hay numeros para borrar.");
            return;
        }
        this.numeros.pop();
    }

    public void mostrarNumeros() {
        System.out.println(this.numeros);
    }

    public void indicarIndice(int numero) {
        System.out.println("El numero " + numero + " se encuentra en el indice " + this.numeros.search(numero));
    }

    public void motrarUltimoNumero() {
        System.out.println(this.numeros.peek());
    }

}

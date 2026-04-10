package Ejercicio3;
import java.util.ArrayList;
import java.util.Collections;

public class GestorDeNumero {
    private ArrayList<Integer> numeros;
    

    public GestorDeNumero() {
        this.numeros = new ArrayList<>();
    }

    public ArrayList<Integer> getNumeros() {
        return this.numeros;
    }

    public void agregarNumero(int numero) {
        this.numeros.add(numero);
    }

    public void VerificarNumero(int numero) {
        if(this.numeros.size()-1 < numero)System.out.println("No se encuentra el numero en el indice " + numero);
    }

    public void borrarNumero(int numero) {
        VerificarNumero(numero);
        if(this.numeros.size()-1 > numero)this.numeros.remove(numero);
    }

    public ArrayList<Integer> ordenarNumeros() {
        Collections.sort(numeros);
        return this.numeros;
    }

    public void mostrarNumeros() {
        System.out.println(ordenarNumeros());
    }

    private int esNumeroValido(int numero){
        try {
            Integer.parseInt(numero);
            throw new illegalArgumentException('sdasd');
        } catch (Exception e) {
        }
    }


}

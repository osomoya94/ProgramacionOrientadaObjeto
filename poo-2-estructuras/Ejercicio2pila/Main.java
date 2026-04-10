package Ejercicio2pila;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez", 20, "12345678A");
        Persona persona2 = new Persona("Maria", "Gomez", 25, "87654321B");
        Persona persona3 = new Persona("Pedro", "Lopez", 30, "23456789C");

        Auto auto1 = new Auto("Toyota", "Camry", "ABC123", "Rojo", 4);
        Auto auto2 = new Auto("Honda", "Civic", "DEF456", "Azul", 4);
        Auto auto3 = new Auto("Ford", "Mustang", "GHI789", "Negro", 2);

        System.err.println("--- 1. ingreso de autos");

        Estacionamiento estacionamiento = new Estacionamiento(5);
        estacionamiento.push(auto1);
        estacionamiento.push(auto2);
        estacionamiento.push(auto3);

        System.err.println("--- 2. mostrar autos estacionados");
        estacionamiento.mostrarEstado();

        System.err.println("--- 3. retirar auto");
        estacionamiento.pop();

        System.err.println("--- 4. mostrar autos estacionados");
        estacionamiento.mostrarEstado();

        System.err.println("--- 5. ingresar personas");
        estacionamiento.push(auto3);

        


        



    }

}

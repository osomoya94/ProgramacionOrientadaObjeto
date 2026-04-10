package Ejercicio2pila;
import java.util.Stack;

public class Estacionamiento{
    private Stack<Auto> pilaAutos;
    private final int capacidadMaxima;

    public Estacionamiento(int capacidadMaxima) {
        this.pilaAutos = new Stack<>();
        this.capacidadMaxima = capacidadMaxima;
    }

    public void push( Auto Auto){
        if(pilaAutos.size() >= capacidadMaxima){
            System.out.println("Estacionamiento lleno. No puede ingresar el auto: " + Auto.getPatente());
            return;
        }

        pilaAutos.push(Auto);
        System.out.println("Auto estacionado: " + Auto.getPatente());
    }

    public Auto pop(){
        if(pilaAutos.isEmpty()){
            System.out.println("Estacionamiento vacio. No hay autos para retirar.");
            return null;
        }

        Auto autoRetirado = pilaAutos.pop();
        System.out.println("Auto retirado: " + autoRetirado.getPatente());
        return autoRetirado;
    }

    public int autosFaltantesParaRetirar(String patente){
        int autosFaltantes = 0;
        for(int i = pilaAutos.size() - 1; i >= 0; i--){
            Auto auto = pilaAutos.get(i);

        if(auto.getPatente().equals(patente)){
            return autosFaltantes;
        }

        autosFaltantes++;
    }
    return -1;
    }

    public void mostrarEstado (){
        System.out.println("\n--- ESTADO DEL ESTACIONAMIENTO ---");
        System.out.println("Capacidad: " + pilaAutos.size() + " / " + capacidadMaxima);
        
        if(pilaAutos.isEmpty()){
            System.out.println("Estacionamiento vacio");
        } else {
            System.out.println("\n orden de la pila (Base a Cima)");
            int i = 1;
            for(Auto auto : pilaAutos){
                System.out.println("Puesto " + i + "  [" + auto.getPatente() + "]");
                i++;
            }

            if(!pilaAutos.isEmpty()){
                System.out.println("Puesto de salida: " + pilaAutos.peek().getPatente() + " proxima a salir");
            }
        }
        System.out.println("----------------------------------\n");
    }

    public Auto peek (){
        return pilaAutos.isEmpty() ? null : pilaAutos.peek();
    }

    public int getTamanoActual(){
        return pilaAutos.size();
    }


}
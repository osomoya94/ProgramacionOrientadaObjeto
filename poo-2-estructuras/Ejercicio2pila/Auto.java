package Ejercicio2pila;

public class Auto extends Vehiculo {
    private String color;
    private int numeroPuertas;


    public Auto(String marca, String modelo, String patente, String color, int numeroPuertas) {
        super(marca, modelo, patente);
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        
    }

    public String getColor() {
        return color;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}

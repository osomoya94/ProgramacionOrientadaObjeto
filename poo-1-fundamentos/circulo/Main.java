package circulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.setRadio(5);

        System.out.println("El area del circulo es: " + circulo.calcularArea());
    }
}

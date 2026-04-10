public class Main {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();

        rect.setAlto(2);
        rect.setAncho(10);

        double area = rect.calcularArea();

        System.out.println("El area del rectangulo es: " + area);
        
    }
}
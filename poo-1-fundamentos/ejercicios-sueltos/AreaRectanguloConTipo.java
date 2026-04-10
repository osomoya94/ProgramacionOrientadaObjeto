import java.util.Scanner;

public class AreaRectanguloConTipo {
    public static double area(double base, double altura) {
        return base * altura;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo: ");
        double basePedida = sc.nextDouble();

        System.out.println("Ingrese la altura del rectángulo: ");
        double alturaPedida = sc.nextDouble();

        double Area = area(basePedida, alturaPedida);

        System.out.println("El área del rectángulo es: " + Area);
    }
}

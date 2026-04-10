import java.util.Scanner;

public class promedioContipo {
    public static double promedio(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese la nota :1 ");
        int num1 = sc.nextInt();
        System.out.println("ingrese la nota :2 ");
        int num2 = sc.nextInt();
        System.out.println("ingrese la nota :3 ");
        int num3 = sc.nextInt();

        double promedio = promedio(num1, num2, num3);
        System.out.println("El promedio es: " + promedio);
    }
}

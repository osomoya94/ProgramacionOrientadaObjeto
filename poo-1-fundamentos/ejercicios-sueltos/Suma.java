import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un numero ");
        int num1 = sc.nextInt();

        System.out.println("ingrese otro numero ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }

}

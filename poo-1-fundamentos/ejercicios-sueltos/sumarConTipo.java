import java.util.Scanner;

public class sumarConTipo {
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = sc.nextInt();
        int suma = sumar(num1, num2);
        System.out.println("La suma es: " + suma);
    }

}

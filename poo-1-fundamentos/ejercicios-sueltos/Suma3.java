import java.util.Scanner;

public class Suma3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un numero ");
        int num1 = sc.nextInt();

        System.out.println("ingrese el segundo numero");
        int num2 = sc.nextInt();

        System.out.println("ingrese el tercer numero ");
        int num3 = sc.nextInt();

        float total = (num1 + num2 + num3)/3;
        System.out.println("el promedio es : " + total);
    }
}

    

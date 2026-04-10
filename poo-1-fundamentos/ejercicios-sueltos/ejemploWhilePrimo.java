import java.util.Scanner;

public class ejemploWhilePrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero ");
        int num = sc.nextInt();

        int i = 2;
        int contador = 0;
        while (i <= num) {
            if (num % i == 0) {
                contador++;
                System.out.println( "El numero es divisible en : " +i);
            }
            i++;
        }
        
        if (contador>2) {
            System.out.println("El numero no es primo");
        }else{
            System.out.println("El numero " + num + " es primo");
        }
    }
}

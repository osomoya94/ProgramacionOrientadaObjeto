import java.util.Scanner;

public class ejemploWhileNumPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero ");
        int num = sc.nextInt();

        int i = 1;
        int contador = 0;
        while (i <= num) {
            if (i % 2 == 0) {
                System.out.println("Es un numero par " + i);
                contador++;
            }
            i++;
        }
        System.out.println("La cantidad de numeros pares son :" + contador);
    }
}

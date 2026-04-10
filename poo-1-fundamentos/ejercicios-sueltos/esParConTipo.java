import java.util.Scanner;

public class esParConTipo {
    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = sc.nextInt();

        boolean Resultado =  esPar(num);

        if(Resultado) {
            System.out.println("El número es par. " + num);
        } else {
            System.out.println("El número es impar. " + num);
        }
     
    }
}

import java.util.Scanner;

public class ContarNsinTipo {
    public static void contarHasta(int n ){
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para contar hasta ese numero: ");
        int numero = sc.nextInt();

        contarHasta(numero);
        
    }

}



import java.util.Scanner;
import java.math.BigInteger;
public class EjercicioEstructutaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger suma = BigInteger.ZERO;

        System.out.println("Ingrese un numero para realizar la formula fibonacci: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Ingrese un numero mayor o igual a 0.");
            sc.close();
            return;
        }

        for(int i = 0; i < num; i++){
            System.out.print("La suma de " + a + " y de " + b + " es: ");
            suma = a.add(b);
            a = b;
            b = suma;
            System.out.print( suma + "\n");
        }
        sc.close();
    }
}

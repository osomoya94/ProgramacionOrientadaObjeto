import java.util.Scanner;

public class ejemploForSumar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un numero ");
        int num1 = sc.nextInt();

        int total=0;

        for(int i = 1 ; i <= num1; i++){
            System.out.println("ingrese un numero " +i);
            total = total + i;
            System.out.println("el total es " + total);
        }
    }
} 
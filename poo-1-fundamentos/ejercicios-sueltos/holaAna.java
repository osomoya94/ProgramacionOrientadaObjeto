import java.util.Scanner;

public class holaAna {
    public static void saludar(int num, String nombre) {
        System.out.print("Hola ");
        
        for(int i = 0; i < num; i++) {
            System.out.print(  nombre + " ");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        saludar(num, nombre);
    }
}

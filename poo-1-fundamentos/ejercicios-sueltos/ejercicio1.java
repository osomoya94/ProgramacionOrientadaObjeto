import java.util.Scanner;

public class ejercicio1 {
    public static void comparar(int num1, int num2) {
        if(num1 > num2){// hace todas las comparaciones posibles
            System.out.println("El numero mayor es: " + num1);
        }else if (num1 < num2){
            System.out.println("El numero mayor es: " + num2);
        }else{
            System.out.println("El numero : " + num1 + " y el numero : " + num2 + " son iguales");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// llamada a la clase Scanner

        System.out.println("Ingrese un numero: ");//solicitar al usuario que ingrese un número
        int num1 = sc.nextInt(); //leer el número ingresado
        System.out.println("Ingrese otro numero: ");
        int num2 = sc.nextInt();
        
        comparar(num1, num2);// llama a la funcion
    }
}

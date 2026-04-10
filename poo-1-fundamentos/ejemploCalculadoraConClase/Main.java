package ejemploCalculadoraConClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt(); 

        System.out.println("Eliga una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potenciar");
        System.out.println("6. Raiz cuadrada: aqui solo se toma el primer valor");
        System.out.println("7. Salir");
        int opcion = sc.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("La suma es: " + calc.sumarEnterosDeDosNumeros(num1, num2));
                break;
            case 2:
                System.out.println("La resta es: " + calc.restarEnterosDeDosNumeros(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicación es: " + calc.multiplicar(num1, num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir por cero.");
                    break;
                }
                System.out.println("La division es: " + calc.dividir(num1, num2));
                break;
            case 5:
                System.out.println("La Potencia es: " + calc.potenciar(num1, num2));
                break;
            case 6:
                System.out.println("La Raiz cuadrada es: " + calc.raizCuadrada(num1));
                break;
            case 7:
                System.out.println("Saliendo...");
                break;
        
            default:
                System.out.println("Opción no válida.");
                break;
        }

    }
}

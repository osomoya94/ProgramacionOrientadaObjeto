import java.util.Scanner;

public class ejemploWhileMenu {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        
        do {
            System.out.println("Eliga uno para continuar:");
            System.out.println("Sumar");
            System.out.println("Promedio");
            System.out.println("Salir");
            opcion = sc.nextLine();

            if (opcion.equals("Sumar")) {
                System.out.println("Ingrese dos numeros");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println("La suma es: " + (num1 + num2));
                break;
                
            } else if (opcion.equals("Promedio")) {
                System.out.println("Ingrese la cantidad de notas que desea ingresar ");
                int numNotas = sc.nextInt(); 
                int cantidad = 0;
                int notaIngresada = 1;
                int nota;
                int notaTotal = 0;

                while (numNotas > cantidad ) {
                    System.out.println("Ingrese la nota " + (notaIngresada) + ": ");
                    nota = sc.nextInt();

                    notaIngresada++;
                    cantidad++;
                    notaTotal += nota;
                }
                double promedio = (double) notaTotal / numNotas;
                System.out.println("El promedio de las notas es: " + promedio);
                break;
            }

        } while (!opcion.equals("Salir"));
    }
}

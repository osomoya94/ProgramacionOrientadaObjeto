import java.util.Scanner;

public class ejemploWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
    }
}
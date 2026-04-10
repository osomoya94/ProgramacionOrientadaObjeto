package Ejercicio6;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> Listas = new ArrayList<>();

        while (true) {
            System.out.println("\ningrese nombre del alumono (o 'salir' para terminar):");
            String nombre = sc.nextLine();

            if (nombre.equals("salir")) {
                break;
            }

            System.out.println("Ingrese la edad del alumno:");
            int edad = sc.nextInt();
            System.out.println("Ingrese la nota del alumno:");
            double nota = sc.nextDouble();
            sc.nextLine();

            Listas.add(new Alumno(nombre, edad, nota));
        }
        System.out.println("\nMuestro lista de alumnos");
        mostrarAlumnoAprobado(Listas, 0);

        sc.close();
    }

    public static void mostrarAlumnoAprobado(ArrayList<Alumno> Lista, int indice) {
        if (indice >= Lista.size()) {
            return;
        }

        if(Lista.get(indice).getNota() >= 4) {
            System.out.println(Lista.get(indice).getNombre());
        }
        mostrarAlumnoAprobado(Lista, indice + 1);
    }
}

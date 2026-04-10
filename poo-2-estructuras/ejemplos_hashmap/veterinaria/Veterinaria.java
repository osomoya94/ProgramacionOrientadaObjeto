package veterinaria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Veterinaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, List<Mascota>> veterinaria = new HashMap<>();

        String vet1 = leerNoVacio(sc, "Veterinario 1: ");
        String vet2 = leerNoVacio(sc, "Veterinario 2: ");

        veterinaria.put(vet1, new ArrayList<>());
        veterinaria.put(vet2, new ArrayList<>());

        cargarTurnos(sc, veterinaria, vet1);
        cargarTurnos(sc, veterinaria, vet2);

        for (String vet : veterinaria.keySet()) {
            veterinaria.get(vet).sort(Comparator.comparingInt(Mascota::getHoraTurno));
        }

        for (String vet : veterinaria.keySet()) {
            System.out.println("\nVeterinario: " + vet);
            for (Mascota m : veterinaria.get(vet)) {
                System.out.println(m);
            }
        }

        sc.close();
    }

    private static void cargarTurnos(Scanner sc, HashMap<String, List<Mascota>> veterinaria, String vet) {
        System.out.println("\nCargando 3 turnos para " + vet);

        while (veterinaria.get(vet).size() < 3) {
            try {
                int legajo = leerEntero(sc, "Legajo: ");
                String animal = leerNoVacio(sc, "Animal: ");
                String duenio = leerNoVacio(sc, "Dueño: ");
                int hora = leerEntero(sc, "Hora (14-18): ");

                Mascota m = new Mascota(legajo, animal, duenio, hora);
                veterinaria.get(vet).add(m);

                System.out.println("Turno agregado.\n");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Repetí el turno.\n");
            }
        }
    }

    private static String leerNoVacio(Scanner sc, String msg) {
        String t;
        do {
            System.out.print(msg);
            t = sc.nextLine().trim();
        } while (t.isBlank());
        return t;
    }

    private static int leerEntero(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Tiene que ser número.");
            }
        }
    }
}
package Ejercico5HASHMAP;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    ArrayList<HashMap<String, Object>> contactos = new ArrayList<>();

    public boolean verificar(String palabra){
        if (palabra.toLowerCase().equals("salir")) {
            System.out.println("Adios");
            return true;
        }
        return false;
    }

    public void IngresarDatos() {
        HashMap<String, Object> ingresarDatos = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Ingrese el nombre del contacto:");
            ingresarDatos.put("nombre", sc.nextLine());
            System.out.println("Ingrese el apellido del contacto:");
            ingresarDatos.put("apellido", sc.nextLine());
            System.out.println("Ingrese el telefono del contacto:");
            ingresarDatos.put("telefono", sc.nextLine());
            System.out.println("Ingrese el email del contacto:");
            ingresarDatos.put("email", sc.nextLine());
            System.out.println("Ingrese el direccion del contacto:");
            ingresarDatos.put("direcionoso", sc.nextLine());
            contactos.add(ingresarDatos);

            System.out.println("Desea ingresar mas contactos? (si/no)");
            respuesta = sc.nextLine();
            if (respuesta.toLowerCase().equals("no")) {
                break;
            }
        } while (true);

        if(contactos.size() == 0){
            System.out.println("No se ingresaron contactos.");
        }else{
            System.out.println("Se ingresaron " + contactos.size() + " contactos.");
        }
    }

    public void mostraAgenda(){
        if (contactos.isEmpty()) {
            System.out.println("No se ingresaron contactos.");
        }

        for (int i = 0; i < contactos.size(); i++) {
            System.out.println(contactos.get(i));
        }
    }
}

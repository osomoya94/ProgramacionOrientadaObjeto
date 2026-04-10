import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//tengo un hospital que tiene un ala clinica y un ala de cirugia, cada ala tiene su lista de pacienta
//cree un hashmap que tiene como clave un string y como valor un elemento del tipo lista
public class HospitalApp {

    public static void main(String[] args) {

        // HashMap: Ala del hospital(clave) -> Lista de pacientes(valor)
        HashMap<String, List<Paciente>> pacientesPorAla = new HashMap<>();

        // Crear pacientes, se inicializa los elementos del tipo Paciente
        Paciente p1 = new Paciente("Rodolfo", "Fernandez", "32265887", "4549-2250");
        Paciente p2 = new Paciente("Monica", "Perez", "34221189", "4529-0458");
        Paciente p3 = new Paciente("Ada", "Hernandez", "31245896", "4542-2126");
        Paciente p4 = new Paciente("Lucian", "Greymark", "33221478", "4523-1140");

        // Crear listas por ala, recuerden que estan hablando de una lista asi que son metodos usados por la lista
        List<Paciente> alaClinica = new ArrayList<>();
        alaClinica.add(p1);
        alaClinica.add(p2);

        List<Paciente> alaCirugia = new ArrayList<>();
        alaCirugia.add(p3);
        alaCirugia.add(p4);

        // Agregar al HashMap, recuerden que se usa el metodo put para agregar elementos al hash
        pacientesPorAla.put("Clinica Medica", alaClinica);
        pacientesPorAla.put("Cirugia", alaCirugia);

        // Mostrar el contenido del mapa
        System.out.println("Pacientes por ala del hospital:\n");
        //este for lo que hace es tomar la clave de cada elemento y muestra lo guardado en la lista
        for (String ala : pacientesPorAla.keySet()) {
            System.out.println("Ala: " + ala);

            List<Paciente> pacientes = pacientesPorAla.get(ala);
            for (Paciente p : pacientes) {
                System.out.println(" - " + p);
            }

            System.out.println("Cantidad de pacientes: " + pacientes.size());
            System.out.println();
        }
    }
}


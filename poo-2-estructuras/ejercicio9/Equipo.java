package ejercicio9;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<String> jugadores;
    Equipo izquierdo;
    Equipo derecho;

    public Equipo(String nombre)
    {
        this.nombre = nombre;
        jugadores = new ArrayList<>();
        izquierdo = null;
        derecho = null;
    }

    public void agregarJugadore(String jugador)
    {
        jugadores.add(jugador);
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarJugadores(){
        System.out.println("Equipo "+nombre);

        if(jugadores.isEmpty()){
            System.out.println("No hay jugadores cargados");
        }else{
            for(String j : jugadores){
                System.out.println("-" + j );
            }
        }

        System.out.println();
    }

}

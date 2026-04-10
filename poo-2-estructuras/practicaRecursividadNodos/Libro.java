package practicaRecursividadNodos;

public class Libro {
    int codigo;
    String titulo;
    Libro izquierdo;
    Libro derecho;

    // Constructor para crear un libro nuevo
    public Libro(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.izquierdo = null; // Al nacer, no tiene hijos
        this.derecho = null;
    }
}
public class Paciente {

    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;

    public Paciente(String nombre, String apellido, String dni, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    // Métodos Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String toString() {
        return nombre + " " + apellido + " (DNI: " + dni + ")";
    }
}

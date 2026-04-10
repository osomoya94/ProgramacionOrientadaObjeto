package trabajoParaPresentar;

public class Peliculas {
    private String titulo;
    private String director;
    private int duracion;
    private boolean aptaMas18;
    private String genero;
    private int anioEstreno;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tituloIngresado) {
        titulo = tituloIngresado;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String directorIngresado) {
        director = directorIngresado;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracionIngresada) {
        duracion = duracionIngresada;
    }

    public boolean isAptaMas18() {
        return aptaMas18;
    }

    public void setAptaMas18(boolean aptaMas18Ingresada) {
        aptaMas18 = aptaMas18Ingresada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String generoIngresado) {
        genero = generoIngresado;
    }

    public int getanioEstreno() {
        return anioEstreno;
    }

    public void setanioEstreno(int anioEstrenoIngresada) {
        anioEstreno = anioEstrenoIngresada;
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duracion: " + duracion);
        System.out.println("Apta para mayores de 18: " + (aptaMas18 ? "Si" : "No") );
        System.out.println("Genero: " + genero);
        System.out.println("Fecha de estreno: " + anioEstreno);
    }

}

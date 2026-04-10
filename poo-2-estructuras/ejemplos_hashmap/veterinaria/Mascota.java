package veterinaria;

public class Mascota {
    private int legajo;
    private String nombreAnimal;
    private String nombreDuenio;
    private int horaTurno;

    public Mascota(int legajo, String nombreAnimal, String nombreDuenio, int horaTurno) throws Exception {
        if (legajo <= 0) throw new Exception("Legajo inválido");
        if (nombreAnimal == null || nombreAnimal.isBlank()) throw new Exception("Animal vacío");
        if (nombreDuenio == null || nombreDuenio.isBlank()) throw new Exception("Dueño vacío");
        if (horaTurno < 14 || horaTurno > 18) throw new Exception("Hora fuera de rango (14-18)");

        this.legajo = legajo;
        this.nombreAnimal = nombreAnimal;
        this.nombreDuenio = nombreDuenio;
        this.horaTurno = horaTurno;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public int getHoraTurno() {
        return horaTurno;
    }

    @Override
    public String toString() {
        return "Legajo: " + legajo + " | Animal: " + nombreAnimal + " | Dueño: " + nombreDuenio + " | Hora: " + horaTurno;
    }
}
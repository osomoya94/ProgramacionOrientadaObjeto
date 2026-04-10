

public class Elprerraco1 {
    public static void main(String[] args) {
        ClasePerro perro = new ClasePerro();
        
        perro.raza = "Pastor Alemán";
        perro.color = "Blanco y negro";
        perro.edad = 5;
        perro.peso = 10;
        perro.sexo = "Macho";
        
        perro.ladrar();
        perro.comer();
        perro.dormir();

        System.out.println("================");

        System.out.println("Raza: " + perro.raza);
        System.out.println("Color: " + perro.color);
        System.out.println("Edad: " + perro.edad);
        System.out.println("Peso: " + perro.peso);
        System.out.println("Sexo: " + perro.sexo);

    }
}
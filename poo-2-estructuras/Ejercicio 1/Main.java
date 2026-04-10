import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento(5);
        Auto auto1 = new Auto("ABC123", "Toyota", "Corolla", "Rojo", 4);
        Auto auto2 = new Auto("DEF456", "Honda", "Civic", "Negro", 4);
        Auto auto3 = new Auto("GHI789", "Ford", "Mustang", "Azul", 4);
        Auto auto4 = new Auto("JKL012", "Chevrolet", "Camaro", "Blanco", 4);

        estacionamiento.setAutosEstacionados(Arrays.asList(auto1, auto2, auto3, auto4));

        System.out.println("Autos estacionados: " + estacionamiento.getAutosEstacionados());
        estacionamiento.mostrarEstacionados();

        estacionamiento.removerAuto("DEF456");
        System.out.println("Autos estacionados: " + estacionamiento.getAutosEstacionados());
        estacionamiento.mostrarEstacionados();

        estacionamiento.agregarAuto(auto4);
        System.out.println("Autos estacionados: " + estacionamiento.getAutosEstacionados());
        estacionamiento.mostrarEstacionados();

        

    }
}

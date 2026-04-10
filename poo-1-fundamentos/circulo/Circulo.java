package circulo;

public class Circulo {
    private double radio;

    public double getRadio() {
        return radio;
    } 

    public void setRadio(double radioAsignar) {
        if (radioAsignar > 0) {
            radio = radioAsignar;
        }else{
            System.out.println("El radio debe ser mayor que cero.");
        }
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

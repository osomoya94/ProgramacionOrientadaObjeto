public class Rectangulo {
    private double alto;
    private double ancho;

    // Getters: sirven para obtener valores
    public double getAlto(){
        return alto;
    }

    public double getAncho(){
        return ancho;
    }

    // Setters: sirven para reasignar valores
    public void setAlto(double altoAsignar){
        if (altoAsignar > 0) {
            alto = altoAsignar;
        }else{
            System.out.println("El alto debe ser mayor que cero.");
        }
    }

    public void setAncho(double anchoAsignar){
        if (anchoAsignar > 0) {
            ancho = anchoAsignar;
        }else{
            System.out.println("El ancho debe ser mayor que cero.");
        }
    }


    public double calcularArea(){
        return alto * ancho;
    }

    // public void mostrarArea(){
    //     System.out.println("El area es: " + (alto * ancho));
    // }
}

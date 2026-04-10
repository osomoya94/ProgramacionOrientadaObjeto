public class tablaMultiplicarMetodos {
    public static void multiplicar(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        multiplicar(5);
        multiplicar(7);
        multiplicar(9);
    }
    
}

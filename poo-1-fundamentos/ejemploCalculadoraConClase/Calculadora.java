package ejemploCalculadoraConClase;

public class Calculadora {
    int sumarEnterosDeDosNumeros(int num1, int num2) {
        return num1 + num2;
    }

    int restarEnterosDeDosNumeros(int num1, int num2) {
        return num1 - num2;
    }

    int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    float dividir(int num1, int num2) {
        return num1 / num2;
    }
    
    int potenciar(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }
    
    double raizCuadrada(int num1) {
        return Math.sqrt(num1);
    }
}

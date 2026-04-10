public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(1000.0); 
        cuenta.depositar(500.0); 
        cuenta.extraer(200.0); 
        System.out.println("Saldo actual: " + cuenta.getSaldo()); 
    }
}

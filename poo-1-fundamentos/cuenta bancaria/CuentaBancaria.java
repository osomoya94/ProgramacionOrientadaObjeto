// Removed package declaration to match default package

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public void setSaldo(double saldoRecibido){
        if(saldoRecibido > 0){
            saldo = saldoRecibido;
        }else{
            System.out.println("El saldo debe ser mayor que cero.");
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
        }else{
            System.out.println("El monto debe ser mayor que cero.");
        }
    }

    public void extraer (double monto){
        if(monto > saldo){
            System.out.println("No hay suficiente saldo en la cuenta.");
        }else{
            saldo -= monto;
        }
    }


}

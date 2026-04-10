package velocidad;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        
        auto.setVelocidad(100);
        auto.acelerar(auto.getVelocidad());
        
    }
}

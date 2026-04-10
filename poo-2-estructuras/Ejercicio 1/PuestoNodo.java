public class PuestoNodo {
    private Auto auto;
    private PuestoNodo siguiente;
    private PuestoNodo anterior;

    public PuestoNodo(Auto auto) {
        this.auto = auto;
        this.siguiente = null;
        this.anterior = null;
    }   

    public Auto getAuto() {
        return auto;
    }

    public PuestoNodo getSiguiente() {return siguiente;}
    public PuestoNodo getAnterior() {return anterior;}

    public void setSiguiente(PuestoNodo siguiente) {this.siguiente = siguiente;}
    public void setAnterior(PuestoNodo anterior) {this.anterior = anterior;}

    
}

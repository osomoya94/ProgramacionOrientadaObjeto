// import java.util.ArrayList;
// import java.util.List;
public class Estacionamiento {

    /* ===== Nodo de la lista doblemente enlazada ===== */
    private static class PuestoNodo {
        private Auto auto;
        private PuestoNodo anterior;
        private PuestoNodo siguiente;

        PuestoNodo(Auto auto) { this.auto = auto; }
        Auto getAuto() { return auto; }
        PuestoNodo getAnterior() { return anterior; }
        PuestoNodo getSiguiente() { return siguiente; }
        void setAnterior(PuestoNodo a) { this.anterior = a; }
        void setSiguiente(PuestoNodo s) { this.siguiente = s; }
    }

    /* ===== Estado del estacionamiento ===== */
    private PuestoNodo cabeza;          // primer auto
    private PuestoNodo cola;            // último auto
    private int capacidadMaxima;
    private int tamanoActual;

    /* ===== ctor ===== */
    public Estacionamiento(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cabeza = null;
        this.cola = null;
        this.tamanoActual = 0;
    }

    /* ===== getters / setters compatibles con tu base ===== */
    public int getCapacidadMaxima() { return capacidadMaxima; }
    public int getAutosEstacionados() { return tamanoActual; }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        // si quedó sobrecapacidad, no expulsamos automáticamente;
        // el control se hace al ingresar.
    }

    /** Permite cargar una lista inicial respetando la capacidad. */
    public void setAutosEstacionados(java.util.List<Auto> autos) {
        // limpiar estructura
        cabeza = null; cola = null; tamanoActual = 0;
        if (autos == null) return;
        for (Auto a : autos) {
            if (tamanoActual >= capacidadMaxima) break;
            // evita duplicados por patente
            if (buscarNodo(a.getPatente()) == null) {
                insertarAlFinal(a);
            }
        }
    }

    /* ===== operaciones principales (mismas firmas que tu base) ===== */

    /** Agrega un auto al final (cola). O(1) tras validaciones */
    public boolean agregarAuto(Auto auto) {
        if (tamanoActual >= capacidadMaxima) {
            System.out.println("Estacionamiento lleno. No puede ingresar el auto: " + auto.getPatente());
            return false;
        }
        if (buscarNodo(auto.getPatente()) != null) {
            System.out.println("ERROR: El auto con patente " + auto.getPatente() + " ya se encuentra en el estacionamiento.");
            return false;
        }
        insertarAlFinal(auto);
        System.out.println("Auto estacionado: " + auto.getPatente());
        return true;
    }

    /** Retira por patente. O(1) una vez encontrado el nodo */
    public boolean removerAuto(String patente) {
        PuestoNodo nodo = buscarNodo(patente);
        if (nodo == null) {
            System.out.println("Auto no encontrado");
            return false;
        }

        PuestoNodo ant = nodo.getAnterior();
        PuestoNodo sig = nodo.getSiguiente();

        if (ant != null) ant.setSiguiente(sig);
        else cabeza = sig; // era la cabeza

        if (sig != null) sig.setAnterior(ant);
        else cola = ant;   // era la cola

        tamanoActual--;
        System.out.println("Auto retirado: " + patente);
        return true;
    }

    /** Muestra disponibilidad como en tu base */
    public void mostrarEstacionados() {
        int libres = capacidadMaxima - tamanoActual;
        if (libres > 0) System.out.println("Cantidad disponible: " + libres);
        else            System.out.println("Estacionamiento lleno");
    }

    /* ===== helpers internos (de tus imágenes) ===== */

    private void insertarAlFinal(Auto auto) {
        PuestoNodo nuevo = new PuestoNodo(auto);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        tamanoActual++;
    }

    /** Búsqueda lineal por patente. O(n) */
    private PuestoNodo buscarNodo(String patente) {
        PuestoNodo actual = cabeza;
        while (actual != null) {
            if (actual.getAuto().getPatente().equals(patente)) return actual;
            actual = actual.getSiguiente();
        }
        return null;
    }

    /* ===== (opcional) estado detallado para debug ===== */
    public void mostrarEstado() {
        System.out.println("\n--- ESTADO DEL ESTACIONAMIENTO ---");
        System.out.println("Capacidad: " + tamanoActual + " / " + capacidadMaxima);
        PuestoNodo act = cabeza;
        int i = 1;
        while (act != null) {
            Auto a = act.getAuto();
            System.out.println("Puesto " + i + "  [" + a.getPatente() + "]");
            act = act.getSiguiente();
            i++;
        }
        System.out.println("----------------------------------\n");
    }
}



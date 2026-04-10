class Nodo {
    String pregunta;
    String resultado;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(String pregunta, Nodo izquierda, Nodo derecha) {
        this.pregunta = pregunta;
        this.izquierda = izquierda;
        this.derecha = derecha;
        this.resultado = null;
    }

    public Nodo(String resultado) {
        this.resultado = resultado;
        this.pregunta = null;
        this.izquierda = null;
        this.derecha = null;
    }
}

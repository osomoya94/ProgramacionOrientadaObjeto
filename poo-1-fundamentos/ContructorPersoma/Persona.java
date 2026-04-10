package ContructorPersoma;

public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        setEdad(edad);
    }

    public void setEdad(int edad) {
        if(edad > 0){
            this.edad = edad;
        }else{
            this.edad = 0;
        }
    }
    
    public void saludar(){
        System.out.println("Hola soy " + this.nombre + " y tengo " + this.edad + " años");
    }
}

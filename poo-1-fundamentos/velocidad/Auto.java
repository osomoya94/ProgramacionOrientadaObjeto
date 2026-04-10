package velocidad;

public class Auto {
        private int velocidad;
         private String marca; 
        private String modelo;

    public int getVelocidad() {
        return velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setVelocidad(int velocidadAsignar) {
        if(0 < velocidadAsignar  && velocidadAsignar < 200){ {
            velocidad = velocidadAsignar;
        }}else{
            System.out.println("La velocidad debe estar entre 0 y 200");
        }
    }

    public void setMarca(String marcaAsignar) {
        marca = marcaAsignar;
    }

    public void setModelo(String modeloAsignar) {
        modelo = modeloAsignar;
    }

    public void acelerar(int velocidad) {
        for(int i = 0; i < velocidad; i++) {
            System.out.println("Acelerando..." + i);
        }
        System.out.println("La velocidad actual es: " + velocidad);
    }

    
} 



    
    

    

    
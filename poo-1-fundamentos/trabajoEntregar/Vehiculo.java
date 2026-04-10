package trabajoEntregar;

public class Vehiculo {
    private float velocidadMaxima;
    private float capacidadTanque;
    private float porcentajeCombustible;
    private int cantidadPuertas;
    

    public Vehiculo( float velocidadMaxima, float capacidadTanque, float porcentajeCombustible, int cantidadPuertas)
    {
        SetVelocidadMaxima(velocidadMaxima); 
        SetCapacidadTanque(capacidadTanque); 
        SetPorcentajeCombustible(porcentajeCombustible);
        setCantidadPuertas(cantidadPuertas); 

    }
    public int getCantidadPuertas()
    {
        return this.cantidadPuertas;
    }


    public float GetVelocidadMaxima()
    {
        return this.velocidadMaxima;
    }

    public float GetCapacidadTanque()
    {
        return this.capacidadTanque;
    }

    public float GetPorcentajeCombustible()
    {
        return this.porcentajeCombustible;
    }

    public void setCantidadPuertas(int cantidadPuertas)
    {
        if(cantidadPuertas >= 2 && cantidadPuertas <= 5 )
        {
            this.cantidadPuertas = cantidadPuertas;
        }else
        {
            System.out.println("la cantidad de puertas debe estar entre 2 y 5 ");
        }
    }
    

    public void SetVelocidadMaxima(float velocidadMaxima)
    {
        if (velocidadMaxima > 0)
        {
            this.velocidadMaxima = velocidadMaxima;
        }
        else
        {
            this.velocidadMaxima = 1; 
        }
    }

    public void SetCapacidadTanque(float capacidadTanque)
    {
        if (capacidadTanque > 0)
        {
            this.capacidadTanque = capacidadTanque;
        }
        else
        {
            System.out.println("Error: La capacidad del tanque debe ser mayor a 0.");
        }
    }

    public void SetPorcentajeCombustible(float porcentajeCombustible)
    {
        if (porcentajeCombustible >= 0 && porcentajeCombustible <= 100)
        {
            this.porcentajeCombustible = porcentajeCombustible;
        }
        else
        {
            System.out.println("Error: El porcentaje de combustible debe estar entre 0 y 100.");

        }
    }

    public void MostrarInformacion() {
        System.out.println("Velocidad máxima: " + this.velocidadMaxima + " km/h");
        System.out.println("Capacidad del tanque: " + this.capacidadTanque + " litros");
        System.out.println("Porcentaje de combustible: " + this.porcentajeCombustible + "%");
        System.out.println("Cantidades de puertas " + this.cantidadPuertas);
    }

}

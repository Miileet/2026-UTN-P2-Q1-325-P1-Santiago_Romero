package romero_santiago_parcial1;
abstract public class Vehiculos {
    protected String patente;
    protected String marca;
    protected int capacidadPasajeros;
    protected int añoFabricacion;

    public Vehiculos(String patente, String marca, int capacidadPasajeros, int añoFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.capacidadPasajeros = capacidadPasajeros;
        this.añoFabricacion = añoFabricacion;
    }

    

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }
    
    
}

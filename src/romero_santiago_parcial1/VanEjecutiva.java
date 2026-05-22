package romero_santiago_parcial1;
public class VanEjecutiva extends Vehiculos {
    boolean aireAcondicionado;

    public VanEjecutiva(boolean aireAcondicionado, String patente, String marca, int capacidadPasajeros, int añoFabricacion) {
        super(patente, marca, capacidadPasajeros, añoFabricacion);
        this.aireAcondicionado = aireAcondicionado;
    }

    

    @Override
    public String toString() {
        return "marca: " + marca +
                "\n" + "Patente: " + patente + 
                "\n" + "Capacidad de pasajeros: " + capacidadPasajeros + 
                "\n" + "Año de fabricacion" + añoFabricacion + 
                "\n" + "Aire acondicionado: " + aireAcondicionado;
    }
    
    
}

package romero_santiago_parcial1;
public class LanchaTuristica extends Vehiculos implements GestionarServicio {
    TipoMotor tipoMotor;

    public LanchaTuristica(TipoMotor tipoMotor, String patente, String marca, int capacidadPasajeros, int añoFabricacion) {
        super(patente, marca, capacidadPasajeros, añoFabricacion);
        this.tipoMotor = tipoMotor;
    }

    public void turismo(){
        System.out.println("empieza el turismo");
    }
    
    public String toString() {
        return "marca: " + marca +
                "\n" + "Patente: " + patente + 
                "\n" + "Capacidad de pasajeros: " + capacidadPasajeros + 
                "\n" + "Año de fabricacion" + añoFabricacion + 
                "\n" + "Tipo de motor: " + tipoMotor;
    }
    
    
}

package romero_santiago_parcial1;
public class ColectivoTuristico extends Vehiculos implements GestionarServicio {
    int cantidadPisos;

    public ColectivoTuristico(int cantidadPisos, String patente, String marca, int capacidadPasajeros, int añoFabricacion) {
        super(patente, marca, capacidadPasajeros, añoFabricacion);
        this.cantidadPisos = cantidadPisos;
    }

    public void turismo(){
        System.out.println("empieza el turismo");
    }
    
    public String toString() {
        return "marca: " + marca +
                "\n" + "Patente: " + patente + 
                "\n" + "Capacidad de pasajeros: " + capacidadPasajeros + 
                "\n" + "Año de fabricacion" + añoFabricacion + 
                "\n" + "Cantidad de pisos: " + cantidadPisos;
    }
}

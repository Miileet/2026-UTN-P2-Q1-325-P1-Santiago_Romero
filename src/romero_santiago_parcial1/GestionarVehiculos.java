package romero_santiago_parcial1;
import java.util.ArrayList;
public class GestionarVehiculos {
    private ArrayList<Vehiculos> vehiculos;

    public GestionarVehiculos() {
        this.vehiculos = new ArrayList<>();
    }

    public void mostrarVehiculos(){
        if (vehiculos.isEmpty()){
            System.out.println("ya esta agregado el vehiculo");
        } else {
            for (Vehiculos v : vehiculos){
                System.out.println(vehiculos);
            }
        }
    }
    
    public void agregarVehiculos() throws VehiculoExistente{
        for (Vehiculos v : vehiculos){
            if (v.getPatente().contains(v.patente)&&
                v.getCapacidadPasajeros() >= 0 &&
                v.getAñoFabricacion() >= 1990 &&
                v.getAñoFabricacion() > 2026){
                vehiculos.add(v);
            } else {
                throw new VehiculoExistente("No es posible agregar el vehiculo");
            }
        } 
    }
    
    public void empezarTurismo(){
        for (Vehiculos v : vehiculos){
            if (v instanceof GestionarServicio){
                ((GestionarServicio)v).turismo();
            } else {
                System.out.println("el vehiculo no puede hacer turismo");
            }
        }
    }
    
    
}

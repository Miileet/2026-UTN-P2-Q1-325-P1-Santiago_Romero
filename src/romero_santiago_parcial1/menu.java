package romero_santiago_parcial1;
import java.util.Scanner;
public class menu {
    Scanner sc = new Scanner(System.in);
    GestionarVehiculos gestion = new GestionarVehiculos();
    
    private int leerEnteros(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
            }
        }
    }
    
    private int leerEnteroRango(String mensaje, int min, int max) {
    int v;
    do {
        v = leerEnteros(mensaje);
        if (v < min || v > max)
            System.out.println("Ingrese un valor entre " + min + " y " + max + ".");
    } while (v < min || v > max);
    return v;
    }
    
    private String leerTexto(String mensaje) {
        String texto = "";
        while (texto.trim().isEmpty()) {
            System.out.print(mensaje);
            texto = sc.nextLine();
            if (texto.trim().isEmpty())
                System.out.println("El campo no puede estar vacio.");
        }
        return texto.trim();
    }
    
    private boolean leerBool(String mensaje){
        if (mensaje == "s"){
            return true;
        } else {
            return false;
        }
    }
    
    private TipoMotor tipoDeMotor(){
        while(true){
            System.out.println("1.NAFTA \n2. DIESEL \n3. ELECTRICO ");
            int eleccion = leerEnteros("Que combustible quiere usar");
            
            switch(eleccion){
                case 1 -> {
                    return TipoMotor.NAFTA;
                }
                case 2 -> {
                    return TipoMotor.DIESEL;
                }
                case 3 -> {
                    return TipoMotor.ELECTRICO;
                }
            }
        }
    }
    
    private void agregarEquipo(){
        while(true){
            System.out.println("Que auto desea agregar?\n----------------\n1. Colectivo Turistico \n2. Van Ejecutiva \n3. Lancha Turistica");
            
            int eleccion = leerEnteros("_");
            String patente = leerTexto("Cual es la patente del auto?");
            String marca = leerTexto("Cual es la marca del vehiculo?");
            int capacidadPasajeros = leerEnteroRango("Cuantos pasajeros puede transportar?(no puede ser 0)", 1, 200);
            int añoFabricacion = leerEnteroRango("Cual es el año de fabricacion?" , 1990 , 2026);
            
            Vehiculos vehiculo = null;
            
            switch(eleccion){
                case 1 -> {
                    int cantidadPisos = leerEnteroRango("Cuantos pisos tiene el colectivo?", 1, 2);
                    vehiculo = new ColectivoTuristico(cantidadPisos, patente, marca, capacidadPasajeros, añoFabricacion);
                }
                case 2 -> {
                    boolean aireAcondicionado = leerBool("Su vehiculo tiene aire acondicionado ? s/n");
                    vehiculo = new VanEjecutiva(aireAcondicionado, patente,marca,capacidadPasajeros,añoFabricacion);
                }
                case 3 -> {
                    TipoMotor tipoMotor = tipoDeMotor();
                    vehiculo = new LanchaTuristica(tipoMotor, patente, marca , capacidadPasajeros, añoFabricacion);
                }
            }
        }
    }
    
    
    private void mostrarPorAñoFab(){
        
    }
}

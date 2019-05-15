
package patrones.de.software;

import java.util.*;
public class Main {
    public static int nAutos=5;
    public static int nScooters=3;
    public static int nMototaxis=6;
    

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        FabricaVehiculo fabrica;
        automovil[] autos = new automovil[nAutos];
        Scooter[] scooters = new Scooter[nScooters];
        Mototaxi[] mototaxis = new Mototaxi[nMototaxis];
        System.out.println("que tipo de vehiculo desea utilizar: "+ "Vehiculos electricos(1) o a gasolina(2) o a GLP(3): ");
        String eleccion = reader.next();
        if(eleccion.equals("1"))
            fabrica=new FabricaVehiculoElectricidad();
            
        if(eleccion.equals("2"))
            fabrica=new FabricaVehiculoGasolina();
            
        if(eleccion.equals("3"))
                fabrica=new FabricaVehiculoGLP();
        
        for(int i=0; i<nAutos; i++)
            autos[i]=fabrica.creaAutomovil("estandar", "blanco", 6+i, 3.2);
        for(int i =0; i<nScooters;i++)
            scooters[i]=fabrica.creaScooter("Clasico", "Azul", 2+i);
        for(int i=0;i<nMototaxis;i++)
            mototaxis[i]=fabrica.
        for(automovil auto:autos)
            auto.mostrarCaracteristicas();
        for(Scooter scooter:scooters)
            scooter.mostrarCaracteristicas();
    }   
    
    
}

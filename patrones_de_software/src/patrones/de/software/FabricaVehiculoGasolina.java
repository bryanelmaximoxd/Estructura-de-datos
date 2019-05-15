/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.de.software;

/**
 *
 * @author User
 */
public class FabricaVehiculoGasolina implements FabricaVehiculo{
public automovil creaAutomovil(String modelo, String color, int potencia, double espacio){
    return new AutomovilGasolina(modelo,color,potencia,espacio);
}
public Scooter creaScooter(String modelo, String color, int potencia){
    return new ScooterGasolina(modelo,color,potencia);
}
public Mototaxi creaMototaxi(String modelo, String color, int potencia){
    return new MototaxiGasolina(modelo,color,potencia);
}

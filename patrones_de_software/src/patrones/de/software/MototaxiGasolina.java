/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.de.software;


public class MototaxiGasolina extends Mototaxi{
     public MototaxiGasolina(String modelo, String color, int potencia){
     super(modelo,color,potencia);   
    }
    public void mostrarCaracteristicas(){
        System.out.println("Scooter electrico de modelo: " +modelo+ "de color"+color+ "de potencia: " +potencia);
    }
}

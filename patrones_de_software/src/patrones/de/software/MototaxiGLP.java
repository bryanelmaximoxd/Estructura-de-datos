/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.de.software;

/**
 *
 * @author Bryan
 */
public class MototaxiGLP extends Mototaxi{
     public MototaxiGLP(String modelo, String color, int potencia){
     super(modelo,color,potencia);   
    }
    public void mostrarCaracteristicas(){
        System.out.println("Scooter electrico de modelo: " +modelo+ "de color"+color+ "de potencia: " +potencia);
    }
}

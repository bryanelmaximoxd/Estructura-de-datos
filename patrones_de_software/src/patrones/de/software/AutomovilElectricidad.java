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
public class AutomovilElectricidad extends automovil{
    public AutomovilElectricidad(String modelo, String color, int potencia, double espacio){
     super(modelo,color,potencia,espacio);   
    }
    public void mostrarCaracteristicas(){
        System.out.println("Automovil electrico de modelo: " +modelo+ "de color"+color+ "de potencia: " +potencia+ "de espacio: " +espacio);
    }
}

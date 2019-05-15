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

public abstract class automovil{
   protected String modelo;
   protected String color;
   protected int potencia;
   protected double espacio;


public automovil(String modelo, String color, int potencia, double espacio){
this.modelo=modelo;
this.color=color;
this.potencia=potencia;
this.espacio=espacio;

}
public abstract void mostrarCaracteristicas();
}


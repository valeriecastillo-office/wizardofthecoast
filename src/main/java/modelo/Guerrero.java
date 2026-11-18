/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Guerrero extends Aventurero {
       private boolean armaduraPesada;

    public Guerrero(String nombre, int nivel, int puntosVida, boolean armaduraPesada) {
        super(nombre, nivel, puntosVida);
        this.armaduraPesada = armaduraPesada;
    }

    public boolean isArmaduraPesada() {
        return armaduraPesada;
    }
    @Override
    public String getClase() {
        return "Guerrero"; // Generated from
    }

    @Override
    public String ejecutarAccionCombate() {
         return "El Guerrero " + getNombre() + " usa Oleada de Acción para realizar múltiples ataques físicos continuos."; // Generated from 
    }
    
}

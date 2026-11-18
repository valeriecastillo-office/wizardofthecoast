/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Monje extends Aventurero {
      private int puntosKi;

    public Monje(String nombre, int nivel, int puntosVida, int puntosKi) {
        super(nombre, nivel, puntosVida);

        if (puntosKi < 0) {
            throw new IllegalArgumentException("Los puntos Ki no pueden ser negativos.");
        }

        this.puntosKi = puntosKi;
    }

    public int getPuntosKi() {
        return puntosKi;
    }

    @Override
    public String getClase() {
        return "Monje";
    }

    @Override
    public String ejecutarAccionCombate() {
        return "El Monje " + getNombre() + " gasta puntos de Ki para ejecutar una Ráfaga de Golpes y un Ataque Aturdidor.";
    }
}

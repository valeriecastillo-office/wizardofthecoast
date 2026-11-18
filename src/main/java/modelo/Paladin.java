/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Paladin extends Aventurero {
    private int puntosFuerza;

    public Paladin(String nombre, int nivel, int puntosVida, int puntosFuerza) {
        super(nombre, nivel, puntosVida);

        if (puntosFuerza < 0) {
            throw new IllegalArgumentException("Los puntos de fuerza no pueden ser negativos.");
        }

        this.puntosFuerza = puntosFuerza;
    }

    public int getPuntosFuerza() {
        return puntosFuerza;
    }

    @Override
    public String getClase() {
        return "Paladín";
    }

    @Override
    public String ejecutarAccionCombate() {
        return "El Paladín " + getNombre() + " consume magia para imbuir su arma con un Castigo Divino de daño radiante.";
    }
}

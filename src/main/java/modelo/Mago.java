/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Mago extends Aventurero{
     private int espaciosConjuro;

    public Mago(String nombre, int nivel, int puntosVida, int espaciosConjuro) {
        super(nombre, nivel, puntosVida);

        if (espaciosConjuro < 0) {
            throw new IllegalArgumentException("Los espacios de conjuro no pueden ser negativos.");
        }

        this.espaciosConjuro = espaciosConjuro;
    }

    public int getEspaciosConjuro() {
        return espaciosConjuro;
    }

    @Override
    public String getClase() {
        return "Mago";
    }

    @Override
    public String ejecutarAccionCombate() {
        return "El Mago " + getNombre() + " gasta un espacio de conjuro para lanzar una poderosa Bola de Fuego.";
    }
}


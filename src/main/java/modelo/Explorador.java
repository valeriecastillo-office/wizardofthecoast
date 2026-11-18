/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Explorador extends Aventurero{
     private String terrenoFavorecido;

    public Explorador(String nombre, int nivel, int puntosVida, String terrenoFavorecido) {
        super(nombre, nivel, puntosVida);

        if (terrenoFavorecido == null || terrenoFavorecido.trim().isEmpty()) {
            throw new IllegalArgumentException("El terreno favorecido es obligatorio.");
        }

        this.terrenoFavorecido = terrenoFavorecido.trim();
    }

    public String getTerrenoFavorecido() {
        return terrenoFavorecido;
    }

    @Override
    public String getClase() {
        return "Explorador";
    }

    @Override
    public String ejecutarAccionCombate() {
        return "El Explorador " + getNombre() + " aplica Marca del Cazador sobre el objetivo para maximizar su daño sostenido.";
    }
}

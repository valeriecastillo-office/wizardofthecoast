/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Clerigo extends Aventurero {
      private String diosVenerado;

    public Clerigo(String nombre, int nivel, int puntosVida, String diosVenerado) {
        super(nombre, nivel, puntosVida);

        if (diosVenerado == null || diosVenerado.trim().isEmpty()) {
            throw new IllegalArgumentException("El dios venerado es obligatorio.");
        }

        this.diosVenerado = diosVenerado.trim();
    }

    public String getDiosVenerado() {
        return diosVenerado;
    }

    @Override
    public String getClase() {
        return "Clérigo";
    }

    @Override
    public String ejecutarAccionCombate() {
        return "El Clérigo " + getNombre() + " usa Canalizar Divinidad para curar a sus aliados y expulsar muertos vivientes.";
    }
}

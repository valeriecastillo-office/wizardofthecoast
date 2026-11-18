/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Bardo extends Aventurero{
    private String instrumentoMusical;

    public Bardo(String nombre, int nivel, int puntosVida, String instrumentoMusical) {
        super(nombre, nivel, puntosVida);

        if (instrumentoMusical == null || instrumentoMusical.trim().isEmpty()) {
            throw new IllegalArgumentException("El instrumento musical es obligatorio.");
        }

        this.instrumentoMusical = instrumentoMusical.trim();
    }

    public String getInstrumentoMusical() {
        return instrumentoMusical;
    }

    @Override
    public String getClase() {
        return "Bardo";
    }

    @Override
    public String ejecutarAccionCombate() {
        return "El Bardo " + getNombre() + " toca su instrumento para otorgar Inspiración Bárdica a un aliado.";
    }
}

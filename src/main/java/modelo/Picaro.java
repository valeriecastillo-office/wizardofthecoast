/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Picaro extends Aventurero{
     private boolean herramientasLadron;

    public Picaro(String nombre, int nivel, int puntosVida, boolean herramientasLadron) {
        super(nombre, nivel, puntosVida);
        this.herramientasLadron = herramientasLadron;
    }

    public boolean isHerramientasLadron() {
        return herramientasLadron;
    }

    @Override
    public String getClase() {
        return "Pícaro";
    }

    @Override
    public String ejecutarAccionCombate() {
        return "El Pícaro " + getNombre() + " aprovecha la ventaja táctica para asestar un Ataque Furtivo masivo y se reposiciona.";
    }
}

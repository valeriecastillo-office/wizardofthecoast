/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wizardofthecoast;
import controlador.ControladorGremio;
import javax.swing.SwingUtilities;
import vista.VentanaGremioForm;
/**
 *
 * @author USER
 */
public class WIZARDOFTHECOAST {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            ControladorGremio controlador = new ControladorGremio();

            VentanaGremioForm ventana = new VentanaGremioForm(controlador);

            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);

        });
    }
}

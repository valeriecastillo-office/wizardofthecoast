/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USER
 */
public class AventureroTest {
    
    @Test
    public void guerreroConservaDatosBasicosYEspeciales() {

        Guerrero guerrero = new Guerrero("Arthas", 4, 35, true);

        assertEquals("Arthas", guerrero.getNombre());
        assertEquals(4, guerrero.getNivel());
        assertEquals(35, guerrero.getPuntosVida());
        assertTrue(guerrero.isArmaduraPesada());
    }

    @Test
    public void magoEjecutaAccionDeCombate() {

        Mago mago = new Mago("Merlín", 5, 22, 4);

        assertEquals(
            "El Mago Merlín gasta un espacio de conjuro para lanzar una poderosa Bola de Fuego.",
            mago.ejecutarAccionCombate()
        );
    }

    @Test
    
    public void constructorSobrecargadoAsignaDiezPuntosDeVida() {

        Aventurero aventurero = new Aventurero("Eira", 1,10 ) {

            @Override
            public String getClase() {
                return "Prueba";
            }

            @Override
            public String ejecutarAccionCombate() {
                return "Acción de prueba";
            }
        };

        assertEquals(10, aventurero.getPuntosVida());
    }

    @Test
    public void noPermiteNivelInvalido() {

        assertThrows(
            IllegalArgumentException.class,
            () -> new Guerrero("Aldric", 0, 20, true)
        );
    }
    
}

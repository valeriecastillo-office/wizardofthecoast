/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USER
 */
public class PicaroTest {
    
 
    @Test
    public void picaroConHerramientasEsVerdadero() {
        Picaro picaro = new Picaro("Garrett", 4, 25, true);

        assertTrue(picaro.isHerramientasLadron());
        assertEquals("Pícaro", picaro.getClase());
    }

    @Test
    public void picaroSinHerramientasEsFalso() {
        Picaro picaro = new Picaro("Robin", 2, 18, false);

        assertFalse(picaro.isHerramientasLadron());
    }
}

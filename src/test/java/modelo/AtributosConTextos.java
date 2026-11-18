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
public class AtributosConTextos {
    
   public class HeroesTextoTest {

    // Bardo, Clérigo, Explorador
    @Test
    public void crearBardoExitoso() {
        Bardo bardo = new Bardo("Jaskier", 3, 20, "Laúd");
        assertEquals("Bardo", bardo.getClase(), "La clase debe ser Bardo");
        assertEquals("Laúd", bardo.getInstrumentoMusical());
    }

    @Test
    public void bardoLanzaExcepcionSiInstrumentoVacio() {
       
        assertThrows(IllegalArgumentException.class, () -> {
            new Bardo("Jaskier", 3, 20, "   "); 
        });
    }

   
    @Test
    public void clerigoAccionCombateCorrecta() {
        Clerigo clerigo = new Clerigo("Luz", 5, 35, "Pelor");
        String accionEsperada = "El Clérigo Luz usa Canalizar Divinidad para curar a sus aliados y expulsar muertos vivientes.";
        assertEquals(accionEsperada, clerigo.ejecutarAccionCombate());
    }

   
    @Test
    public void exploradorLanzaExcepcionSiDiosNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Explorador("Aragorn", 10, 50, null); 
        });
    }
}}

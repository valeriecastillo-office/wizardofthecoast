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
public class AtributosNumericos {
// Mago, Monje, Paladín
    public class HeroesNumericosTest {

        @Test
        public void magoAsignaAtributosCorrectamente() {
            Mago mago = new Mago("Merlín", 5, 22, 4);
            assertEquals(4, mago.getEspaciosConjuro());
        }

        @Test
        public void magoLanzaExcepcionSiConjuroNegativo() {
            assertThrows(IllegalArgumentException.class, () -> {
                new Mago("Gargamel", 2, 15, -1);
            });
        }

        @Test
        public void monjePermiteCeroPuntosKi() {

            Monje monje = new Monje("Lee", 1, 10, 0);
            assertEquals(0, monje.getPuntosKi());
        }

        @Test
        public void monjeLanzaExcepcionSiKiNegativo() {
            assertThrows(IllegalArgumentException.class, () -> {
                new Monje("Aang", 4, 30, -5);
            });
        }

        @Test
        public void paladinAccionCombateCorrecta() {
            Paladin paladin = new Paladin("Arthur", 6, 60, 18);
            String esperado = "El Paladín Arthur consume magia para imbuir su arma con un Castigo Divino de daño radiante.";
            assertEquals(esperado, paladin.ejecutarAccionCombate());
        }
    }
}

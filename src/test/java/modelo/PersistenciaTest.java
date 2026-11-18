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
public class PersistenciaTest {
   @Test
    public void guardarAventureroNoLanzaError() {
        Persistencia persistencia = new Persistencia();
        Bardo bardoFalso = new Bardo("TestBardo", 1, 10, "Flauta");

        // assertDoesNotThrow asegura que intentar guardar en el .txt no rompa el programa
        assertDoesNotThrow(() -> {
            persistencia.guardar(bardoFalso);
        }, "El método guardar Aventurero no debería lanzar una IOException");
    }

    @Test
    public void guardarTextoNoLanzaError() {
        Persistencia persistencia = new Persistencia();
        
        assertDoesNotThrow(() -> {
            persistencia.guardar("Este es un texto de prueba para JUnit.");
        }, "El método guardar String no debería lanzar una IOException");
    }

    
}

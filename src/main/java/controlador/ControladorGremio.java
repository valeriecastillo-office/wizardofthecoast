/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Aventurero;
import modelo.Persistencia;
/**
 *
 * @author USER
 */
public class ControladorGremio {
    
    private final ArrayList<Aventurero> aventureros;
    private final Persistencia persistencia;

    public ControladorGremio() {
        aventureros = new ArrayList<>();
        persistencia = new Persistencia();
    }

    public void registrarAventurero(Aventurero aventurero) throws IOException {

        if (aventurero == null) {
            throw new IllegalArgumentException("El aventurero no puede ser nulo.");
        }

        persistencia.guardar(aventurero);
        aventureros.add(aventurero);
    }

    public void registrarAventurero(Aventurero aventurero, String observacion) throws IOException {

        registrarAventurero(aventurero);
        persistencia.guardar(observacion);
    }

    public ArrayList<Aventurero> getAventureros() {
        return new ArrayList<>(aventureros);
    }

    public ArrayList<String> simularCombate() throws IOException {

        ArrayList<String> resultados = new ArrayList<>();
// poliforismo
        for (Aventurero aventurero : aventureros) {

            String resultado = aventurero.ejecutarAccionCombate();

            resultados.add(resultado);
            persistencia.guardar(resultado);
        }

        return resultados;
    }

    public String generarReportePorClase() {

        StringBuilder reporte = new StringBuilder("REPORTE DE AVENTUREROS POR CLASE\n");

        String[] clases = {
            "Guerrero", "Mago", "Clérigo", "Monje",
            "Paladín", "Explorador", "Pícaro", "Bardo"
        };

        for (String clase : clases) {

            int cantidad = 0;

            for (Aventurero aventurero : aventureros) {
                if (aventurero.getClase().equals(clase)) {
                    cantidad++;
                }
            }

            reporte.append(clase).append(": ").append(cantidad).append("\n");
        }

        return reporte.toString();
    }

    public String generarReportePuntosVida() {

        int total = 0;
        int mayor = 0;
        String nombreMayor = "Ninguno";

        for (Aventurero aventurero : aventureros) {

            total += aventurero.getPuntosVida();

            if (aventurero.getPuntosVida() > mayor) {
                mayor = aventurero.getPuntosVida();
                nombreMayor = aventurero.getNombre();
            }
        }

        return "REPORTE DE PUNTOS DE VIDA\n"
                + "Total de aventureros: " + aventureros.size()
                + "\nPuntos de vida acumulados: " + total
                + "\nMayor cantidad: " + mayor + " (" + nombreMayor + ")";
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author USER
 */
public class Persistencia {

    private String archivo = "datos.txt"; 

  
    public void guardar(Aventurero aventurero) throws IOException {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fecha = LocalDateTime.now().format(formato);

        BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true));
        escritor.write("Fecha: " + fecha);
        escritor.newLine();
        escritor.write(aventurero.toString());
        escritor.newLine();
        escritor.write("--------------------------------");
        escritor.newLine();
        escritor.close();
    }

 
    public void guardar(String texto) throws IOException {
        BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true));
        escritor.write(texto);
        escritor.newLine();
        escritor.close();
    }
}
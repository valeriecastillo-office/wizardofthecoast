/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public abstract class Aventurero implements IAccionCombate{
    
  protected String nombre;
    protected int nivel;
    protected int puntosVida;

    public Aventurero(String nombre, int nivel, int puntosVida) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }

        if (nivel < 1 || puntosVida < 1) {
            throw new IllegalArgumentException("El nivel y los puntos de vida deben ser mayores que cero.");
        }
        this.nombre = nombre.trim();
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }
    public Aventurero(String nombre) {
        this(nombre, 1, 10);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
          if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
    }
           this.nombre = nombre.trim();
    }
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        
        if (nivel < 1) {
            throw new IllegalArgumentException("El nivel debe ser mayor o igual a 1.");
        }
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
          if (puntosVida < 1) {
            throw new IllegalArgumentException("Los puntos de vida deben ser mayores que 0.");
        }
        this.puntosVida = puntosVida;
    }
     public abstract String getClase();

    @Override
    public String toString() {
        return "Clase: " + getClase()+" | Nombre: " + nombre+ " | Nivel: " + nivel+ " | Puntos de vida: " + puntosVida;
    }
}

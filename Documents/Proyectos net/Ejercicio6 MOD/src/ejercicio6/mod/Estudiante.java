/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6.mod;

/**
 *
 * @author jepeh
 */
public class Estudiante {
   private String nombre;
   private Double[] notas;

    public Estudiante() {
    }

    public Estudiante(String nombre, Double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public Double[] getNotas() {
        return notas;
    }
   
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6.mod;

/**
 *
 * @author jepeh
 */
public class CalculoNotas {
    public static double calcularPromedio(Double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public static boolean Mayor(double promedio) {
        return promedio >= 14;
    }

   
}


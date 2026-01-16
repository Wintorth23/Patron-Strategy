/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6.mod;

/**
 *
 * @author jepeh
 */

public class Registro implements IRegistro{

    @Override
    public void mostrar(Estudiante es, double promedioInicial, double promedioFinal, boolean aprovado1, boolean aprovado2) {
        System.out.println("---------Datos obtenidos---------");
        System.out.println("Nombre: "+ es.getNombre());
        System.out.println("PromedioInicial: "+promedioInicial);
        System.out.println("PromedioFinal: "+promedioFinal);
        System.out.println("Estado: "+(aprovado1 ? "Aprobado" : "Reprobado"));
        System.out.println("Estado: "+(aprovado2 ?  "Aprobado" : "Reprobado"));
       
        System.out.println("Notas finales (actualizadas): ");
        Double[] notasFinales = es.getNotas();
        
        for (int i = 0; i < notasFinales.length; i++) {
            System.out.println("nota "+(i+1)+": "+ notasFinales[i] );
        }
        System.out.println("-------Fin de mostrar datos---------");
    }

 
    
}

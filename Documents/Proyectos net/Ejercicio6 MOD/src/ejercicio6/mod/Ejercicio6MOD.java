/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6.mod;

import java.util.Scanner;

/**
 *
 * @author jepeh
 */
public class Ejercicio6MOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        ICambioNotas nt=new CambioNotas();
        IRegistro reg=new Registro();
        

        System.out.println("--------Calculo de Notas---------");
        System.out.println("Ingrese el Nombre del estudiante");
        String nombre=sc.nextLine();
        System.out.println("Ingrese el numero de notas a calacular");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("---------Calculo Notas---------");
        Double[] notas=new Double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la nota "+ (i+1));
            notas[i]=sc.nextDouble();   
        }
        Estudiante es = new Estudiante(nombre,notas);
        double promedioInicial=CalculoNotas.calcularPromedio(es.getNotas());
        boolean aprovado1=CalculoNotas.Mayor(promedioInicial);
        
        
        double promedioFinal=nt.cambio(notas);
        boolean aprovado2=CalculoNotas.Mayor(promedioFinal);
        
        reg.mostrar(es, promedioInicial, promedioFinal, aprovado1, aprovado2);
        
    }
    
}

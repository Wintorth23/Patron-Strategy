/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uni;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Uni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Estudiante Es= new Estudiante ( );

	System.out.println("Ingrese el nombre");
	String nombre = sc.nextLine();
	System.out.println("Ingrese el numero de notas que desea ingresar");
	int Nn= sc.nextInt();
	sc.nextLine();
	double[] notas = new double[Nn];
	CalculoEstudiante CE= new  CalculoEstudiante();
	CE.calculoPromedio(Nn,notas);
	ARestudiante ar= new ARestudiante();
	ar.ARes(CE);
	System.out.println("Desea aumentar un punto al estudiante");
	System.out.println("1.Si\n"+"2.No");
	
	int B= sc.nextInt();
	sc.nextLine();
	Bono b= new Bono();
	if(B==1){
	    b.bono(CE);
	}else{
	    System.out.println("No aplica el aumento");
	}
	Reporte rt=new Reporte();
	rt.ReporteEs(nombre, CE);
	sc.close();
    }
    
    
}

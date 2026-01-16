/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni;

/**
 *
 * @author labesp
 */
public class CalculoEstudiante extends Estudiante implements Calculo {
    
    double resultado;
   

    @Override
    public double calculoPromedio(int Nnotas, double[] notas) {
	double suma = 0;
	for (int i = 0; i <Nnotas; i++) {
	    System.out.println("Ingrese la nota:"+(i+1));
	    notas[i]= sc.nextDouble();
	    suma+= notas[i];
	    
	}
	resultado =suma/Nnotas;
	return resultado;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.strategy;

import java.util.Scanner;

/**
 *
 * @author jepeh
 */
public class EjemploStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner sc = new Scanner (System.in);
        Quintil quintil = new Quintil();
        System.out.println("Ingrese el precio de la materia");
        double monto=sc.nextDouble();
        sc.nextLine();
        int op =0;
        do {
            System.out.println("Seleccione su Quintil");
            System.out.println("1. Quintil 1(Bajo economico)");
            System.out.println("2. Quintil 2(Medio Economico)");
            System.out.println("3. Quintil 3(Alto Economico)");
            System.out.println("4. Salir");
            op = sc.nextInt();
            
            switch (op){
                case 1: 
                    quintil.setAumentar(new Quitil1());
                    System.out.println("Toal a pagar: $"+quintil.total(monto));
                    break;
                case 2:
                    quintil.setAumentar(new Quintil2());
                    System.out.println("Toal a pagar: $"+quintil.total(monto));
                    break;
                case 3:
                    quintil.setAumentar(new Quintil3());
                    System.out.println("Toal a pagar: $"+quintil.total(monto)); 
                    break;
                case 4:
                    System.out.println("Pago reaizado con Exito");
                default:
                    System.out.println("NO se selecciono una opcion de pago");
                    
            }
        
        }while (op != 4);
    }
    
}
    
    


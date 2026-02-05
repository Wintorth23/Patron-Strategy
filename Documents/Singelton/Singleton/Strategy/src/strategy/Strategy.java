/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy;
import java.util.*;
/**
 *
 * @author jepeh
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        Pago pago = new Pago();
        System.out.println("======Ingrese el monto a pagar=======");
        double monto= sc.nextDouble();
        int op =0;
        sc.nextLine();
        do{
            System.out.println("Seleccione un metodo de pago ");
            System.out.println("1. Pago en efectivo");
            System.out.println("2. Pago por Tarjeta");
            System.out.println("3. Pago por PayPal");
            System.out.println("4. Salir");
            op=sc.nextInt();
            sc.nextLine();
            
            switch (op){
                case 1 :
                    pago.setmetodopago(new PagoEfectivo());
                    pago.realizarPago(monto);
                    break;
                case 2: 
                    pago.setmetodopago(new PagoTarjeta());
                    pago.realizarPago(monto);
                    break;
                case 3:
                    pago.setmetodopago(new PagoPaypal());
                    pago.realizarPago(monto);
                    break;
                case 4:
                    System.out.println("Pago realizado con exito");
                    break;
                default: 
                    System.out.println("No se selecciono un metodo de pago");
                    break;
                    
                
            }
            
        }while(op != 4);
         
      
    }
    
}

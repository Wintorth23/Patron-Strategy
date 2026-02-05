/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Strategy2;
import java.util.*;
/**
 *
 * @author jepeh
 */
public class Strategy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Venta venta = new Venta();
        System.out.println("Ingrese el monto de descuento");
        double monto=sc.nextDouble();
        sc.nextLine();
        int op =0;
        do {
            System.out.println("Seleccione un Descuento");
            System.out.println("1. Descuento Normal");
            System.out.println("2. Descuento Estudiantil");
            System.out.println("3. Descuento VIP");
            System.out.println("4. Salir");
            op = sc.nextInt();
            
            switch (op){
                case 1: 
                    venta.setDescuento(new DescuentoNormal());
                    System.out.println("El precion con descuento es: $"+ (monto-venta.CalcularTotal(monto)));
                    break;
                case 2:
                    venta.setDescuento(new DescuentoEstudiantil());
                    System.out.println("El precion con descuento es: $"+ (monto-venta.CalcularTotal(monto)));
                    break;
                case 3:
                    venta.setDescuento(new DescuentoVip());
                    System.out.println("El precion con descuento es: $"+ (monto-venta.CalcularTotal(monto))); 
                    break;
                case 4:
                    System.out.println("Pago reaizado con Exito");
                default:
                    System.out.println("NO se selecciono una opcion de pago");
                    
            }
        
        }while (op != 4);
    }
    
}

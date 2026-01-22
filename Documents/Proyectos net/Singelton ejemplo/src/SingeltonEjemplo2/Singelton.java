/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SingeltonEjemplo2;
import java.util.*;
/**
 *
 * @author jepeh
 */
public class Singelton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op=0;
        String url;
        String basedatos;
        Scanner sc = new Scanner (System.in);
        Configurador c = Configurador.getConfigurador();
        do{
        System.out.println("Ingrese la opcion que va a realizar");
            System.out.println("1. Ingresar url y seleccionar la bse de datos");
            System.out.println("2. Mostrar");
            System.out.println("3. Salir");
            op=sc.nextInt();
            sc.nextLine();
     switch (op){
         case 1:
             System.out.println("Ingrse la url");
             url=sc.nextLine();
             c.registrarUrl(url);
             System.out.println("Ingrese la base de datos");
             basedatos=sc.nextLine();
             c.regitrarBase(basedatos);
             
             break;
         case 2:
        System.out.println(c.getUrl());

        System.out.println(c.getBaseDatos());
         break;
         case 3:
             System.out.println("Saliendo del sistema");
         break;
         default:
             System.out.println("Eleccion Incorrecta");
        
     }  
        }while(op !=3);
    }

}
  

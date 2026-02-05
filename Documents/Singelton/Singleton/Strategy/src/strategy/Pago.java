/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author jepeh
 */
public class Pago {
    private MetodoPago metodo;

    public Pago() {
    }
    public void setmetodopago(MetodoPago metodo){
        this.metodo= metodo;
    }

    public void realizarPago(double monto){
        metodo.pagar(monto);
    }
    
    
    
}

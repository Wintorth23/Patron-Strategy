/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy2;

/**
 *
 * @author jepeh
 */
public class Venta {
    private Descuento descuento;
    
    public void setDescuento(Descuento descuento){
        this.descuento=descuento;
    }
    
    public double CalcularTotal(double precio){
       return descuento.Aplicar(precio);
       
    }
    
}

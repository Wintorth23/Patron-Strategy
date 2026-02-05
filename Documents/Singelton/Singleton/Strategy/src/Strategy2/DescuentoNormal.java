/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy2;

/**
 *
 * @author jepeh
 */

public class DescuentoNormal implements Descuento {

    @Override
    public double Aplicar(double monto) {
            return monto *0.05;
    }
    
    
}

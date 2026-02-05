/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.strategy;

/**
 *
 * @author jepeh
 */
public class Quintil {
   private Aumentar aumento;
   
   public void setAumentar(Aumentar aumento){
       this.aumento=aumento;
   }

    public Quintil() {
    }

    public Quintil(Aumentar aumento) {
        this.aumento = aumento;
    }
    
    public double total(double quinitil){
        
        return aumento.aumento(quinitil);
    }
   
}

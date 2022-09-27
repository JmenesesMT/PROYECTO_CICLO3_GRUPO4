
package model;

import javax.swing.JOptionPane;


public abstract class Acueducto {
    private int metros;
    private double vlrConsumo;

    public Acueducto(int metros) {
        this.metros = metros;
    }
  
    public int getMetros() {
        return metros;
    }
  
    public void setMetros(int metros) {
        this.metros = metros;
    }

    public double getVlrConsumo() {
        return vlrConsumo;
    }

    public void setVlrConsumo(double vlrConsumo) {
        this.vlrConsumo = vlrConsumo;
    }
    
    public abstract void consumo();
    
    public void presenta(double exceso,double alcantarillado){
        JOptionPane.showMessageDialog(null,"Valor consumo: "+getVlrConsumo()+
                                      "\nValor exceso: "+exceso+
                                      "\nValor alcantarillado: "+alcantarillado+
                                      "\n Total a pagar: "+(getVlrConsumo()+exceso+alcantarillado));
        
    }   
}

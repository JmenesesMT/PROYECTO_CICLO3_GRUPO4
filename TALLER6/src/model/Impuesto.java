
package model;

import javax.swing.JOptionPane;


public class Impuesto {
    private String idPropietario;
    private double smlv = 1000000;
    private double proAnciano;
    private double proUis;
    private double vlrImpuesto;

    public Impuesto(String idPropietario) {
        this.idPropietario = idPropietario;
    }

   
    public String getIdPropietario() {
        return idPropietario;
    }

   
    public void setIdPropietario(String idPropietario) {
        this.idPropietario = idPropietario;
    }

   
    public double getSmlv() {
        return smlv;
    }

    
    public void setSmlv(double smlv) {
        this.smlv = smlv;
    }

  
    public double getProAnciano() {
        return proAnciano;
    }

   
    public void setProAnciano(double proAnciano) {
        this.proAnciano = proAnciano;
    }

  
    public double getProUis() {
        return proUis;
    }

  
    public void setProUis(double proUis) {
        this.proUis = proUis;
    }

  
    public double getVlrImpuesto() {
        return vlrImpuesto;
    }


    public void setVlrImpuesto(double vlrImpuesto) {
        this.vlrImpuesto = vlrImpuesto;
    }
    
    public void valorImpuesto (){
        //vlrImpuesto=smlv*0.6;
        setVlrImpuesto(getSmlv()*0.6);
    }
    
    public void subsidios(){
        
       // proUis=vlrImpuesto*0.01;
       // proAnciano=vlrImpuesto*0.01;
        
        setProUis(getVlrImpuesto()*0.01);
        setProAnciano(getVlrImpuesto()*0.01);
    }
    
    public void presentar(){
        //JOptionPane.showMessageDialog(null,"Valor impuesto: "+vlrImpuesto+
         //                                  "\nValor pro-Uis: "+proUis+
       //                                    "\nValor pro-Anciano: "+proAnciano);
        
        
        JOptionPane.showMessageDialog(null,"Valor impuesto: "+getVlrImpuesto()+
                                           "\nValor pro-Uis: "+getProUis()+
                                           "\nValor pro-Anciano: "+getProAnciano());
        
    }
   
}

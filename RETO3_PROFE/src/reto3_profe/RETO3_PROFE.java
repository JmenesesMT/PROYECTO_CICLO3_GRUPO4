
package reto3_profe;

import javax.swing.JOptionPane;
import model.Impuesto;


public class RETO3_PROFE {

   
    public static void main(String[] args) {
         String continuar = "S";
        
        while(continuar.equals("S")){
        String tipoImpuesto = JOptionPane.showInputDialog("Tipo impuesto "+
                                                          "\nD - Departamental"+
                                                          "\nM - Municipal").toUpperCase();
        
        String placa = JOptionPane.showInputDialog("Ingrese placa del vehiculo): ").toUpperCase();
        String soat = JOptionPane.showInputDialog("Soat vigente (S/N): ").toUpperCase();
        
        
    }   
}
}

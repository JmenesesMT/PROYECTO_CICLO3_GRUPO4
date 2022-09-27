
package taller6;

import javax.swing.JOptionPane;
import model.Vehiculos;
import model.Vivienda;


public class TALLER6 {

   
    public static void main(String[] args) {
        
        String continuar = "S";
        while(continuar.equals("S")){
            String tipo=JOptionPane.showInputDialog("Seleccione tipo"+
                                                    "\nV - Vehiculo"+
                                                    "\nC - Vivienda").toUpperCase();
            String idPropietario=JOptionPane.showInputDialog("ID del propietario: ");
            
            if (tipo.equals("V")){
                int modelo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese modelo del vehiculo: "));
                Vehiculos vehiculo = new Vehiculos (modelo,idPropietario);
                vehiculo.valorImpuesto();
                vehiculo.subsidios();
                vehiculo.presentar();
                
            }else{
                int estrato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato de la vivienda: "+
                                                                         "\n1"+
                                                                         "\n2"+
                                                                         "\n3"));
                Vivienda vivienda = new Vivienda (estrato,idPropietario);
                vivienda.valorImpuesto();
                vivienda.subsidios();
                vivienda.presentar();
                
          
            }
            continuar = JOptionPane.showInputDialog("Desea continuar S/N: ").toUpperCase();
        }}
        }
                                                             
            
     


package model;


public class Impuesto extends Transito {
    String tipoImpuesto;

    public Impuesto(String tipoImpuesto, String placa) {
        super(placa);
        this.tipoImpuesto = tipoImpuesto;
    }
    
    //impuesto municipal
    public double calculaImp(){
        return smlv; 
    }
    
    // impuesto departamental
    public double calculaImp(int modelo){
        if(modelo<=2010){
            return smlv * 1.1;
        }
        else{
            return smlv *1.2;
        }
        
    }
    //dcto departamental
    public double calculaDcto(int modelo,double vlrImp){
        if(tipoImpuesto.equals("D")){
             if(modelo>=2010 && modelo <=2015){
                return vlrImp*0.05;
        }else{
                 if(modelo>2015){
                     return vlrImp*0.1;
                 }
             }
            
        }
        return 0;       
    }
    //descuento D Y M
    public double calculaDcto(String soat,double vlrImp){
        if(soat.equals("S")){
            return vlrImp*0.05;
        }
        return 0;
        
    }
}

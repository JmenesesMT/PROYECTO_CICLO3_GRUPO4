
package model;


public class Vehiculos extends Impuesto{
    private int modelo;

    public Vehiculos(int modelo, String idPropietario) {
        super(idPropietario);
        this.modelo = modelo;
    }

  
    public int getModelo() {
        return modelo;
    }

    
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void valorImpuesto(){
        if(getModelo() < 2010){
            setVlrImpuesto(getSmlv()*0.45);
        }else{
            setVlrImpuesto(getSmlv()*0.55);
        }
    }
   
    @Override
    public void subsidios(){
        setProUis(getVlrImpuesto()*0.1);
        setProAnciano(getVlrImpuesto()*0.05);
        
    }
    
    
}

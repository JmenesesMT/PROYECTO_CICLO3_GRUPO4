
package model;

public class Vivienda extends Impuesto {
    private int estrato;

    public Vivienda(int estrato, String idPropietario) {
        super(idPropietario);
        this.estrato = estrato;
    }

    
    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }
    
    //override sobreescribir metodo en super clase
    @Override
    public void valorImpuesto(){
        if ( getEstrato() == 1){
            //vlrImpuesto = smlv*0.3; (no se puede)
            setVlrImpuesto(getSmlv()*0.3);
        } else{ 
            if (getEstrato() == 2){
                setVlrImpuesto(getSmlv()*0.4);
            }
            else {
              setVlrImpuesto(getSmlv()*0.5);
            }            
        }
    }
    
    @Override
    public void subsidios(){
        if ( getEstrato() == 1 || getEstrato() == 2){
            setProUis(getVlrImpuesto()*0.05);
            setProAnciano(getVlrImpuesto()*0.05);
            
        }else{
            setProUis(getVlrImpuesto()*0.1);
            setProAnciano(getVlrImpuesto()*0.1);
        }
    }
}

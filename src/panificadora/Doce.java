
package panificadora;


public class Doce extends Produto{
    private String tipoDoce;
    
    @Override
    public void Vproducao(String dia){
      if("sabado".equals(dia)||"domingo".equals(dia)){
         this.setTempo(this.tempo*1.2);
      }
    }

    public String getTipoDoce() {
        return tipoDoce;
    }

    public void setTipoDoce(String tipoDoce) {
        this.tipoDoce = tipoDoce;
    }
   
}

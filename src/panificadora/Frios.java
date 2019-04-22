
package panificadora;


public class Frios extends Produto{
    @Override
    public void Vproducao(String dia){
      if("domingo".equals(dia)){
         this.setTempo(this.tempo*1.1);
      }
    }
    
}

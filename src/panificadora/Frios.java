
package panificadora;


public class Frios extends Produto{
    
    public Frios(){
        this.tempo = 6.0;
    }
    @Override
    public void Vproducao(String dia){
      if("domingo".equals(dia)){
         this.setTempo(this.tempo*1.1);
      }
    }
    
}


package panificadora;

public class Paozinho extends Produto{
    private String sabor;

    @Override
    public void Vproducao(String dia){
      if("sabado".equals(dia)||"domingo".equals(dia)){
        this.setTempo(this.tempo*1.15);
      }
    }
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
}

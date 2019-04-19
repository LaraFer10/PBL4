
package panificadora;


public class Frios extends Produto{
    @Override
    public double Vproducao(String dia){
      if("Domingo".equals(dia)){
         return this.tempo*1.1;
      }
        return 0;
    }
    @Override
     public void setPreco(double preco) {
        this.preco = 6;
    }
}

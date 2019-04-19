
package panificadora;

public class Paozinho extends Produto{
    private String sabor;

    @Override
    public double Vproducao(String dia){
      if("Sabado".equals(dia)&&"Domingo".equals(dia)){
         return this.tempo*1.15;
      }
        return 0;
    }
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    @Override
     public void setPreco(double preco) {
        this.preco = 2;
    }
}


package panificadora;


public class Doce extends Produto{
    private String tipoDoce;
    
    @Override
    public double Vproducao(String dia){
      if("Sabado".equals(dia)&&"Domingo".equals(dia)){
         return this.tempo*1.2;
      }
        return 0;
    }

    public String getTipoDoce() {
        return tipoDoce;
    }

    public void setTipoDoce(String tipoDoce) {
        this.tipoDoce = tipoDoce;
    }
    @Override
     public void setPreco(double preco) {
        this.preco = 5;
    }
}

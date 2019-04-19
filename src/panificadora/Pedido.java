
package panificadora;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> produto;
    
    public Pedido(){
        this.produto = new ArrayList();
    }

   public double TotalPreco(){
       double soma=0;        
       for (int i = 0; i < this.produto.size(); i++) {
           soma = soma+this.produto.get(i).preco;
       }
       return soma;
   }
   public ArrayList<Integer> TotalItens(){
       int cont1 = 0, cont2 = 0, cont3 = 0;
       for (int i = 0; i < this.produto.size(); i++) {
           if(this.produto.get(i) instanceof Paozinho){
               cont1++;
           }else{
               if(this.produto.get(i) instanceof Doce){
                   cont2++;
               }else{
                   if(this.produto.get(i) instanceof Frios){
                       cont3++;
                   }
               }
           }
       }
       ArrayList<Integer> item = new ArrayList();
       item.add(cont1);
       item.add(cont2);
       item.add(cont3);
       return item; 
   }
   public ArrayList<Double> ValorItens(){
       double cont1 = 0, cont2 = 0, cont3 = 0;
       for (int i = 0; i < this.produto.size(); i++) {
           if(this.produto.get(i) instanceof Paozinho){
               cont1 = this.produto.get(i).getPreco()+cont1;
           }else{
               if(this.produto.get(i) instanceof Doce){
                   cont2 = this.produto.get(i).getPreco()+cont2;
               }else{
                   if(this.produto.get(i) instanceof Frios){
                       cont3 = this.produto.get(i).getPreco()+cont3;
                   }
               }
           }
       }
       ArrayList<Double> item = new ArrayList();
       item.add(cont1);
       item.add(cont2);
       item.add(cont3);
       return item; 
   }
   public double TempoTotal(){
       double tempo = 0;
       for (int i = 0; i < this.produto.size(); i++) {
           tempo = tempo + this.produto.get(i).tempo;
       }
       return tempo;
   }

   public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto.add(produto);
    }
}

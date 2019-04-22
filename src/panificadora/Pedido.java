
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
       double c1 = 0, c2 = 0, c3 = 0;
       for (int i = 0; i < this.produto.size(); i++) {
           if(this.produto.get(i) instanceof Paozinho){
               c1 = this.produto.get(i).getPreco()+c1;
           }else{
               if(this.produto.get(i) instanceof Doce){
                   c2 = this.produto.get(i).getPreco()+c2;
               }else{
                   if(this.produto.get(i) instanceof Frios){
                       c3 = this.produto.get(i).getPreco()+c3;
                   }
               }
           }
       }
       ArrayList<Double> item = new ArrayList();
       item.add(c1);
       item.add(c2);
       item.add(c3);
       return item; 
   }
   public double TempoTotal(String dia){
       double t = 0;
       for (int i = 0; i < this.produto.size(); i++) {
           this.produto.get(i).Vproducao(dia);
           t= this.produto.get(i).getTempo()+ t;
       }
       return t;
   }

   public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto.add(produto);
    }
}

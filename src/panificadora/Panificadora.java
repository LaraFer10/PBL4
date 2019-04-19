
package panificadora;

import javax.swing.JOptionPane;

public class Panificadora {

    
    public static void main(String[] args) {
        Produto prod = new Produto();
        Doce doce = new Doce();
        doce.setPreco(50);
        Frios frio = new Frios();
        frio.setPreco(70);
        Paozinho pao = new Paozinho();
        pao.setPreco(30);
        prod = (Produto) frio;
        prod = (Produto) pao;
        prod = (Produto) doce;
        Pedido pedido = new Pedido();
       
        int cont=0, quant=0;
        
        
        String x;
        while(quant == 0){
            x = JOptionPane.showInputDialog(null, "EFETUAR COMPRA:\n[1]Pãozinho\n[2]Doces\n[3]Frios");
            switch(x){
                case "1":
                    while(cont==0){
                        pao.setSabor(JOptionPane.showInputDialog("Sabor do pãozinho"));
                        cont = JOptionPane.showConfirmDialog(null, "Compra realizada com sucesso!\nEfetuar outra compra de pãozinho?");
                        pedido.setProduto(pao);
                    }
                    break;
                case "2":
                    while(cont==0){
                        doce.setTipoDoce(JOptionPane.showInputDialog("Tipo do doce"));
                        cont = JOptionPane.showConfirmDialog(null, "Compra realizada com sucesso!\nEfetuar outra compra de docinhos?");
                        pedido.setProduto(doce);
                    }
                    break;
                case "3":
                    while(cont==0){
                        cont = JOptionPane.showConfirmDialog(null, "Compra realizada com sucesso!\nEfetuar outra compra de frios?");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Informação invalida");
                    break;
            }
            quant = JOptionPane.showConfirmDialog(null, "Continuar compra?");
        }
        //gerar nota fiscal
        String dia = JOptionPane.showInputDialog("Dia da compra");
        for (int i = 0; i < pedido.getProduto().size(); i++) {
            pedido.getProduto().get(i).Vproducao(dia);
        }
        
        JOptionPane.showMessageDialog(null, "NOTA FISCAL\n"+pedido.TotalItens().get(0)+"Pãozinho - "+pedido.ValorItens().get(0)+"R$\n"
        +pedido.TotalItens().get(1)+"Docinho - "+pedido.ValorItens().get(1)+"R$\n"+pedido.TotalItens().get(2)
        +"Frios - "+pedido.ValorItens().get(2)+"R$\nValor Total - "+pedido.TotalPreco()+"Tempo Total: "+pedido.TempoTotal());
        
    }
    
}

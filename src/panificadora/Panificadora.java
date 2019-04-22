
package panificadora;

import javax.swing.JOptionPane;

public class Panificadora {

    
    public static void main(String[] args) {
        Produto prod = new Produto();
        Doce doce = new Doce();
        doce.setPreco(25.0);
        doce.setTempo(5.0);
        Frios frio = new Frios();
        frio.setPreco(10.0);
        frio.setTempo(6.0);
        Paozinho pao = new Paozinho();
        pao.setPreco(30.0);
        pao.setTempo(2.0);
        prod = (Produto) frio;
        prod = (Produto) pao;
        prod = (Produto) doce;
        Pedido pedido = new Pedido();
       
        int quant = 0;
        
        
        String x;
       while(quant == 0){
            x = JOptionPane.showInputDialog("EFETUAR COMPRA:\n[1]Pãozinho\n[2]Doces\n[3]Frios");
            switch(x){
                case "1":
                    pao.setSabor(JOptionPane.showInputDialog("Sabor do pãozinho"));
                    pedido.setProduto(pao);
                    break;
                case "2":
                    doce.setTipoDoce(JOptionPane.showInputDialog("Tipo do doce"));
                    pedido.setProduto(doce);
                    break;
                case "3":
                    pedido.setProduto(frio);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Informação invalida");
                    break;
            }
            quant = JOptionPane.showConfirmDialog(null, "Continuar compra?");
        }
        //gerar nota fiscal
        String dia = JOptionPane.showInputDialog("Dia da compra");
        /*for (int i = 0; i < pedido.getProduto().size(); i++) {
            pedido.getProduto().get(i).Vproducao(dia);
        }*/
        
        JOptionPane.showMessageDialog(null, "NOTA FISCAL\n"+pedido.TotalItens().get(0)+" Pãozinho - "+pedido.ValorItens().get(0)+" R$\n"
        +pedido.TotalItens().get(1)+" Docinho - "+pedido.ValorItens().get(1)+" R$\n"+pedido.TotalItens().get(2)
        +" Frios - "+pedido.ValorItens().get(2)+" R$\nValor Total - "+pedido.TotalPreco()+" R$\nTempo Total - "+pedido.TempoTotal(dia));
        
    }
    
}

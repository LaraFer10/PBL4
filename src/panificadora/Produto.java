
package panificadora;

public class Produto {
    protected double preco;
    protected String especifica;
    protected int validade;
    protected double tempo;
    
    public double Vproducao(String dia){
        return 0;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEspecifica() {
        return especifica;
    }

    public void setEspecifica(String especifica) {
        this.especifica = especifica;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
}

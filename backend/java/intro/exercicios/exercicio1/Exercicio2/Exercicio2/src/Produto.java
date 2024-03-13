import javax.swing.JOptionPane;

public class Produto {
    String nome;
    double preco;
    int quantidade;
    double precoTotal;
    double[] desconto = {0.1, 0.2, 0.25};

    Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        calculadoraDeDesconto();
    }

    private void calculadoraDeDesconto() {
        double valor = this.preco * this.quantidade;
        if (this.quantidade > 10 && this.quantidade <=20) {
            precoTotal = valor - (valor * desconto[0]);
        }else if(this.quantidade > 20  && this.quantidade <= 50) {
            precoTotal = valor - (valor * desconto[1]);
        }else if (this.quantidade > 50) {
            precoTotal = valor - (valor * desconto[2]);
        } else {
            precoTotal = valor;
        }
    }

    public void sobreACompra() {
        String mensagem = "Produto: " + this.nome+"\nValor Total: R$ "+this.precoTotal;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

package cinema;
public class Filme {
    private String nome;
    private int preco;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return this.preco;
    }

    public void setPreco(int novoPreco) {
        this.preco = novoPreco;
    }
}

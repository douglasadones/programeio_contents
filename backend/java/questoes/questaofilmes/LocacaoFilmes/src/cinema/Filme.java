package cinema;
public class Filme {
    private String nome;
    private double preco;

    public Filme(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }
}
package cinema;

import javax.swing.JOptionPane;

// Enum criado afim de facilitar a lógica e melhorar a semântica
enum Tipo {
    lancamento,
    promocao,
    infantil,
}

public class LocacaoFilmes {
    private double valorFilmeNormal = 4.0;
    private Filme[] lancamentos = {};
    private Filme[] promocao = {};
    private Filme[] infantil = {};
    
    public void getLancamentos() {
        String message = auxiliarDeInformacoes(this.lancamentos, Tipo.lancamento);
        JOptionPane.showMessageDialog(null, message);
    }

    public void setLancamentos(Filme novoFilme) {
        novoFilme.setPreco(valorFilmeNormal + 3.00);
        reconstruindoArray(novoFilme, this.lancamentos, Tipo.lancamento
        );
    }

    public void getPromocao() {
        String message = auxiliarDeInformacoes(this.promocao, Tipo.promocao);
        JOptionPane.showMessageDialog(null, message);
    }

    public void setPromocao(Filme novoFilme) {
        novoFilme.setPreco(valorFilmeNormal - 2.00);
        reconstruindoArray(novoFilme, this.promocao, Tipo.promocao);
    }

    public void getInfantil() {
        String message = auxiliarDeInformacoes(this.infantil, Tipo.infantil);
        JOptionPane.showMessageDialog(null, message);
    }

    public void setInfantil(Filme novoFilme) {
        novoFilme.setPreco(valorFilmeNormal + 2.00);
        reconstruindoArray(novoFilme, this.infantil, Tipo.infantil);
    }

    // Método auxiliar que realoca espaço na array informada para adicionar os filmes. Usado pelos métodos setters
    private void reconstruindoArray(Filme novoFilme, Filme[] catalogo, Tipo tipo) {
        Filme[] arrayRedimensionada = new Filme[catalogo.length+1];
        for(int i = 0; i < catalogo.length; i++) {
            arrayRedimensionada[i] = catalogo[i];
        }
        if (arrayRedimensionada[0] != null) {
            arrayRedimensionada[arrayRedimensionada.length-1] = novoFilme;
        } else {
            arrayRedimensionada[0] = novoFilme;
        }
        if (tipo == Tipo.infantil){
            this.infantil = arrayRedimensionada;
        } else if(tipo == Tipo.lancamento) {
            this.lancamentos = arrayRedimensionada;
        } else {
            this.promocao = arrayRedimensionada;
        }
    }

    // Método auxiliar que percorre a array informada para formata e retornar uma string que será usada no showMessageDialog pelos métodos getters
    private String auxiliarDeInformacoes(Filme[] array, Tipo tipo) {
        String tipoCatalogo = (tipo == Tipo.lancamento) ? "Lançamento" : (tipo == Tipo.infantil) ? "Infantil" : "Promoção";
        String mensagem = "";
        double precoTotal = 0.0;
        for (int i=0; i<array.length; i++) {
            precoTotal += array[i].getPreco();
        }
        for(int i=0; i<array.length; i++) {
            mensagem += "\nNome: "+array[i].getNome()+"\nPreço: R$ " + String.format("%.2f", array[i].getPreco()) + "\n";
        }
        return "Catálogo "+tipoCatalogo+":\n"+mensagem+"\nPreço total: R$ " + String.format("%.2f", precoTotal);
    }
}

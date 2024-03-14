package cinema;

import javax.swing.JOptionPane;

enum Tipo {
    lancamento,
    promocao,
    infantil,
}

public class LocacaoFilmes {
    private Filme[] lancamentos = {};
    private Filme[] promocao = {};
    private Filme[] infantil = {};
    
    public void getLancamentos() {
        String message = auxiliarDeInformacoes(lancamentos);
        JOptionPane.showMessageDialog(null, message);
    }
    public void setLancamentos(Filme novoFilme) {
        reconstruindoArray(novoFilme, this.lancamentos, Tipo.lancamento
        );
    }
    public Filme[] getPromocao() {
        return promocao;
    }
    public void setPromocao(Filme novoFilme) {
        reconstruindoArray(novoFilme, this.lancamentos, Tipo.promocao);
    }
    public Filme[] getInfantil() {
        return infantil;
    }
    public void setInfantil(Filme novoFilme) {
        reconstruindoArray(novoFilme, this.lancamentos, Tipo.infantil);
    }

    private void reconstruindoArray(Filme novoFilme, Filme[] catalogo, Tipo tipo) {
        Filme[] arrayRedimensionada = new Filme[catalogo.length+1];
        for(int i = 0; i < catalogo.length; i++) {
            arrayRedimensionada[i] = catalogo[i];
        }
        if (arrayRedimensionada[0] != null) {
            arrayRedimensionada[arrayRedimensionada.length+1] = novoFilme;
        } else {
            arrayRedimensionada[catalogo.length] = novoFilme;
        }
        if (tipo == Tipo.infantil){
            this.infantil = arrayRedimensionada;
        } else if(tipo == Tipo.lancamento) {
            this.lancamentos = arrayRedimensionada;
        } else {
            this.promocao = arrayRedimensionada;
        }
    }

    // formata os dados para usar no showMessageDialog
    public String auxiliarDeInformacoes(Filme[] array) {
        String mensagem = "";
        for(int i=0; i<array.length; i++) {
            mensagem += "\nNome: "+array[i].getNome()+"\nPreço: "+array[i].getPreco();
        }
        return mensagem;
    }
    
}

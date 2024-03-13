package cinema;

import javax.swing.JOptionPane;

public class LocacaoFilmes {
    private Filme[] lancamentos = {};
    private Filme[] promocao = {};
    private Filme[] infantil = {};
    
    public void getLancamentos() {
        JOptionPane.showMessageDialog(null, auxiliarDeInformacoes(lancamentos));
    }
    public void setLancamentos(Filme novoFilme) {
        reconstruindoArray(novoFilme, this.lancamentos);
    }
    public Filme[] getPromocao() {
        return promocao;
    }
    public void setPromocao(Filme novoFilme) {
        reconstruindoArray(novoFilme, this.lancamentos);
    }
    public Filme[] getInfantil() {
        return infantil;
    }
    public void setInfantil(Filme novoFilme) {
        reconstruindoArray(novoFilme, this.lancamentos);
    }

    private void reconstruindoArray(Filme novoFilme, Filme[] catalogo) {
        Filme[] arrayRedimensionada = new Filme[catalogo.length+1];

        for(int i = 0; i < catalogo.length; i++) {
            arrayRedimensionada[i] = catalogo[i];
        
        }
        arrayRedimensionada[catalogo.length+1] = novoFilme;
        catalogo = arrayRedimensionada;
    }

    // formata os dados para usar no showMessageDialog
    // private String auxiliarDeInformacoes(Filme[] tipo) {
    //     String mensagem;
    //     for(int i=0; i!=tipo.length; i++) {
    //         mensagem += "\nNome: "+tipo[i].getNome()+"\nPreço: "+tipo[i].getPreco();
    //     }
    //     return mensagem;
    // }
    
}

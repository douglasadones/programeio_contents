
package controller;

import dao.GenericDAO;
import java.text.ParseException;
import javax.swing.JOptionPane;
import modelo.Atividade;
import utilitario.Caracter;
import utilitario.DateUtil;

public class AtividadeController {
    
    private Atividade atividade;
    private GenericDAO<Atividade> atividadeDAO;

    public AtividadeController() {
        atividade = new Atividade();
        atividadeDAO = new GenericDAO<Atividade>(Atividade.class);
    }

    public void salvar() {
        atividadeDAO.save(atividade);
    }

    public void salvar(String nome, String descricao, String dataAtividade) throws ParseException {
        atividade.setDataAtividade(DateUtil.StringToDate(dataAtividade));
        atividade.setNome(nome);
        atividade.setDescricao(descricao);
        atividadeDAO.save(atividade);
    }
    
    public void consultarTodos() {
        JOptionPane.showMessageDialog(null, atividadeDAO.findAll());
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
    
}

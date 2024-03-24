package controller;

import dao.GenericDAO;
import javax.swing.JOptionPane;
import modelo.Pessoa;
import utilitario.Caracter;

public class PessoaController {

    private Pessoa pessoa;
    private GenericDAO<Pessoa> pessoaDAO;

    public PessoaController() {
        pessoa = new Pessoa();
        pessoaDAO = new GenericDAO<Pessoa>(Pessoa.class);
    }

    public void salvar() {
        pessoaDAO.save(pessoa);
    }

    public void salvar(String nome, String cpf) {
        pessoa.setNome(nome);
        pessoa.setCpf(Caracter.removerCaracter(cpf));
        pessoaDAO.save(pessoa);
    }
    
    public void consultarTodos() {
        JOptionPane.showMessageDialog(null, pessoaDAO.findAll());
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}

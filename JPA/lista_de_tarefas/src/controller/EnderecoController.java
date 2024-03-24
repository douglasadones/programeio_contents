
package controller;

import dao.GenericDAO;
import javax.swing.JOptionPane;
import modelo.Endereco;
import utilitario.Caracter;

public class EnderecoController {
    private Endereco endereco;
    private GenericDAO<Endereco> enderecoDAO;

    public EnderecoController() {
        endereco = new Endereco();
        enderecoDAO = new GenericDAO<Endereco>(Endereco.class);
    }

    public void salvar() {
        enderecoDAO.save(endereco);
    }

    public void salvar(String bairro, String cidade, String complemento, 
            String logradouro, String numero) {
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setComplemento(cidade);
        endereco.setComplemento(Caracter.removerCaracter(complemento));
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);
        enderecoDAO.save(endereco);
    }
    
    public void consultarTodos() {
        JOptionPane.showMessageDialog(null, enderecoDAO.findAll());
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

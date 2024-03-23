
package exemplo.crud;

import javax.persistence.EntityManager;
import modelo.Endereco;
import modelo.Pessoa;
import utilitario.JpaUtil;

public class CadastrarPessoaEndereco {
    public static void main(String[] args) {
        
        
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        
        Endereco endereco = new Endereco(); 
        endereco.setBairro("Bairro X");
        endereco.setCidade("Cidade X");
        endereco.setLogradouro("Av. XX");
        endereco.setNumero("000");
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setCpf("99999999999");
        pessoa.setEndereco(endereco);
        
        em.persist(pessoa);
        
        em.getTransaction().commit();
        JpaUtil.fecharConexao();
        
    }
}

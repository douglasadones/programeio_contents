package servicos;

import generico.ServicoGenerico;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import modelo.Cliente;

/**
 *
 * @author dougl
 */

@Stateless
public class ClienteServico extends ServicoGenerico<Cliente> {

//    //  Isso aqui já vai criar e persistir o nosso cliente no banco de dados; (isso foi importado da classe ServicoGenerico)
//    @PersistenceContext
//    EntityManager em;

    public ClienteServico() {
        super(Cliente.class);
    }
    
    public List<Cliente> pesquisarCliente(Cliente cliente) {
        // Iniciando a Query do bd
        String sql = "select c from Cliente c where ";
        
        // Caso o nome do cliente tenha um valor inserido ele entra no if
        if(cliente.getNome() != null && !cliente.getNome().equals("")) {
            sql += "lower(c.nome) like lower(:nome) and ";
        }
        
        // Caso o telefone do cliente tenha um valor inserido ele entra no if
        if (cliente.getTelefone() != null && !cliente.getTelefone().equals("")) {
            sql += "c.telefone like :telefone and ";
        }
        
        // A consulta vai sempre trazer os clientes ativos no banco de dados
        sql += "c.ativo = true";
        
        // Lendo a Query
        Query query = getEntityManager().createQuery(sql);
        
        // Passando os parâmetros
        if(cliente.getNome() != null && !cliente.getNome().equals("")) {
            query.setParameter("nome", "%"+cliente.getNome()+"%");
        }
        
        if (cliente.getTelefone() != null && !cliente.getTelefone().equals("")) {
            query.setParameter("telefone", cliente.getTelefone());
        }
        return query.getResultList();
    }

}

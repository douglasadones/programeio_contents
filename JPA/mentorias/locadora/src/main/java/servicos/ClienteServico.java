package servicos;

import generico.ServicoGenerico;
import java.util.List;
import javax.ejb.Stateless;
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
    
    public List<Cliente> findByName(String nome) {
        return getEntityManager().createQuery("SELECT c FROM Cliente c WHERE c.nome like "+nome+"").getResultList();
    }

}

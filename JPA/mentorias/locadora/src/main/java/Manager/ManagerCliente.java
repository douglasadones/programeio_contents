package Manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Cliente;
import servicos.ClienteServico;
import utilitario.Mensagem;

/**
 *
 * @author dougl
 */

@Named
@ViewScoped
public class ManagerCliente implements Serializable {
    
    @EJB
    private ClienteServico clienteServico;
    
    private Cliente cliente;
    private List<Cliente> clientes;
    
    @PostConstruct
    public void instanciar() {
        cliente = new Cliente();
        clientes = new ArrayList<>();
    }
    
    public void salvar() {
        clienteServico.salvar(cliente);
        instanciar();
        Mensagem.msg("Operação realizada com sucesso!");
    }
    
    public void pesquisarPorNome() {
        clientes = clienteServico.findByName(cliente.getNome());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

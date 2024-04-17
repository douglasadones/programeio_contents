package Manager;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
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
        // Passando parâmetros para a página de cadastro para atualizar.
        Map<String, String> parms = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String visualizar = parms.get("visualizar");
        String editar = parms.get("editar");

        if (visualizar != null) {
            cliente = clienteServico.find(Long.parseLong(visualizar));
        } else if (editar != null) {
            cliente = clienteServico.find(Long.parseLong(editar));
        } else {
            cliente = new Cliente();
        }
    }

    public void salvar() {
        if (cliente.getId() == null) {
            cliente.setAtivo(Boolean.TRUE);
            clienteServico.salvar(cliente);
            instanciar();
            Mensagem.msg("Operação realizada com sucesso!");
        } else {
            clienteServico.atualizar(cliente);
            Mensagem.msg("Operação realizada com sucesso!");
        }

    }

    public void findAll() {
        clientes = clienteServico.findAll();
    }

    public void pesquisar() {
        clientes = clienteServico.pesquisarCliente(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

}

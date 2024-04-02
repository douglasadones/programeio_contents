package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelos.Agenda;
import modelos.Contato;

/**
 *
 * @author dougl
 */

@Named
@ViewScoped
public class ManagerAgenda implements Serializable {
    
    private Agenda agenda;
    private Contato contato;
    private List<Contato> contatos;
//    private String resultado;
    
    @PostConstruct
    public void instanciar() {
        agenda = new Agenda();
        contato = new Contato();
        contatos = new ArrayList<>();
    }
    
//    public void mostarValoresAgenda() {
//        System.out.println(agenda.getNome());
//        resultado = agenda.getNome();
//    }
    
    public void adicionarContato() {
        contatos.add(contato);
        contato = new Contato();
    }
    
    public void removerContato(Contato c) {
        contatos.remove(c);
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

//    public String getResultado() {;
//        return resultado;
//    }
//
//    public void setResultado(String resultado) {
//        this.resultado = resultado;
//    }
    
    
    
}

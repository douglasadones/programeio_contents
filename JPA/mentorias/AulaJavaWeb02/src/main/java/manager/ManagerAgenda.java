package manager;

import java.io.Serializable;
import java.util.ArrayList;
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
//    private String resultado;

    @PostConstruct
    public void instanciar() {
        agenda = new Agenda();
        agenda.setContatos(new ArrayList<>());
        contato = new Contato();
    }

//    public void mostarValoresAgenda() {
//        System.out.println(agenda.getNome());
//        resultado = agenda.getNome();
//    }
    public void adicionarContato() {
        agenda.getContatos().add(contato);
        contato = new Contato();
    }

    public void removerContato(Contato c) {
        agenda.getContatos().remove(c);
    }

    public void visualizar() {
        System.out.println(agenda.getNome());
        System.out.println(agenda.getContatos());
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

//    public String getResultado() {;
//        return resultado;
//    }
//
//    public void setResultado(String resultado) {
//        this.resultado = resultado;
//    }
}

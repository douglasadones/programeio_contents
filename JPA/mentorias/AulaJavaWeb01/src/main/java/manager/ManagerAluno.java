
package manager;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Aluno;

/**
 *
 * @author dougl
 */

@Named
@ViewScoped
public class ManagerAluno implements Serializable {
    
    private Aluno aluno;
    private String resultado;
    
    @PostConstruct // Esse método será chamado automaticamente após o construtor.
    public void instanciar() {
        aluno = new Aluno();
    }
    
    public void salvar() {
        resultado = aluno.getNome();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}

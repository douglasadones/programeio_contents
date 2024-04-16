package modelo;

import generico.EntidadeGenerica;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author dougl
 */

@Entity
public class Cliente extends EntidadeGenerica {
    
    @Id
    @SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente")
    @GeneratedValue(generator = "seq_cliente", strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String nome;
    
    private String telefone;

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.nome);
        hash = 43 * hash + Objects.hashCode(this.telefone);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    
    
    
    
}

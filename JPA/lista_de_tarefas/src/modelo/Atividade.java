package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "tab_atividade")
public class Atividade implements Serializable {
    
    @Id
    private Long id;
    @Column(length = 200, nullable = true) // Opcional
    private String nome;
    @Column(length = 500, nullable = true)
    private String descricao;
    @Temporal(TemporalType.TIMESTAMP) // data e hora
    private Date dataAtividade;
    
    public Atividade() {
    }

    public Atividade(Long id, String nome, String descricao, Date dataAtividade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataAtividade = dataAtividade;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataAtividade() {
        return dataAtividade;
    }

    public void setDataAtividade(Date dataAtividade) {
        this.dataAtividade = dataAtividade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((dataAtividade == null) ? 0 : dataAtividade.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Atividade other = (Atividade) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (dataAtividade == null) {
            if (other.dataAtividade != null)
                return false;
        } else if (!dataAtividade.equals(other.dataAtividade))
            return false;
        return true;
    }
}

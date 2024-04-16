package generico;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dougl
 */

@MappedSuperclass
public abstract class EntidadeGenerica implements Serializable{
    
    public Boolean ativo;  // Isso aqui é para quando quisermos "excluir" um dado na interface
    
    @Temporal(TemporalType.TIMESTAMP)  // Armazena no banco de dados quando isso foi armazenado
    public Date dataCadastro;
    
    @Temporal(TemporalType.TIMESTAMP)
    public Date dataAtualizacao;

    public EntidadeGenerica() {
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
    
    
    
}

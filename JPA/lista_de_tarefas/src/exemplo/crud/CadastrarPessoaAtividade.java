
package exemplo.crud;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.Atividade;
import modelo.Pessoa;
import utilitario.JpaUtil;

public class CadastrarPessoaAtividade {
    
    public static void main(String[] args) {
        
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        
        Atividade atividade = new Atividade(); 
        atividade.setNome("Realizar Consulta");
        atividade.setDataAtividade(new Date());
        
        Atividade atividade2 = new Atividade(); 
        atividade2.setNome("Pagar Mensalidade");
        atividade2.setDataAtividade(new Date());
        
        
        List<Atividade> atividades = new ArrayList<>();
        atividades.add(atividade);
        atividades.add(atividade2);
        
        
//        for(Atividade a: atividades) {;
//            em.persist(a);
//        }
        
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("José");
        pessoa.setCpf("88888888888");
        pessoa.setAtividades(atividades);
        
        em.persist(pessoa);
        
        em.getTransaction().commit();
        JpaUtil.fecharConexao();
    }   
}

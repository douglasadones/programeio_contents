
package exemplo.crud;

import javax.persistence.EntityManager;
import modelo.Atividade;
import utilitario.JpaUtil;

public class AtualizarAtividade {
    
    public static void main(String[] args) {
        
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        
        Atividade atividade = em.find(Atividade.class, 553L);
        atividade.setDescricao("Ir para a clinica y");
        atividade.setNome("Ir Para o Dentista");
        
        em.merge(atividade);
        em.getTransaction().commit();
        JpaUtil.fecharConexao();
    }
    
}


package exemplo.crud;

import javax.persistence.EntityManager;
import modelo.Atividade;
import utilitario.JpaUtil;

public class RemoverAtividade {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        
        Atividade atividade = em.find(Atividade.class, 552L);
        em.remove(atividade);
        
        em.getTransaction().commit();
        JpaUtil.fecharConexao();
    }
}

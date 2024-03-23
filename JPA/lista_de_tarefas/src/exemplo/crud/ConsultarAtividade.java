
package exemplo.crud;

import java.util.List;
import javax.persistence.EntityManager;
import modelo.Atividade;
import utilitario.JpaUtil;

public class ConsultarAtividade {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        
        List<Atividade> atividades = em.createQuery("select a from Atividade a").getResultList();
        System.out.println(atividades);
        
        em.getTransaction().commit();
        JpaUtil.fecharConexao();
    }
}

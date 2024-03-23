
package exemplo.crud;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Atividade;
import utilitario.JpaUtil;

public class ConsultarAtividadeParametro {
    
    public static void main(String[] args) {
        
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        
        
        String consulta = "select a from Atividade a where lower(a.nome) like :nome";
        Query query = em.createQuery(consulta);
        query.setParameter("nome", "%realizar%");
        List<Atividade> atividades = query.getResultList();
        
        System.out.println(atividades);
        
        em.getTransaction().commit();
        JpaUtil.fecharConexao();
        
    }
    
}

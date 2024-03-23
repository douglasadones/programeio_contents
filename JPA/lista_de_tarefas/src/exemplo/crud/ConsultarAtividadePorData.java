
package exemplo.crud;

import java.text.ParseException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Atividade;
import utilitario.DateUtil;
import utilitario.JpaUtil;

public class ConsultarAtividadePorData {
    
    public static void main(String[] args) throws ParseException {
        
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        
        
        String consulta = "select a from Atividade a where a.dataAtividade BETWEEN :dataIni AND :dataFim";
        Query query = em.createQuery(consulta);
        query.setParameter("dataIni", DateUtil.StringToDate("10/07/2022"));
        query.setParameter("dataFim", DateUtil.StringToDate("30/12/2022"));
        List<Atividade> atividades = query.getResultList();
        
        System.out.println(atividades);
        
        em.getTransaction().commit();
        JpaUtil.fecharConexao();
        
    }
    
}
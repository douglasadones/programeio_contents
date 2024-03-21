package exemplo.crud;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.Atividade;
import utilitario.JpaUtil;

public class CadastrarAtividade {

    public static void main(String[] args) {
        Atividade atividade = new Atividade("Realizar Compra", "Realizar Compra no Mercado", new Date());
        Atividade atividade2 = new Atividade("Fazer tarefas de casa", "Lavar roupas", new Date());
        Atividade atividade3 = new Atividade("Ir ao dentista", "Realizar exame odontológico", new Date());
        List<Atividade> atividades = new ArrayList<>();
        
        atividades.add(atividade);
        atividades.add(atividade2);
        atividades.add(atividade3);
        
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
  
        
        for (Atividade atv: atividades) {
            em.persist(atv);
        }

        em.getTransaction().commit();
        JpaUtil.fecharConexao();
    }

}

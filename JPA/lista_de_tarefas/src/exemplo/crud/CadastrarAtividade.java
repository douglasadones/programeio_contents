package exemplo.crud;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Atividade;

public class CadastrarAtividade {
    
    public static void main(String[] args) {
        Atividade atividade = new Atividade(1L, "Realizar Compra", "Realizar Compra no Mercado", new Date());
        Atividade atividade2 = new Atividade(2L, "Fazer tarefas de casa", "Lavar roupas", new Date());
        Atividade atividade3 = new Atividade(3L, "Ir ao dentista", "Realizar exame odontológico", new Date());
        List<Atividade> atividades = new ArrayList<>();
        atividades.add(atividade);
        atividades.add(atividade2);
        atividades.add(atividade3);
        
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("ListaDeTarefasPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        for (Atividade a: atividades) {
            em.persist(a);
        }
        
        em.getTransaction().commit();
    }
    
}

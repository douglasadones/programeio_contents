package exemplo.crud;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Atividade;

public class CadastrarAtividade {
    
    public static void main(String[] args) {
        Atividade atividade = new Atividade();
        atividade.setId(1L);
        atividade.setNome("Fazer Compras");
        atividade.setDescricao("Realizar compras no mecado (Frutas)");
        atividade.setDataAtividade(new Date());
        
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("ListaDeTarefasPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        em.persist(atividade);
        
        em.getTransaction().commit();
    }
    
}

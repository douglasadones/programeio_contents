package utilitario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
    private static EntityManagerFactory emf;
    
    static {
        emf = Persistence.createEntityManagerFactory("ListaDeTarefasPU");
    }
    
    public static EntityManager conexao() {
        return emf.createEntityManager();
    }
    
    public static void fecharConexao() {
        emf.close();
    }
}

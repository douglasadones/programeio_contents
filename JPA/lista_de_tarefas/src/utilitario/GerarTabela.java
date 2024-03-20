package utilitario;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTabela {

    public static void main(String[] args) {
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("ListaDeTarefasPU");
        
        emf.close();
    }

}

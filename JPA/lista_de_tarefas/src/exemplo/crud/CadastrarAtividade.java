package exemplo.crud;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.Atividade;
import utilitario.DateUtil;
import utilitario.JpaUtil;

public class CadastrarAtividade {

    public static void main(String[] args) throws ParseException {
        Atividade atividade = new Atividade("Realizar Compra", "Realizar Compra no Mercado", DateUtil.StringToDate("01/01/2022"));
        Atividade atividade2 = new Atividade("Fazer tarefas de casa", "Lavar roupas", DateUtil.StringToDate("01/06/2022"));
        Atividade atividade3 = new Atividade("Ir ao dentista", "Ir para a clinica X", DateUtil.StringToDate("22/09/2022"));
        Atividade atividade4 = new Atividade("Entrar na Academia", "Matricular na Academia", DateUtil.StringToDate("10/12/2022"));
        Atividade atividade5 = new Atividade("Realizar Compras do Fim de ano", "Realizar Compras", DateUtil.StringToDate("25/12/2022"));
        
        List<Atividade> atividades = new ArrayList<>();
        
        atividades.add(atividade);
        atividades.add(atividade2);
        atividades.add(atividade3);
        atividades.add(atividade4);
        atividades.add(atividade5);
        
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
  
        
        for (Atividade atv: atividades) {
            em.persist(atv);
        }

        em.getTransaction().commit();
        JpaUtil.fecharConexao();
    }

}

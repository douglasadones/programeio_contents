
// Bloco de código não mais necessário por conta do GenericDAO

//package dao;
//
//import java.util.List;
//import javax.persistence.EntityManager;
//import modelo.Atividade;
//import utilitario.JpaUtil;
//
//public class AtividadeDAO {
//
//    public void salvar(Atividade atividade) {
//        try {
//            EntityManager em = JpaUtil.conexao();
//            em.getTransaction().begin();
//
//            em.persist(atividade);
//            em.getTransaction().commit();
//        } finally {
//            JpaUtil.fecharConexao();
//        }
//    }
//    
//    public Atividade consultar(Long id) {
//        EntityManager em = JpaUtil.conexao();
//        return em.find(Atividade.class, id);
//    }
//    
//        public void atualizar(Atividade atividade) {
//        try {
//            EntityManager em = JpaUtil.conexao();
//            em.getTransaction().begin();
//            em.merge(atividade);
//            em.flush();
//            em.getTransaction().commit();
//        } finally {
//            JpaUtil.fecharConexao();
//        }
//    }
//
//    public List<Atividade> todosRegistros() {
//        EntityManager em = JpaUtil.conexao();
//        return em.createQuery("select a from Atividade a").getResultList();
//    }
//}

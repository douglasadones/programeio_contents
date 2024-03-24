
// Bloco de código não mais necessário por conta do GenericDAO

//package dao;
//
//import java.util.List;
//import javax.persistence.EntityManager;
//import modelo.Endereco;
//import utilitario.JpaUtil;
//
//public class EnderecoDAO {
//
//    public void salvar(Endereco endereco) {
//        try {
//            EntityManager em = JpaUtil.conexao();
//            em.getTransaction().begin();
//
//            em.persist(endereco);
//            em.getTransaction().commit();
//        } finally {
//            JpaUtil.fecharConexao();
//        }
//    }
//
//    public Endereco consultar(Long id) {
//        EntityManager em = JpaUtil.conexao();
//        return em.find(Endereco.class, id);
//    }
//
//    public void atualizar(Endereco endereco) {
//        try {
//            EntityManager em = JpaUtil.conexao();
//            em.getTransaction().begin();
//            em.merge(endereco);
//            em.flush();
//            em.getTransaction().commit();
//        } finally {
//            JpaUtil.fecharConexao();
//        }
//    }
//
//    public List<Endereco> todosRegistros() {
//        EntityManager em = JpaUtil.conexao();
//        return em.createQuery("select a from Atividade a").getResultList();
//    }
//
//}

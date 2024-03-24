
// Bloco de código não mais necessário por conta do GenericDAO

//package dao;
//
//import java.util.List;
//import javax.persistence.EntityManager;
//import modelo.Pessoa;
//import utilitario.JpaUtil;
//
//public class PessoaDAO {
//
//    public void salvar(Pessoa pessoa) {
//        try {
//            EntityManager em = JpaUtil.conexao();
//            em.getTransaction().begin();
//
//            em.persist(pessoa);
//
//            em.getTransaction().commit();
//        } finally {
//            JpaUtil.fecharConexao();
//        }
//    }
//
//    public Pessoa consultar(Long id) {
//        EntityManager em = JpaUtil.conexao();
//        return em.find(Pessoa.class, id);
//    }
//
//    public void atualizar(Pessoa pessoa) {
//        try {
//            EntityManager em = JpaUtil.conexao();
//            em.getTransaction().begin();
//            em.merge(pessoa);
//            em.flush();
//            em.getTransaction().commit();
//        } finally {
//            JpaUtil.fecharConexao();
//        }
//    }
//
//    public List<Pessoa> todosRegistros() {
//        EntityManager em = JpaUtil.conexao();
//        return em.createQuery("select e from Endereco e").getResultList();
//    }
//}

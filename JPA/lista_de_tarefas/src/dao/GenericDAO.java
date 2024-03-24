package dao;

import java.util.List;
import javax.persistence.EntityManager;
import utilitario.JpaUtil;

public class GenericDAO<T> {

    private EntityManager entityManager;
    private Class<T> classe;

    public GenericDAO(Class<T> classe) {
        this.classe = classe;
        entityManager = JpaUtil.conexao();
    }

    public void save(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    public void update(T entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.flush();
        entityManager.getTransaction().commit();
    }
    
    public T getByID(Long id){
        return entityManager.find(classe, id);
    }
    
    public List<T> findAll(){
        return entityManager.createQuery("SELECT t FROM "+classe.getName()+" t").getResultList();
    }
}

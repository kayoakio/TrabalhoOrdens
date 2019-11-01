package ejb;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public abstract class AbstractFacadeLocal<T> {
    
    private final Class<T> entityClass;
    
    //Construtor com parâmetro
    public AbstractFacadeLocal(Class<T> entityClass){
        this.entityClass = entityClass;
    }
    
    protected abstract EntityManager getEntityManager();
    
    public void create (T entity){
        getEntityManager().persist(entity);
    }
    
    public void update (T entity){
        getEntityManager().merge(entity);
    }
    
    public void remove (T entity){
        getEntityManager().remove(getEntityManager().merge(entity));
    }
    
    //buscar pelo numero
    public T find(Object numero){
        return getEntityManager().find(entityClass, numero);
    }
    
    //listar todas
    public List<T> findAll(){
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }
    
    public Integer count(){
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
}

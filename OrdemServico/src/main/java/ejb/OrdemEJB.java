package ejb;

import entity.Ordem;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class OrdemEJB 
    extends AbstractFacadeLocal <Ordem>
    implements OrdemFacadeLocal {
    
    @PersistenceContext (unitName = "perPU")
    private EntityManager entityManager;
    
    public OrdemEJB(){
        super(Ordem.class);
    }
    
    public OrdemEJB(Class <Ordem> entityClass){
        super(entityClass);
    }
    
    @Override
    protected EntityManager getEntityManager(){
        return entityManager;
    }
    
    @Override 
    public void create (Ordem ordem){
        ordem.setData(new Date());
        getEntityManager().persist(ordem);
    }
    
}

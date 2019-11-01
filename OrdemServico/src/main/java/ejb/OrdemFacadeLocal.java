package ejb;

import entity.Ordem;
import java.util.List;
import javax.ejb.Local;

@Local
public interface OrdemFacadeLocal {
    
    public void create (Ordem ordem);
    
    public void update (Ordem ordem);
    
    public void remove (Ordem ordem);
    
    public Ordem find (Object numero);
    
    public List<Ordem> findAll();
    
    public Integer count();
    
}

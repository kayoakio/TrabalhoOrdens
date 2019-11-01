package bean;

import ejb.OrdemFacadeLocal;
import entity.Ordem;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class OrdemBean implements Serializable {
    
    @EJB
    private OrdemFacadeLocal ordemEJB;
    private Ordem ordem;
    private Ordem ordemSelecionada;
    
    @PostConstruct
    public void init(){
        ordem = new Ordem();
    }
    
    //Gets
    public Ordem getOrdem (){
        return ordem;
    }
    
    public Ordem getOrdemSelecionada (){
        return ordemSelecionada;
    }
    
    //Sets
    public void setOrdem (Ordem ordem){
        this.ordem = ordem;
    }
    
    public void setOrdemSelecionada (Ordem ordemSelecionada){
        this.ordemSelecionada = ordemSelecionada;
    }
    
    //Métodos
    public void clear(){
        ordem.setNumero(null);
        ordem.setData(null);
        ordem.setNomeCliente(null);
        ordem.setEndCliente(null);
        ordem.setTelefoneCliente(null);
        ordem.setModeloCarro(null);
        ordem.setPlacaCarro(null);
        ordem.setAnoCarro(null);
        
        ordem.setObservacao(null);
        ordem.setAvaliacao(null);
        ordem.setMecanico(null);
    }
    
    public void createOrdem(){
        ordemEJB.create(ordem);
        clear();
    }
    
    public void updateOrdem(){
        ordemEJB.update(ordemSelecionada);
        clear();
    }

    public void deleteOrdem(){
        ordemEJB.remove(ordemSelecionada);
        clear();
    }
    
    public List<Ordem> findAllOrdens() {
        return ordemEJB.findAll();
    }
    
}

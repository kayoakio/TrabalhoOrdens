package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Papel implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String identificacao;
    private String papel;

    @OneToOne (mappedBy = "pap")
    private Credencial credencial;
    
    public Integer getId() {
        return Id;
    }
    
    public String getIdentificacao () {
        return identificacao;
    }
        
    public String getPapel() {
        return papel;
    }
       
    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    public void setIdentificacao(Integer Identificacao) {
        this.identificacao = identificacao;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }
    
}

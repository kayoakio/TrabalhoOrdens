package entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Credencial implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String identificacao;
    private String senha;
    
    @OneToOne (cascade=CascadeType.ALL) 
    @JoinColumn (name="id_papel")
    private Papel pap;
    
    public Integer getId() {
        return id;
    }
    
    public String getIdentificacao () {
        return identificacao;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public Papel getPap() {
        return pap;
    }
    
    public void setId(Integer Id) {
        this.id = id;
    }
    
    public void setIdentificacao(Integer Identificacao) {
        this.identificacao = identificacao;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPap(Papel pap) {
        this.pap = pap;
    }
            
}

package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ordem implements Serializable {
    
    //Ordem]
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer numero;
    private Date data;

    private String observacao;
    private String avaliacao;
    private String mecanico;
    
    //Cliente
    private String nomecliente;
    private String endcliente;
    private String telefonecliente;
    
    //Carro
    private String modelocarro;
    private String placacarro;
    private String anocarro;

    //Gets
    public Integer getNumero() {
        return numero;
    }
    
    public Date getData() {
        return data;
    }
    
    public String getAvaliacao() {
        return avaliacao;
    }
    
    public String getObservacao() {
        return observacao;
    }
    
    public String getMecanico() {
        return mecanico;
    }
    
    public String getNomeCliente() {
        return nomecliente;
    }
    
    public String getEndCliente() {
        return endcliente;
    }
    
    public String getTelefoneCliente() {
        return telefonecliente;
    }

    public String getModeloCarro() {
        return modelocarro;
    }

    public String getPlacaCarro() {
        return placacarro;
    }

    public String getAnoCarro() {
        return anocarro;
    }
    
    //Sets
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setMecanico(String mecanico) {
        this.mecanico = mecanico;
    }

    public void setNomeCliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public void setEndCliente(String endcliente) {
        this.endcliente = endcliente;
    }
    
    public void setTelefoneCliente(String telefonecliente) {
        this.telefonecliente = telefonecliente;
    }
    
    public void setModeloCarro(String modelocarro) {
        this.modelocarro = modelocarro;
    }
    
    public void setPlacaCarro(String placacarro) {
        this.placacarro = placacarro;
    }
    
    public void setAnoCarro(String anocarro) {
        this.anocarro = anocarro;
    }  
    
}

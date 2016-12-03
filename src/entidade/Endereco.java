package entidade;
// Generated 21/11/2016 20:40:48 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Endereco generated by hbm2java
 */
public class Endereco  implements java.io.Serializable {


     private Integer idEndereco;
     private String logradouro;
     private String estado;
     private String cidade;
     private String cep;
     private String complemento;
     private String numero;
     private String bairro;
     private Set eventoses = new HashSet(0);
     private Set clientes = new HashSet(0);
     private Set funcionarios = new HashSet(0);

    public Endereco() {
    }

    public Endereco(String logradouro, String estado, String cidade, String cep, String complemento, String numero, String bairro, Set eventoses, Set clientes, Set funcionarios) {
       this.logradouro = logradouro;
       this.estado = estado;
       this.cidade = cidade;
       this.cep = cep;
       this.complemento = complemento;
       this.numero = numero;
       this.bairro = bairro;
       this.eventoses = eventoses;
       this.clientes = clientes;
       this.funcionarios = funcionarios;
    }
   
    public Integer getIdEndereco() {
        return this.idEndereco;
    }
    
    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }
    public String getLogradouro() {
        return this.logradouro;
    }
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public Set getEventoses() {
        return this.eventoses;
    }
    
    public void setEventoses(Set eventoses) {
        this.eventoses = eventoses;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }
    public Set getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set funcionarios) {
        this.funcionarios = funcionarios;
    }




}


package br.edu.ifsp.sbv.pjs.Modelo;


public class Cliente {

    public Cliente() {
    }

    private int id_cliente;
   
    private String email_cliente;
   
    private String nome_cliente;

    private String telefone_cliente;
    
    private String telefonerecado_cliente;  
    
    private String celular_cliente;
    
    private String cpf;  
    
    private Endereco endereco;
    
    private ComplementoEndereco complemento;
           
            

    public String getTelefonerecado_cliente() {
        return telefonerecado_cliente;
    }

    public void setTelefonerecado_cliente(String telefonerecado_cliente) {
        this.telefonerecado_cliente = telefonerecado_cliente;
    }

    public ComplementoEndereco getComplemento() {
        return complemento;
    }

    public void setComplemento(ComplementoEndereco complemento) {
        this.complemento = complemento;
    }

    public String getCelular_cliente() {
        return celular_cliente;
    }

    public void setCelular_cliente(String celular_cliente) {
        this.celular_cliente = celular_cliente;
    }   
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
   
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

   


    
}
package br.edu.ifsp.sbv.pjs.Modelo;


public class ComplementoEndereco {

    public ComplementoEndereco() {
    }

    private int id_complemento;
    private String numero_Endereco;
    private String complemento_Endereco;

  
    public String getComplemento_Endereco() {
        return complemento_Endereco;
    }

    public void setComplemento_Endereco(String complemento_Endereco) {
        this.complemento_Endereco = complemento_Endereco;
    }
    
    
    
    public int getId_complemento() {
        return id_complemento;
    }

    public void setId_complemento(int id_complemento) {
        this.id_complemento = id_complemento;
    }

    
    
    public String getNumero_Endereco() {
        return numero_Endereco;
    }

    public void setNumero_Endereco(String numero_Endereco) {
        this.numero_Endereco = numero_Endereco;
    }

}
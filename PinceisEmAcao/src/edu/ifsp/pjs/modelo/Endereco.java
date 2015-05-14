package edu.ifsp.pjs.modelo;

import java.util.*;


public class Endereco {

    
    public Endereco() {
    }

    
    private int id_Endereco;
   
    private String rua_Endereco;
   
    private String cidade_Endereco;
    
    private String uf_Endereco;

    private String cep_Endereco;
    
    private ComplementoEndereco complementoendereco;    

    public ComplementoEndereco getComplementoendereco() {
        return complementoendereco;
    }

    public void setComplementoendereco(ComplementoEndereco complementoendereco) {
        this.complementoendereco = complementoendereco;
    }
    
    public int getId_Endereco() {
        return id_Endereco;
    }

    public void setId_Endereco(int id_Endereco) {
        this.id_Endereco = id_Endereco;
    }

    public String getRua_Endereco() {
        return rua_Endereco;
    }

    public void setRua_Endereco(String rua_Endereco) {
        this.rua_Endereco = rua_Endereco;
    }

    public String getCidade_Endereco() {
        return cidade_Endereco;
    }

    public void setCidade_Endereco(String cidade_Endereco) {
        this.cidade_Endereco = cidade_Endereco;
    }

    public String getUf_Endereco() {
        return uf_Endereco;
    }

    public void setUf_Endereco(String uf_Endereco) {
        this.uf_Endereco = uf_Endereco;
    }

    public String getCep_Endereco() {
        return cep_Endereco;
    }

    public void setCep_Endereco(String cep_Endereco) {
        this.cep_Endereco = cep_Endereco;
    }




    
}
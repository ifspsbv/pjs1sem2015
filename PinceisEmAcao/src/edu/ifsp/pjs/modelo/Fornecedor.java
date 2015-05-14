package edu.ifsp.pjs.modelo;

import java.util.*;


public class Fornecedor {

    
    public Fornecedor() {
    }
   
    private int id_fornecedor;

    
    private String cnpj_Fornecedor;

    
    private String razao_social;

   
    private String nome_fantasia_Fornecedor;
    
    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getCnpj_Fornecedor() {
        return cnpj_Fornecedor;
    }

    public void setCnpj_Fornecedor(String cnpj_Fornecedor) {
        this.cnpj_Fornecedor = cnpj_Fornecedor;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia_Fornecedor() {
        return nome_fantasia_Fornecedor;
    }

    public void setNome_fantasia_Fornecedor(String nome_fantasia_Fornecedor) {
        this.nome_fantasia_Fornecedor = nome_fantasia_Fornecedor;
    }


}
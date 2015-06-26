package br.edu.ifsp.sbv.pjs.Modelo;

import java.util.*;


public class Fornecedor {

    private int Id_fornecedor;
    
    private String Razao_social;
    
    private String Nome_fantasia;
    
    private String Cnpj_Fornecedor;
    
    private String email_fornecedor;

    private String telefone_fornecedor;
    
    private String celular_fornecedor;
    
    private ComplementoEndereco complemento_endereco;
    
    private Endereco endereco;

    public int getId_fornecedor() {
        return Id_fornecedor;
    }

    public void setId_fornecedor(int Id_fornecedor) {
        this.Id_fornecedor = Id_fornecedor;
    }

    public String getRazao_social() {
        return Razao_social;
    }

    public void setRazao_social(String Razao_social) {
        this.Razao_social = Razao_social;
    }
    
    public String getNome_fantasia(){
        return Nome_fantasia;
    }
    
    public void setNome_fantasia(String Nome_fantasia){
        this.Nome_fantasia = Nome_fantasia;
    }

    public String getCnpj_Fornecedor() {
        return Cnpj_Fornecedor;
    }

    public void setCnpj_Fornecedor(String Cnpj_Fornecedor) {
        this.Cnpj_Fornecedor = Cnpj_Fornecedor;
    }

    public String getEmail_fornecedor() {
        return email_fornecedor;
    }

    public void setEmail_fornecedor(String email_fornecedor) {
        this.email_fornecedor = email_fornecedor;
    }

    public String getTelefone_fornecedor() {
        return telefone_fornecedor;
    }

    public void setTelefone_fornecedor(String telefone_fornecedor) {
        this.telefone_fornecedor = telefone_fornecedor;
    }

    public String getCelular_fornecedor() {
        return celular_fornecedor;
    }

    public void setCelular_fornecedor(String celular_fornecedor) {
        this.celular_fornecedor = celular_fornecedor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public ComplementoEndereco getcomplemento_endereco(){
        return complemento_endereco;
    }
    
    public void setComplementoEndereco (ComplementoEndereco complemento_endereco){
        this.complemento_endereco = complemento_endereco;
    }

    public Fornecedor get(int selectedRow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
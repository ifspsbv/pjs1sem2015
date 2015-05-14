package edu.ifsp.pjs.modelo;

import java.util.*;


public class ComplementoEndereco {

    public ComplementoEndereco() {
    }

    private int id_complemento;

    private int numero_Endereco;

    private String bairro_Endereco;
    
    public int getId_complemento() {
        return id_complemento;
    }

    public void setId_complemento(int id_complemento) {
        this.id_complemento = id_complemento;
    }

    public int getNumero_Endereco() {
        return numero_Endereco;
    }

    public void setNumero_Endereco(int numero_Endereco) {
        this.numero_Endereco = numero_Endereco;
    }

    public String getBairro_Endereco() {
        return bairro_Endereco;
    }

    public void setBairro_Endereco(String bairro_Endereco) {
        this.bairro_Endereco = bairro_Endereco;
    }


    
}
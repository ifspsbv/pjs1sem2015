package edu.ifsp.pjs.modelo;

import java.util.*;

public class Usuario {
    
    public Usuario() {
    }
    
    private int id_usuario;

    private String nome_usuario;

    private String email_usuario;

    private Login login;    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public Login getlogin() {
        return login;
    }

    public void setlogin(Login login) {
        this.login = login;
    }

}
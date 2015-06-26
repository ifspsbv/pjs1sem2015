/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.sbv.pjs.Controle;

import br.edu.ifsp.sbv.pjs.Modelo.Login;
import br.edu.ifsp.sbv.pjs.Dao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginBD extends Conexao {

    private String res = new String();
    private Integer idLogin;

    public Login autenticarUsuario(String usuario, String senha) {
        Login log = null;
        res = "";

        String sql = "SELECT * FROM Login "
                + "WHERE usuario = '"+usuario+"' and senha = '"+senha+"'";

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }
        try {

            rs = prep.executeQuery(sql);

            if (rs == null) {
                log = null;
            } else {
                while (rs.next()) {
                    log = new Login();
                    log.setId_login(rs.getInt("id_login"));
                    log.setUsuario(rs.getString("usuario"));
                    log.setSenha(rs.getString("senha"));

                }
            }

        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        } finally {
            fecharConexao();
        }       
        
        if (!res.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, res);
        }

        return log;

    }
    
    
    public Login pesquisarPorID(int idLogin) {
        Login log = null;
        res = "";

        String sql = "SELECT * FROM Login "
                + "WHERE id_login = "+idLogin;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }
        try {

            rs = prep.executeQuery(sql);

            if (rs == null) {
                log = null;
            } else {
                while (rs.next()) {
                    log = new Login();
                    log.setId_login(rs.getInt("id_login"));
                    log.setUsuario(rs.getString("usuario"));
                    log.setSenha(rs.getString("senha"));

                }
            }

        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        } finally {
            fecharConexao();
        }       
        
        if (!res.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, res);
        }

        return log;

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.sbv.pjs.Controle;

import br.edu.ifsp.sbv.pjs.Dao.Conexao;
import br.edu.ifsp.sbv.pjs.Modelo.Login;
import br.edu.ifsp.sbv.pjs.Modelo.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioBD extends Conexao {

    private String res = new String();

      
    public Usuario pesquisarPorID(int idUsuario) {
        Usuario usuario = null;
        res = "";

        String sql = "SELECT * FROM Usuario "
                + "WHERE id_usuario = "+idUsuario;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }
        try {

            rs = prep.executeQuery(sql);

            if (rs == null) {
                usuario = null;
            } else {
                while (rs.next()) {
                    usuario = new Usuario();
                    usuario.setId_usuario(rs.getInt("id_usuario"));
                    usuario.setNome_usuario(rs.getString("nome"));
                    usuario.setEmail_usuario(rs.getString("email"));
                    
                    
                    LoginBD loginBD = new LoginBD();
                    Login login = loginBD.pesquisarPorID(rs.getInt("idFKlogin"));
                    usuario.setlogin(login);
                    

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

        return usuario;

    }
    
    
    public Usuario pesquisarLogin(int idLogin) {
        Usuario usuario = null;
        res = "";

        String sql = "SELECT * FROM Usuario "
                + "WHERE idFKlogin = "+idLogin;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }
        try {

            rs = prep.executeQuery(sql);

            if (rs == null) {
                usuario = null;
            } else {
                while (rs.next()) {
                    usuario = new Usuario();
                    usuario.setId_usuario(rs.getInt("id_usuario"));
                    usuario.setNome_usuario(rs.getString("nome"));
                    usuario.setEmail_usuario(rs.getString("email"));
                    
                    
                    LoginBD loginBD = new LoginBD();
                    Login login = loginBD.pesquisarPorID(rs.getInt("idFKlogin"));
                    usuario.setlogin(login);
                    

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

        return usuario;

    }

}

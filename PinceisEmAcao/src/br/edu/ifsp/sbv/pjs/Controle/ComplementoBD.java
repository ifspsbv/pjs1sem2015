package br.edu.ifsp.sbv.pjs.Controle;

import br.edu.ifsp.sbv.pjs.Dao.Conexao;
import br.edu.ifsp.sbv.pjs.Modelo.ComplementoEndereco;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ComplementoBD extends Conexao {

    private String res = new String();

    public Integer Inserir(ComplementoEndereco comp) {
        String sql
                = "INSERT INTO complementoendereco "
                + "(numero, complemento) "
                + "VALUES (?,?)";

        abrirConexao();

        try {
            prep = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setString(1, comp.getNumero_Endereco());
            prep.setString(2, comp.getComplemento_Endereco());
            prep.executeUpdate();

            ResultSet rs = prep.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            fecharConexao();
        }
        return 0;
    }

    public ComplementoEndereco pesquisarPorID(int id) {
        res = "";

        String sql = "SELECT * FROM complementoendereco "
                + "WHERE id_complemento = " + id;

        ComplementoEndereco comp = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {

            rs = prep.executeQuery(sql);

            if (rs == null) {
                comp = null;
            } else {
                while (rs.next()) {
                    comp = new ComplementoEndereco();
                    comp.setComplemento_Endereco(rs.getString("complemento"));
                    comp.setNumero_Endereco(rs.getString("numero"));
                    comp.setId_complemento(rs.getInt("id_complemento"));
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

        return comp;
    }

    public String alterar(ComplementoEndereco comp) {

        String sql = "UPDATE complementoendereco SET complemento = ? , "
                + "numero = ? where id_complemento = ? ";

        res = new String();

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setString(1, comp.getComplemento_Endereco());
            prep.setString(2, comp.getNumero_Endereco());
            prep.setInt(3, comp.getId_complemento());

            prep.executeUpdate();
            res = "Dados atualizados com sucesso!";

        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        } finally {
            fecharConexao();
        }
        return res;
    }

    public String excluir(int id) {
        String sql = "DELETE FROM complementoendereco WHERE id_complemento = " + id;
        res = new String();

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        }

        try {
            int retorno = prep.executeUpdate();
            if (retorno == 1) {
                res = "Dados excluídos com sucesso !";
            } else {
                res = "Não foi possível excluir os dados !";
            }
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        } finally {
            fecharConexao();
        }

        return res;
    }

}

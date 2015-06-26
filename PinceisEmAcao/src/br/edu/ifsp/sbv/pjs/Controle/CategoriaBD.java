package br.edu.ifsp.sbv.pjs.Controle;

import br.edu.ifsp.sbv.pjs.Dao.Conexao;
import br.edu.ifsp.sbv.pjs.Modelo.Categoria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaBD extends Conexao {

    private String res = new String();

    public Integer Inserir(Categoria cat) {
        String sql
                = "INSERT INTO categoria "
                + "(id_categoria, descricao_categoria) "
                + "VALUES (?,?)";

        abrirConexao();

        try {
            prep = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setInt(1, cat.getId_categoria());
            prep.setString(2, cat.getDescricao_categoria());

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

    public Categoria pesquisarPorID(int id) {
        res = "";

        String sql = "SELECT * FROM categoria "
                + "WHERE id_categoria = " + id;

        Categoria cat = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {

            rs = prep.executeQuery(sql);

            if (rs == null) {
                cat = null;
            } else {
                while (rs.next()) {
                    cat = new Categoria();
                    cat.setDescricao_categoria(rs.getString("descricao_categoria"));
                    cat.setId_categoria(rs.getInt("id_categoria"));
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

        return cat;
    }

    public String alterar(Categoria cat) {

        String sql = "UPDATE categoria SET descricao_categoria = ?";
//                + " where id_categoria = ? "

        res = new String();

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setString(1, cat.getDescricao_categoria());
//            prep.setInt(2, cat.getId_categoria());

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
        String sql = "DELETE FROM categoria WHERE id_categoria = " + id;
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

    public List<Categoria> pesquisarTodos() {

        res = "";

        String sql = "SELECT * FROM categoria ";

        Categoria cat = null;
        List<Categoria> categorias = new ArrayList<Categoria>();

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {

            rs = prep.executeQuery(sql);

            if (rs == null) {
                cat = null;
            } else {
                while (rs.next()) {
                    cat = new Categoria();
                    cat.setDescricao_categoria(rs.getString("descricao_categoria"));
                    cat.setId_categoria(rs.getInt("id_categoria"));
                    categorias.add(cat);
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

        return categorias;
    }
}

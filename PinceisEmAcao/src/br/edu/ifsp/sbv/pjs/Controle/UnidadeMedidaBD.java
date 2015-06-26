package br.edu.ifsp.sbv.pjs.Controle;


import br.edu.ifsp.sbv.pjs.Dao.Conexao;
import br.edu.ifsp.sbv.pjs.Modelo.UnidadeMedida;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UnidadeMedidaBD extends Conexao {

        private String res = new String();

    public Integer Inserir(UnidadeMedida unid) {
        String sql
                = "INSERT INTO unidademedida "
                + "(descricao_unidade_medida, id_unidade_medida) "
                + "VALUES (?,?)";

        abrirConexao();

        try {
            prep = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setString(1, unid.getDescricao_unidade_medida());
            prep.setInt(1, unid.getId_unidade_medida());
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

    public UnidadeMedida pesquisarPorID(int id) {
        res = "";

        String sql = "SELECT * FROM unidademedida "
                + "WHERE id_unidade_medida = " + id;

        UnidadeMedida unid = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {

            rs = prep.executeQuery(sql);

            if (rs == null) {
                unid = null;
            } else {
                while (rs.next()) {
                    unid = new UnidadeMedida();
                    unid.setDescricao_unidade_medida(rs.getString("descricao_unidade_medida"));
                    unid.setId_unidade_medida(rs.getInt("id_unidade_medida"));
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

        return unid;
    }

    public String alterar(UnidadeMedida unid) {

        String sql = "UPDATE unidademedida SET descricao_unidade_medida = ? "
                + " where id_unidade_medida = ? ";

        res = new String();

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setString(1, unid.getDescricao_unidade_medida());
            prep.setInt(2, unid.getId_unidade_medida());

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
        String sql = "DELETE FROM unidademedida WHERE id_unidade_medida = " + id;
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
    
    public List<UnidadeMedida> pesquisarTodos() {

        res = "";

        String sql = "SELECT * FROM unidademedida ";

        UnidadeMedida unid = null;
        List<UnidadeMedida> unidades = new ArrayList<UnidadeMedida>();

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {

            rs = prep.executeQuery(sql);

            if (rs == null) {
                unid = null;
            } else {
                while (rs.next()) {
                    unid = new UnidadeMedida();
                    unid.setDescricao_unidade_medida(rs.getString("descricao_unidade_medida"));
                    unid.setId_unidade_medida(rs.getInt("id_unidade_medida"));
                    unidades.add(unid);
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

        return unidades;
    }

}

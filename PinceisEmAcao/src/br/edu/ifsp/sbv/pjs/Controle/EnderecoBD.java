package br.edu.ifsp.sbv.pjs.Controle;

import br.edu.ifsp.sbv.pjs.Dao.Conexao;
import br.edu.ifsp.sbv.pjs.Modelo.Endereco;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EnderecoBD extends Conexao {

    private String res = new String();

    public Integer Inserir(Endereco end) {
        String sql
                = "INSERT INTO Endereco "
                + "(rua, cidade, uf, cep, bairro) "
                + "VALUES (?,?,?,?, ?)";

        abrirConexao();

        try {
            prep = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setString(1, end.getRua_Endereco());
            prep.setString(2, end.getCidade_Endereco());
            prep.setString(3, end.getUf_Endereco());
            prep.setInt(4, end.getCep_Endereco());
            prep.setString(5, end.getBairro_Endereco());

            prep.executeUpdate();
            
            ResultSet rs = prep.getGeneratedKeys();
            if(rs.next())
            {
                return rs.getInt(1);
            }
            
            
           return 0;

        } catch (SQLException ex) {
            return null;
        } finally {
            fecharConexao();
        }

    }

    public Endereco pesquisarPorID(int id) {
        res = "";

        String sql = "SELECT * FROM Endereco "
                + "WHERE id_endereco = " + id;

        Endereco end = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {

            rs = prep.executeQuery(sql);

            if (rs == null) {
                end = null;
            } else {
                while (rs.next()) {
                    end = new Endereco();
                    end.setId_Endereco(rs.getInt("id_endereco"));
                    end.setRua_Endereco(rs.getString("rua"));
                    end.setCidade_Endereco(rs.getString("cidade"));
                    end.setUf_Endereco(rs.getString("uf"));
                    end.setCep_Endereco(rs.getInt("cep"));
                    end.setBairro_Endereco(rs.getString("bairro"));
                
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

        return end;
    }
    
     public Endereco pesquisarPorCEP(int cep) {
        res = "";

        String sql = "SELECT * FROM Endereco "
                + "WHERE cep = " + cep;

        Endereco end = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {

            rs = prep.executeQuery(sql);

            if (rs == null) {
                end = null;
            } else {
                while (rs.next()) {
                    end = new Endereco();
                    end.setId_Endereco(rs.getInt("id_endereco"));
                    end.setRua_Endereco(rs.getString("rua"));
                    end.setCidade_Endereco(rs.getString("cidade"));
                    end.setUf_Endereco(rs.getString("uf"));
                    end.setCep_Endereco(rs.getInt("cep")); 
                    end.setBairro_Endereco(rs.getString("bairro"));
                
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

        return end;
    }
     
         
    public String alterar(Endereco end) {

        String sql = "UPDATE endereco SET rua = ? , "
                + "cidade = ?, "
                + "uf = ?, "
                + "cep = ?, "
                + "bairro = ?"
                + "where id_endereco = ?";
        

        res = new String();

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setString(1, end.getRua_Endereco());
            prep.setString(2, end.getCidade_Endereco());            
            prep.setString(3, end.getUf_Endereco());
            prep.setInt(4, end.getCep_Endereco());
            prep.setString(5, end.getBairro_Endereco());
            prep.setInt(6, end.getId_Endereco());
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
        String sql = "DELETE FROM endereco WHERE id_endereco = " + id;
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

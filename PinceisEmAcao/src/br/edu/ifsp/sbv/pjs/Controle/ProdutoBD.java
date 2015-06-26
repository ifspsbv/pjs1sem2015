package br.edu.ifsp.sbv.pjs.Controle;


import br.edu.ifsp.sbv.pjs.Dao.Conexao;
import br.edu.ifsp.sbv.pjs.Modelo.Categoria;
import br.edu.ifsp.sbv.pjs.Modelo.Produto;
import br.edu.ifsp.sbv.pjs.Modelo.UnidadeMedida;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoBD extends Conexao {

    private String res = new String();

     public String Inserir(Produto prod) {
        String sql =
                "INSERT INTO Produto "
                + "(cod_fixo, preco_venda, quantidade_minima, nome_produto, margem_lucro, idFKcategoria, idFKunidade_medida, valor_unitario,observacao) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setInt(1, prod.getCod_fixo());
            prep.setDouble(2, prod.getPreco_venda());
            prep.setDouble(3, prod.getQtde_min());
            prep.setString(4, prod.getNome_produto());
            prep.setDouble(5, prod.getMargem_lucro());
            prep.setInt(6, prod.getCategoria().getId_categoria());
            prep.setInt(7, prod.getUnidademedida().getId_unidade_medida());
            prep.setDouble(8, prod.getValor_unitario());
            prep.setString(9, prod.getObservacao());
                                               
            prep.executeUpdate();

            res = "Dados inseridos com sucesso!";
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        } finally {
            fecharConexao();
        }

        return res;
    }

    public Produto pesquisarPorID(int id) {
        res = "";

        String sql = "SELECT * FROM produto "
                + "WHERE id_produto = " + id;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        List<Produto> produto = preencherDadosProduto(sql);

        if(produto.size()>0)
        {
           return produto.get(0); 
        }

        return null;

    }
      
    
    public Produto pesquisarPorCodigoFixo(int codigo) {
        res = "";

        String sql = "SELECT * FROM produto "
                + "WHERE cod_fixo = " + codigo;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        List<Produto> produto = preencherDadosProduto(sql);

        if(produto.size()>0)
        {
           return produto.get(0); 
        }

        return null;

    }
        
    public List<Produto> pesquisarPorNome(String nome) {
        
        
        res = "";
        
       
        String sql = "SELECT * FROM produto "
                + "where nome_produto like '"+nome+"%'";

        Produto prod = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        
        return preencherDadosProduto(sql);
    }
    
    
    
    public List<Produto> pesquisarTodos() {
        
        
        res = "";
        
       
        String sql = "SELECT * FROM produto ";

        Produto prod = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        
        return preencherDadosProduto(sql);
    }
    
    private List<Produto> preencherDadosProduto(String sql)
    {
        List<Produto> produto = new ArrayList<Produto>();
        Produto prod = null;
        res = "";
        
        try {
            rs = prep.executeQuery(sql);
            

            if (rs == null) {
                prod = null;
            } else {
                while (rs.next()) {
                    prod = new Produto();
                    prod.setId_produto(rs.getInt("id_produto"));
                    prod.setCod_fixo(rs.getInt("cod_fixo"));
                    prod.setNome_produto(rs.getString("nome_produto"));
                    prod.setQtde_min(rs.getDouble("quantidade_minima"));
                    prod.setMargem_lucro(rs.getDouble("margem_lucro"));
                    prod.setQtde_estoque(rs.getDouble("quantidade_estoque"));
                    prod.setPreco_venda(rs.getDouble("preco_venda"));
                    prod.setValor_unitario(rs.getDouble("valor_unitario"));
                    prod.setObservacao(rs.getString("observacao"));
                    
                    
                                        
                    CategoriaBD categoriaBD = new CategoriaBD();
                    Categoria cat = categoriaBD.pesquisarPorID(rs.getInt("idFKcategoria"));
                    prod.setCategoria(cat);
                    
                    UnidadeMedidaBD unidademedidaBD = new UnidadeMedidaBD();
                    UnidadeMedida uni = unidademedidaBD.pesquisarPorID(rs.getInt("idFKunidade_medida"));
                    prod.setUnidademedida(uni);
                    
                    produto.add(prod);                   
                    
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
        
        return produto;
    }
    
    
    
    
    public String alterar(Produto prod) {

        String sql = "UPDATE produto SET cod_fixo = ? , "
                + "preco_venda = ?, "
                + "quantidade_minima = ?, "
                + "nome_produto = ?, "
                + "margem_lucro = ?, "
                + "quantidade_estoque = ?, "
                + "idFKcategoria = ?, "
                + "idFKunidade_medida = ?, "
                + "valor_unitario = ?, "
                + "observacao = ? "
                + "WHERE id_produto = ?";
        
        res = new String();

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setInt(1, prod.getCod_fixo());
            prep.setDouble(2, prod.getPreco_venda());
            prep.setDouble(3, prod.getQtde_min());
            prep.setString(4, prod.getNome_produto());
            prep.setDouble(5, prod.getMargem_lucro());
            prep.setDouble(6, prod.getQtde_estoque());
            prep.setInt(7, prod.getCategoria().getId_categoria());
            prep.setInt(8, prod.getUnidademedida().getId_unidade_medida());
            prep.setDouble(9, prod.getValor_unitario());
            prep.setString(10, prod.getObservacao());
            prep.setInt(11, prod.getId_produto()); 
           
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
        String sql = "DELETE FROM produto WHERE id_produto = " + id;
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

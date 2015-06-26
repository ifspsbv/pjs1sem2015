package br.edu.ifsp.sbv.pjs.Controle;


import br.edu.ifsp.sbv.pjs.Dao.Conexao;
import br.edu.ifsp.sbv.pjs.Modelo.Cliente;
import br.edu.ifsp.sbv.pjs.Modelo.ComplementoEndereco;
import br.edu.ifsp.sbv.pjs.Modelo.CompraProduto;
import br.edu.ifsp.sbv.pjs.Modelo.Endereco;
import br.edu.ifsp.sbv.pjs.Modelo.PedidoCompraNF;
import br.edu.ifsp.sbv.pjs.Modelo.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CompraProdutoBD extends Conexao {

    private String res = new String();

     public String Inserir(CompraProduto cp) {
        String sql =
                "INSERT INTO compraproduto "
                + "(idFKproduto, idFKpedido_compra, quantidade, preco_custo,total) "
                + "VALUES (?,?,?,?,?)";
        

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setInt(1, cp.getProduto().getId_produto());
            prep.setInt(2, cp.getPedidocompraNF().getId_pedido_compraNF());
            prep.setDouble(3, cp.getQuantidade());            
            prep.setDouble(4, cp.getPreco_custo());
            prep.setDouble(5, cp.getTotal());
      
                        
            prep.executeUpdate();

            res = "Dados inseridos com sucesso!";
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        } finally {
            fecharConexao();
        }

        return res;
    }

    public CompraProduto pesquisarPorID(int id) {
        res = "";

        String sql = "SELECT * FROM compraproduto "
                + "WHERE id_compra_produto = " + id;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }
       
    
        List<CompraProduto> cps = preencherDadosCompra(sql);
        
        if(cps.size()>0)
        {
           return cps.get(0); 
        }
       
        return null;
        
    }
    
    
    public List<CompraProduto> pesquisarPorPedidoCompra(PedidoCompraNF nf) {
        res = "";

        String sql = "SELECT * FROM compraproduto "
                + "WHERE idFKpedido_compra = "+nf.getId_pedido_compraNF();        

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        
        List<CompraProduto> cps = preencherDadosCompra(sql);
        
        
       
        return cps;
              

    }
    

    private List<CompraProduto> preencherDadosCompra(String sql)
    {
        List<CompraProduto> cps = new ArrayList<CompraProduto>();
        CompraProduto cp = null;
        res = "";
        
        try {
            rs = prep.executeQuery(sql);
            

            if (rs == null) {
                cp = null;
            } else {
                while (rs.next()) {
                    cp = new CompraProduto();
                    cp.setId_compra_produto(rs.getInt("id_compra_produto"));
                    
                    ProdutoBD produtobd = new ProdutoBD();
                    Produto end = produtobd.pesquisarPorID(rs.getInt("id_compra_produto"));
                    cp.setProduto(end);
                    
                    
                    
                    
                    NotaFiscalBD notafiscalbd = new NotaFiscalBD();
                    PedidoCompraNF  a = notafiscalbd.pesquisarPorNotafiscal(rs.getInt("id_compra_produto"));
                  
//                    cp.setPedidocompraNF(rs.getInt("idFKpedido_compra"));
                    cp.setQuantidade(rs.getDouble("quantidade"));
                    cp.setPreco_custo(rs.getDouble("preco_custo"));
                    cp.setTotal(rs.getDouble("total"));
                    
                    
                    cps.add(cp);                   
                    
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
        
        return cps;
    }
    
    
    
    
    public String alterar(CompraProduto cp) {

        String sql = "UPDATE compraproduto SET id_compra_produto = ? , "
                + "id_compra_produto = ?, "
                + "idFKproduto = ?, "
                + "idFKpedido_compra = ?, "
                + "quantidade = ?, "
                + "preco_custo = ?, "
                + "total = ?, "
             
                + "WHERE id_compra_produto = ?";
        


        res = new String();

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setInt(1, cp.getId_compra_produto());
            ProdutoBD produtobd = new ProdutoBD();
                    Produto end = produtobd.pesquisarPorID(rs.getInt("id_compra_produto"));
                    cp.setProduto(end);
                    NotaFiscalBD notafiscalbd = new NotaFiscalBD();
                    PedidoCompraNF  a = notafiscalbd.pesquisarPorNotafiscal(rs.getInt("id_compra_produto"));
            prep.setDouble(4, cp.getQuantidade());
            prep.setDouble(5, cp.getPreco_custo());
            prep.setDouble(6, cp.getTotal());
            
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
        String sql = "DELETE FROM compraproduto WHERE id_compra_produto = " + id;
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

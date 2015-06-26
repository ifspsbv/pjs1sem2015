package br.edu.ifsp.sbv.pjs.Controle;


import br.edu.ifsp.sbv.pjs.Dao.Conexao;
import br.edu.ifsp.sbv.pjs.Modelo.Cliente;
import br.edu.ifsp.sbv.pjs.Modelo.ComplementoEndereco;
import br.edu.ifsp.sbv.pjs.Modelo.CompraProduto;
import br.edu.ifsp.sbv.pjs.Modelo.Endereco;
import br.edu.ifsp.sbv.pjs.Modelo.PedidoCompraNF;
import br.edu.ifsp.sbv.pjs.Modelo.PedidoVenda;
import br.edu.ifsp.sbv.pjs.Modelo.Produto;
import br.edu.ifsp.sbv.pjs.Modelo.VendaProduto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VendaProdutoBD extends Conexao {

    private String res = new String();

     public String Inserir(VendaProduto vp) {
        String sql =
                "INSERT INTO vendaproduto "
                + "(idFKProduto, idFKVenda, quantidade,valor_venda, total) "
                + "VALUES (?,?,?,?,?)";
        

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setInt(1, vp.getProduto().getId_produto());
            prep.setInt(2, vp.getPedidoVenda().getId_PedidoVenda());
            prep.setDouble(3, vp.getQuantidadeVenda());            
            prep.setDouble(4, vp.getValorVenda());
            prep.setDouble(5, vp.getTotal());
           
            prep.executeUpdate();

            res = "Dados inseridos com sucesso!";
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        } finally {
            fecharConexao();
        }

        return res;
    }

    public VendaProduto pesquisarPorID(int id) {
        res = "";

        String sql = "SELECT * FROM vendaproduto "
                + "WHERE id_venda_produto = " + id;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }
       
    
        List<VendaProduto> vps = preencherDadosVenda(sql);
        
        if(vps.size()>0)
        {
           return vps.get(0); 
        }
       
        return null;
        
    }
    
    
    private List<VendaProduto> preencherDadosVenda(String sql)
    {
        List<VendaProduto> vps = new ArrayList<VendaProduto>();
        VendaProduto vp = null;
        res = "";
        
        try {
            rs = prep.executeQuery(sql);
            

            if (rs == null) {
                vp = null;
            } else {
                while (rs.next()) {
                    vp = new VendaProduto();
                    vp.setIdVendaProduto(rs.getInt("id_venda_produto"));
                    
                    ProdutoBD produtobd = new ProdutoBD();
                    Produto end = produtobd.pesquisarPorID(rs.getInt("id_venda_produto"));
                    vp.setProduto(end);
                                   
                    
                    PedidoVendaBD vendasbd = new PedidoVendaBD();
                    PedidoVenda  b = vendasbd.pesquisarPorID(rs.getInt("id_venda_produto"));
                  
//                    cp.setPedidocompraNF(rs.getInt("idFKpedido_compra"));
                    vp.setQuantidadeVenda(rs.getDouble("quantidade"));
                    vp.setValorVenda(rs.getDouble("preco_custo"));
                    vp.setTotal(rs.getDouble("total"));
                    
                    
                    vps.add(vp);                   
                    
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
        
        return vps;
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

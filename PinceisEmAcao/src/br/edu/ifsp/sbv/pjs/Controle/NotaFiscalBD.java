 package br.edu.ifsp.sbv.pjs.Controle;


import br.edu.ifsp.sbv.pjs.Dao.Conexao;
import br.edu.ifsp.sbv.pjs.Modelo.Fornecedor;
import br.edu.ifsp.sbv.pjs.Modelo.PedidoCompraNF;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class NotaFiscalBD extends Conexao {

    private String res = new String();

    
    
    
     public Integer Inserir(PedidoCompraNF NF) {
        String sql =
                "INSERT INTO PedidoCompraNF "
                + "(numeroNF, parcela1 , parcela2 ,parcela3 ,parcela4 ,parcela5 ,"
                + "parcela6 ,valor_totalNF, data_emissao,impostos, idFKFornecedor)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        

        abrirConexao();

        try {
            prep = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        }

        try {

            prep.setInt(1, NF.getNumNF_PedidoCompraNF());
            prep.setDouble(2, NF.getParcela1());
            prep.setDouble(3, NF.getParcela2()); 
            prep.setDouble(4, NF.getParcela3());
            prep.setDouble(5, NF.getParcela4());
            prep.setDouble(6,NF.getParcela5());
            prep.setDouble(7,NF.getParcela6());
            prep.setDouble(8, NF.getValor_total_PedidoCompraNF());            
            prep.setDate(9, new Date(NF.getData_emissao_PedidoCompraNF().getTime()));
            prep.setDouble(10, NF.getImpostos());
            prep.setInt(11, NF.getFornecedor().getId_fornecedor());
 
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

    public PedidoCompraNF pesquisarPorNotafiscal(int id) {
        res = "";

        String sql = "SELECT * FROM PedidoCompraNF "
                + "WHERE numeroNF = " + id;

        PedidoCompraNF NF = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        List<PedidoCompraNF> notaFiscal = preencherDadosNotaFiscal(sql);
        
        if(notaFiscal.size()>0)
        {
           return notaFiscal.get(0); 
        }
       
        return null;
        
    }
    
    
    public PedidoCompraNF pesquisarPorIDNotaFiscal(int id) {
        res = "";

        String sql = "SELECT * FROM PedidoCompraNF "
                + "WHERE id_pedido_compraNF = " + id;

        PedidoCompraNF NF = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        List<PedidoCompraNF> notaFiscal = preencherDadosNotaFiscal(sql);
        
        if(notaFiscal.size()>0)
        {
           return notaFiscal.get(0); 
        }
       
        return null;
        
    }
    
    
    public PedidoCompraNF pesquisarPorCNPJ(String cnpj) {
        res = "";

        String sql = "SELECT * FROM PedidoCompraNF "
                + "WHERE cnpj = '" + cnpj+"'";
        
        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        List<PedidoCompraNF> notaFiscal = preencherDadosNotaFiscal(sql);
        
        if(notaFiscal.size()>0)
        {
           return notaFiscal.get(0); 
        }
       
        return null;
              

    }
    
    
    public List<PedidoCompraNF> pesquisarPorNome(String nome) {
        
        
        res = "";
        
       
        String sql = "SELECT * FROM PedidoCompraNF "
                + "where razao_social like '"+nome+"%'";

        PedidoCompraNF NF = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

           
        return preencherDadosNotaFiscal(sql);
    }
    
    
    public List<PedidoCompraNF> pesquisarTodos() {
        
        
        res = "";
        
       
        String sql = "SELECT * FROM PedidoCompraNF ";

        PedidoCompraNF NF = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        
        return preencherDadosNotaFiscal(sql);
    }
    
    private List<PedidoCompraNF> preencherDadosNotaFiscal(String sql)
    {
        List<PedidoCompraNF> notaFiscal = new ArrayList<PedidoCompraNF>();
        PedidoCompraNF NF = null;
        res = "";
        
        try {
            rs = prep.executeQuery(sql);
            

            if (rs == null) {
                NF = null;
            } else {
                while (rs.next()) {
                    NF = new PedidoCompraNF();
                    NF.setId_pedido_compraNF(rs.getInt("id_pedido_compraNF"));
                    NF.setNumNF_PedidoCompraNF(rs.getInt("numeroNF"));
                    NF.setParcela1(rs.getDouble("parcela1"));
                    NF.setParcela2(rs.getDouble("parcela2"));
                    NF.setParcela3(rs.getDouble("parcela3"));
                    NF.setParcela4(rs.getDouble("parcela4"));
                    NF.setParcela5(rs.getDouble("parcela5"));
                    NF.setParcela6(rs.getDouble("parcela6"));
                    NF.setValor_total_PedidoCompraNF(rs.getDouble("valor_totalNF"));
                    NF.setData_emissao_PedidoCompraNF(rs.getDate("data_emissao"));
                    NF.setImpostos(rs.getDouble("impostos"));        
                    
                    FornecedorBD fornecedorBD = new FornecedorBD();
                    Fornecedor fornecedor = fornecedorBD.pesquisarFornecedorporId(rs.getInt("idFKFornecedor"));
                    NF.setFornecedor(fornecedor);                   
                    notaFiscal.add(NF);                   
                    
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
        
        return notaFiscal;
    }
    
    public String alterar(PedidoCompraNF NF) {

        String sql = "UPDATE PedidoCompaNF  SET numeroNF = ? , "
                + "parcela1 = ?, "
                + "parcela2 = ?, "
                + "parcela3 = ? "
                + "parcela4 = ? "
                + "parcela5 = ? "
                + "parcela6 = ? "
                + "valor_totalNF  = ? "
                + "data_emissao  = ? "
                + "impostos  = ? "
                + "WHERE id_pedido_compraNF = ?";
        


        res = new String();

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            
            
            prep.setInt(1, NF.getNumNF_PedidoCompraNF());
            prep.setDouble(2, NF.getParcela1());
            prep.setDouble(3, NF.getParcela2());
            prep.setDouble(4, NF.getParcela3());
            prep.setDouble(5, NF.getParcela4());
            prep.setDouble(6, NF.getParcela5());
            prep.setDouble(7, NF.getParcela6());
            prep.setDouble(8, NF.getValor_total_PedidoCompraNF());
            prep.setDate(9, new Date(NF.getData_emissao_PedidoCompraNF().getTime()));
            prep.setDouble(10, NF.getImpostos());
            prep.setInt(11, NF.getId_pedido_compraNF());
            
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
        String sql = "DELETE FROM PedidoCompraNF WHERE id_pedido_compraNF = " + id;
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

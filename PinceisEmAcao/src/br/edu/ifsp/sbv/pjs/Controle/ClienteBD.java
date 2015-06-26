package br.edu.ifsp.sbv.pjs.Controle;


import br.edu.ifsp.sbv.pjs.Dao.Conexao;
import br.edu.ifsp.sbv.pjs.Modelo.Cliente;
import br.edu.ifsp.sbv.pjs.Modelo.ComplementoEndereco;
import br.edu.ifsp.sbv.pjs.Modelo.Endereco;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteBD extends Conexao {

    private String res = new String();

     public String Inserir(Cliente cli) {
        String sql =
                "INSERT INTO Cliente "
                + "(nome_cliente, cpf_cliente, telefone, telefone_recado, celular, email, fk_cliente_endereco, fk_cliente_complemento) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setString(1, cli.getNome_cliente());
            prep.setString(2, cli.getCpf());
            prep.setString(3, cli.getTelefone_cliente());
            prep.setString(4, cli.getTelefonerecado_cliente());
            prep.setString(5, cli.getCelular_cliente());
            prep.setString(6, cli.getEmail_cliente());
            prep.setInt(7, cli.getEndereco().getId_Endereco());
            prep.setInt(8, cli.getComplemento().getId_complemento());
                        
            prep.executeUpdate();

            res = "Dados inseridos com sucesso!";
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        } finally {
            fecharConexao();
        }

        return res;
    }

    public Cliente pesquisarPorID(int id) {
        res = "";

        String sql = "SELECT * FROM cliente "
                + "WHERE id_cliente = " + id;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        List<Cliente> clientes = preencherDadosCliente(sql);
        
        if(clientes.size()>0)
        {
           return clientes.get(0); 
        }
       
        return null;
        
    }
    
    
    public Cliente pesquisarPorCPF(String cpf) {
        res = "";

        String sql = "SELECT * FROM cliente "
                + "WHERE cpf_cliente = '" + cpf+"'";        

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        
        List<Cliente> clientes = preencherDadosCliente(sql);
        
        if(clientes.size()>0)
        {
           return clientes.get(0); 
        }
       
        return null;
              

    }
    
    public List<Cliente> pesquisarPorNome(String nome) {
        
        
        res = "";
        
       
        String sql = "SELECT * FROM cliente "
                + "where nome_cliente like '"+nome+"%'";

        Cliente cli = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        
        return preencherDadosCliente(sql);
    }
    
    public List<Cliente> pesquisarPorEmail(String email) {
        
        
        res = "";
        
       
        String sql = "SELECT * FROM cliente "
                + "where email like '"+email+"%'";

        Cliente cli = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        
        return preencherDadosCliente(sql);
    }
    
     public Cliente pesquisarPorCep(String cep) {
        res = "";

        String sql = "SELECT * FROM endereco "
                + "WHERE cep = '" + cep+"'";        

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        
        List<Cliente> clientes = preencherDadosCliente(sql);
        
        if(clientes.size()>0)
        {
           return clientes.get(0); 
        }
       
        return null;
              

    }
        
    public List<Cliente> pesquisarTodos() {
        
        
        res = "";
        
       
        String sql = "SELECT * FROM cliente ";

        Cliente cli = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        
        return preencherDadosCliente(sql);
    }
    
    private List<Cliente> preencherDadosCliente(String sql)
    {
        List<Cliente> clientes = new ArrayList<Cliente>();
        Cliente cli = null;
        res = "";
        
        try {
            rs = prep.executeQuery(sql);
            

            if (rs == null) {
                cli = null;
            } else {
                while (rs.next()) {
                    cli = new Cliente();
                    cli.setId_cliente(rs.getInt("id_cliente"));
                    cli.setNome_cliente(rs.getString("nome_cliente"));
                    cli.setCpf(rs.getString("cpf_cliente"));
                    cli.setCelular_cliente(rs.getString("celular"));
                    cli.setTelefone_cliente(rs.getString("telefone"));
                    cli.setTelefonerecado_cliente(rs.getString("telefone_recado"));
                    cli.setEmail_cliente(rs.getString("email"));
                    
                    EnderecoBD enderecoBD = new EnderecoBD();
                    Endereco end = enderecoBD.pesquisarPorID(rs.getInt("fk_cliente_endereco"));
                    cli.setEndereco(end);
                    
                    ComplementoBD complementoBD = new ComplementoBD();
                    ComplementoEndereco complementoEndereco = complementoBD.pesquisarPorID(rs.getInt("fk_cliente_complemento"));
                    cli.setComplemento(complementoEndereco);
                    
                    clientes.add(cli);                   
                    
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
        
        return clientes;
    }
    
    
    
    
    public String alterar(Cliente cli) {

        String sql = "UPDATE cliente SET nome_cliente = ? , "
                + "cpf_cliente = ?, "
                + "telefone = ?, "
                + "telefone_recado = ?, "
                + "celular = ?, "
                + "email = ?, "
                + "fk_cliente_endereco = ?, "
                + "fk_cliente_complemento = ? "
                + "WHERE id_cliente = ?";
        


        res = new String();

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        try {
            // setar os campos (?) do SQL
            prep.setString(1, cli.getNome_cliente());
            prep.setString(2, cli.getCpf());
            prep.setString(3, cli.getTelefone_cliente());
            prep.setString(4, cli.getTelefonerecado_cliente());
            prep.setString(5, cli.getCelular_cliente());
            prep.setString(6, cli.getEmail_cliente());
            prep.setInt(7, cli.getEndereco().getId_Endereco());
            prep.setInt(8, cli.getComplemento().getId_complemento());            
            prep.setInt(9, cli.getId_cliente());
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
        String sql = "DELETE FROM cliente WHERE id_cliente = " + id;
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

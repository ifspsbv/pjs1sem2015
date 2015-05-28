
package br.edu.ifsp.sbv.pjs.controle;

import br.edu.ifsp.pjs.dao.ConexaoJava;
import br.edu.ifsp.pjs.modelo.Fornecedor;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FornecedorBD extends ConexaoJava {
    
    private String res = new String();
    
    public String Inserir(Fornecedor forne)
    {
        String sql =
                "INSERT INTO FORNECEDOR"
                +"(razao_social,cnpj,email,telefone,celular)"
                +"VALUES(?,?)";
          
        abrirConexao();
        
        try{
        prep = con.prepareStatement(sql);
        }catch(SQLException ex){
            res = "" + ex.getMessage();
        }
        
        try{
         prep.setString(1, forne.getRazao_social());
         prep.setString(2, forne.getCnpj_fornecedor());
         prep.setString(3, forne.getemail_fornecedor());
         prep.setString(4, forne.gettelfone_fornecedor());
         prep.setString(5, forne.getcelular_fornecedor());
         prep.executeUpdate();
         
         res = "Dados inseridos com sucesso";
        }catch(SQLException ex){
         res = "" + ex.getMessage();
        }finally{
        fecharConexao();
        }
       
    return res;
    
    }
    
    public Fornecedor pesquisarFornecedorporId(int id)
    {
    res = "";
    
    String sql = "SELECT * FROM FORNECEDOR"
            +"WHERE id_fornecedor = " + id;
    
        Fornecedor forne = null;
        
        abrirConexao();
        
        try{
          prep = con.prepareStatement(sql);
       }catch(SQLException ex){
           res = ex.getMessage();
       }
           
       try{
           rs = prep.executeQuery(sql);
           
           if(rs == null){
             forne = null;  
           }else{
               while(rs.next()){
                   forne = new Fornecedor();
                   forne.setId_fornecedor(rs.getInt("id_fornecedor"));
                   forne.setRazao_social(rs.getString("razao_social"));
                   forne.setCnpj_fornecedor(rs.getString("cnpj"));
                   forne.setemail_fornecedor(rs.getString("email"));
                 //  forne.setEndereco(rs.getObject(""), null));
                   forne.settelefone_fornecedor(rs.getString("telefone"));
                   forne.setcelular_fornecedor(rs.getString("celular"));
               }
           }
        
       }catch (SQLException ex){
          res = "" + ex.getMessage();
       }finally{
           fecharConexao();
       }
       if(!res.equalsIgnoreCase("")){
           JOptionPane.showMessageDialog(null, res);
       }
       return forne;
    }
        
}
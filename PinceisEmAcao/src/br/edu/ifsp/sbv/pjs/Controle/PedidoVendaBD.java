/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.sbv.pjs.Controle;

import br.edu.ifsp.sbv.pjs.Dao.Conexao;
import br.edu.ifsp.sbv.pjs.Modelo.Categoria;
import br.edu.ifsp.sbv.pjs.Modelo.Cliente;
import br.edu.ifsp.sbv.pjs.Modelo.PedidoCompraNF;
import br.edu.ifsp.sbv.pjs.Modelo.PedidoVenda;
import br.edu.ifsp.sbv.pjs.Modelo.Produto;
import br.edu.ifsp.sbv.pjs.Modelo.UnidadeMedida;
import br.edu.ifsp.sbv.pjs.Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import static java.sql.Types.NULL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class PedidoVendaBD extends Conexao {

    private String res = new String();

    public Integer Inserir(PedidoVenda p_venda) {

        String sql
                = "INSERT INTO pedidovenda"
                + "(valor_total_pedido,"
                + "forma_pagamento,"
                + "tipo_de_venda,"
                + "idFKcliente,"
                + "data_venda,"
                + "idFKusuario)"
                + " VALUES(?,?,?,?,?,?)";

        abrirConexao();
        try {
            prep = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException ex) {
            res = "" + ex.getMessage();
        }
        try {
            prep.setDouble(1, p_venda.getValor_total_pedido());
            prep.setString(2, p_venda.getForma_pgto());
            prep.setString(3, p_venda.getTipo_de_venda());
            if(p_venda.getCliente()!=null)
            {
              prep.setInt(4, p_venda.getCliente().getId_cliente());  
            }
            else
            {
                prep.setNull(4, NULL);
            }
            
            prep.setDate(5, new java.sql.Date(p_venda.getData_venda().getTime()));
             if(p_venda.getUsuario()!=null)
            {
              prep.setInt(6, p_venda.getUsuario().getId_usuario());  
            }
            else
            {
                prep.setNull(6, NULL);
            }
           
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

    public PedidoVenda pesquisarPorID(int id) {
        res = "";

        String sql = "SELECT * FROM pedidovenda "
                + "WHERE id_Pedido_Venda = " + id;

        PedidoCompraNF NF = null;

        abrirConexao();

        try {
            prep = con.prepareStatement(sql);
        } catch (SQLException ex) {
            res = ex.getMessage();
        }

        List<PedidoVenda> notaFiscal = preencherDados(sql);

        if (notaFiscal.size() > 0) {
            return notaFiscal.get(0);
        }

        return null;

    }

    private List<PedidoVenda> preencherDados(String sql) {
        List<PedidoVenda> vendas = new ArrayList<PedidoVenda>();
        PedidoVenda pedidoVenda = null;
        res = "";

        try {
            rs = prep.executeQuery(sql);

            if (rs == null) {
                vendas = null;
            } else {
                while (rs.next()) {
                    pedidoVenda = new PedidoVenda();
                    pedidoVenda.setId_PedidoVenda(rs.getInt("id_Pedido_Venda"));

                    ClienteBD clienteBD = new ClienteBD();
                    Cliente cliente = clienteBD.pesquisarPorID(rs.getInt("idFKcliente"));
                    pedidoVenda.setCliente(cliente);

                    UsuarioBD usuarioBD = new UsuarioBD();
                    Usuario usuario = usuarioBD.pesquisarPorID(rs.getInt("idFKusuario"));
                    pedidoVenda.setUsuario(usuario);

                    pedidoVenda.setForma_pgto(rs.getString("forma_pagamento"));
                    pedidoVenda.setValor_total_pedido(rs.getDouble("valor_total_pedido"));
                    pedidoVenda.setTipo_de_venda(rs.getString("tipo_de_venda"));
                    pedidoVenda.setData_venda(rs.getDate("data_venda"));
                    vendas.add(pedidoVenda);

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

        return vendas;
    }

}

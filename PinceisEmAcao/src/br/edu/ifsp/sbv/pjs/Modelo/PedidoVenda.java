package br.edu.ifsp.sbv.pjs.Modelo;

import java.util.*;

public class PedidoVenda {

    private int id_PedidoVenda;

    private Usuario usuario;

    private Cliente cliente;

    private String forma_pgto;

    private String tipo_de_venda;

    private double valor_total_pedido;

    private Date data_venda;

    public PedidoVenda() {
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public String getTipo_de_venda() {
        return tipo_de_venda;
    }

    public void setTipo_de_venda(String tipo_de_venda) {
        this.tipo_de_venda = tipo_de_venda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getId_PedidoVenda() {
        return id_PedidoVenda;
    }

    public void setId_PedidoVenda(int id_PedidoVenda) {
        this.id_PedidoVenda = id_PedidoVenda;
    }

    public String getForma_pgto() {
        return forma_pgto;
    }

    public void setForma_pgto(String forma_pgto) {
        this.forma_pgto = forma_pgto;
    }

    public double getValor_total_pedido() {
        return valor_total_pedido;
    }

    public void setValor_total_pedido(double valor_total_pedido) {
        this.valor_total_pedido = valor_total_pedido;
    }

}

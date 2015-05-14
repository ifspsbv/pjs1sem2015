package edu.ifsp.pjs.modelo;

import java.util.*;


public class PedidoVenda {

    
    public PedidoVenda() {
    }

    private int id_PedidoVenda;

    private double total_venda;

    private String forma_pgto;

    private double valor_pago;
    
    private double valor_total_pedido;
    
    private Usuario usuario;
    
    private Cliente cliente;

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

    public double getTotal_venda() {
        return total_venda;
    }

    public void setTotal_venda(double total_venda) {
        this.total_venda = total_venda;
    }

    public String getForma_pgto() {
        return forma_pgto;
    }

    public void setForma_pgto(String forma_pgto) {
        this.forma_pgto = forma_pgto;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public double getValor_total_pedido() {
        return valor_total_pedido;
    }

    public void setValor_total_pedido(double valor_total_pedido) {
        this.valor_total_pedido = valor_total_pedido;
    }






    
}
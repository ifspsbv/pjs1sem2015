package br.edu.ifsp.sbv.pjs.Modelo;

import java.util.*;


public class VendaProduto {

   
    public VendaProduto() {
    }
    private int idVendaProduto;
  
    
    private Produto produto;
    
    private PedidoVenda pedidoVenda;

    private double quantidadeVenda;
    
    private double valorVenda;
    
    private double total;


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto nomeProduto) {
        this.produto = nomeProduto;
    }

    public PedidoVenda getPedidoVenda() {
        return pedidoVenda;
    }

    public void setPedidoVenda(PedidoVenda pedidoVenda) {
        this.pedidoVenda = pedidoVenda;
    }

    public double getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(double quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
     public int getIdVendaProduto() {
        return idVendaProduto;
    }

    public void setIdVendaProduto(int idVendaProduto) {
        this.idVendaProduto = idVendaProduto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
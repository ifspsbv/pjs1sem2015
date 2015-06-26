package br.edu.ifsp.sbv.pjs.Modelo;

import java.util.*;

public class CompraProduto {

    public CompraProduto() {
    }
   private int id_compra_produto;
    
   private Produto produto;
   
   private PedidoCompraNF pedidocompraNF;
   
   private double quantidade;

   private double preco_custo;
   
  
    private double total;


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
       

    public int getId_compra_produto() {
        return id_compra_produto;
    }

    public void setId_compra_produto(int id_compra_produto) {
        this.id_compra_produto = id_compra_produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(double preco_custo) {
        this.preco_custo = preco_custo;
    }
   
   
   
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public PedidoCompraNF getPedidocompraNF() {
        return pedidocompraNF;
    }

    public void setPedidocompraNF(PedidoCompraNF pedidocompraNF) {
        this.pedidocompraNF = pedidocompraNF;
    }
       
}
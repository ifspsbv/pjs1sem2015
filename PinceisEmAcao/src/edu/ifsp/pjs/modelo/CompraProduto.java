package edu.ifsp.pjs.modelo;

import java.util.*;

public class CompraProduto {

    public CompraProduto() {
    }

   private Produto produto;
   
   private PedidoCompraNF pedidocompraNF;

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
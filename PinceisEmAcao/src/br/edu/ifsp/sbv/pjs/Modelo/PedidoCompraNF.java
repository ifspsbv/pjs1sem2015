package br.edu.ifsp.sbv.pjs.Modelo;

import java.util.Date;



public class PedidoCompraNF {

     
    public PedidoCompraNF() {
    }
    
    private int id_pedido_compraNF;

    private int numNF_PedidoCompraNF;

    private double parcela1;

    private double parcela2;

    private double parcela3;

    private double parcela4;

    private double parcela5;

    private double parcela6;

    private double valor_total_PedidoCompraNF;

    private Date data_emissao_PedidoCompraNF;
    
    private Fornecedor fornecedor;
    
    private double impostos;
    
    
    private Produto produto;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }
    

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getNumNF_PedidoCompraNF() {
        return numNF_PedidoCompraNF;
    }

    public void setNumNF_PedidoCompraNF(int numNF_PedidoCompraNF) {
        this.numNF_PedidoCompraNF = numNF_PedidoCompraNF;
    }

    public double getParcela1() {
        return parcela1;
    }

    public void setParcela1(double parcela1) {
        this.parcela1 = parcela1;
    }

    public double getParcela2() {
        return parcela2;
    }

    public void setParcela2(double parcela2) {
        this.parcela2 = parcela2;
    }

    public double getParcela3() {
        return parcela3;
    }

    public void setParcela3(double parcela3) {
        this.parcela3 = parcela3;
    }

    public double getParcela4() {
        return parcela4;
    }

    public void setParcela4(double parcela4) {
        this.parcela4 = parcela4;
    }

    public double getParcela5() {
        return parcela5;
    }

    public void setParcela5(double parcela5) {
        this.parcela5 = parcela5;
    }

    public double getParcela6() {
        return parcela6;
    }

    public void setParcela6(double parcela6) {
        this.parcela6 = parcela6;
    }

    public double getValor_total_PedidoCompraNF() {
        return valor_total_PedidoCompraNF;
    }

    public void setValor_total_PedidoCompraNF(double valor_total_PedidoCompraNF) {
        this.valor_total_PedidoCompraNF = valor_total_PedidoCompraNF;
    }

    public Date getData_emissao_PedidoCompraNF() {
        return data_emissao_PedidoCompraNF;
    }

    public void setData_emissao_PedidoCompraNF(Date data_emissao_PedidoCompraNF) {
        this.data_emissao_PedidoCompraNF = data_emissao_PedidoCompraNF;
    }

    public int getId_pedido_compraNF() {
        return id_pedido_compraNF;
    }

    public void setId_pedido_compraNF(int id_pedido_compraNF) {
        this.id_pedido_compraNF = id_pedido_compraNF;
    }
    
    

   


    

}
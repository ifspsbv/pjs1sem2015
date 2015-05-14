package edu.ifsp.pjs.modelo;

import java.util.*;


public class PedidoCompraNF {

   
    public PedidoCompraNF() {
    }

    private String numNF_PedidoCompraNF;

    private double qtde_PedidoCompraNF;

    private int qtde_parcelas;

    private double parcela1;

    private double parcela2;

    private double parcela3;

    private double parcela4;

    private double parcela5;

    private double parcela6;

    private double valor_total_PedidoCompraNF;

    private double valor_total_produto_PedidoCompraNF;

    private double preco_custo_PedidoCompraNF;

    private String data_emissao_PedidoCompraNF;
    
    private Fornecedor fornecedor;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNumNF_PedidoCompraNF() {
        return numNF_PedidoCompraNF;
    }

    public void setNumNF_PedidoCompraNF(String numNF_PedidoCompraNF) {
        this.numNF_PedidoCompraNF = numNF_PedidoCompraNF;
    }

    public double getQtde_PedidoCompraNF() {
        return qtde_PedidoCompraNF;
    }

    public void setQtde_PedidoCompraNF(double qtde_PedidoCompraNF) {
        this.qtde_PedidoCompraNF = qtde_PedidoCompraNF;
    }

    public int getQtde_parcelas() {
        return qtde_parcelas;
    }

    public void setQtde_parcelas(int qtde_parcelas) {
        this.qtde_parcelas = qtde_parcelas;
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

    public double getValor_total_produto_PedidoCompraNF() {
        return valor_total_produto_PedidoCompraNF;
    }

    public void setValor_total_produto_PedidoCompraNF(double valor_total_produto_PedidoCompraNF) {
        this.valor_total_produto_PedidoCompraNF = valor_total_produto_PedidoCompraNF;
    }

    public double getPreco_custo_PedidoCompraNF() {
        return preco_custo_PedidoCompraNF;
    }

    public void setPreco_custo_PedidoCompraNF(double preco_custo_PedidoCompraNF) {
        this.preco_custo_PedidoCompraNF = preco_custo_PedidoCompraNF;
    }

    public String getData_emissao_PedidoCompraNF() {
        return data_emissao_PedidoCompraNF;
    }

    public void setData_emissao_PedidoCompraNF(String data_emissao_PedidoCompraNF) {
        this.data_emissao_PedidoCompraNF = data_emissao_PedidoCompraNF;
    }



    

}
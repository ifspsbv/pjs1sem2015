package br.edu.ifsp.sbv.pjs.Modelo;

public class Produto {

    public Produto() {
    }

    private int id_produto;

    private int cod_fixo;

    private double preco_venda;

    private double qtde_min;

    private String nome_produto;

    private double margem_lucro;

    private double qtde_estoque;
    
    private double valor_unitario;
    
    private String observacao;
    

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
    
    private UnidadeMedida unidademedida;
    private Categoria categoria;

    public UnidadeMedida getUnidademedida() {
        return unidademedida;
    }

    public void setUnidademedida(UnidadeMedida unidademedida) {
        this.unidademedida = unidademedida;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getCod_fixo() {
        return cod_fixo;
    }

    public void setCod_fixo(int cod_fixo) {
        this.cod_fixo = cod_fixo;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public double getQtde_min() {
        return qtde_min;
    }

    public void setQtde_min(double qtde_min) {
        this.qtde_min = qtde_min;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getMargem_lucro() {
        return margem_lucro;
    }

    public void setMargem_lucro(double margem_lucro) {
        this.margem_lucro = margem_lucro;
    }

    public double getQtde_estoque() {
        return qtde_estoque;
    }

    public void setQtde_estoque(double qtde_estoque) {
        this.qtde_estoque = qtde_estoque;
    }

    public static void Clonar(Produto pOrigem, Produto pDestino)
    {
        if (pDestino == null)
        {
            pDestino = new Produto();
        }
        pDestino.id_produto = pOrigem.id_produto;
        pDestino.cod_fixo = pOrigem.cod_fixo;
        pDestino.preco_venda = pOrigem.preco_venda;
        pDestino.qtde_min = pOrigem.qtde_min;
        pDestino.nome_produto = pOrigem.nome_produto;
        pDestino.margem_lucro = pOrigem.margem_lucro;
        pDestino.qtde_estoque = pOrigem.qtde_estoque;
        pDestino.valor_unitario = pOrigem.valor_unitario;
        pDestino.observacao = pOrigem.observacao;
    }
}
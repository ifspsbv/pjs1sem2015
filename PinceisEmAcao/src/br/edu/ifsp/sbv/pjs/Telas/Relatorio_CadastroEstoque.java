/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.sbv.pjs.Telas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author bv1301144
 */
public class Relatorio_CadastroEstoque extends javax.swing.JFrame {

    /**
     * Creates new form Vendas
     */
    public Relatorio_CadastroEstoque() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_DataInicial_Relatorio_CadastroEstoque = new javax.swing.JLabel();
        jLabel_DataFinal_Relatorio_CadastroEstoque = new javax.swing.JLabel();
        jCheckBox_Consumo_Relatorio_CadastroEstoque = new javax.swing.JCheckBox();
        jCheckBox_Venda_Relatorio_CadastroEstoque = new javax.swing.JCheckBox();
        jButton_Limpar_Relatorio_CadastroEstoque = new javax.swing.JButton();
        jButton_Pesquisar_Relatorio_CadastroEstoque = new javax.swing.JButton();
        jDateChooser_jDateChooser_DataInicial_Relatorio_CadastroEstoque = new com.toedter.calendar.JDateChooser();
        jDateChooser_DataFinal_Relatorio_CadastroEstoque = new com.toedter.calendar.JDateChooser();
        jLabel_Codigo_Relatorio_CadastroEstoque = new javax.swing.JLabel();
        jLabelProduto_Relatorio_CadastroEstoque = new javax.swing.JLabel();
        jTextField_Codigo_Produto_Relatorio_Produto_Relatorio_CadastroEstoque = new javax.swing.JTextField();
        jTextField_Produto_Relatorio_Produto_Relatorio_CadastroEstoque = new javax.swing.JTextField();
        jLabel_Codigo_Relatorio_CadastroEstoque1 = new javax.swing.JLabel();
        jTextField_Codigo_Produto_Relatorio_Estoque_Relatorio_CadastroEstoque = new javax.swing.JTextField();
        jLabelProduto_Relatorio_CadastroEstoque1 = new javax.swing.JLabel();
        jTextField_Codigo_Cliente_Relatorio_Venda_Relatorio_CadastroEstoque = new javax.swing.JTextField();
        jLabel_Codigo_Relatorio_CadastroEstoque2 = new javax.swing.JLabel();
        jTextField_Codigo_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque = new javax.swing.JTextField();
        jLabelProduto_Relatorio_CadastroEstoque2 = new javax.swing.JLabel();
        jTextField_Produto_Relatorio_Estoque_Relatorio_CadastroEstoque = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_Codigo_Relatorio_CadastroEstoque3 = new javax.swing.JLabel();
        jTextField_Codigo_Venda_Relatorio_Venda_Relatorio_CadastroEstoque = new javax.swing.JTextField();
        jLabel_Codigo_Relatorio_CadastroEstoque4 = new javax.swing.JLabel();
        jTextField_Nome_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque = new javax.swing.JTextField();
        jLabel_Codigo_Relatorio_CadastroEstoque5 = new javax.swing.JLabel();
        jTextField_CPF_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque = new javax.swing.JTextField();
        jCheckBox_Relatorio_Venda = new javax.swing.JCheckBox();
        jCheckBox_Relatorio_Cliente = new javax.swing.JCheckBox();
        jCheckBox_Relatorio_Estoque = new javax.swing.JCheckBox();
        jCheckBox_Relatorio_Produto = new javax.swing.JCheckBox();
        jButton_Sair_Relatorio_CadastroEstoque = new javax.swing.JButton();

        jLabel_DataInicial_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DataInicial_Relatorio_CadastroEstoque.setText("Data Inicial");

        jLabel_DataFinal_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DataFinal_Relatorio_CadastroEstoque.setText("Data Final");

        jCheckBox_Consumo_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox_Consumo_Relatorio_CadastroEstoque.setText("Consumo");

        jCheckBox_Venda_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox_Venda_Relatorio_CadastroEstoque.setText("Venda");

        jButton_Limpar_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Limpar_Relatorio_CadastroEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Limpar.png"))); // NOI18N
        jButton_Limpar_Relatorio_CadastroEstoque.setText("Limpar");

        jButton_Pesquisar_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Pesquisar_Relatorio_CadastroEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/lupa24.png"))); // NOI18N
        jButton_Pesquisar_Relatorio_CadastroEstoque.setText("Pesquisar");

        jLabel_Codigo_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Codigo_Relatorio_CadastroEstoque.setText("Codigo Produto");

        jLabelProduto_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelProduto_Relatorio_CadastroEstoque.setText("Produto");

        jTextField_Codigo_Produto_Relatorio_Produto_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Codigo_Produto_Relatorio_Produto_Relatorio_CadastroEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Codigo_Produto_Relatorio_Produto_Relatorio_CadastroEstoqueKeyPressed(evt);
            }
        });

        jTextField_Produto_Relatorio_Produto_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel_Codigo_Relatorio_CadastroEstoque1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Codigo_Relatorio_CadastroEstoque1.setText("Codigo Produto");

        jTextField_Codigo_Produto_Relatorio_Estoque_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Codigo_Produto_Relatorio_Estoque_Relatorio_CadastroEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Codigo_Produto_Relatorio_Estoque_Relatorio_CadastroEstoqueKeyPressed(evt);
            }
        });

        jLabelProduto_Relatorio_CadastroEstoque1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelProduto_Relatorio_CadastroEstoque1.setText("Produto");

        jTextField_Codigo_Cliente_Relatorio_Venda_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Codigo_Cliente_Relatorio_Venda_Relatorio_CadastroEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Codigo_Cliente_Relatorio_Venda_Relatorio_CadastroEstoqueActionPerformed(evt);
            }
        });

        jLabel_Codigo_Relatorio_CadastroEstoque2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Codigo_Relatorio_CadastroEstoque2.setText("Codigo Venda");

        jTextField_Codigo_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Codigo_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Codigo_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoqueKeyPressed(evt);
            }
        });

        jLabelProduto_Relatorio_CadastroEstoque2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelProduto_Relatorio_CadastroEstoque2.setText("Codigo Cliente");

        jTextField_Produto_Relatorio_Estoque_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Relatorio de Estoque");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Relatorio de Produto");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Relatorio de Venda");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Relatorio de Clientes");

        jLabel_Codigo_Relatorio_CadastroEstoque3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Codigo_Relatorio_CadastroEstoque3.setText("Codigo Cliente");

        jTextField_Codigo_Venda_Relatorio_Venda_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Codigo_Venda_Relatorio_Venda_Relatorio_CadastroEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Codigo_Venda_Relatorio_Venda_Relatorio_CadastroEstoqueKeyPressed(evt);
            }
        });

        jLabel_Codigo_Relatorio_CadastroEstoque4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Codigo_Relatorio_CadastroEstoque4.setText("Nome Cliente");

        jTextField_Nome_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel_Codigo_Relatorio_CadastroEstoque5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Codigo_Relatorio_CadastroEstoque5.setText("CPF Cliente");

        jTextField_CPF_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_CPF_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_CPF_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoqueKeyPressed(evt);
            }
        });

        jCheckBox_Relatorio_Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Relatorio_VendaActionPerformed(evt);
            }
        });

        jCheckBox_Relatorio_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Relatorio_ClienteActionPerformed(evt);
            }
        });

        jCheckBox_Relatorio_Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Relatorio_EstoqueActionPerformed(evt);
            }
        });

        jCheckBox_Relatorio_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Relatorio_ProdutoActionPerformed(evt);
            }
        });

        jButton_Sair_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Sair_Relatorio_CadastroEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Sair.png"))); // NOI18N
        jButton_Sair_Relatorio_CadastroEstoque.setText("Sair");
        jButton_Sair_Relatorio_CadastroEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sair_Relatorio_CadastroEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jButton_Pesquisar_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton_Limpar_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton_Sair_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_Codigo_Produto_Relatorio_Produto_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabelProduto_Relatorio_CadastroEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Produto_Relatorio_Produto_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox_Relatorio_Produto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque1)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_Codigo_Produto_Relatorio_Estoque_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabelProduto_Relatorio_CadastroEstoque1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Produto_Relatorio_Estoque_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox_Relatorio_Estoque))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel_DataInicial_Relatorio_CadastroEstoque)
                            .addGap(10, 10, 10)
                            .addComponent(jDateChooser_jDateChooser_DataInicial_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(jLabel_DataFinal_Relatorio_CadastroEstoque)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jDateChooser_DataFinal_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jCheckBox_Venda_Relatorio_CadastroEstoque)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox_Consumo_Relatorio_CadastroEstoque))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_Codigo_Venda_Relatorio_Venda_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabelProduto_Relatorio_CadastroEstoque2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_Codigo_Cliente_Relatorio_Venda_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jCheckBox_Relatorio_Venda)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Codigo_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Nome_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque5)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_CPF_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jCheckBox_Relatorio_Cliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox_Consumo_Relatorio_CadastroEstoque)
                        .addComponent(jCheckBox_Venda_Relatorio_CadastroEstoque))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_DataInicial_Relatorio_CadastroEstoque)
                        .addComponent(jDateChooser_jDateChooser_DataInicial_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_DataFinal_Relatorio_CadastroEstoque)
                        .addComponent(jDateChooser_DataFinal_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque)
                            .addComponent(jTextField_Codigo_Produto_Relatorio_Produto_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelProduto_Relatorio_CadastroEstoque)
                                .addComponent(jTextField_Produto_Relatorio_Produto_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jCheckBox_Relatorio_Produto))
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque1)
                        .addComponent(jTextField_Codigo_Produto_Relatorio_Estoque_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelProduto_Relatorio_CadastroEstoque1)
                        .addComponent(jTextField_Produto_Relatorio_Estoque_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox_Relatorio_Estoque))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque2)
                        .addComponent(jLabelProduto_Relatorio_CadastroEstoque2)
                        .addComponent(jTextField_Codigo_Cliente_Relatorio_Venda_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Codigo_Venda_Relatorio_Venda_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox_Relatorio_Venda))
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque3)
                            .addComponent(jTextField_Codigo_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque4)
                            .addComponent(jTextField_Nome_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque5)
                            .addComponent(jTextField_CPF_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCheckBox_Relatorio_Cliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Pesquisar_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Limpar_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Sair_Relatorio_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        setBounds(224, 57, 1101, 662);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Codigo_Produto_Relatorio_Produto_Relatorio_CadastroEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Codigo_Produto_Relatorio_Produto_Relatorio_CadastroEstoqueKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER)
     {
         jTextField_Produto_Relatorio_Produto_Relatorio_CadastroEstoque.requestFocus();
     }
    }//GEN-LAST:event_jTextField_Codigo_Produto_Relatorio_Produto_Relatorio_CadastroEstoqueKeyPressed

    private void jTextField_Codigo_Produto_Relatorio_Estoque_Relatorio_CadastroEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Codigo_Produto_Relatorio_Estoque_Relatorio_CadastroEstoqueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Codigo_Produto_Relatorio_Estoque_Relatorio_CadastroEstoqueKeyPressed

    private void jTextField_Codigo_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Codigo_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoqueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Codigo_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoqueKeyPressed

    private void jTextField_Codigo_Venda_Relatorio_Venda_Relatorio_CadastroEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Codigo_Venda_Relatorio_Venda_Relatorio_CadastroEstoqueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Codigo_Venda_Relatorio_Venda_Relatorio_CadastroEstoqueKeyPressed

    private void jTextField_CPF_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CPF_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoqueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CPF_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoqueKeyPressed

    private void jCheckBox_Relatorio_VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Relatorio_VendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_Relatorio_VendaActionPerformed

    private void jCheckBox_Relatorio_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Relatorio_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_Relatorio_ClienteActionPerformed

    private void jCheckBox_Relatorio_EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Relatorio_EstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_Relatorio_EstoqueActionPerformed

    private void jCheckBox_Relatorio_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Relatorio_ProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_Relatorio_ProdutoActionPerformed

    private void jTextField_Codigo_Cliente_Relatorio_Venda_Relatorio_CadastroEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Codigo_Cliente_Relatorio_Venda_Relatorio_CadastroEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Codigo_Cliente_Relatorio_Venda_Relatorio_CadastroEstoqueActionPerformed

    private void jButton_Sair_Relatorio_CadastroEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sair_Relatorio_CadastroEstoqueActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_Sair_Relatorio_CadastroEstoqueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Relatorio_CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio_CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio_CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio_CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio_CadastroEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Limpar_Relatorio_CadastroEstoque;
    private javax.swing.JButton jButton_Pesquisar_Relatorio_CadastroEstoque;
    private javax.swing.JButton jButton_Sair_Relatorio_CadastroEstoque;
    private javax.swing.JCheckBox jCheckBox_Consumo_Relatorio_CadastroEstoque;
    private javax.swing.JCheckBox jCheckBox_Relatorio_Cliente;
    private javax.swing.JCheckBox jCheckBox_Relatorio_Estoque;
    private javax.swing.JCheckBox jCheckBox_Relatorio_Produto;
    private javax.swing.JCheckBox jCheckBox_Relatorio_Venda;
    private javax.swing.JCheckBox jCheckBox_Venda_Relatorio_CadastroEstoque;
    private com.toedter.calendar.JDateChooser jDateChooser_DataFinal_Relatorio_CadastroEstoque;
    private com.toedter.calendar.JDateChooser jDateChooser_jDateChooser_DataInicial_Relatorio_CadastroEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelProduto_Relatorio_CadastroEstoque;
    private javax.swing.JLabel jLabelProduto_Relatorio_CadastroEstoque1;
    private javax.swing.JLabel jLabelProduto_Relatorio_CadastroEstoque2;
    private javax.swing.JLabel jLabel_Codigo_Relatorio_CadastroEstoque;
    private javax.swing.JLabel jLabel_Codigo_Relatorio_CadastroEstoque1;
    private javax.swing.JLabel jLabel_Codigo_Relatorio_CadastroEstoque2;
    private javax.swing.JLabel jLabel_Codigo_Relatorio_CadastroEstoque3;
    private javax.swing.JLabel jLabel_Codigo_Relatorio_CadastroEstoque4;
    private javax.swing.JLabel jLabel_Codigo_Relatorio_CadastroEstoque5;
    private javax.swing.JLabel jLabel_DataFinal_Relatorio_CadastroEstoque;
    private javax.swing.JLabel jLabel_DataInicial_Relatorio_CadastroEstoque;
    private javax.swing.JTextField jTextField_CPF_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque;
    private javax.swing.JTextField jTextField_Codigo_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque;
    private javax.swing.JTextField jTextField_Codigo_Cliente_Relatorio_Venda_Relatorio_CadastroEstoque;
    private javax.swing.JTextField jTextField_Codigo_Produto_Relatorio_Estoque_Relatorio_CadastroEstoque;
    private javax.swing.JTextField jTextField_Codigo_Produto_Relatorio_Produto_Relatorio_CadastroEstoque;
    private javax.swing.JTextField jTextField_Codigo_Venda_Relatorio_Venda_Relatorio_CadastroEstoque;
    private javax.swing.JTextField jTextField_Nome_Cliente_Relatorio_Cliente_Relatorio_CadastroEstoque;
    private javax.swing.JTextField jTextField_Produto_Relatorio_Estoque_Relatorio_CadastroEstoque;
    private javax.swing.JTextField jTextField_Produto_Relatorio_Produto_Relatorio_CadastroEstoque;
    // End of variables declaration//GEN-END:variables
}

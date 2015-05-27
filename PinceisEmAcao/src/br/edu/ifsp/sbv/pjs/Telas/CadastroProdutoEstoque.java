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
public class CadastroProdutoEstoque extends javax.swing.JFrame {

    /**
     * Creates new form Vendas
     */
    public CadastroProdutoEstoque() {
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

        jLabel_Codigo_Cadastro_CadastroEstoque = new javax.swing.JLabel();
        jTextField_Codigo_CadastroProdutoEstoque = new javax.swing.JTextField();
        jLabel_Produto_Cadastro_CadastroEstoque = new javax.swing.JLabel();
        jTextField_Produto_CadastroProdutoEstoque = new javax.swing.JTextField();
        jTextField_EstoqueMinimo_CadastroProdutoEstoque = new javax.swing.JTextField();
        jLabel_Categoria_CadastroEstoque = new javax.swing.JLabel();
        jLabel_EstoqueMinimo_Cadastro_CadastroEstoque = new javax.swing.JLabel();
        jTextField_ValorUnitario_CadastroProdutoEstoque = new javax.swing.JTextField();
        jComboBox_Categoria_CadastroProdutoEstoque = new javax.swing.JComboBox();
        jComboBox_UnidadeDeMedida_CadastroProdutoEstoque = new javax.swing.JComboBox();
        jButton_Editar_CadastroProdutoEstoque = new javax.swing.JButton();
        jButton_Salvar_CadastroProdutoEstoque = new javax.swing.JButton();
        jButton_Limpar_CadastroProdutoEstoque = new javax.swing.JButton();
        jButton_Excluir_CadastroProdutoEstoque = new javax.swing.JButton();
        jLabel_MargemLucro_Cadastro_CadastroEstoque = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_PrecoVenda_CadastroProdutoEstoque = new javax.swing.JTextField();
        jLabel_ValorUnitario_Cadastro_CadastroEstoque = new javax.swing.JLabel();
        jLabel_PrecoVenda_Cadastro_CadastroEstoque = new javax.swing.JLabel();
        jTextField_MargemLucro_CadastroProdutoEstoque = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_Observacoes_Cadastro_CadastroEstoque = new javax.swing.JTextArea();
        jButton_Sair_CadastroProdutoEstoque = new javax.swing.JButton();
        jLabel_Codigo_Cadastro_CadastroEstoque1 = new javax.swing.JLabel();
        jTextField_CodigoFixo_CadastroProdutoEstoque = new javax.swing.JTextField();

        jLabel_Codigo_Cadastro_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Codigo_Cadastro_CadastroEstoque.setText("Codigo");

        jTextField_Codigo_CadastroProdutoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Codigo_CadastroProdutoEstoqueActionPerformed(evt);
            }
        });
        jTextField_Codigo_CadastroProdutoEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Codigo_CadastroProdutoEstoqueKeyPressed(evt);
            }
        });

        jLabel_Produto_Cadastro_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Produto_Cadastro_CadastroEstoque.setText("Produto");

        jTextField_Produto_CadastroProdutoEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Produto_CadastroProdutoEstoqueKeyPressed(evt);
            }
        });

        jTextField_EstoqueMinimo_CadastroProdutoEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_EstoqueMinimo_CadastroProdutoEstoqueKeyPressed(evt);
            }
        });

        jLabel_Categoria_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Categoria_CadastroEstoque.setText("Categoria");

        jLabel_EstoqueMinimo_Cadastro_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_EstoqueMinimo_Cadastro_CadastroEstoque.setText("Estoque Mínimo");

        jTextField_ValorUnitario_CadastroProdutoEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_ValorUnitario_CadastroProdutoEstoqueKeyPressed(evt);
            }
        });

        jComboBox_Categoria_CadastroProdutoEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_Categoria_CadastroProdutoEstoque.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agulha", "Botão", "Cordão", "Elastico", "Fita", "Guipper", "Linha", "Passa Fita", "Renda", "Sianinha", "Tecido", "Tinta", "Velcro", "Viés", "Ziper", "Outro" }));

        jComboBox_UnidadeDeMedida_CadastroProdutoEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_UnidadeDeMedida_CadastroProdutoEstoque.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unidade", "Centimetro" }));

        jButton_Editar_CadastroProdutoEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Editar_CadastroProdutoEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Editar.png"))); // NOI18N
        jButton_Editar_CadastroProdutoEstoque.setText("Editar");

        jButton_Salvar_CadastroProdutoEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Salvar_CadastroProdutoEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Salvar.png"))); // NOI18N
        jButton_Salvar_CadastroProdutoEstoque.setText("Salvar");

        jButton_Limpar_CadastroProdutoEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Limpar_CadastroProdutoEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Limpar.png"))); // NOI18N
        jButton_Limpar_CadastroProdutoEstoque.setText("Limpar");

        jButton_Excluir_CadastroProdutoEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Excluir_CadastroProdutoEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Excluir.png"))); // NOI18N
        jButton_Excluir_CadastroProdutoEstoque.setText("Excluir");
        jButton_Excluir_CadastroProdutoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Excluir_CadastroProdutoEstoqueActionPerformed(evt);
            }
        });

        jLabel_MargemLucro_Cadastro_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_MargemLucro_Cadastro_CadastroEstoque.setText("Margem de Lucro");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel_ValorUnitario_Cadastro_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_ValorUnitario_Cadastro_CadastroEstoque.setText("Valor Unitário");

        jLabel_PrecoVenda_Cadastro_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_PrecoVenda_Cadastro_CadastroEstoque.setText("Preço de Venda");

        jTextField_MargemLucro_CadastroProdutoEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_MargemLucro_CadastroProdutoEstoqueKeyPressed(evt);
            }
        });

        jTextArea1_Observacoes_Cadastro_CadastroEstoque.setColumns(20);
        jTextArea1_Observacoes_Cadastro_CadastroEstoque.setRows(5);
        jTextArea1_Observacoes_Cadastro_CadastroEstoque.setBorder(javax.swing.BorderFactory.createTitledBorder("Observações"));
        jScrollPane1.setViewportView(jTextArea1_Observacoes_Cadastro_CadastroEstoque);

        jButton_Sair_CadastroProdutoEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Sair.png"))); // NOI18N
        jButton_Sair_CadastroProdutoEstoque.setText("Sair");
        jButton_Sair_CadastroProdutoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sair_CadastroProdutoEstoqueActionPerformed(evt);
            }
        });

        jLabel_Codigo_Cadastro_CadastroEstoque1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Codigo_Cadastro_CadastroEstoque1.setText("Codigo Fixo");

        jTextField_CodigoFixo_CadastroProdutoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CodigoFixo_CadastroProdutoEstoqueActionPerformed(evt);
            }
        });
        jTextField_CodigoFixo_CadastroProdutoEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_CodigoFixo_CadastroProdutoEstoqueKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_ValorUnitario_Cadastro_CadastroEstoque)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_MargemLucro_Cadastro_CadastroEstoque)
                                .addComponent(jLabel_EstoqueMinimo_Cadastro_CadastroEstoque, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Produto_Cadastro_CadastroEstoque, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Codigo_Cadastro_CadastroEstoque, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Categoria_CadastroEstoque, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_PrecoVenda_Cadastro_CadastroEstoque, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Codigo_Cadastro_CadastroEstoque1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Codigo_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Categoria_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField_PrecoVenda_CadastroProdutoEstoque, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_MargemLucro_CadastroProdutoEstoque, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_ValorUnitario_CadastroProdutoEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_EstoqueMinimo_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField_Produto_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox_UnidadeDeMedida_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField_CodigoFixo_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton_Salvar_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton_Editar_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton_Excluir_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton_Limpar_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton_Sair_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(327, 327, 327))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox_Categoria_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Categoria_CadastroEstoque))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Codigo_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Codigo_Cadastro_CadastroEstoque))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CodigoFixo_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Codigo_Cadastro_CadastroEstoque1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox_UnidadeDeMedida_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_Produto_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Produto_Cadastro_CadastroEstoque)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_EstoqueMinimo_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_EstoqueMinimo_Cadastro_CadastroEstoque))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_ValorUnitario_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ValorUnitario_Cadastro_CadastroEstoque))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_MargemLucro_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_MargemLucro_Cadastro_CadastroEstoque))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_PrecoVenda_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_PrecoVenda_Cadastro_CadastroEstoque)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Limpar_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Excluir_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Editar_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Salvar_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Sair_CadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        setBounds(224, 57, 1101, 662);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Codigo_CadastroProdutoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Codigo_CadastroProdutoEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Codigo_CadastroProdutoEstoqueActionPerformed

    private void jTextField_Codigo_CadastroProdutoEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Codigo_CadastroProdutoEstoqueKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
     {
         jTextField_Produto_CadastroProdutoEstoque.requestFocus();
     }
    }//GEN-LAST:event_jTextField_Codigo_CadastroProdutoEstoqueKeyPressed

    private void jTextField_Produto_CadastroProdutoEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Produto_CadastroProdutoEstoqueKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER)
     {
         jTextField_EstoqueMinimo_CadastroProdutoEstoque.requestFocus();
     }
    }//GEN-LAST:event_jTextField_Produto_CadastroProdutoEstoqueKeyPressed

    private void jTextField_EstoqueMinimo_CadastroProdutoEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_EstoqueMinimo_CadastroProdutoEstoqueKeyPressed
         if(evt.getKeyCode()== KeyEvent.VK_ENTER)
     {
         jTextField_ValorUnitario_CadastroProdutoEstoque.requestFocus();
     }
    }//GEN-LAST:event_jTextField_EstoqueMinimo_CadastroProdutoEstoqueKeyPressed

    private void jTextField_ValorUnitario_CadastroProdutoEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ValorUnitario_CadastroProdutoEstoqueKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
     {
         jTextField_MargemLucro_CadastroProdutoEstoque.requestFocus();
     }
    }//GEN-LAST:event_jTextField_ValorUnitario_CadastroProdutoEstoqueKeyPressed

    private void jTextField_MargemLucro_CadastroProdutoEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_MargemLucro_CadastroProdutoEstoqueKeyPressed
      if(evt.getKeyCode()== KeyEvent.VK_ENTER)
     {
         jTextField_PrecoVenda_CadastroProdutoEstoque.requestFocus();
     }
    }//GEN-LAST:event_jTextField_MargemLucro_CadastroProdutoEstoqueKeyPressed

    private void jButton_Excluir_CadastroProdutoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Excluir_CadastroProdutoEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Excluir_CadastroProdutoEstoqueActionPerformed

    private void jButton_Sair_CadastroProdutoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sair_CadastroProdutoEstoqueActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton_Sair_CadastroProdutoEstoqueActionPerformed

    private void jTextField_CodigoFixo_CadastroProdutoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CodigoFixo_CadastroProdutoEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CodigoFixo_CadastroProdutoEstoqueActionPerformed

    private void jTextField_CodigoFixo_CadastroProdutoEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CodigoFixo_CadastroProdutoEstoqueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CodigoFixo_CadastroProdutoEstoqueKeyPressed

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
            java.util.logging.Logger.getLogger(CadastroProdutoEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutoEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Editar_CadastroProdutoEstoque;
    private javax.swing.JButton jButton_Excluir_CadastroProdutoEstoque;
    private javax.swing.JButton jButton_Limpar_CadastroProdutoEstoque;
    private javax.swing.JButton jButton_Sair_CadastroProdutoEstoque;
    private javax.swing.JButton jButton_Salvar_CadastroProdutoEstoque;
    private javax.swing.JComboBox jComboBox_Categoria_CadastroProdutoEstoque;
    private javax.swing.JComboBox jComboBox_UnidadeDeMedida_CadastroProdutoEstoque;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Categoria_CadastroEstoque;
    private javax.swing.JLabel jLabel_Codigo_Cadastro_CadastroEstoque;
    private javax.swing.JLabel jLabel_Codigo_Cadastro_CadastroEstoque1;
    private javax.swing.JLabel jLabel_EstoqueMinimo_Cadastro_CadastroEstoque;
    private javax.swing.JLabel jLabel_MargemLucro_Cadastro_CadastroEstoque;
    private javax.swing.JLabel jLabel_PrecoVenda_Cadastro_CadastroEstoque;
    private javax.swing.JLabel jLabel_Produto_Cadastro_CadastroEstoque;
    private javax.swing.JLabel jLabel_ValorUnitario_Cadastro_CadastroEstoque;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1_Observacoes_Cadastro_CadastroEstoque;
    private javax.swing.JTextField jTextField_CodigoFixo_CadastroProdutoEstoque;
    private javax.swing.JTextField jTextField_Codigo_CadastroProdutoEstoque;
    private javax.swing.JTextField jTextField_EstoqueMinimo_CadastroProdutoEstoque;
    private javax.swing.JTextField jTextField_MargemLucro_CadastroProdutoEstoque;
    private javax.swing.JTextField jTextField_PrecoVenda_CadastroProdutoEstoque;
    private javax.swing.JTextField jTextField_Produto_CadastroProdutoEstoque;
    private javax.swing.JTextField jTextField_ValorUnitario_CadastroProdutoEstoque;
    // End of variables declaration//GEN-END:variables
}

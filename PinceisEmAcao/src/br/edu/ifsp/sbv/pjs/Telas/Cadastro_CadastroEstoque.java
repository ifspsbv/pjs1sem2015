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
public class Cadastro_CadastroEstoque extends javax.swing.JFrame {

    /**
     * Creates new form Vendas
     */
    public Cadastro_CadastroEstoque() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField_Codigo_Cadastro_CadastroEstoque = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Produto_Cadastro_CadastroEstoque1 = new javax.swing.JTextField();
        jTextField_EstoqueMinimo_Cadastro_CadastroEstoque = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_ValorUnitario_Cadastro_CadastroEstoque3 = new javax.swing.JTextField();
        jComboBox_UnidadeDeMedida_CadastroEstoque = new javax.swing.JComboBox();
        jComboBox_UnidadeDeMedida_CadastroEstoque1 = new javax.swing.JComboBox();
        jButton_Editar_Cadastro_CadastroEstoque = new javax.swing.JButton();
        jButton_Salvar_Cadastro_CadastroEstoque1 = new javax.swing.JButton();
        jButton_Limpar_Cadastro_CadastroEstoque1 = new javax.swing.JButton();
        jButton_Excluir_Cadastro_CadastroEstoque2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_PrecoVenda_Cadastro_CadastroEstoque4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_MargemLucro_Cadastro_CadastroEstoque5 = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Codigo");

        jTextField_Codigo_Cadastro_CadastroEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Codigo_Cadastro_CadastroEstoqueActionPerformed(evt);
            }
        });
        jTextField_Codigo_Cadastro_CadastroEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Codigo_Cadastro_CadastroEstoqueKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Produto");

        jTextField_Produto_Cadastro_CadastroEstoque1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Produto_Cadastro_CadastroEstoque1KeyPressed(evt);
            }
        });

        jTextField_EstoqueMinimo_Cadastro_CadastroEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_EstoqueMinimo_Cadastro_CadastroEstoqueKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Categoria");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Estoque Mínimo");

        jTextField_ValorUnitario_Cadastro_CadastroEstoque3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_ValorUnitario_Cadastro_CadastroEstoque3KeyPressed(evt);
            }
        });

        jComboBox_UnidadeDeMedida_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox_UnidadeDeMedida_CadastroEstoque.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agulha", "Botão", "Cordão", "Elastico", "Fita", "Guipper", "Linha", "Passa Fita", "Renda", "Sianinha", "Tecido", "Tinta", "Velcro", "Viés", "Ziper" }));

        jComboBox_UnidadeDeMedida_CadastroEstoque1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox_UnidadeDeMedida_CadastroEstoque1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Unidade", "Centimetro" }));

        jButton_Editar_Cadastro_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_Editar_Cadastro_CadastroEstoque.setText("Editar");

        jButton_Salvar_Cadastro_CadastroEstoque1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_Salvar_Cadastro_CadastroEstoque1.setText("Salvar");

        jButton_Limpar_Cadastro_CadastroEstoque1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_Limpar_Cadastro_CadastroEstoque1.setText("Limpar");

        jButton_Excluir_Cadastro_CadastroEstoque2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_Excluir_Cadastro_CadastroEstoque2.setText("Excluir");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Margem de Lucro");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Valor Unitário");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Preço de Venda");

        jTextField_MargemLucro_Cadastro_CadastroEstoque5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_MargemLucro_Cadastro_CadastroEstoque5KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(436, 436, 436)
                                .addComponent(jButton_Excluir_Cadastro_CadastroEstoque2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jButton_Salvar_Cadastro_CadastroEstoque1)
                                .addGap(98, 98, 98)
                                .addComponent(jButton_Editar_Cadastro_CadastroEstoque))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(jButton_Limpar_Cadastro_CadastroEstoque1)
                        .addGap(172, 172, 172))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Codigo_Cadastro_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox_UnidadeDeMedida_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_EstoqueMinimo_Cadastro_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField_Produto_Cadastro_CadastroEstoque1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox_UnidadeDeMedida_CadastroEstoque1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField_ValorUnitario_Cadastro_CadastroEstoque3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField_MargemLucro_Cadastro_CadastroEstoque5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField_PrecoVenda_Cadastro_CadastroEstoque4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox_UnidadeDeMedida_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Codigo_Cadastro_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Produto_Cadastro_CadastroEstoque1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_UnidadeDeMedida_CadastroEstoque1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_EstoqueMinimo_Cadastro_CadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_ValorUnitario_Cadastro_CadastroEstoque3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_MargemLucro_Cadastro_CadastroEstoque5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_PrecoVenda_Cadastro_CadastroEstoque4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Salvar_Cadastro_CadastroEstoque1)
                    .addComponent(jButton_Editar_Cadastro_CadastroEstoque)
                    .addComponent(jButton_Excluir_Cadastro_CadastroEstoque2)
                    .addComponent(jButton_Limpar_Cadastro_CadastroEstoque1))
                .addGap(32, 32, 32))
        );

        setBounds(224, 57, 1101, 662);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Codigo_Cadastro_CadastroEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Codigo_Cadastro_CadastroEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Codigo_Cadastro_CadastroEstoqueActionPerformed

    private void jTextField_Codigo_Cadastro_CadastroEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Codigo_Cadastro_CadastroEstoqueKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
     {
         jTextField_Produto_Cadastro_CadastroEstoque1.requestFocus();
     }
    }//GEN-LAST:event_jTextField_Codigo_Cadastro_CadastroEstoqueKeyPressed

    private void jTextField_Produto_Cadastro_CadastroEstoque1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Produto_Cadastro_CadastroEstoque1KeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER)
     {
         jTextField_EstoqueMinimo_Cadastro_CadastroEstoque.requestFocus();
     }
    }//GEN-LAST:event_jTextField_Produto_Cadastro_CadastroEstoque1KeyPressed

    private void jTextField_EstoqueMinimo_Cadastro_CadastroEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_EstoqueMinimo_Cadastro_CadastroEstoqueKeyPressed
         if(evt.getKeyCode()== KeyEvent.VK_ENTER)
     {
         jTextField_ValorUnitario_Cadastro_CadastroEstoque3.requestFocus();
     }
    }//GEN-LAST:event_jTextField_EstoqueMinimo_Cadastro_CadastroEstoqueKeyPressed

    private void jTextField_ValorUnitario_Cadastro_CadastroEstoque3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ValorUnitario_Cadastro_CadastroEstoque3KeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
     {
         jTextField_MargemLucro_Cadastro_CadastroEstoque5.requestFocus();
     }
    }//GEN-LAST:event_jTextField_ValorUnitario_Cadastro_CadastroEstoque3KeyPressed

    private void jTextField_MargemLucro_Cadastro_CadastroEstoque5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_MargemLucro_Cadastro_CadastroEstoque5KeyPressed
      if(evt.getKeyCode()== KeyEvent.VK_ENTER)
     {
         jTextField_PrecoVenda_Cadastro_CadastroEstoque4.requestFocus();
     }
    }//GEN-LAST:event_jTextField_MargemLucro_Cadastro_CadastroEstoque5KeyPressed

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
            java.util.logging.Logger.getLogger(Cadastro_CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_CadastroEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Editar_Cadastro_CadastroEstoque;
    private javax.swing.JButton jButton_Excluir_Cadastro_CadastroEstoque2;
    private javax.swing.JButton jButton_Limpar_Cadastro_CadastroEstoque1;
    private javax.swing.JButton jButton_Salvar_Cadastro_CadastroEstoque1;
    private javax.swing.JComboBox jComboBox_UnidadeDeMedida_CadastroEstoque;
    private javax.swing.JComboBox jComboBox_UnidadeDeMedida_CadastroEstoque1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField_Codigo_Cadastro_CadastroEstoque;
    private javax.swing.JTextField jTextField_EstoqueMinimo_Cadastro_CadastroEstoque;
    private javax.swing.JTextField jTextField_MargemLucro_Cadastro_CadastroEstoque5;
    private javax.swing.JTextField jTextField_PrecoVenda_Cadastro_CadastroEstoque4;
    private javax.swing.JTextField jTextField_Produto_Cadastro_CadastroEstoque1;
    private javax.swing.JTextField jTextField_ValorUnitario_Cadastro_CadastroEstoque3;
    // End of variables declaration//GEN-END:variables
}

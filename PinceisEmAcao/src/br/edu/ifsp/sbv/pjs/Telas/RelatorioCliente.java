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
public class RelatorioCliente extends javax.swing.JFrame {

    /**
     * Creates new form Vendas
     */
    public RelatorioCliente() {
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

        jButton_Limpar_RelatorioCliente = new javax.swing.JButton();
        jButton_Pesquisar_RelatorioCliente = new javax.swing.JButton();
        jLabel_Codigo_Relatorio_CadastroEstoque = new javax.swing.JLabel();
        jLabelProduto_Relatorio_CadastroEstoque = new javax.swing.JLabel();
        jTextField_Codigo_RelatorioCliente = new javax.swing.JTextField();
        jTextField_Cliente_RelatorioCliente = new javax.swing.JTextField();
        jButton_Sair__RelatorioCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_Tabela_RelatorioCliente = new javax.swing.JTable();
        jButton1_PDF_RelatorioCliente = new javax.swing.JButton();
        jLabelProduto_Relatorio_CadastroEstoque1 = new javax.swing.JLabel();
        jTextField_Cep_RelatorioCliente = new javax.swing.JTextField();
        jLabelProduto_Relatorio_CadastroEstoque2 = new javax.swing.JLabel();
        jTextField_email_RelatorioCliente = new javax.swing.JTextField();

        jButton_Limpar_RelatorioCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Limpar_RelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Limpar.png"))); // NOI18N
        jButton_Limpar_RelatorioCliente.setText("Limpar");

        jButton_Pesquisar_RelatorioCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Pesquisar_RelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/lupa24.png"))); // NOI18N
        jButton_Pesquisar_RelatorioCliente.setText("Pesquisar");

        jLabel_Codigo_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Codigo_Relatorio_CadastroEstoque.setText("Codigo");

        jLabelProduto_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelProduto_Relatorio_CadastroEstoque.setText("Cliente");

        jTextField_Codigo_RelatorioCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Codigo_RelatorioCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Codigo_RelatorioClienteKeyPressed(evt);
            }
        });

        jTextField_Cliente_RelatorioCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_Sair__RelatorioCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Sair__RelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Sair.png"))); // NOI18N
        jButton_Sair__RelatorioCliente.setText("Sair");
        jButton_Sair__RelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sair__RelatorioClienteActionPerformed(evt);
            }
        });

        jTable1_Tabela_RelatorioCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Cliente", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1_Tabela_RelatorioCliente.setShowHorizontalLines(false);
        jTable1_Tabela_RelatorioCliente.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1_Tabela_RelatorioCliente);

        jButton1_PDF_RelatorioCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_PDF_RelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/pdf 23x24.png"))); // NOI18N
        jButton1_PDF_RelatorioCliente.setText("Gerar PDF");

        jLabelProduto_Relatorio_CadastroEstoque1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelProduto_Relatorio_CadastroEstoque1.setText("CEP");

        jTextField_Cep_RelatorioCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelProduto_Relatorio_CadastroEstoque2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelProduto_Relatorio_CadastroEstoque2.setText("E-mail");

        jTextField_email_RelatorioCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jButton_Pesquisar_RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton_Limpar_RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton_Sair__RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton1_PDF_RelatorioCliente)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Codigo_RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabelProduto_Relatorio_CadastroEstoque)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_Cliente_RelatorioCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelProduto_Relatorio_CadastroEstoque1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Cep_RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelProduto_Relatorio_CadastroEstoque2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_email_RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_Codigo_RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque)
                        .addComponent(jLabelProduto_Relatorio_CadastroEstoque)
                        .addComponent(jTextField_Cliente_RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelProduto_Relatorio_CadastroEstoque2)
                        .addComponent(jTextField_email_RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Cep_RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelProduto_Relatorio_CadastroEstoque1)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Pesquisar_RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Limpar_RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Sair__RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1_PDF_RelatorioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        setBounds(224, 57, 1101, 662);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Codigo_RelatorioClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Codigo_RelatorioClienteKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER)
     {
         jTextField_Cliente_RelatorioCliente.requestFocus();
     }
    }//GEN-LAST:event_jTextField_Codigo_RelatorioClienteKeyPressed

    private void jButton_Sair__RelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sair__RelatorioClienteActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton_Sair__RelatorioClienteActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_PDF_RelatorioCliente;
    private javax.swing.JButton jButton_Limpar_RelatorioCliente;
    private javax.swing.JButton jButton_Pesquisar_RelatorioCliente;
    private javax.swing.JButton jButton_Sair__RelatorioCliente;
    private javax.swing.JLabel jLabelProduto_Relatorio_CadastroEstoque;
    private javax.swing.JLabel jLabelProduto_Relatorio_CadastroEstoque1;
    private javax.swing.JLabel jLabelProduto_Relatorio_CadastroEstoque2;
    private javax.swing.JLabel jLabel_Codigo_Relatorio_CadastroEstoque;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_Tabela_RelatorioCliente;
    private javax.swing.JTextField jTextField_Cep_RelatorioCliente;
    private javax.swing.JTextField jTextField_Cliente_RelatorioCliente;
    private javax.swing.JTextField jTextField_Codigo_RelatorioCliente;
    private javax.swing.JTextField jTextField_email_RelatorioCliente;
    // End of variables declaration//GEN-END:variables
}

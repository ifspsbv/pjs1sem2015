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
public class RelatorioEstoque extends javax.swing.JFrame {

    /**
     * Creates new form Vendas
     */
    public RelatorioEstoque() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel_DataInicial_Relatorio_CadastroEstoque = new javax.swing.JLabel();
        jLabel_DataFinal_Relatorio_CadastroEstoque = new javax.swing.JLabel();
        jButton_Limpar_RelatorioEstoque = new javax.swing.JButton();
        jButton_Pesquisar_RelatorioEstoque = new javax.swing.JButton();
        jDateChooser_jDateChooser_DataInicial_RelatorioEstoque = new com.toedter.calendar.JDateChooser();
        jDateChooser_DataFinal_RelatorioEstoque = new com.toedter.calendar.JDateChooser();
        jLabel_Codigo_Relatorio_CadastroEstoque = new javax.swing.JLabel();
        jLabelProduto_Relatorio_CadastroEstoque = new javax.swing.JLabel();
        jTextField_Codigo_RelatorioEstoque = new javax.swing.JTextField();
        jTextField_Produto_RelatorioEstoque = new javax.swing.JTextField();
        jButton_Sair_RelatorioEstoque = new javax.swing.JButton();
        jRadioButton1_Venda__RelatorioEstoque = new javax.swing.JRadioButton();
        jRadioButton2_Consumo_RelatorioEstoque = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_Tabela_RelatorioEstoque = new javax.swing.JTable();
        jButton1_PDF_RelatorioEstoque = new javax.swing.JButton();

        jLabel_DataInicial_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DataInicial_Relatorio_CadastroEstoque.setText("Data Inicial");

        jLabel_DataFinal_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DataFinal_Relatorio_CadastroEstoque.setText("Data Final");

        jButton_Limpar_RelatorioEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Limpar_RelatorioEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Limpar.png"))); // NOI18N
        jButton_Limpar_RelatorioEstoque.setText("Limpar");

        jButton_Pesquisar_RelatorioEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Pesquisar_RelatorioEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/lupa24.png"))); // NOI18N
        jButton_Pesquisar_RelatorioEstoque.setText("Pesquisar");

        jLabel_Codigo_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Codigo_Relatorio_CadastroEstoque.setText("Codigo");

        jLabelProduto_Relatorio_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelProduto_Relatorio_CadastroEstoque.setText("Produto");

        jTextField_Codigo_RelatorioEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Codigo_RelatorioEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Codigo_RelatorioEstoqueKeyPressed(evt);
            }
        });

        jTextField_Produto_RelatorioEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_Sair_RelatorioEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Sair_RelatorioEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Sair.png"))); // NOI18N
        jButton_Sair_RelatorioEstoque.setText("Sair");
        jButton_Sair_RelatorioEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sair_RelatorioEstoqueActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1_Venda__RelatorioEstoque);
        jRadioButton1_Venda__RelatorioEstoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1_Venda__RelatorioEstoque.setText("Venda");

        buttonGroup1.add(jRadioButton2_Consumo_RelatorioEstoque);
        jRadioButton2_Consumo_RelatorioEstoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton2_Consumo_RelatorioEstoque.setText("Consumo");
        jRadioButton2_Consumo_RelatorioEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_Consumo_RelatorioEstoqueActionPerformed(evt);
            }
        });

        jTable1_Tabela_RelatorioEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Produto", "Quantidade", "Estoque Mínimo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1_Tabela_RelatorioEstoque.setShowHorizontalLines(false);
        jTable1_Tabela_RelatorioEstoque.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1_Tabela_RelatorioEstoque);

        jButton1_PDF_RelatorioEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_PDF_RelatorioEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/pdf 23x24.png"))); // NOI18N
        jButton1_PDF_RelatorioEstoque.setText("Gerar PDF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel_DataInicial_Relatorio_CadastroEstoque)
                .addGap(7, 7, 7)
                .addComponent(jDateChooser_jDateChooser_DataInicial_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel_DataFinal_Relatorio_CadastroEstoque)
                .addGap(7, 7, 7)
                .addComponent(jDateChooser_DataFinal_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque)
                .addGap(10, 10, 10)
                .addComponent(jTextField_Codigo_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabelProduto_Relatorio_CadastroEstoque)
                .addGap(13, 13, 13)
                .addComponent(jTextField_Produto_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jRadioButton1_Venda__RelatorioEstoque)
                .addGap(0, 0, 0)
                .addComponent(jRadioButton2_Consumo_RelatorioEstoque))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jButton_Pesquisar_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton_Limpar_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton_Sair_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton1_PDF_RelatorioEstoque))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel_DataInicial_Relatorio_CadastroEstoque))
                    .addComponent(jDateChooser_jDateChooser_DataInicial_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel_DataFinal_Relatorio_CadastroEstoque))
                    .addComponent(jDateChooser_DataFinal_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel_Codigo_Relatorio_CadastroEstoque))
                    .addComponent(jTextField_Codigo_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelProduto_Relatorio_CadastroEstoque))
                    .addComponent(jTextField_Produto_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButton1_Venda__RelatorioEstoque))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButton2_Consumo_RelatorioEstoque)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Pesquisar_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Limpar_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Sair_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1_PDF_RelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        setBounds(224, 57, 1101, 662);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Codigo_RelatorioEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Codigo_RelatorioEstoqueKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER)
     {
         jTextField_Produto_RelatorioEstoque.requestFocus();
     }
    }//GEN-LAST:event_jTextField_Codigo_RelatorioEstoqueKeyPressed

    private void jButton_Sair_RelatorioEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sair_RelatorioEstoqueActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton_Sair_RelatorioEstoqueActionPerformed

    private void jRadioButton2_Consumo_RelatorioEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_Consumo_RelatorioEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2_Consumo_RelatorioEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1_PDF_RelatorioEstoque;
    private javax.swing.JButton jButton_Limpar_RelatorioEstoque;
    private javax.swing.JButton jButton_Pesquisar_RelatorioEstoque;
    private javax.swing.JButton jButton_Sair_RelatorioEstoque;
    private com.toedter.calendar.JDateChooser jDateChooser_DataFinal_RelatorioEstoque;
    private com.toedter.calendar.JDateChooser jDateChooser_jDateChooser_DataInicial_RelatorioEstoque;
    private javax.swing.JLabel jLabelProduto_Relatorio_CadastroEstoque;
    private javax.swing.JLabel jLabel_Codigo_Relatorio_CadastroEstoque;
    private javax.swing.JLabel jLabel_DataFinal_Relatorio_CadastroEstoque;
    private javax.swing.JLabel jLabel_DataInicial_Relatorio_CadastroEstoque;
    private javax.swing.JRadioButton jRadioButton1_Venda__RelatorioEstoque;
    private javax.swing.JRadioButton jRadioButton2_Consumo_RelatorioEstoque;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_Tabela_RelatorioEstoque;
    private javax.swing.JTextField jTextField_Codigo_RelatorioEstoque;
    private javax.swing.JTextField jTextField_Produto_RelatorioEstoque;
    // End of variables declaration//GEN-END:variables
}
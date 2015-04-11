/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.sbv.pjs.Telas;

/**
 *
 * @author bv1301144
 */
public class CadastroEstoque extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    private Pesquisar_CadastroEstoque pesquisarestoque;
    private Relatorio_CadastroEstoque relatorioestoque;
    private Cadastro_CadastroEstoque cadastroestoque;
    public CadastroEstoque() {
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

        jButton_Cadastro_NF = new javax.swing.JButton();
        jButton_Pesquisar_Estoque = new javax.swing.JButton();
        jButton_Cadastrar_Estoque = new javax.swing.JButton();
        jButton_Relatorio_Estoque = new javax.swing.JButton();
        jButton_Sair_Fornecedor = new javax.swing.JButton();
        jLabel_imagem_fundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(66, 188, 251));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Cadastro_NF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cadastro_NFActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Cadastro_NF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 150, 60));

        jButton_Pesquisar_Estoque.setText("Pesquisar");
        jButton_Pesquisar_Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Pesquisar_EstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Pesquisar_Estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, 60));

        jButton_Cadastrar_Estoque.setText("Cadastrar");
        jButton_Cadastrar_Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cadastrar_EstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Cadastrar_Estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 60));

        jButton_Relatorio_Estoque.setText("Relatório");
        jButton_Relatorio_Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Relatorio_EstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Relatorio_Estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 60));

        jButton_Sair_Fornecedor.setText("Sair");
        jButton_Sair_Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sair_FornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Sair_Fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 60));

        jLabel_imagem_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/fundo com logo.png"))); // NOI18N
        jLabel_imagem_fundo.setText("jLabel2");
        getContentPane().add(jLabel_imagem_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1100, 660));

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Pesquisar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Relatório");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Cadastro_NFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cadastro_NFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Cadastro_NFActionPerformed

    private void jButton_Pesquisar_EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Pesquisar_EstoqueActionPerformed
        if(pesquisarestoque==null){
        pesquisarestoque= new Pesquisar_CadastroEstoque();
    }
    pesquisarestoque.setVisible(true);
    }//GEN-LAST:event_jButton_Pesquisar_EstoqueActionPerformed

    private void jButton_Cadastrar_EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cadastrar_EstoqueActionPerformed
       if(cadastroestoque==null){
        cadastroestoque= new Cadastro_CadastroEstoque();
    }
    cadastroestoque.setVisible(true);
                              
    }//GEN-LAST:event_jButton_Cadastrar_EstoqueActionPerformed

    private void jButton_Relatorio_EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Relatorio_EstoqueActionPerformed
        if(relatorioestoque==null){
        relatorioestoque= new Relatorio_CadastroEstoque();
    }
    relatorioestoque.setVisible(true);
    }//GEN-LAST:event_jButton_Relatorio_EstoqueActionPerformed

    private void jButton_Sair_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sair_FornecedorActionPerformed
       this.dispose(); 
    }//GEN-LAST:event_jButton_Sair_FornecedorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cadastrar_Estoque;
    private javax.swing.JButton jButton_Cadastro_NF;
    private javax.swing.JButton jButton_Pesquisar_Estoque;
    private javax.swing.JButton jButton_Relatorio_Estoque;
    private javax.swing.JButton jButton_Sair_Fornecedor;
    private javax.swing.JLabel jLabel_imagem_fundo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}

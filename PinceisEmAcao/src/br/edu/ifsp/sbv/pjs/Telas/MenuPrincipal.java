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
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    
    private Vendas vendas;
    private CadastroEstoque estoque;
    public MenuPrincipal() {
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

        jButton_Cadastro_NF_MenuPrincipal = new javax.swing.JButton();
        jButton_Cadastro_Cliente_MenuPrincipal = new javax.swing.JButton();
        jButton_Vendas_MenuPrincipal = new javax.swing.JButton();
        jButton_Estoque_MenuPrincipal = new javax.swing.JButton();
        jButton_Cadastro_Fornecedor_MenuPrincipal = new javax.swing.JButton();
        jLabel_imagem_fundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(66, 188, 251));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Cadastro_NF_MenuPrincipal.setText("Cadastro NF");
        jButton_Cadastro_NF_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cadastro_NF_MenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Cadastro_NF_MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 150, 60));

        jButton_Cadastro_Cliente_MenuPrincipal.setText("Cadastro Cliente");
        jButton_Cadastro_Cliente_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cadastro_Cliente_MenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Cadastro_Cliente_MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, 60));

        jButton_Vendas_MenuPrincipal.setText("Vendas");
        jButton_Vendas_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Vendas_MenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Vendas_MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 60));

        jButton_Estoque_MenuPrincipal.setText("Estoque");
        jButton_Estoque_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Estoque_MenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Estoque_MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 60));

        jButton_Cadastro_Fornecedor_MenuPrincipal.setText("Cadastro Fornecedor");
        jButton_Cadastro_Fornecedor_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cadastro_Fornecedor_MenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Cadastro_Fornecedor_MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 60));

        jLabel_imagem_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/fundo com logo.png"))); // NOI18N
        jLabel_imagem_fundo.setText("jLabel2");
        getContentPane().add(jLabel_imagem_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1100, 660));

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Vendas");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Cad.Cliente");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Estoque");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Cad.Fornecedor");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Cad.NF");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Cadastro_NF_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cadastro_NF_MenuPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Cadastro_NF_MenuPrincipalActionPerformed

    private void jButton_Cadastro_Cliente_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cadastro_Cliente_MenuPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Cadastro_Cliente_MenuPrincipalActionPerformed

    private void jButton_Vendas_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Vendas_MenuPrincipalActionPerformed
    if(vendas==null){
        vendas= new Vendas();
    }
    vendas.setVisible(true);
    }//GEN-LAST:event_jButton_Vendas_MenuPrincipalActionPerformed

    private void jButton_Estoque_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Estoque_MenuPrincipalActionPerformed
        if(estoque==null){
        estoque= new CadastroEstoque();
    }
    estoque.setVisible(true);
    }//GEN-LAST:event_jButton_Estoque_MenuPrincipalActionPerformed

    private void jButton_Cadastro_Fornecedor_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cadastro_Fornecedor_MenuPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Cadastro_Fornecedor_MenuPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cadastro_Cliente_MenuPrincipal;
    private javax.swing.JButton jButton_Cadastro_Fornecedor_MenuPrincipal;
    private javax.swing.JButton jButton_Cadastro_NF_MenuPrincipal;
    private javax.swing.JButton jButton_Estoque_MenuPrincipal;
    private javax.swing.JButton jButton_Vendas_MenuPrincipal;
    private javax.swing.JLabel jLabel_imagem_fundo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}

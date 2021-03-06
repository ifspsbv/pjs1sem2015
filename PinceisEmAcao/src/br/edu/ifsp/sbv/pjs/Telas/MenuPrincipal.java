/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.sbv.pjs.Telas;

import br.edu.ifsp.sbv.pjs.Modelo.Usuario;

/**
 *
 * @author bv1301144
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    private CadastroClientes cadastroclientes;
    private CadastroNF notafiscal;
    private Vendas vendas;
    private Estoque estoque;
    private CadastroFornecedor fornecedor;
    private Relatorio relatorio;
    public static Usuario usuarioLogado = null;
    

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

        jButton_Relatorio_MenuPrincipal = new javax.swing.JButton();
        jButton_CadastroCliente_MenuPrincipal = new javax.swing.JButton();
        jButton_Vendas_MenuPrincipal = new javax.swing.JButton();
        jButton_Estoque_MenuPrincipal = new javax.swing.JButton();
        jButton_CadastroFornecedor_MenuPrincipal = new javax.swing.JButton();
        jLabel_imagem_fundo = new javax.swing.JLabel();
        jButton_CadastroNF_MenuPrincipal = new javax.swing.JButton();
        jButton_Sair_MenuPrincipal1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(66, 188, 251));

        jButton_Relatorio_MenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/relatorio.png"))); // NOI18N
        jButton_Relatorio_MenuPrincipal.setText("Relatório");
        jButton_Relatorio_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Relatorio_MenuPrincipalActionPerformed(evt);
            }
        });

        jButton_CadastroCliente_MenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Cliente.png"))); // NOI18N
        jButton_CadastroCliente_MenuPrincipal.setText(" Clientes");
        jButton_CadastroCliente_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CadastroCliente_MenuPrincipalActionPerformed(evt);
            }
        });

        jButton_Vendas_MenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/vendas 32.png"))); // NOI18N
        jButton_Vendas_MenuPrincipal.setText("Vendas");
        jButton_Vendas_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Vendas_MenuPrincipalActionPerformed(evt);
            }
        });

        jButton_Estoque_MenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Estoque.png"))); // NOI18N
        jButton_Estoque_MenuPrincipal.setText("Estoque");
        jButton_Estoque_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Estoque_MenuPrincipalActionPerformed(evt);
            }
        });

        jButton_CadastroFornecedor_MenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Fornecedor.png"))); // NOI18N
        jButton_CadastroFornecedor_MenuPrincipal.setText("Fornecedor");
        jButton_CadastroFornecedor_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CadastroFornecedor_MenuPrincipalActionPerformed(evt);
            }
        });

        jLabel_imagem_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/fundo com logo.png"))); // NOI18N
        jLabel_imagem_fundo.setText("jLabel2");

        jButton_CadastroNF_MenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Nota Fiscal.png"))); // NOI18N
        jButton_CadastroNF_MenuPrincipal.setText("Cadastro NF");
        jButton_CadastroNF_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CadastroNF_MenuPrincipalActionPerformed(evt);
            }
        });

        jButton_Sair_MenuPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Sair.png"))); // NOI18N
        jButton_Sair_MenuPrincipal1.setText("Sair");
        jButton_Sair_MenuPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sair_MenuPrincipal1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Vendas_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_CadastroCliente_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Estoque_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_CadastroFornecedor_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_CadastroNF_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Relatorio_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Sair_MenuPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jLabel_imagem_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton_Vendas_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_CadastroCliente_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_Estoque_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_CadastroFornecedor_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_CadastroNF_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_Relatorio_MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_Sair_MenuPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_imagem_fundo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Relatorio_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Relatorio_MenuPrincipalActionPerformed
        if (relatorio == null) {
            relatorio = new Relatorio();
        }
        relatorio.setVisible(true);
    }//GEN-LAST:event_jButton_Relatorio_MenuPrincipalActionPerformed

    private void jButton_CadastroCliente_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CadastroCliente_MenuPrincipalActionPerformed
        if (cadastroclientes == null) {
            cadastroclientes = new CadastroClientes();
        }
        
        cadastroclientes.setVisible(true);
        cadastroclientes.limparDados();

    }//GEN-LAST:event_jButton_CadastroCliente_MenuPrincipalActionPerformed

    private void jButton_Vendas_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Vendas_MenuPrincipalActionPerformed
        if (vendas == null) {
            vendas = new Vendas();
        }
        vendas.setVisible(true);
    }//GEN-LAST:event_jButton_Vendas_MenuPrincipalActionPerformed

    private void jButton_Estoque_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Estoque_MenuPrincipalActionPerformed
        if (estoque == null) {
            estoque = new Estoque();
        }
        estoque.setVisible(true);
    }//GEN-LAST:event_jButton_Estoque_MenuPrincipalActionPerformed

    private void jButton_CadastroFornecedor_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CadastroFornecedor_MenuPrincipalActionPerformed
        if (fornecedor == null) {
            fornecedor = new CadastroFornecedor();
        }
        fornecedor.setVisible(true);
        fornecedor.limparDados();

    }//GEN-LAST:event_jButton_CadastroFornecedor_MenuPrincipalActionPerformed

    private void jButton_CadastroNF_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CadastroNF_MenuPrincipalActionPerformed
        if (notafiscal == null) {
            notafiscal = new CadastroNF();
        }
        notafiscal.setVisible(true);
    }//GEN-LAST:event_jButton_CadastroNF_MenuPrincipalActionPerformed

    private void jButton_Sair_MenuPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sair_MenuPrincipal1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_Sair_MenuPrincipal1ActionPerformed

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
    private javax.swing.JButton jButton_CadastroCliente_MenuPrincipal;
    private javax.swing.JButton jButton_CadastroFornecedor_MenuPrincipal;
    private javax.swing.JButton jButton_CadastroNF_MenuPrincipal;
    private javax.swing.JButton jButton_Estoque_MenuPrincipal;
    private javax.swing.JButton jButton_Relatorio_MenuPrincipal;
    private javax.swing.JButton jButton_Sair_MenuPrincipal1;
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

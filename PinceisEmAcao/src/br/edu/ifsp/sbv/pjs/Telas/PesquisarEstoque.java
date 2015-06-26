
package br.edu.ifsp.sbv.pjs.Telas;

import br.edu.ifsp.sbv.pjs.Controle.ProdutoBD;
import br.edu.ifsp.sbv.pjs.Modelo.Produto;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcelo
 */
public class PesquisarEstoque extends javax.swing.JFrame {


    
    public PesquisarEstoque() {
        initComponents();
    }
    
    public PesquisarEstoque(Produto p) {
        this.retornarValor = true;
        this.produtoReferencia = p;
        initComponents();
    }

    boolean retornarValor = false;
    
    private Produto produto;
    private Produto produtoReferencia = null;
    private List<Produto> produtos;
    private ProdutoBD bd = new ProdutoBD();

    public void limparDados() {

        jTextField_Codigo_PesquisarEstoque.setText("");
        jTextField_Codigo_fixo_PesquisarEstoque.setText("");
        jTextField_Produto_PesquisarEstoque.setText("");

        jTextField_Codigo_PesquisarEstoque.requestFocus(true);

        ((DefaultTableModel) Tabela_PesquisarEstoque.getModel()).setNumRows(0);
        Tabela_PesquisarEstoque.updateUI();
        produtos = null;
        produtos = new ArrayList<Produto>();

    }

    private void pesquisarProduto() {
        bd = new ProdutoBD();
        if (!jTextField_Codigo_PesquisarEstoque.getText().isEmpty()) {
            produto = bd.pesquisarPorID(Integer.parseInt(jTextField_Codigo_PesquisarEstoque.getText()));

            if (produto != null) {

                produtos = new ArrayList<Produto>();
                produtos.add(produto);
                atualizarListaProduto();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Produto não encontrado!");
                limparDados();
            }
        } else if (!jTextField_Codigo_fixo_PesquisarEstoque.getText().isEmpty()) {
            produto = bd.pesquisarPorCodigoFixo(Integer.parseInt(jTextField_Codigo_fixo_PesquisarEstoque.getText()));

            if (produto != null) {

                produtos = new ArrayList<Produto>();
                produtos.add(produto);
                atualizarListaProduto();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Produto não encontrado!");
                limparDados();
            }

        } else if (!jTextField_Produto_PesquisarEstoque.getText().isEmpty()) {
            produtos = bd.pesquisarPorNome(jTextField_Produto_PesquisarEstoque.getText());

            if (produtos.size() > 0) {
                atualizarListaProduto();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Produto não encontrado!");
                limparDados();
            }

        }

    }

    public void atualizarListaProduto() {
        DefaultTableModel modelo = (DefaultTableModel) Tabela_PesquisarEstoque.getModel();
        modelo.setNumRows(0);
        Tabela_PesquisarEstoque.updateUI();

        if (produtos != null) {
            if (produtos.size() > 0) {
                for (Produto p : produtos) {
                    modelo.addRow(new Object[]{p.getId_produto(), p.getCod_fixo(), p.getNome_produto(),
                        p.getValor_unitario(), p.getQtde_min(), p.getQtde_estoque()});
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Codigo_Pesquisar_CadastroEstoque = new javax.swing.JLabel();
        jTextField_Produto_PesquisarEstoque = new javax.swing.JTextField();
        jLabel_Produto_Pesquisar_CadastroEstoque = new javax.swing.JLabel();
        jTextField_Codigo_PesquisarEstoque = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_PesquisarEstoque = new javax.swing.JTable();
        jButton_Pesquisar_PesquisarEstoque = new javax.swing.JButton();
        jButton_Limpar_PesquisarEstoque = new javax.swing.JButton();
        jButton_Sair_PesquisarEstoque = new javax.swing.JButton();
        jLabel_Codigo_Pesquisar_CadastroEstoque1 = new javax.swing.JLabel();
        jTextField_Codigo_fixo_PesquisarEstoque = new javax.swing.JTextField();

        jLabel_Codigo_Pesquisar_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Codigo_Pesquisar_CadastroEstoque.setText("Codigo");

        jLabel_Produto_Pesquisar_CadastroEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Produto_Pesquisar_CadastroEstoque.setText("Produto");

        jTextField_Codigo_PesquisarEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Codigo_PesquisarEstoqueKeyPressed(evt);
            }
        });

        Tabela_PesquisarEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cod. Fixo", "Produto", "Preco Unitario", "Estoque Minimo", "Quantidade Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_PesquisarEstoque.setShowHorizontalLines(false);
        Tabela_PesquisarEstoque.setShowVerticalLines(false);
        Tabela_PesquisarEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Tabela_PesquisarEstoqueKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_PesquisarEstoque);

        jButton_Pesquisar_PesquisarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/lupa32.png"))); // NOI18N
        jButton_Pesquisar_PesquisarEstoque.setText("Pesquisar");
        jButton_Pesquisar_PesquisarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Pesquisar_PesquisarEstoqueActionPerformed(evt);
            }
        });

        jButton_Limpar_PesquisarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Limpar.png"))); // NOI18N
        jButton_Limpar_PesquisarEstoque.setText("Limpar");
        jButton_Limpar_PesquisarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Limpar_PesquisarEstoqueActionPerformed(evt);
            }
        });

        jButton_Sair_PesquisarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/Sair.png"))); // NOI18N
        jButton_Sair_PesquisarEstoque.setText("Sair");
        jButton_Sair_PesquisarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sair_PesquisarEstoqueActionPerformed(evt);
            }
        });

        jLabel_Codigo_Pesquisar_CadastroEstoque1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Codigo_Pesquisar_CadastroEstoque1.setText("Codigo Fixo");

        jTextField_Codigo_fixo_PesquisarEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_Codigo_fixo_PesquisarEstoqueKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Pesquisar_PesquisarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(jButton_Limpar_PesquisarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(jButton_Sair_PesquisarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Codigo_Pesquisar_CadastroEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Codigo_PesquisarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Codigo_Pesquisar_CadastroEstoque1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Codigo_fixo_PesquisarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Produto_Pesquisar_CadastroEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Produto_PesquisarEstoque)))
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Codigo_Pesquisar_CadastroEstoque)
                    .addComponent(jTextField_Produto_PesquisarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Produto_Pesquisar_CadastroEstoque)
                    .addComponent(jTextField_Codigo_PesquisarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Codigo_Pesquisar_CadastroEstoque1)
                    .addComponent(jTextField_Codigo_fixo_PesquisarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Limpar_PesquisarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Pesquisar_PesquisarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Sair_PesquisarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 43, Short.MAX_VALUE))
        );

        setBounds(224, 57, 1101, 662);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Sair_PesquisarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sair_PesquisarEstoqueActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_Sair_PesquisarEstoqueActionPerformed

    private void jButton_Pesquisar_PesquisarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Pesquisar_PesquisarEstoqueActionPerformed
        pesquisarProduto();
    }//GEN-LAST:event_jButton_Pesquisar_PesquisarEstoqueActionPerformed

    private void jTextField_Codigo_PesquisarEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Codigo_PesquisarEstoqueKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField_Produto_PesquisarEstoque.requestFocus();
        }
    }//GEN-LAST:event_jTextField_Codigo_PesquisarEstoqueKeyPressed

    private void jButton_Limpar_PesquisarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Limpar_PesquisarEstoqueActionPerformed
        limparDados();
    }//GEN-LAST:event_jButton_Limpar_PesquisarEstoqueActionPerformed

    private void jTextField_Codigo_fixo_PesquisarEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Codigo_fixo_PesquisarEstoqueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Codigo_fixo_PesquisarEstoqueKeyPressed

    private void Tabela_PesquisarEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tabela_PesquisarEstoqueKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyCode() == KeyEvent.VK_ENTER) && retornarValor)
        {
            DefaultTableModel modelo = (DefaultTableModel) Tabela_PesquisarEstoque.getModel();
            int idRecuperado = (int)modelo.getValueAt(Tabela_PesquisarEstoque.getSelectedRow(), 0);
            
            for (Produto p : produtos)
            {
                if(p.getId_produto() == idRecuperado)
                {
                    Produto.Clonar(p, this.produtoReferencia);
                }
            }
            
            this.dispose();
        }
    }//GEN-LAST:event_Tabela_PesquisarEstoqueKeyPressed

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
            java.util.logging.Logger.getLogger(PesquisarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela_PesquisarEstoque;
    private javax.swing.JButton jButton_Limpar_PesquisarEstoque;
    private javax.swing.JButton jButton_Pesquisar_PesquisarEstoque;
    private javax.swing.JButton jButton_Sair_PesquisarEstoque;
    private javax.swing.JLabel jLabel_Codigo_Pesquisar_CadastroEstoque;
    private javax.swing.JLabel jLabel_Codigo_Pesquisar_CadastroEstoque1;
    private javax.swing.JLabel jLabel_Produto_Pesquisar_CadastroEstoque;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_Codigo_PesquisarEstoque;
    private javax.swing.JTextField jTextField_Codigo_fixo_PesquisarEstoque;
    private javax.swing.JTextField jTextField_Produto_PesquisarEstoque;
    // End of variables declaration//GEN-END:variables
}

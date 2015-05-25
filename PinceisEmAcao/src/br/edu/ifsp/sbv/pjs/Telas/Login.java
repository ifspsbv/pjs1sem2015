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
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPassword_Senha_Login = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Usuario_Login = new javax.swing.JTextField();
        jButton_Login_Login = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLayeredPane1.setEnabled(false);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPassword_Senha_Login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPassword_Senha_Login.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPassword_Senha_Login.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jPassword_Senha_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPassword_Senha_LoginKeyPressed(evt);
            }
        });
        jLayeredPane1.add(jPassword_Senha_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 170, 35));

        jLabel3.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Senha");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 80, -1));

        jTextField_Usuario_Login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Usuario_Login.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField_Usuario_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Usuario_LoginActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField_Usuario_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 170, 35));

        jButton_Login_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/key-16.png"))); // NOI18N
        jButton_Login_Login.setText("Login");
        jButton_Login_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Login_LoginMouseClicked(evt);
            }
        });
        jButton_Login_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Login_LoginActionPerformed(evt);
            }
        });
        jButton_Login_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_Login_LoginKeyPressed(evt);
            }
        });
        jLayeredPane1.add(jButton_Login_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 100, 30));

        jLabel4.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Usuário");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 70, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/fundo com logo login.png"))); // NOI18N
        jLabel2.setAutoscrolls(true);
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Usuario_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Usuario_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Usuario_LoginActionPerformed

    private void jButton_Login_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Login_LoginActionPerformed


    }//GEN-LAST:event_jButton_Login_LoginActionPerformed

    private void jButton_Login_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_Login_LoginKeyPressed

    }//GEN-LAST:event_jButton_Login_LoginKeyPressed

    private void jPassword_Senha_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassword_Senha_LoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextField_Usuario_Login.getText().equals("usuario") && (jPassword_Senha_Login.getText().equals("1234"))) {
//JOptionPane.showMessageDialog(null,"Acesso Permitido ");
                new MenuPrincipal().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Acesso negado");
            }
    }//GEN-LAST:event_jPassword_Senha_LoginKeyPressed
    }
    private void jButton_Login_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Login_LoginMouseClicked
       {
            if (jTextField_Usuario_Login.getText().equals("usuario") && (jPassword_Senha_Login.getText().equals("1234"))) {
//JOptionPane.showMessageDialog(null,"Acesso Permitido ");
                new MenuPrincipal().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Acesso negado");
            }
    }  
    }//GEN-LAST:event_jButton_Login_LoginMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jButton_Login_Login;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPasswordField jPassword_Senha_Login;
    private javax.swing.JTextField jTextField_Usuario_Login;
    // End of variables declaration//GEN-END:variables
}

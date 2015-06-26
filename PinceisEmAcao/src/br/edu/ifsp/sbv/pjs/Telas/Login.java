package br.edu.ifsp.sbv.pjs.Telas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import br.edu.ifsp.sbv.pjs.Controle.LoginBD;
import br.edu.ifsp.sbv.pjs.Controle.UsuarioBD;
//import java.util.ArrayList;
//import java.util.List;

public class Login extends javax.swing.JFrame {

   // private Login login;
    private LoginBD bdL = new LoginBD();

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
        jPassword_Senha_Login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPassword_Senha_Login.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jPassword_Senha_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassword_Senha_LoginActionPerformed(evt);
            }
        });
        jPassword_Senha_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPassword_Senha_LoginKeyPressed(evt);
            }
        });
        jLayeredPane1.add(jPassword_Senha_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 170, 35));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Senha");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextField_Usuario_Login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Usuario_Login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_Usuario_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Usuario_LoginActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField_Usuario_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 170, 35));

        jButton_Login_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/sbv/pjs/Imagens/key-16.png"))); // NOI18N
        jButton_Login_Login.setText("Login");
        jButton_Login_Login.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_Login_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Login_LoginActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton_Login_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 100, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Usuário");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

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

    private void jButton_Login_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Login_LoginActionPerformed
        logar();

    }//GEN-LAST:event_jButton_Login_LoginActionPerformed

    private void logar() {
        bdL = new LoginBD();
        br.edu.ifsp.sbv.pjs.Modelo.Login login = new br.edu.ifsp.sbv.pjs.Modelo.Login();
        login = bdL.autenticarUsuario(jTextField_Usuario_Login.getText(), jPassword_Senha_Login.getText());
        if (login != null) {
            new MenuPrincipal().setVisible(true);
            UsuarioBD usuarioBD = new UsuarioBD();            
            MenuPrincipal.usuarioLogado = usuarioBD.pesquisarLogin(login.getId_login());
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado");
            jTextField_Usuario_Login.setText("");
            jPassword_Senha_Login.setText("");
            jTextField_Usuario_Login.requestFocus(true);
        }

    }

    private void jPassword_Senha_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassword_Senha_LoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            logar();
        }
    }//GEN-LAST:event_jPassword_Senha_LoginKeyPressed

    private void jPassword_Senha_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassword_Senha_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassword_Senha_LoginActionPerformed

    private void jTextField_Usuario_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Usuario_LoginActionPerformed
      
    }//GEN-LAST:event_jTextField_Usuario_LoginActionPerformed

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

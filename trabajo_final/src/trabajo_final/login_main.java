package trabajo_final;

import java.beans.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francisco PC
 */
public class login_main extends javax.swing.JFrame {

    /**
     * Creates new form login_main
     */
    public login_main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nickname_login = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        btn_registrar_user = new javax.swing.JButton();
        btn_acceder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contraseña_login = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(38, 158, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jLabel2.setText("NickName");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        nickname_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nickname_loginActionPerformed(evt);
            }
        });
        jPanel1.add(nickname_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 126, -1));

        jLabel3.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 126, 30));

        btn_registrar_user.setText("Registrate");
        btn_registrar_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_userActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 126, 33));

        btn_acceder.setText("Accede");
        btn_acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_accederActionPerformed(evt);
            }
        });
        jPanel1.add(btn_acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 262, 126, 33));

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel1.setText("Suplidora FranSupl");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
        jPanel1.add(contraseña_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nickname_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nickname_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nickname_loginActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_registrar_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_userActionPerformed
        registro_usuario_login ru = new registro_usuario_login();
        ru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_registrar_userActionPerformed

    private void btn_accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_accederActionPerformed

        if (nickname_login.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Te falta llenar esto, Si no tienes usuario create uno aqui abajo");

            if (contraseña_login.getText().isEmpty()) {

            }

        } else {
            Pantalla_principal op = new Pantalla_principal();
            op.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btn_accederActionPerformed

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
            java.util.logging.Logger.getLogger(login_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acceder;
    private javax.swing.JButton btn_registrar_user;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPasswordField contraseña_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nickname_login;
    // End of variables declaration//GEN-END:variables
}
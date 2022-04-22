package trabajo_final;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco PC
 */
public class pantalla_usuarios extends javax.swing.JFrame {

    Trabajo_final conectar = new Trabajo_final();
    Connection con = conectar.conexionf();

    public pantalla_usuarios() {
        initComponents();
        setLocationRelativeTo(null);
        mostrar();
    }

    public void mostrar() {
        DefaultTableModel tusuarios = new DefaultTableModel();
        tusuarios.addColumn("idusuarios");
        tusuarios.addColumn("nickusuarios");
        tusuarios.addColumn("nombreusuarios");
        tusuarios.addColumn("apellidousuarios");
        tusuarios.addColumn("telefonousuariosc");
        tusuarios.addColumn("emailusuarios");
        tusuarios.addColumn("passwordusuarios");

        tabla_usuarios.setModel(tusuarios);

        String[] datos = new String[7];
        try {
            Statement leer = con.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM usuarios");
            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                tusuarios.addRow(datos);

            }
            tabla_usuarios.setModel(tusuarios);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error en la conexion");
        }

    }

    public void eliminar_dat() {

        try {
            int filaSelect = tabla_usuarios.getSelectedRow();

            String Sql = "delete from usuarios where idusuarios= " + tabla_usuarios.getValueAt(filaSelect, 0);

            Statement st = con.createStatement();
            int n = st.executeUpdate(Sql);

            if (n >= 0) {
                JOptionPane.showInternalMessageDialog(null, "Usuario eliminado...");
            }

        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Error al eliminar el usuario" + e.getMessage());
        }

    }

    public void actualizar_dat() {
        int filaSeleccionada = tabla_usuarios.getSelectedRow();
        String ac = (String) tabla_usuarios.getValueAt(filaSeleccionada, 0);
        String SQL = "update usuarios set idusuarios=?, nickusuarios=?, nombreusuarios=?, apellidousuarios=?, telefonousuariosc=?, emailusuarios=?, passwordusuarios=? where idusuarios=?";
        String SQLL = "update usuarios set idusuarios=?, nickusuarios=?, nombreusuarios=?, apellidousuarios=?, telefonousuariosc=?, emailusuarios=?, passwordusuarios=? where nickusuarios=?";
        String SSQL = "update usuarios set idusuarios=?, nickusuarios=?, nombreusuarios=?, apellidousuarios=?, telefonousuariosc=?, emailusuarios=?, passwordusuarios=? where nombreusuarios=?";
        String SQQL = "update usuarios set idusuarios=?, nickusuarios=?, nombreusuarios=?, apellidousuarios=?, telefonousuariosc=?, emailusuarios=?, passwordusuarios=? where apellidousuarios=?";
        String SSQQL = "update usuarios set idusuarios=?, nickusuarios=?, nombreusuarios=?, apellidousuarios=?, telefonousuariosc=?, emailusuarios=?, passwordusuarios=? where telefonousuariosc=?";
        String SSQLL = "update usuarios set idusuarios=?, nickusuarios=?, nombreusuarios=?, apellidousuarios=?, telefonousuariosc=?, emailusuarios=?, passwordusuarios=? where idusuarios=?";
        String SQQLL = "update usuarios set idusuarios=?, nickusuarios=?, nombreusuarios=?, apellidousuarios=?, telefonousuariosc=?, emailusuarios=?, passwordusuarios=? where emailusuarios=?";
        String SSQQLL = "update usuarios set idusuarios=?, nickusuarios=?, nombreusuarios=?, apellidousuarios=?, telefonousuariosc=?, emailusuarios=?, passwordusuarios=? where passwordusuarios=?";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, jTextField1.getText());
            pst.setString(2, jTextField2.getText());
            String pass = String.valueOf(jPasswordField1.getPassword());
            pst.setString(3, pass);
            pst.setString(4, jTextField4.getText());
            pst.setString(5, jTextField5.getText());
            pst.setString(6, jTextField6.getText());
            pst.setString(7, jTextField7.getText());

            pst.setString(8, ac);
            int n = pst.executeUpdate();
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Usuario Actualizado");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR"+e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        btn_agregarU_pantalla_usuarios = new javax.swing.JButton();
        btn_eliminarU_pantalla_usuarios = new javax.swing.JButton();
        btn_editarU_pantalla_usuarios = new javax.swing.JButton();
        btn_volver_pantalla_usuarios = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla_usuarios.setBackground(new java.awt.Color(38, 158, 226));
        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NickName", "Nombre", "Apellidos", "Correo", "Telefono", "Contraseña"
            }
        ));
        tabla_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_usuarios);

        btn_agregarU_pantalla_usuarios.setText("Agregar usuario");
        btn_agregarU_pantalla_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarU_pantalla_usuariosActionPerformed(evt);
            }
        });

        btn_eliminarU_pantalla_usuarios.setText("Eliminar usuario");
        btn_eliminarU_pantalla_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarU_pantalla_usuariosActionPerformed(evt);
            }
        });

        btn_editarU_pantalla_usuarios.setText("Editar usuario");
        btn_editarU_pantalla_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarU_pantalla_usuariosActionPerformed(evt);
            }
        });

        btn_volver_pantalla_usuarios.setText("Volver atras");
        btn_volver_pantalla_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volver_pantalla_usuariosActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel9.setText("Telefono:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel8.setText("Correo Electronico: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel7.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel10.setText("Nombre de Usuario:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel2.setText("ID de Usuario:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/recargar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btn_agregarU_pantalla_usuarios)
                        .addGap(56, 56, 56)
                        .addComponent(btn_eliminarU_pantalla_usuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(btn_editarU_pantalla_usuarios)
                        .addGap(57, 57, 57)
                        .addComponent(btn_volver_pantalla_usuarios)
                        .addGap(99, 99, 99)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_eliminarU_pantalla_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregarU_pantalla_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editarU_pantalla_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_volver_pantalla_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarU_pantalla_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarU_pantalla_usuariosActionPerformed
        registro_usuarios ru = new registro_usuarios();
        ru.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_agregarU_pantalla_usuariosActionPerformed


    private void btn_volver_pantalla_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver_pantalla_usuariosActionPerformed
        Pantalla_principal pp = new Pantalla_principal();
        pp.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btn_volver_pantalla_usuariosActionPerformed

    private void btn_editarU_pantalla_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarU_pantalla_usuariosActionPerformed
        actualizar_dat();
        
    }//GEN-LAST:event_btn_editarU_pantalla_usuariosActionPerformed

    private void btn_eliminarU_pantalla_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarU_pantalla_usuariosActionPerformed
        eliminar_dat();
    }//GEN-LAST:event_btn_eliminarU_pantalla_usuariosActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void tabla_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuariosMouseClicked
        int filaseleccionada = tabla_usuarios.rowAtPoint(evt.getPoint());
        jTextField1.setText(tabla_usuarios.getValueAt(filaseleccionada, 0).toString());
        jTextField2.setText(tabla_usuarios.getValueAt(filaseleccionada, 1).toString());
        jPasswordField1.setText(tabla_usuarios.getValueAt(filaseleccionada, 2).toString());
        jTextField4.setText(tabla_usuarios.getValueAt(filaseleccionada, 3).toString());
        jTextField5.setText(tabla_usuarios.getValueAt(filaseleccionada, 4).toString());
        jTextField6.setText(tabla_usuarios.getValueAt(filaseleccionada, 5).toString());
        jTextField7.setText(tabla_usuarios.getValueAt(filaseleccionada, 6).toString());


    }//GEN-LAST:event_tabla_usuariosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
mostrar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pantalla_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarU_pantalla_usuarios;
    private javax.swing.JButton btn_editarU_pantalla_usuarios;
    private javax.swing.JButton btn_eliminarU_pantalla_usuarios;
    private javax.swing.JButton btn_volver_pantalla_usuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tabla_usuarios;
    // End of variables declaration//GEN-END:variables
}

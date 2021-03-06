
package trabajo_final;
import java.sql. *;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco PC
 */
public class panatalla_almacen extends javax.swing.JFrame {
    Trabajo_final conectar = new Trabajo_final();
    Connection con = conectar.conexionf();

  
    public panatalla_almacen() {
        initComponents();
        setLocationRelativeTo(null);
        mostrar();
    }
      public void mostrar(){
        DefaultTableModel talmacen = new DefaultTableModel();
        talmacen.addColumn("id_Producto");
        talmacen.addColumn("nombreproductos");
        talmacen.addColumn("marcaproductos");
        talmacen.addColumn("categoriaproductos");
        talmacen.addColumn("precioproductos");
        talmacen.addColumn("cantidadproductos");
       
        tabla_almacen.setModel(talmacen);
        
        String []datos = new String[6];
          try {
              Statement leer = con.createStatement();
              ResultSet resultado = leer.executeQuery("SELECT * FROM productos");
              while(resultado.next()){
              datos[0] = resultado.getString(1);
              datos[1] = resultado.getString(2);
              datos[2] = resultado.getString(3);
              datos[3] = resultado.getString(4);
              datos[4] = resultado.getString(5);
              datos[5] = resultado.getString(6);
              talmacen.addRow(datos);
              
              }
              tabla_almacen.setModel(talmacen);
              
          } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e + "Error en la conexion");
          }
    
    
    
    }
      public void eliminar_dat(){
       

          try {
              int filaSelect = tabla_almacen.getSelectedRow();
              
              String Sql= "delete from productos where idproductos= "+tabla_almacen.getValueAt(filaSelect, 0);
              
              Statement st = con.createStatement();
              int n= st.executeUpdate(Sql);
              
              if(n >=0){
              JOptionPane.showInternalMessageDialog(null, "Producto eliminado..." );
              }
              
          } catch (Exception e) {
              JOptionPane.showInternalMessageDialog(null, "Error al eliminar el producto" + e.getMessage() );
          }
      
      
      }
      public void actualizar_dat() {
        int filaSeleccionada = tabla_almacen.getSelectedRow();
        String ac = (String) tabla_almacen.getValueAt(filaSeleccionada, 0);
        String SQL = "update productos set idproductos=?, nombreproductos=?, marcaproductos=?, categoriaproductos=?, precioproductos=?, cantidadproductos=? where idproductos=?";
        String SSQL = "update productos set idproductos=?, nombreproductos=?, marcaproductos=?, categoriaproductos=?, precioproductos=?, cantidadproductos=? where nombreproductos=?";
        String SQQL = "update productos set idproductos=?, nombreproductos=?, marcaproductos=?, categoriaproductos=?, precioproductos=?, cantidadproductos=? where marcaproductos=?";
        String SQLL = "update productos set idproductos=?, nombreproductos=?, marcaproductos=?, categoriaproductos=?, precioproductos=?, cantidadproductos=? where categoriaproductos=?";
        String SSQQL = "update productos set idproductos=?, nombreproductos=?, marcaproductos=?, categoriaproductos=?, precioproductos=?, cantidadproductos=? where precioproductos=?";
        String SSQQLL = "update productos set idproductos=?, nombreproductos=?, marcaproductos=?, categoriaproductos=?, precioproductos=?, cantidadproductos=? where cantidadproductos=?";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, jTextField6.getText());
            pst.setString(2, jTextField1.getText());
            pst.setString(3, jTextField2.getText());
            pst.setString(4, jTextField3.getText());
            pst.setString(5, jTextField4.getText());
            pst.setString(6, jTextField5.getText());
           

            pst.setString(7, ac);
            int n = pst.executeUpdate();
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Producto Actualizado");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR"+e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_almacen = new javax.swing.JTable();
        btn_agregarP_pantalla_almacen = new javax.swing.JButton();
        btn_eliminarP_pantalla_almacen = new javax.swing.JButton();
        btn_editarP_pantalla_almacen = new javax.swing.JButton();
        btn_volver_pantalla_almacen = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(38, 158, 226));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabla_almacen.setBackground(new java.awt.Color(38, 158, 226));
        tabla_almacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Producto", "Marca", "Categoria", "Precio", "Cantidad"
            }
        ));
        tabla_almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_almacenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_almacen);

        btn_agregarP_pantalla_almacen.setText("Agregar Producto");
        btn_agregarP_pantalla_almacen.setMaximumSize(new java.awt.Dimension(114, 22));
        btn_agregarP_pantalla_almacen.setMinimumSize(new java.awt.Dimension(114, 22));
        btn_agregarP_pantalla_almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarP_pantalla_almacenActionPerformed(evt);
            }
        });

        btn_eliminarP_pantalla_almacen.setText("Eliminar Producto");
        btn_eliminarP_pantalla_almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarP_pantalla_almacenActionPerformed(evt);
            }
        });

        btn_editarP_pantalla_almacen.setText("Editar Producto");
        btn_editarP_pantalla_almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarP_pantalla_almacenActionPerformed(evt);
            }
        });

        btn_volver_pantalla_almacen.setText("Volver atras");
        btn_volver_pantalla_almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volver_pantalla_almacenActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/recargar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel8.setText("ID");

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel2.setText("Marca");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel3.setText("Categoria");

        jTextField4.setText("$");

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel5.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel6.setText("Cantidad Disponible");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_agregarP_pantalla_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn_eliminarP_pantalla_almacen)
                        .addGap(27, 27, 27)
                        .addComponent(btn_editarP_pantalla_almacen)
                        .addGap(29, 29, 29)
                        .addComponent(btn_volver_pantalla_almacen))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                        .addGap(23, 23, 23)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_agregarP_pantalla_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminarP_pantalla_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editarP_pantalla_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_volver_pantalla_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volver_pantalla_almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver_pantalla_almacenActionPerformed
 Pantalla_principal pp = new Pantalla_principal();
       pp.setVisible(true);
       this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btn_volver_pantalla_almacenActionPerformed

    private void btn_agregarP_pantalla_almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarP_pantalla_almacenActionPerformed
        registro_producto rp = new registro_producto();
        rp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_agregarP_pantalla_almacenActionPerformed

    private void btn_eliminarP_pantalla_almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarP_pantalla_almacenActionPerformed
eliminar_dat();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarP_pantalla_almacenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabla_almacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_almacenMouseClicked
      int filaseleccionada = tabla_almacen.rowAtPoint(evt.getPoint());
        jTextField6.setText(tabla_almacen.getValueAt(filaseleccionada, 0).toString());
        jTextField1.setText(tabla_almacen.getValueAt(filaseleccionada, 1).toString());
        jTextField2.setText(tabla_almacen.getValueAt(filaseleccionada, 2).toString());
        jTextField3.setText(tabla_almacen.getValueAt(filaseleccionada, 3).toString());
        jTextField4.setText(tabla_almacen.getValueAt(filaseleccionada, 4).toString());
        jTextField5.setText(tabla_almacen.getValueAt(filaseleccionada, 5).toString());
         // TODO add your handling code here:
    }//GEN-LAST:event_tabla_almacenMouseClicked

    private void btn_editarP_pantalla_almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarP_pantalla_almacenActionPerformed
actualizar_dat();        
    }//GEN-LAST:event_btn_editarP_pantalla_almacenActionPerformed

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
            java.util.logging.Logger.getLogger(panatalla_almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panatalla_almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panatalla_almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panatalla_almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panatalla_almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarP_pantalla_almacen;
    private javax.swing.JButton btn_editarP_pantalla_almacen;
    private javax.swing.JButton btn_eliminarP_pantalla_almacen;
    private javax.swing.JButton btn_volver_pantalla_almacen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tabla_almacen;
    // End of variables declaration//GEN-END:variables
}

package trabajo_final;

public class Pantalla_principal extends javax.swing.JFrame {

    public Pantalla_principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_usuarios_principal = new javax.swing.JButton();
        btn_almacen_principal = new javax.swing.JButton();
        btn_Salir_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(38, 158, 226));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_usuarios_principal.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btn_usuarios_principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/paquetes.png"))); // NOI18N
        btn_usuarios_principal.setText("Almacen");
        btn_usuarios_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuarios_principalActionPerformed(evt);
            }
        });

        btn_almacen_principal.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btn_almacen_principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario (3).png"))); // NOI18N
        btn_almacen_principal.setText("Usuarios");
        btn_almacen_principal.setMaximumSize(new java.awt.Dimension(5, 5));
        btn_almacen_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_almacen_principalActionPerformed(evt);
            }
        });

        btn_Salir_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar-sesion (1).png"))); // NOI18N
        btn_Salir_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir_loginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel1.setText("Suplidora FranSupl");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Salir_login, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btn_almacen_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(btn_usuarios_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_usuarios_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_almacen_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(btn_Salir_login, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Salir_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir_loginActionPerformed
        login_main csl = new login_main();
        csl.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btn_Salir_loginActionPerformed

    private void btn_almacen_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_almacen_principalActionPerformed
        pantalla_usuarios ver = new pantalla_usuarios();

        ver.show();

       
        this.dispose();
    }//GEN-LAST:event_btn_almacen_principalActionPerformed

    private void btn_usuarios_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarios_principalActionPerformed
        panatalla_almacen ver = new panatalla_almacen();

        ver.show();

       
        this.dispose();
    }//GEN-LAST:event_btn_usuarios_principalActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Salir_login;
    private javax.swing.JButton btn_almacen_principal;
    private javax.swing.JButton btn_usuarios_principal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

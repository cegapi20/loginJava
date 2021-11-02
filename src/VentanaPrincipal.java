
import FiveCodMover.FiveCodMoverJFrame;
import java.awt.Color;

/**
 *
 * @author dam
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Boolean bl = false;

    public VentanaPrincipal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoUser = new javax.swing.JTextField();
        textoPsswrd = new javax.swing.JLabel();
        btnLoguear = new javax.swing.JButton();
        textoUser = new javax.swing.JLabel();
        opMostrar = new javax.swing.JCheckBox();
        textoAddUser = new javax.swing.JLabel();
        textoPrincipal = new javax.swing.JLabel();
        campoPsswrd = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        labelMinimizar = new javax.swing.JLabel();
        labelCerrar = new javax.swing.JLabel();
        labelMaximizar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(750, 370));
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);
        jPanel1.add(campoUser);
        campoUser.setBounds(110, 70, 155, 24);

        textoPsswrd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textoPsswrd.setForeground(new java.awt.Color(255, 255, 255));
        textoPsswrd.setText("Contraseña: ");
        jPanel1.add(textoPsswrd);
        textoPsswrd.setBounds(20, 120, 72, 16);

        btnLoguear.setBackground(new java.awt.Color(177, 88, 245));
        btnLoguear.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLoguear.setForeground(new java.awt.Color(85, 42, 117));
        btnLoguear.setText("Loguear");
        btnLoguear.setActionCommand("");
        btnLoguear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLoguear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoguearActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoguear);
        btnLoguear.setBounds(110, 170, 155, 32);

        textoUser.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textoUser.setForeground(new java.awt.Color(255, 255, 255));
        textoUser.setText("Usuario: ");
        jPanel1.add(textoUser);
        textoUser.setBounds(40, 70, 50, 16);

        opMostrar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        opMostrar.setForeground(new java.awt.Color(255, 255, 255));
        opMostrar.setText("Mostrar");
        opMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(opMostrar);
        opMostrar.setBounds(280, 120, 69, 24);

        textoAddUser.setForeground(new java.awt.Color(255, 255, 255));
        textoAddUser.setText("Haz click para agregar un nuevo usuario");
        textoAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoAddUserMouseClicked(evt);
            }
        });
        jPanel1.add(textoAddUser);
        textoAddUser.setBounds(80, 220, 228, 16);

        textoPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        textoPrincipal.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        textoPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        textoPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPrincipal.setText("Por favor, introduzca sus credenciales para acceder: ");
        textoPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(textoPrincipal);
        textoPrincipal.setBounds(20, 20, 340, 23);

        campoPsswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPsswrdActionPerformed(evt);
            }
        });
        jPanel1.add(campoPsswrd);
        campoPsswrd.setBounds(110, 120, 155, 22);

        jPanel3.setBackground(new java.awt.Color(140, 70, 194));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(null);

        labelMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        labelMinimizar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        labelMinimizar.setForeground(new java.awt.Color(92, 52, 107));
        labelMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimizar.setText("-");
        labelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMinimizarMouseClicked(evt);
            }
        });
        jPanel3.add(labelMinimizar);
        labelMinimizar.setBounds(280, 0, 30, 20);

        labelCerrar.setBackground(new java.awt.Color(255, 255, 255));
        labelCerrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCerrar.setForeground(new java.awt.Color(92, 52, 107));
        labelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCerrar.setText("X");
        labelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(labelCerrar);
        labelCerrar.setBounds(350, 0, 30, 30);

        labelMaximizar.setBackground(new java.awt.Color(255, 255, 255));
        labelMaximizar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        labelMaximizar.setForeground(new java.awt.Color(92, 52, 107));
        labelMaximizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMaximizar.setText("❒");
        labelMaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMaximizarMouseClicked(evt);
            }
        });
        jPanel3.add(labelMaximizar);
        labelMaximizar.setBounds(310, 0, 40, 30);

        jPanel2.setBackground(new java.awt.Color(140, 70, 194));
        jPanel2.setPreferredSize(new java.awt.Dimension(30, 14));
        jPanel2.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(92, 52, 107));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fichero");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 60, 30);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(0, 0, 60, 30);

        jPanel4.setBackground(new java.awt.Color(140, 70, 194));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(92, 52, 107));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Color");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, 0, 50, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(60, 0, 50, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoguearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoguearActionPerformed
        // TODO add your handling code here:
        String usuario = campoUser.getText();
        String contraseña = String.valueOf(campoPsswrd.getPassword());
        if (Metodos.verificarUsuario(usuario, contraseña)) {
            this.dispose();
            new VentanaLogueado(campoUser.getText()).setVisible(true);
        } else {
            new VentanaDialogo("El usuario no está logueado").setVisible(true);
            campoUser.setText("");
            campoPsswrd.setText("");

        }
    }//GEN-LAST:event_btnLoguearActionPerformed

    private void textoAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoAddUserMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new VentanaAñadirUsuario().setVisible(true);
    }//GEN-LAST:event_textoAddUserMouseClicked

    private void opMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMostrarActionPerformed
        // TODO add your handling code here:
        if (opMostrar.isSelected()) {
            campoPsswrd.setEchoChar((char) 0);
        } else {
            campoPsswrd.setEchoChar('*');
        }
    }//GEN-LAST:event_opMostrarActionPerformed

    private void campoPsswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPsswrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPsswrdActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        /* x = evt.getX();
        y = evt.getY();*/
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
        
    }//GEN-LAST:event_jPanel3MouseDragged

    private void labelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_labelCerrarMouseClicked

    private void labelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_labelMinimizarMouseClicked

    private void labelMaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMaximizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }//GEN-LAST:event_labelMaximizarMouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        if (!bl) {
            this.jLabel2.setForeground(Color.decode("#5C346B"));
            this.jPanel2.setBackground(Color.decode("#8C46C2"));

        }
    
        
        
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
       
        if(!bl){
            this.jLabel2.setForeground(Color.WHITE);
            this.jPanel2.setBackground(Color.decode("#333333")); 
        }
        
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        bl=!bl;

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel4MouseClicked

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        if (!bl) {
            this.jLabel1.setForeground(Color.decode("#5C346B"));
            this.jPanel4.setBackground(Color.decode("#8C46C2"));
        }
        
        //this.jPanel1.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        this.jLabel1.setForeground(Color.WHITE);
        this.jPanel4.setBackground(Color.decode("#333333"));
        //this.jPanel1.setVisible(false);

    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        bl = true;
    }//GEN-LAST:event_jLabel1MouseClicked


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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        MetodosBD.conectar();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoguear;
    private javax.swing.JPasswordField campoPsswrd;
    private javax.swing.JTextField campoUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelMaximizar;
    private javax.swing.JLabel labelMinimizar;
    private javax.swing.JCheckBox opMostrar;
    private javax.swing.JLabel textoAddUser;
    private javax.swing.JLabel textoPrincipal;
    private javax.swing.JLabel textoPsswrd;
    private javax.swing.JLabel textoUser;
    // End of variables declaration//GEN-END:variables
}

import FiveCodMover.FiveCodMoverJFrame;
import java.awt.event.WindowEvent;

/**
 *
 * @author dam
 */
public class VentanaLogueado extends javax.swing.JFrame {
    
    String nomUsuario;

    /**
     * Creates new form ventanaLogeado
     */
    public VentanaLogueado(String nomUsuario) {
        this.nomUsuario = nomUsuario;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaCambContraseña = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        cpNContraseña = new javax.swing.JPasswordField();
        textoContraseña = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JCheckBox();
        textoConfContraseña = new javax.swing.JLabel();
        cpConfNContraseña = new javax.swing.JPasswordField();
        btnCambContraseña = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelMinimizar1 = new javax.swing.JLabel();
        labelCerrar1 = new javax.swing.JLabel();
        labelMaximizar1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textoBienvenido = new javax.swing.JLabel();
        textoUser = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnCContraseña = new javax.swing.JButton();
        iconoUser = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelMinimizar = new javax.swing.JLabel();
        labelMaximizar = new javax.swing.JLabel();
        labelCerrar = new javax.swing.JLabel();

        ventanaCambContraseña.setLocation(new java.awt.Point(750, 370));
        ventanaCambContraseña.setUndecorated(true);
        ventanaCambContraseña.setSize(new java.awt.Dimension(380, 261));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(null);
        jPanel3.add(cpNContraseña);
        cpNContraseña.setBounds(88, 47, 230, 22);

        textoContraseña.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textoContraseña.setForeground(new java.awt.Color(255, 255, 255));
        textoContraseña.setText("Introduce la nueva contraseña:");
        jPanel3.add(textoContraseña);
        textoContraseña.setBounds(63, 19, 193, 16);

        btnMostrar.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnMostrar);
        btnMostrar.setBounds(88, 139, 72, 24);

        textoConfContraseña.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textoConfContraseña.setForeground(new java.awt.Color(255, 255, 255));
        textoConfContraseña.setText("Confirma la nueva contraseña:");
        jPanel3.add(textoConfContraseña);
        textoConfContraseña.setBounds(63, 83, 173, 16);
        jPanel3.add(cpConfNContraseña);
        cpConfNContraseña.setBounds(88, 111, 230, 22);

        btnCambContraseña.setBackground(new java.awt.Color(177, 88, 245));
        btnCambContraseña.setForeground(new java.awt.Color(85, 42, 117));
        btnCambContraseña.setText("Cambiar contraseña");
        btnCambContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambContraseñaActionPerformed(evt);
            }
        });
        jPanel3.add(btnCambContraseña);
        btnCambContraseña.setBounds(166, 175, 146, 32);

        jPanel4.setBackground(new java.awt.Color(140, 70, 194));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(null);

        labelMinimizar1.setBackground(new java.awt.Color(255, 255, 255));
        labelMinimizar1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        labelMinimizar1.setForeground(new java.awt.Color(92, 52, 107));
        labelMinimizar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimizar1.setText("-");
        labelMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMinimizar1MouseClicked(evt);
            }
        });
        jPanel4.add(labelMinimizar1);
        labelMinimizar1.setBounds(280, 0, 30, 20);

        labelCerrar1.setBackground(new java.awt.Color(255, 255, 255));
        labelCerrar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCerrar1.setForeground(new java.awt.Color(92, 52, 107));
        labelCerrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCerrar1.setText("X");
        labelCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCerrar1MouseClicked(evt);
            }
        });
        jPanel4.add(labelCerrar1);
        labelCerrar1.setBounds(350, 0, 30, 30);

        labelMaximizar1.setBackground(new java.awt.Color(255, 255, 255));
        labelMaximizar1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        labelMaximizar1.setForeground(new java.awt.Color(92, 52, 107));
        labelMaximizar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMaximizar1.setText("❒");
        labelMaximizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMaximizar1MouseClicked(evt);
            }
        });
        jPanel4.add(labelMaximizar1);
        labelMaximizar1.setBounds(310, 0, 40, 30);

        javax.swing.GroupLayout ventanaCambContraseñaLayout = new javax.swing.GroupLayout(ventanaCambContraseña.getContentPane());
        ventanaCambContraseña.getContentPane().setLayout(ventanaCambContraseñaLayout);
        ventanaCambContraseñaLayout.setHorizontalGroup(
            ventanaCambContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ventanaCambContraseñaLayout.setVerticalGroup(
            ventanaCambContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaCambContraseñaLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setLocation(new java.awt.Point(750, 370));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        textoBienvenido.setBackground(new java.awt.Color(255, 255, 255));
        textoBienvenido.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        textoBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        textoBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBienvenido.setText("Bienvenid@");
        jPanel1.add(textoBienvenido);
        textoBienvenido.setBounds(130, 10, 149, 24);

        textoUser.setBackground(new java.awt.Color(255, 255, 255));
        textoUser.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textoUser.setForeground(new java.awt.Color(255, 255, 255));
        textoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoUser.setText("El usuario " + nomUsuario + " está logueado.");
        jPanel1.add(textoUser);
        textoUser.setBounds(80, 150, 250, 16);

        btnCerrarSesion.setBackground(new java.awt.Color(177, 88, 245));
        btnCerrarSesion.setForeground(new java.awt.Color(85, 42, 117));
        btnCerrarSesion.setText("Cerrar sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion);
        btnCerrarSesion.setBounds(20, 220, 383, 32);

        btnCContraseña.setBackground(new java.awt.Color(177, 88, 245));
        btnCContraseña.setForeground(new java.awt.Color(85, 42, 117));
        btnCContraseña.setText("Cambiar Contraseña");
        btnCContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCContraseña);
        btnCContraseña.setBounds(20, 180, 383, 32);

        iconoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoUser.setIcon(new javax.swing.ImageIcon("E:\\Hannah\\ProyectosZayas\\Desarrollo de Interfaces\\imagen_login2.png")); // NOI18N
        iconoUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(iconoUser);
        iconoUser.setBounds(140, 30, 127, 96);

        jPanel2.setBackground(new java.awt.Color(140, 70, 194));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(null);

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
        jPanel2.add(labelMinimizar);
        labelMinimizar.setBounds(330, 0, 30, 20);

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
        jPanel2.add(labelMaximizar);
        labelMaximizar.setBounds(360, 0, 40, 30);

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
        jPanel2.add(labelCerrar);
        labelCerrar.setBounds(400, 0, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new VentanaPrincipal().setVisible(true);
        
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnCContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCContraseñaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ventanaCambContraseña.setVisible(true);
        
    }//GEN-LAST:event_btnCContraseñaActionPerformed

    private void btnCambContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambContraseñaActionPerformed
        // TODO add your handling code here:
        String contraseña = String.valueOf(cpNContraseña.getPassword());
        String confContraseña = String.valueOf(cpConfNContraseña.getPassword());
        if(Metodos.agregarNuevaContraseña(nomUsuario, contraseña, confContraseña)){
            ventanaCambContraseña.dispose();
            new VentanaDialogo("La contraseña se cambio correctamente").setVisible(true);
        }else{
            new VentanaDialogo("La contraseña introducida en ambos campos no son iguales").setVisible(true);
            //javax.swing.JOptionPane.showMessageDialog(this, "La contraseña introducida en ambos campos no son iguales");
            cpNContraseña.setText("");
            cpConfNContraseña.setText("");
        }
        
    }//GEN-LAST:event_btnCambContraseñaActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        if (btnMostrar.isSelected()) {
            cpNContraseña.setEchoChar((char) 0);
            cpConfNContraseña.setEchoChar((char) 0);
        } else {
            cpNContraseña.setEchoChar('*');
            cpConfNContraseña.setEchoChar('*');
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void labelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_labelMinimizarMouseClicked

    private void labelMaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMaximizarMouseClicked
        // TODO add your handling code here:

        this.setExtendedState(this.MAXIMIZED_BOTH);
    }//GEN-LAST:event_labelMaximizarMouseClicked

    private void labelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_labelCerrarMouseClicked

    private void labelMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizar1MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_labelMinimizar1MouseClicked

    private void labelCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrar1MouseClicked
        // TODO add your handling code here:
        this.ventanaCambContraseña.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_labelCerrar1MouseClicked

    private void labelMaximizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMaximizar1MouseClicked
        // TODO add your handling code here:

        this.setExtendedState(this.MAXIMIZED_BOTH);
    }//GEN-LAST:event_labelMaximizar1MouseClicked

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        // TODO add your handling code here:
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        /* x = evt.getX();
        y = evt.getY();*/
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_jPanel4MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCContraseña;
    private javax.swing.JButton btnCambContraseña;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JCheckBox btnMostrar;
    private javax.swing.JPasswordField cpConfNContraseña;
    private javax.swing.JPasswordField cpNContraseña;
    private javax.swing.JLabel iconoUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelCerrar1;
    private javax.swing.JLabel labelMaximizar;
    private javax.swing.JLabel labelMaximizar1;
    private javax.swing.JLabel labelMinimizar;
    private javax.swing.JLabel labelMinimizar1;
    private javax.swing.JLabel textoBienvenido;
    private javax.swing.JLabel textoConfContraseña;
    private javax.swing.JLabel textoContraseña;
    private javax.swing.JLabel textoUser;
    private javax.swing.JFrame ventanaCambContraseña;
    // End of variables declaration//GEN-END:variables
}


import FiveCodMover.FiveCodMoverJFrame;
import java.sql.Date;
import java.util.logging.Logger;

/**
 *
 * @author dam
 */
public class VentanaAñadirUsuario extends javax.swing.JFrame {

    public VentanaAñadirUsuario() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cpApellidos = new javax.swing.JTextField();
        cpFecha = new com.toedter.calendar.JDateChooser();
        textoUsuario = new javax.swing.JLabel();
        cpConfContraseña = new javax.swing.JPasswordField();
        textoDatosOp = new javax.swing.JLabel();
        cpNombre = new javax.swing.JTextField();
        cpCorreo = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        cpUsuario = new javax.swing.JTextField();
        textoContraseña = new javax.swing.JLabel();
        textoCorreo = new javax.swing.JLabel();
        textoApellidos = new javax.swing.JLabel();
        textoPrincipal = new javax.swing.JLabel();
        textoConfContraseña = new javax.swing.JLabel();
        textoFecha = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        cpContraseña = new javax.swing.JPasswordField();
        textoNombre = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelMinimizar = new javax.swing.JLabel();
        labelMaximizar = new javax.swing.JLabel();
        labelCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(750, 300));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(402, 504));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        cpFecha.setBackground(new java.awt.Color(51, 51, 51));
        cpFecha.setForeground(new java.awt.Color(0, 0, 0));

        textoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        textoUsuario.setText("Usuario");

        textoDatosOp.setForeground(new java.awt.Color(255, 255, 255));
        textoDatosOp.setText("Agregar datos opcionales del nuevo usuario:");

        btnVolver.setBackground(new java.awt.Color(177, 88, 245));
        btnVolver.setForeground(new java.awt.Color(85, 42, 117));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        textoContraseña.setForeground(new java.awt.Color(255, 255, 255));
        textoContraseña.setText("Contraseña");

        textoCorreo.setForeground(new java.awt.Color(255, 255, 255));
        textoCorreo.setText("Correo");

        textoApellidos.setForeground(new java.awt.Color(255, 255, 255));
        textoApellidos.setText("Apellidos");

        textoPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        textoPrincipal.setText("Por favor, intruduzca la información del nuevo usuario:");
        textoPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoConfContraseña.setForeground(new java.awt.Color(255, 255, 255));
        textoConfContraseña.setText("Confirmar contraseña");

        textoFecha.setForeground(new java.awt.Color(255, 255, 255));
        textoFecha.setText("Fecha nacimiento");

        btnAgregar.setBackground(new java.awt.Color(177, 88, 245));
        btnAgregar.setForeground(new java.awt.Color(85, 42, 117));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        textoNombre.setForeground(new java.awt.Color(255, 255, 255));
        textoNombre.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoConfContraseña)
                    .addComponent(textoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoFecha)
                            .addComponent(textoDatosOp)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoContraseña)
                            .addComponent(textoUsuario))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(cpContraseña)
                            .addComponent(cpConfContraseña)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoNombre)
                                    .addComponent(textoApellidos)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(textoCorreo)))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(cpNombre)
                            .addComponent(cpApellidos)
                            .addComponent(cpCorreo))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(textoPrincipal)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoUsuario)
                    .addComponent(cpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoContraseña)
                    .addComponent(cpContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoConfContraseña)
                    .addComponent(cpConfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(textoDatosOp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNombre)
                    .addComponent(cpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoApellidos)
                    .addComponent(cpApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(textoFecha))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(cpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCorreo)
                    .addComponent(cpCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnVolver))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 31, 410, 480);

        jPanel3.setBackground(new java.awt.Color(140, 70, 194));
        jPanel3.setPreferredSize(new java.awt.Dimension(380, 30));
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
        labelMinimizar.setBounds(300, 0, 30, 20);

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
        labelMaximizar.setBounds(330, 0, 40, 30);

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
        labelCerrar.setBounds(370, 0, 30, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 410, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static final Logger LOG = Logger.getLogger(VentanaAñadirUsuario.class.getName());

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String usuario = cpUsuario.getText();
        String contraseña = String.valueOf(cpContraseña.getPassword());
        String confContraseña = String.valueOf(cpConfContraseña.getPassword());
        String nombre = cpNombre.getText();

        if (MetodosBD.buscarUsuario(usuario) > 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "El usuario introducido ya está en uso");
        } else {
            if (!nombre.isEmpty()) {
                String apellidos = cpApellidos.getText();
                java.sql.Date fecha = new java.sql.Date(cpFecha.getDate().getTime());
                String correo = cpCorreo.getText();

                if (Metodos.agregarDatos(usuario, contraseña, confContraseña, nombre, apellidos, fecha, correo)) {
                    new VentanaDialogo("Los datos se insertaron correctamente").setVisible(true);
                    cpUsuario.setText("");
                    cpContraseña.setText("");
                    cpConfContraseña.setText("");
                    cpNombre.setText("");
                    cpApellidos.setText("");
                    cpFecha.setDate(null);
                    cpCorreo.setText("");
                    
                    
                } else {
                    new VentanaDialogo("Los datos introduciods no son validos").setVisible(true);
                    
                }

            } else {
                if (Metodos.agregarDatos(usuario, contraseña, confContraseña)) {
                    new VentanaDialogo("Los datos se insertaron correctamente").setVisible(true);
                } else {
                    new VentanaDialogo("Los datos introduciods no son validos").setVisible(true);
                }
                cpUsuario.setText("");
                cpContraseña.setText("");
                cpConfContraseña.setText("");
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new VentanaPrincipal().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_jPanel3MouseDragged

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

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField cpApellidos;
    private javax.swing.JPasswordField cpConfContraseña;
    private javax.swing.JPasswordField cpContraseña;
    private javax.swing.JTextField cpCorreo;
    private com.toedter.calendar.JDateChooser cpFecha;
    private javax.swing.JTextField cpNombre;
    private javax.swing.JTextField cpUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelMaximizar;
    private javax.swing.JLabel labelMinimizar;
    private javax.swing.JLabel textoApellidos;
    private javax.swing.JLabel textoConfContraseña;
    private javax.swing.JLabel textoContraseña;
    private javax.swing.JLabel textoCorreo;
    private javax.swing.JLabel textoDatosOp;
    private javax.swing.JLabel textoFecha;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoPrincipal;
    private javax.swing.JLabel textoUsuario;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package alurahotel;

import alurahotel.logica.Conexion;
import alurahotel.logica.Editor;
import alurahotel.logica.Salida;
import alurahotel.logica.Validacion;


/**
 *
 * @author bjimenez
 */
public class Login extends javax.swing.JFrame {
    
     private Conexion conexion = new Conexion();
     private Editor editor;
     private Validacion validacion;
     private Salida salida;
     
     
    public Login() {
        initComponents();
        conexion.estableceConexion();
        
        this.setLocationRelativeTo(null);
        txtUsuario.setFocusable(true);
        
        salida = new Salida();
        
        validacion = new Validacion();
        
        editor = new Editor();
        
        editor.ajustarImagen(fondo, "src\\alurahotel\\imagenes\\backgroundLogin.jpg");
        editor.ajustarImagen(cuadro, "src\\alurahotel\\imagenes\\cuadroLogin.jpg");
        editor.ajustarImagen(perfil, "src\\alurahotel\\imagenes\\perfil.png");
        editor.ajustarImagen(salir, "src\\alurahotel\\imagenes\\salida.png");
        editor.ajustarImagen(regresa, "src\\alurahotel\\imagenes\\atras.png");
        
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
        jPanel2 = new javax.swing.JPanel();
        perfil = new javax.swing.JLabel();
        cuadro = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        salirBtn = new javax.swing.JButton();
        regresa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        iniciarBtn = new javax.swing.JButton();
        txtContra = new javax.swing.JPasswordField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 80, 60));
        jPanel2.add(cuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 110));

        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 60, 40));

        salirBtn.setBackground(new java.awt.Color(250, 250, 250));
        salirBtn.setBorder(null);
        salirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        jPanel2.add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 60, 40));

        regresa.setBackground(new java.awt.Color(250, 250, 250));
        regresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresaMouseClicked(evt);
            }
        });
        jPanel2.add(regresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 60, 40));

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jLabel1.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel1.setText("Contraseña");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, -1));

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel2.setText("Usuario");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, -1));

        txtUsuario.setBackground(new java.awt.Color(153, 153, 153));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUsuario.setCaretColor(new java.awt.Color(51, 51, 51));
        txtUsuario.setDisabledTextColor(new java.awt.Color(250, 250, 250));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 300, -1));

        iniciarBtn.setBackground(new java.awt.Color(255, 106, 24));
        iniciarBtn.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        iniciarBtn.setForeground(new java.awt.Color(255, 255, 255));
        iniciarBtn.setText("INICIAR");
        iniciarBtn.setBorder(null);
        iniciarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(iniciarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 100, 30));

        txtContra.setBackground(new java.awt.Color(153, 153, 153));
        txtContra.setForeground(new java.awt.Color(255, 255, 255));
        txtContra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtContra.setCaretColor(new java.awt.Color(51, 51, 51));
        jPanel2.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 300, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 340, 360));
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        
        salida.Mensaje(this);
        
    }//GEN-LAST:event_salirBtnActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void iniciarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBtnActionPerformed
        validacion.iniciar(txtUsuario, txtContra, this);
    }//GEN-LAST:event_iniciarBtnActionPerformed

    private void regresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresaMouseClicked
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresaMouseClicked

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cuadro;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton iniciarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel perfil;
    private javax.swing.JLabel regresa;
    private javax.swing.JLabel salir;
    private javax.swing.JButton salirBtn;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

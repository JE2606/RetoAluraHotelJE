/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package alurahotel;

import alurahotel.logica.Conexion;
import alurahotel.logica.Editor;
import alurahotel.logica.Salida;



/**
 *
 * @author bjimenez
 */
public class Inicio extends javax.swing.JFrame {

    
    private Editor editor;
    private Salida salida;
    
    public Inicio() {
        initComponents();
        
        
        this.setLocationRelativeTo(null);
        
        salida = new Salida();
        editor = new Editor();
        
        editor.ajustarImagen(fondo, "src\\alurahotel\\imagenes\\principal.jpg");
        editor.ajustarImagen(logo, "src\\alurahotel\\imagenes\\iconoPrincipal.png");
        editor.ajustarImagen(salir, "src\\alurahotel\\imagenes\\salida.png");
        editor.ajustarImagen(login, "src\\alurahotel\\imagenes\\login.png");
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
        fondo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        salirBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 440));
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 140, 130));

        titulo.setBackground(new java.awt.Color(250, 250, 250));
        titulo.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 102, 102));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("ALURA HOTEL");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 180, 20));

        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 60, 50));

        salirBtn.setBackground(new java.awt.Color(250, 250, 250));
        salirBtn.setBorder(null);
        salirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        jPanel1.add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 60, 50));

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 30, 150));

        login.setBackground(new java.awt.Color(0, 168, 177));
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 245, 60, 50));

        loginBtn.setBackground(new java.awt.Color(255, 106, 24));
        loginBtn.setBorder(null);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 90, 80));

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inicio de Sesión");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 313, 90, -1));

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

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        
       salida.InicioSalida(this);
    
    }//GEN-LAST:event_salirBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_loginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel salir;
    private javax.swing.JButton salirBtn;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

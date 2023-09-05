
package alurahotel;

import alurahotel.logica.EditarTabla;
import alurahotel.logica.Editor;
import alurahotel.logica.Eliminar;
import alurahotel.logica.PanelesPersonalizados;
import alurahotel.logica.Salida;
import alurahotel.logica.TablaRegistro;
import alurahotel.logica.TablaReserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author bjimenez
 */
public class Busqueda extends javax.swing.JFrame {
    
    private Salida salida;
    private Editor editor;
    private TablaRegistro tablaRegistro = new TablaRegistro();
    private TablaReserva tablaReserva = new TablaReserva();
    private EditarTabla editarTabla = new EditarTabla();
    private Eliminar eliminar = new Eliminar();
    private String vista = "Reserva"; 
    
    public Busqueda() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        tablaReserva.LLenadoTabla(tabla);
        
        salida = new Salida();
        editor = new Editor();
        
        
        editor.ajustarImagen(fondo, "src\\alurahotel\\imagenes\\Menu.jpg");
        editor.ajustarImagen(salir, "src\\alurahotel\\imagenes\\salida.png");
        editor.ajustarImagen(regresa, "src\\alurahotel\\imagenes\\atras.png");
        editor.ajustarImagen(titular, "src\\alurahotel\\imagenes\\buscar.png");
        editor.ajustarImagen(buscarLbl, "src\\alurahotel\\imagenes\\lupa.png");
        editor.ajustarImagen(reservaImg, "src\\alurahotel\\imagenes\\campana.png");
        editor.ajustarImagen(registroImg, "src\\alurahotel\\imagenes\\huesped.png");
        editor.ajustarImagen(eliminaBtn, "src\\alurahotel\\imagenes\\borrar.png");
        
        
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
        salir = new javax.swing.JLabel();
        salirBtn = new javax.swing.JButton();
        regresa = new javax.swing.JLabel();
        titular = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buscarLbl = new javax.swing.JLabel();
        buscarTxt = new javax.swing.JTextField();
        buscarbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        reservaImg = new javax.swing.JLabel();
        reservaBtn = new javax.swing.JButton();
        registroImg = new javax.swing.JLabel();
        registroBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        eliminaBtn = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 60, 40));

        salirBtn.setBackground(new java.awt.Color(250, 250, 250));
        salirBtn.setBorder(null);
        salirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        jPanel2.add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 60, 40));

        regresa.setBackground(new java.awt.Color(250, 250, 250));
        regresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresaMouseClicked(evt);
            }
        });
        jPanel2.add(regresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 60, 40));

        titular.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.add(titular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 70));

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Busqueda");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        buscarLbl.setBackground(new java.awt.Color(250, 250, 250));
        buscarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(buscarLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 30, 30));

        buscarTxt.setBackground(new java.awt.Color(153, 153, 153));
        buscarTxt.setForeground(new java.awt.Color(255, 255, 255));
        buscarTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarTxt.setCaretColor(new java.awt.Color(51, 51, 51));
        buscarTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        buscarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTxtActionPerformed(evt);
            }
        });
        buscarTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarTxtKeyTyped(evt);
            }
        });
        jPanel2.add(buscarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 150, 20));

        buscarbtn.setText("jButton3");
        buscarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarbtnMouseClicked(evt);
            }
        });
        buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(buscarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 30, -1));

        tabla.setBackground(new java.awt.Color(250, 250, 250));
        tabla.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabla.setForeground(new java.awt.Color(51, 51, 51));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 550, 160));

        reservaImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reservaImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservaImgMouseClicked(evt);
            }
        });
        jPanel2.add(reservaImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 85, 30, 20));

        reservaBtn.setBackground(new java.awt.Color(102, 102, 102));
        reservaBtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        reservaBtn.setForeground(new java.awt.Color(255, 255, 255));
        reservaBtn.setText("Reserva");
        reservaBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reservaBtn.setBorderPainted(false);
        reservaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reservaBtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        reservaBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reservaBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        reservaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservaBtnActionPerformed(evt);
            }
        });
        jPanel2.add(reservaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 130, 30));

        registroImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registroImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroImgMouseClicked(evt);
            }
        });
        jPanel2.add(registroImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 85, 30, 20));

        registroBtn.setBackground(new java.awt.Color(102, 102, 102));
        registroBtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registroBtn.setForeground(new java.awt.Color(255, 255, 255));
        registroBtn.setText("Registro");
        registroBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registroBtn.setBorderPainted(false);
        registroBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registroBtn.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        registroBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroBtnActionPerformed(evt);
            }
        });
        jPanel2.add(registroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 130, 30));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(250, 250, 250));
        jButton1.setText("Guardar Cambios");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 285, 140, -1));

        eliminaBtn.setBackground(new java.awt.Color(250, 250, 250));
        eliminaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminaBtnMouseClicked(evt);
            }
        });
        jPanel2.add(eliminaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 40, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 580, 330));
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 460));

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
        salida.Mensaje(this);
    }//GEN-LAST:event_salirBtnActionPerformed

    private void regresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresaMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresaMouseClicked

    private void reservaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservaBtnActionPerformed
        tablaReserva.LLenadoTabla(tabla);
        vista = "Reserva";
    }//GEN-LAST:event_reservaBtnActionPerformed

    private void registroImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroImgMouseClicked
       tablaRegistro.PropiedadesTabla(tabla);
        vista = "Registro";
    }//GEN-LAST:event_registroImgMouseClicked

    private void registroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroBtnActionPerformed
        tablaRegistro.PropiedadesTabla(tabla);
        vista = "Registro";

    }//GEN-LAST:event_registroBtnActionPerformed

    private void reservaImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservaImgMouseClicked
        tablaReserva.LLenadoTabla(tabla);
        vista = "Reserva";
    }//GEN-LAST:event_reservaImgMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
        List<String> botones = Arrays.asList("Si","No");
            PanelesPersonalizados optionPane = new PanelesPersonalizados(
                "¿Estas seguro que deseas guardar lo editado? ",
                "¡Un campo esta siendo editado!",
                botones,
                "/alurahotel/imagenes/confundido.png",
                60,
                60
            );
            int resultado = optionPane.Mostrar();
            
            if (resultado == 0){
                
                if (vista.equals("Reserva")) {
                    
                    editarTabla.actualizarReserva(tabla);
                    
                }else if (vista.equals("Registro")) {
                
                    editarTabla.actualizarRegistro(tabla);
                }
                
            List<String> boton = Arrays.asList("¡Entendido!");
            PanelesPersonalizados panel = new PanelesPersonalizados(
                "El campo editado ha sido guardado con exito.",
                "¡Campo guardado!",
                boton,
                "/alurahotel/imagenes/guardado.png",
                60,
                60
                );
                
                panel.Mostrar();
                
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eliminaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminaBtnMouseClicked
         
        
        if(tabla.getSelectedRowCount() != 1){
             return;
         }
        List<String> botones = Arrays.asList("Si", "No");
            PanelesPersonalizados panel = new PanelesPersonalizados(
                "¿Estas seguro que deseas eliminar la fila seleccionada?",
                "Eliminar fila",
                botones,
                "/alurahotel/imagenes/confundido.png",
                60,
                60
                );
                
               int resultado = panel.Mostrar();
               if(resultado == 0){
                   //DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                   //int fila = tabla.getSelectedRow();
                   //modelo.removeRow(fila);
                   
                   eliminar.BorrarFila(tabla);
                    List<String> boton = Arrays.asList("¡Entendido!");
                    PanelesPersonalizados panelP = new PanelesPersonalizados(
                    "La fila ha sido eliminada con exito.",
                    "Fila Eliminada",
                    boton,
                    "/alurahotel/imagenes/borrar.png",
                    60,
                    60
                );
                    panelP.Mostrar();
                
               }
                     
    }//GEN-LAST:event_eliminaBtnMouseClicked

    
    private void buscarTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarTxtKeyTyped

    }//GEN-LAST:event_buscarTxtKeyTyped

    private void buscarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarbtnMouseClicked

    private void buscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbtnActionPerformed
        buscarbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String criterio = buscarTxt.getText();
                
                if (vista.equals("Reserva")){
                    tablaReserva.buscarReserva(tabla, criterio);
                
                }else if (vista.equals("Registro")){
                
                    tablaRegistro.buscarRegistros(tabla, criterio);
                }   
            }
        });
    }//GEN-LAST:event_buscarbtnActionPerformed

    private void buscarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarTxtActionPerformed

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
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarLbl;
    private javax.swing.JTextField buscarTxt;
    private javax.swing.JButton buscarbtn;
    private javax.swing.JLabel eliminaBtn;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registroBtn;
    private javax.swing.JLabel registroImg;
    private javax.swing.JLabel regresa;
    private javax.swing.JButton reservaBtn;
    private javax.swing.JLabel reservaImg;
    private javax.swing.JLabel salir;
    private javax.swing.JButton salirBtn;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titular;
    // End of variables declaration//GEN-END:variables

}
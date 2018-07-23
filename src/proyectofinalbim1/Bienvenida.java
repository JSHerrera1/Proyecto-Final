/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalbim1;

/**
 *
 * @author Usuario
 */
public class Bienvenida extends javax.swing.JFrame {

    /**
     * Creates new form Bienvenida
     */
    int x, y ;
    public Bienvenida() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenidos = new javax.swing.JLabel();
        btnCalifica = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        lblCalificar = new javax.swing.JLabel();
        lblTrans = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnDatos = new javax.swing.JButton();
        lblImagen2 = new javax.swing.JLabel();
        lblFondi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE REGISTRO\n");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBienvenidos.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblBienvenidos.setForeground(new java.awt.Color(0, 0, 0));
        lblBienvenidos.setText("Bienvenidos");
        getContentPane().add(lblBienvenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 300, 74));

        btnCalifica.setBackground(new java.awt.Color(255, 0, 0));
        btnCalifica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalifica.setForeground(new java.awt.Color(0, 0, 0));
        btnCalifica.setText("CALIFICAR");
        btnCalifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 120, 50));

        btnRegistrarse.setBackground(new java.awt.Color(0, 255, 0));
        btnRegistrarse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarse.setText("REGISTRAR");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 353, 140, 50));

        lblCalificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/calificar.png"))); // NOI18N
        getContentPane().add(lblCalificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 250, 230));

        lblTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/logoaat.png"))); // NOI18N
        getContentPane().add(lblTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Al sistema de registro y calificacion de servicio de transporte Publico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/btn_cerrar2.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 40, 40));

        btnDatos.setBackground(new java.awt.Color(255, 255, 0));
        btnDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDatos.setForeground(new java.awt.Color(0, 0, 0));
        btnDatos.setText("DATOS REGISTRADOS");
        btnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosActionPerformed(evt);
            }
        });
        getContentPane().add(btnDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 200, 50));

        lblImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ElaboracionFichasDatosSeguridad.png"))); // NOI18N
        getContentPane().add(lblImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 240, 240));

        lblFondi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.png"))); // NOI18N
        lblFondi.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblFondiMouseDragged(evt);
            }
        });
        lblFondi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblFondiMousePressed(evt);
            }
        });
        getContentPane().add(lblFondi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
           this.setVisible(false);
           /// Instancia del onjeto
           Registro_CodigoQR rc= new Registro_CodigoQR();
           rc.setVisible(true);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnCalificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificaActionPerformed
        // TODO add your handling code here:
           this.setVisible(false);
           LectorCodigo lc = new  LectorCodigo();
           lc.setVisible(true);
    }//GEN-LAST:event_btnCalificaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void lblFondiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondiMousePressed
        // TODO add your handling code here:
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_lblFondiMousePressed

    private void lblFondiMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondiMouseDragged
        // TODO add your handling code here:
        int posx = evt.getXOnScreen()-x;
        int posy=evt.getYOnScreen()-y;
        this.setLocation(posx, posy);
    }//GEN-LAST:event_lblFondiMouseDragged

    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
        // TODO add your handling code here:
        InicioSesion login = new InicioSesion();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btnDatosActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalifica;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDatos;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBienvenidos;
    private javax.swing.JLabel lblCalificar;
    private javax.swing.JLabel lblFondi;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblTrans;
    // End of variables declaration//GEN-END:variables
}
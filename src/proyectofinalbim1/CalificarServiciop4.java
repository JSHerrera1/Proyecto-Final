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
public class CalificarServiciop4 extends javax.swing.JFrame {

    /**
     * Creates new form CalificarServiciop4
     */
    public static String n4;
    public static String resp3 = "";
    public CalificarServiciop4() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnSiguiente.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Opciones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrBtn1 = new javax.swing.JRadioButton();
        jrBtn2 = new javax.swing.JRadioButton();
        btnSiguiente = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pregunta Nro 4");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 24, 118, 24));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Volveria usar este sevicio   con este chofer o conductor :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 66, 450, 23));

        Opciones.add(jrBtn1);
        jrBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrBtn1.setText("SI");
        jrBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(jrBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 122, -1, -1));

        Opciones.add(jrBtn2);
        jrBtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrBtn2.setText("NO");
        jrBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(jrBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        btnSiguiente.setBackground(new java.awt.Color(255, 0, 0));
        btnSiguiente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 327, 120, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
         
      
        this.setVisible(false);
        CalificarServiciop5 cs5 = new CalificarServiciop5();
        cs5.setVisible(true);
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void jrBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBtn1ActionPerformed
        // TODO add your handling code here:
        resp3 = "SI";   
           n4="8";
           btnSiguiente.setEnabled(true);
    }//GEN-LAST:event_jrBtn1ActionPerformed

    private void jrBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBtn2ActionPerformed
        // TODO add your handling code here:
        resp3 = "SI";   
           n4="8";
           btnSiguiente.setEnabled(true);
    }//GEN-LAST:event_jrBtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(CalificarServiciop4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalificarServiciop4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalificarServiciop4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalificarServiciop4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalificarServiciop4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Opciones;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jrBtn1;
    private javax.swing.JRadioButton jrBtn2;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}

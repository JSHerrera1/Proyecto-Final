/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalbim1;



public class CalificarServicio extends javax.swing.JFrame {
public  static String n1;
    /**
     * Creates new form CalificarServicio
     */
    public static String n;
    public static String resp=" ";
    public CalificarServicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnSiguiente.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opciones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rBtn1 = new javax.swing.JRadioButton();
        rBtn2 = new javax.swing.JRadioButton();
        rBtn3 = new javax.swing.JRadioButton();
        rBtn4 = new javax.swing.JRadioButton();
        btnSiguiente = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CALIFICAR SERVICIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 160, 36));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("El servicio ofrecido  le parecio");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 47));

        opciones.add(rBtn1);
        rBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rBtn1.setText("Muy Bueno");
        rBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(rBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        opciones.add(rBtn2);
        rBtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rBtn2.setText("Bueno");
        rBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(rBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 79, -1));

        opciones.add(rBtn3);
        rBtn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rBtn3.setText("Regular");
        rBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(rBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 79, -1));

        opciones.add(rBtn4);
        rBtn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rBtn4.setText("Malo");
        rBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(rBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 80, -1));

        btnSiguiente.setBackground(new java.awt.Color(255, 0, 0));
        btnSiguiente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 120, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
  
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
       
     

        this.setVisible(false);
        CalificarSeviiciop2  cs2 = new CalificarSeviiciop2();
        cs2.setVisible(true);
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void rBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtn1ActionPerformed
        // TODO add your handling code here:
           resp = "Muy Bueno";   
           n="4";
           btnSiguiente.setEnabled(true);
      
             
    }//GEN-LAST:event_rBtn1ActionPerformed

    private void rBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtn2ActionPerformed
        // TODO add your handling code here:
         if (rBtn2.getModel().isSelected()){
          resp = "Bueno";
          n="3";
          btnSiguiente.setEnabled(true);
      }
    }//GEN-LAST:event_rBtn2ActionPerformed

    private void rBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtn3ActionPerformed
        // TODO add your handling code here:
        resp = "Regular";
          n="2";
          btnSiguiente.setEnabled(true);
    }//GEN-LAST:event_rBtn3ActionPerformed

    private void rBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtn4ActionPerformed
        // TODO add your handling code here:
        resp = "Regular";
          n="2";
          btnSiguiente.setEnabled(true);
    }//GEN-LAST:event_rBtn4ActionPerformed

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
            java.util.logging.Logger.getLogger(CalificarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalificarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalificarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalificarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalificarServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.ButtonGroup opciones;
    private javax.swing.JRadioButton rBtn1;
    private javax.swing.JRadioButton rBtn2;
    private javax.swing.JRadioButton rBtn3;
    private javax.swing.JRadioButton rBtn4;
    // End of variables declaration//GEN-END:variables
}

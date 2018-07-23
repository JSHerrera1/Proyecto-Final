package proyectofinalbim1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class DatosRegistrados extends javax.swing.JFrame {

    Registro_CodigoQR rc = new Registro_CodigoQR();
    File contenedor = new File(rc.ubicacion);
    File[] registro = contenedor.listFiles();
    String[] titulo = {"Placa", "Nombre", "Apellido", "ID", "Tipo de Vehiculo", "Cooperativa", "Total","Promedio", "Numero de Personsas"};
    DefaultTableModel dtm = new DefaultTableModel(null, titulo);
    TableRowSorter trs = null;

    private void RegTabla() {
        
        for (int i = 0; i < registro.length; i++) {
            File url = new File(rc.ubicacion + registro[i].getName());
            try {
                FileInputStream fis = new FileInputStream(url);
                Properties mostrar = new Properties();
                  
                mostrar.load(fis);
              
                String filas[] = {registro[i].getName().replace(".txt", ""),
                    mostrar.getProperty("Nombre"), mostrar.getProperty("Apellido"), mostrar.getProperty("ID"), mostrar.getProperty("Tipo"), 
                    mostrar.getProperty("Cooperativa"), mostrar.getProperty("Total"),mostrar.getProperty("Promedio") ,mostrar.getProperty("NroPersonas")

                };
                dtm.addRow(filas);
            } catch (Exception e) {
            }
        }
        jTable1.setModel(dtm);
    }

    private void ActualizarTabla() {
        registro = contenedor.listFiles();
        dtm.setRowCount(0);
        RegTabla();
    }

    public void Editar() {
        Registro_CodigoQR rcqr = new Registro_CodigoQR();
        File url = new File(rcqr.ubicacion + txtPlaca.getText() + ".txt");
        if (txtPlaca.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Indique el registro a editar");
        } else {
            if (url.exists()) {
                try {
                    FileWriter permite_escrito = new FileWriter(rcqr.ubicacion + txtPlaca.getText() + ".txt");
                    String id = "ID=";
                    String name = "Nombre=";
                    String ape = "Apellido=";
                    String placa = "Placa=";
                    String tipo = "Tipo=";
                    String cop = "Cooperativa=";

                    PrintWriter guardar = new PrintWriter(permite_escrito);
                    guardar.println(id + txtID.getText());
                    guardar.println(name + txtNombre.getText());
                    guardar.println(ape + txtApellido.getText());
                    guardar.println(placa + txtPlaca.getText());
                    guardar.println(tipo + txtTipo.getText());
                    guardar.print(cop + txtCopertaiva.getText());

                    permite_escrito.close();
                    JOptionPane.showMessageDialog(rootPane, "Registro editado correctamente");
                    ActualizarTabla();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "ERROR" + e);
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "El registro no esxite");
            }

        }
    }

    public DatosRegistrados() {
        initComponents();
        this.setLocationRelativeTo(null);
        RegTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtTipo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtCopertaiva = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblPlca = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 720, 380));
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 190, 30));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 190, 30));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 190, 30));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 190, 30));
        getContentPane().add(txtCopertaiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 190, 30));
        getContentPane().add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 190, 30));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("COOPERATIVA :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, 30));

        lblPlca.setForeground(new java.awt.Color(0, 0, 0));
        lblPlca.setText("PLACA :");
        getContentPane().add(lblPlca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, 30));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("TIPO DE VEHICULO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 30));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("APELLIDO :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 30));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRE :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 30));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ID :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 30));

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 100, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 100, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FILTRAR :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 27, -1, 30));

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });
        getContentPane().add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 400, 40));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/btn_cerrar2.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 40, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        Editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Bienvenida bn = new Bienvenida();
        bn.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selection = jTable1.rowAtPoint(evt.getPoint());
        txtPlaca.setText(String.valueOf(jTable1.getValueAt(selection, 0)));
        txtNombre.setText(String.valueOf(jTable1.getValueAt(selection, 1)));
        txtApellido.setText(String.valueOf(jTable1.getValueAt(selection, 2)));
        txtID.setText(String.valueOf(jTable1.getValueAt(selection, 3)));
        txtTipo.setText(String.valueOf(jTable1.getValueAt(selection, 4)));
        txtCopertaiva.setText(String.valueOf(jTable1.getValueAt(selection, 5)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        // TODO add your handling code here:
        txtFiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtFiltro.getText(), 1));
            }

        });
        trs = new TableRowSorter(dtm);
        jTable1.setRowSorter(trs);
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        //Cerrar Programa
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(DatosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosRegistrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblPlca;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCopertaiva;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}

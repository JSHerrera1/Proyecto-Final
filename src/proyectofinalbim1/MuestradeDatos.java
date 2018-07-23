
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalbim1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MuestradeDatos extends javax.swing.JFrame {

    int posx, posy, suma, numPers,total,promedio;
    int n1, n2, n3, n4;
    int p1, p2, p3,p4;
    Registro_CodigoQR rcqr = new Registro_CodigoQR();

    /**
     * Creates new form MuestradeDatos
     */
    private void mostar() {
        CalificarServiciop5 cs5 = new CalificarServiciop5();
        CalificarServicio cs = new CalificarServicio();
        CalificarSeviiciop2 cs2 = new CalificarSeviiciop2();
        CalificarServiciop3 cs3 = new CalificarServiciop3();
        CalificarServiciop4 cs4 = new CalificarServiciop4();
        //Con la variable publica de los jFrame creados le asignamos a nustros txt el valor de cada variable

        txtaMues.setText(cs5.comen);
        txtPreg1.setText(cs.resp);
        txtPreg2.setText(cs2.respt);
        txtPreg3.setText(cs3.respta);
        txtPreg4.setText(cs4.resp3);
        lbl4.setText(cs4.n4);
        lbl3.setText(cs3.n3);
        lbl2.setText(cs2.n2);
        lbl1.setText(cs.n);
        
        n1 = Integer.parseInt(lbl1.getText());
        n2 = Integer.parseInt(lbl2.getText());
        n3 = Integer.parseInt(lbl3.getText());
        n4 = Integer.parseInt(lbl4.getText());
        suma = n1 + n2 + n3 + n4;
        JOptionPane.showMessageDialog(null, "LA CALIFICACION DEL  SERVICIO ES DE : \n" + suma);
        File url = new File(rcqr.ubicacion + txtPlaca.getText() + ".txt");
        if (txtPlaca.getText().equals("")) {
            
        } else {
            if (url.exists()) {

                try {
                    FileInputStream fis = new FileInputStream(url);
                    Properties mostrar = new Properties();
                    mostrar.load(fis);
                   
                    txtID.setText(mostrar.getProperty("ID"));
                    txtNomb.setText(mostrar.getProperty("Nombre"));
                    txtApellido.setText(mostrar.getProperty("Apellido"));
                    txtCOOp.setText(mostrar.getProperty("Cooperativa"));
                    txtTipo.setText(mostrar.getProperty("Tipo"));
                    numPers= Integer.parseInt(mostrar.getProperty("NroPersonas"));
                    numPers= numPers+1;
                    total=Integer.parseInt(mostrar.getProperty("Total"));
                    total=total+suma;
                    suma=total;
                    promedio=suma/numPers;
                    p1=Integer.parseInt(mostrar.getProperty("Pregunta1"));
                    p1=p1+n1;
                    n1=p1;             
                    p2=Integer.parseInt(mostrar.getProperty("Pregunta2"));
                    p2=p2+n2;
                    n2=p2;   
                    p3=Integer.parseInt(mostrar.getProperty("Pregunta3"));
                    p3=p3+n3;
                    n3=p3;   
                    p4=Integer.parseInt(mostrar.getProperty("Pregunta4"));
                    p4=p4+n4;
                    n4=p4; 
                    
                    
                    
                    
                    

                } catch (Exception e) {
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Registro no exitente");
            }
        }

      
       

    }

    public void crear() {
        File url = new File(rcqr.ubicacion + txtPlaca.getText() + ".txt");

        if (txtPlaca.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "No hay id");

        } else {
            try {
                if (url.exists()) {

                    String id = "ID=";
                    String name = "Nombre=";
                    String ape = "Apellido=";
                    String placa = "Placa=";
                    String tpve="Tipo=";
                    String coop = "Cooperativa=";
                    String preg1 = "Pregunta1=";
                    String preg2 = "Pregunta2=";
                    String preg3 = "Pregunta3=";
                    String preg4 = "Pregunta4=";
                    String to = "Total=";
                    String cant = "NroPersonas=";
                    String prom= "Promedio=";
                    FileWriter permite_escrito = new FileWriter(rcqr.ubicacion + txtPlaca.getText() + ".txt");
                    PrintWriter guardar = new PrintWriter(permite_escrito);
                    guardar.println(id + txtID.getText());
                    guardar.println(name + txtNomb.getText());
                    guardar.println(ape + txtApellido.getText());
                    guardar.println(placa + txtPlaca.getText());
                    guardar.println(tpve+txtTipo.getText());
                    guardar.println(coop + txtCOOp.getText());
                    guardar.println(preg1 + n1);
                    guardar.println(preg2 + n2);
                    guardar.println(preg3 + n3);
                    guardar.println(preg4 + n4);
                    guardar.println(to + suma);
                    guardar.println(cant + numPers);
                    guardar.println(prom+promedio);
                    permite_escrito.close();
                } else {

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "NO se pudo");
            }
        }
    }

    public MuestradeDatos() {

        initComponents();
        this.setLocationRelativeTo(null);
        LectorCodigo lc = new LectorCodigo();
        txtPlaca.setText(lc.val);
        //Controlamos que los txt no puedan ser editados
        txtID.setEditable(false);
        txtNomb.setEditable(false);
        txtApellido.setEditable(false);
        txtPlaca.setEditable(false);
        txtCOOp.setEditable(false);
        txtaMues.setEditable(false);
        txtPreg1.setEditable(false);
        txtPreg2.setEditable(false);
        txtPreg3.setEditable(false);
        txtPreg4.setEditable(false);
      mostar();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID = new javax.swing.JLabel();
        lblMD = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApe = new javax.swing.JLabel();
        lblPlca = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblCoopertaiva = new javax.swing.JLabel();
        lblPreg1 = new javax.swing.JLabel();
        lblPreg2 = new javax.swing.JLabel();
        lblPreg3 = new javax.swing.JLabel();
        lblPreg4 = new javax.swing.JLabel();
        lblComentario = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNomb = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtCOOp = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtPreg1 = new javax.swing.JTextField();
        txtPreg2 = new javax.swing.JTextField();
        txtPreg3 = new javax.swing.JTextField();
        txtPreg4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaMues = new javax.swing.JTextArea();
        btnFinalizar = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(0, 0, 0));
        lblID.setText("ID :");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 75, 24));

        lblMD.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblMD.setForeground(new java.awt.Color(0, 0, 0));
        lblMD.setText("Muestra de datos");
        getContentPane().add(lblMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 433, 50));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre :");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 83, 31));

        lblApe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApe.setForeground(new java.awt.Color(0, 0, 0));
        lblApe.setText("Apellido :");
        getContentPane().add(lblApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 84, 32));

        lblPlca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlca.setForeground(new java.awt.Color(0, 0, 0));
        lblPlca.setText("Placa :");
        getContentPane().add(lblPlca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 84, 32));

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipo.setText("Tipo");
        getContentPane().add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 84, 32));

        lblCoopertaiva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCoopertaiva.setForeground(new java.awt.Color(0, 0, 0));
        lblCoopertaiva.setText("Cooperativa");
        getContentPane().add(lblCoopertaiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 100, -1));

        lblPreg1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPreg1.setForeground(new java.awt.Color(0, 0, 0));
        lblPreg1.setText("Pregunta 1 :");
        getContentPane().add(lblPreg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        lblPreg2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPreg2.setForeground(new java.awt.Color(0, 0, 0));
        lblPreg2.setText("Pregunta 2 :");
        getContentPane().add(lblPreg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        lblPreg3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPreg3.setForeground(new java.awt.Color(0, 0, 0));
        lblPreg3.setText("Pregunta 3 :");
        getContentPane().add(lblPreg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        lblPreg4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPreg4.setForeground(new java.awt.Color(0, 0, 0));
        lblPreg4.setText("Pregunta 4 :");
        getContentPane().add(lblPreg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, -1));

        lblComentario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblComentario.setForeground(new java.awt.Color(0, 0, 0));
        lblComentario.setText("Comentario");
        getContentPane().add(lblComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 760, -1, -1));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 390, 40));
        getContentPane().add(txtNomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 390, 40));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 390, 40));
        getContentPane().add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 390, 40));
        getContentPane().add(txtCOOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 390, 40));
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 390, 40));

        txtPreg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreg1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPreg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 390, 37));
        getContentPane().add(txtPreg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 400, 41));
        getContentPane().add(txtPreg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 400, 41));
        getContentPane().add(txtPreg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 650, 400, 41));

        txtaMues.setColumns(20);
        txtaMues.setRows(5);
        jScrollPane1.setViewportView(txtaMues);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 710, 400, 98));

        btnFinalizar.setBackground(new java.awt.Color(255, 0, 0));
        btnFinalizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 820, 110, 30));

        lbl1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 40, 30));

        lbl2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 40, 30));

        lbl3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, 40, 30));
        getContentPane().add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 650, 30, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.png"))); // NOI18N
        lblFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblFondoMouseDragged(evt);
            }
        });
        lblFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblFondoMousePressed(evt);
            }
        });
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPreg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreg1ActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        
        crear();
        
        System.exit(0);
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void lblFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondoMousePressed
        // TODO add your handling code here:
        posx = evt.getX();
        posy = evt.getY();
    }//GEN-LAST:event_lblFondoMousePressed

    private void lblFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondoMouseDragged
        // TODO add your handling code here:
        int xp = evt.getXOnScreen() - posx;
        int yp = evt.getYOnScreen() - posy;
        this.setLocation(xp, yp);
    }//GEN-LAST:event_lblFondoMouseDragged

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
            java.util.logging.Logger.getLogger(MuestradeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MuestradeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MuestradeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MuestradeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MuestradeDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lblApe;
    private javax.swing.JLabel lblComentario;
    private javax.swing.JLabel lblCoopertaiva;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMD;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPlca;
    private javax.swing.JLabel lblPreg1;
    private javax.swing.JLabel lblPreg2;
    private javax.swing.JLabel lblPreg3;
    private javax.swing.JLabel lblPreg4;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCOOp;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNomb;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPreg1;
    private javax.swing.JTextField txtPreg2;
    private javax.swing.JTextField txtPreg3;
    private javax.swing.JTextField txtPreg4;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextArea txtaMues;
    // End of variables declaration//GEN-END:variables
}

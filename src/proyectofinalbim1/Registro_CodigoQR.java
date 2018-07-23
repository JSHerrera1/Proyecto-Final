
package proyectofinalbim1;

import com.barcodelib.barcode.QRCode;
import java.awt.Desktop;
import java.io.File;
import java.util.Formatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author Usuario
 */
public class Registro_CodigoQR extends javax.swing.JFrame {
     public  static String barra = File.separator;
     public String ubicacion = System.getProperty("user.dir") + barra + "Registro" + barra;
    //Declaracion de variables  para definir el tamaño y la calidad de codigo qr
    int  udm = 0 , resol= 72, rot = 0;
    float mi=0.10f,md=0.10f,ms=0.100f,min=0.100f,tam=9.00f;
    
    int posx,posy;
    public Registro_CodigoQR() {
        initComponents();
        this.setLocationRelativeTo(null);
        //bloquear();
        
    }
    //Creacion de metodo  para la generacion del codigo QR
    private void generarQr (String dato){
         //Ponerle dominio al archivo generedo
        String archivo = System.getProperty("user.home")+"/codigoQR"+txtPlaca.getText()+".png";
          
        File crear_ubicacion= new File(ubicacion);
        File crea_archivo=new File(ubicacion +archivo);
    try{
        
        QRCode c= new QRCode();
        c.setData(dato);
        c.setDataMode(QRCode.MODE_BYTE);
        c.setUOM(udm);
        c.setLeftMargin(mi);
        c.setRightMargin(md);
        c.setTopMargin(ms);
        c.setBottomMargin(min);
        c.setResolution(resol);
        c.setRotate(rot);
        c.setModuleSize(tam);
       
        c.renderBarcode(archivo);
        //Para abrrir el escritorio
        Desktop d= Desktop.getDesktop();
        d.open(new File(archivo));
        
        
    }catch(Exception e){
        System.out.println("ERROR"+e);
    }
}
    private void Crear(){
          String archivo=txtPlaca.getText()+".txt";
          
        File crear_ubicacion= new File(ubicacion);
        File crea_archivo=new File(ubicacion +archivo);
        if(txtPlaca.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "No hay id");
        }else{
            try {
                if(crea_archivo.exists()){
                JOptionPane.showMessageDialog(rootPane, "Registro existente");
            }else{
                crear_ubicacion.mkdirs();
                Formatter crea= new Formatter(ubicacion+archivo);
                crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n", "ID="+txtID.getText(),"Nombre="+txtnombre.getText(),
                        "Apellido="+txtApellido.getText(), "Tipo="+cbxTipo.getSelectedItem().toString(),
                        "Cooperativa="+txtCooperativa.getText(),"Pregunta1=0","Pregunta2=0","Pregunta3=0","Pregunta4=0","NroPersonas=0","Total=0","Promedio=0");
                
                crea.close();
                JOptionPane.showMessageDialog(rootPane, "Archivo Creado");
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, " se pudo");
            }
        }
    }
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistro = new javax.swing.JLabel();
        lblsmsDatos = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblT_Vehiculo = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblCop = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtCooperativa = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        lblDatos = new javax.swing.JLabel();
        lblers = new javax.swing.JLabel();
        lblVehi = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistro.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(0, 0, 0));
        lblRegistro.setText("REGISTRO");
        getContentPane().add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 260, 80));

        lblsmsDatos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsmsDatos.setForeground(new java.awt.Color(0, 0, 0));
        lblsmsDatos.setText("DATOS DE CHOFER DEL TRANSPORTE");
        getContentPane().add(lblsmsDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 460, -1));

        lblNombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(0, 0, 0));
        lblNombres.setText("Nombres:");
        getContentPane().add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 88, 36));

        lblPlaca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(0, 0, 0));
        lblPlaca.setText("Placa:");
        getContentPane().add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 80, 40));

        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(0, 0, 0));
        lblApellido.setText("Apellidos :");
        getContentPane().add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 88, 40));

        lblT_Vehiculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblT_Vehiculo.setForeground(new java.awt.Color(0, 0, 0));
        lblT_Vehiculo.setText("Tipo de vehiculo:");
        getContentPane().add(lblT_Vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 110, 23));

        lblCedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(0, 0, 0));
        lblCedula.setText("Nro Cedula :");
        getContentPane().add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lblCop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCop.setForeground(new java.awt.Color(0, 0, 0));
        lblCop.setText("Cooperativa :");
        getContentPane().add(lblCop, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 100, 20));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 349, 40));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 349, 39));
        getContentPane().add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 349, 40));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 350, 40));
        getContentPane().add(txtCooperativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 670, 349, 40));

        cbxTipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbxTipo.setForeground(new java.awt.Color(0, 0, 0));
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taxi", "Bus", "Otros..." }));
        getContentPane().add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 349, 33));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/btn_cerrar2.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 40, 40));

        btnGenerar.setBackground(new java.awt.Color(0, 255, 0));
        btnGenerar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerar.setText("GENERAR CODIGO QR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 790, 210, 60));

        lblDatos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDatos.setForeground(new java.awt.Color(0, 0, 0));
        lblDatos.setText("\t\t\tDATOS DEL VEHICULO");
        getContentPane().add(lblDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 280, -1));

        lblers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Male-icon.png"))); // NOI18N
        getContentPane().add(lblers, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 210, 260));

        lblVehi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vehiculo.png"))); // NOI18N
        getContentPane().add(lblVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 460, 220));

        btnVolver.setBackground(new java.awt.Color(255, 255, 0));
        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setText("VOLVER INICIO");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 790, 220, 60));

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/btn_min1.png"))); // NOI18N
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 40, 40));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.png"))); // NOI18N
        lblfondo.setText("jLabel6");
        lblfondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblfondoMouseDragged(evt);
            }
        });
        lblfondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblfondoMousePressed(evt);
            }
        });
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:
        // Declaracion de variable y asignacion de los elementos de los txt
        String placa = txtPlaca.getText();
       //Generacion de codigo QR con los datos registrados
        generarQr(placa);
        Crear();
        
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        //Cerrar Programa
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Bienvenida bv= new Bienvenida();
        bv.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void lblfondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfondoMousePressed
         // TODO add your handling code here:
         posx = evt.getX(); 
         posy = evt.getY();
    }//GEN-LAST:event_lblfondoMousePressed

    private void lblfondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfondoMouseDragged
         // TODO add your handling code here:
         int xp = evt.getXOnScreen()-posx;
         int yp = evt.getYOnScreen() - posy;
         this.setLocation(xp,yp);
    }//GEN-LAST:event_lblfondoMouseDragged

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        // TODO add your handling code here:
        setExtendedState(JFrame.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_btnMinimizarActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_CodigoQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_CodigoQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_CodigoQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_CodigoQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_CodigoQR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCop;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblT_Vehiculo;
    private javax.swing.JLabel lblVehi;
    private javax.swing.JLabel lblers;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblsmsDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCooperativa;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}

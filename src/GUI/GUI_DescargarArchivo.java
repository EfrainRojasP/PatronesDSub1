/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Rojas Piña Efrain Ulises <al2172001457@azc.uam.mx>
 */
public class GUI_DescargarArchivo extends javax.swing.JFrame {

   /**
    * Creates new form GUI_DescargarArchivo
    */
   public GUI_DescargarArchivo() {
      initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      lblNombreReporte = new javax.swing.JLabel();
      btnGuardar = new javax.swing.JButton();
      btnCarpeta = new javax.swing.JButton();
      lblNomCarpeta = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jLabel1.setText("APALizer");

      lblNombreReporte.setText("dsddddddddddddddddd");

      btnGuardar.setText("Guardar");

      btnCarpeta.setText("Seleccionar Carpeta");
      btnCarpeta.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCarpetaActionPerformed(evt);
         }
      });

      lblNomCarpeta.setText("dsdsdsdsdsd");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(btnCarpeta)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                     .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lblNombreReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
               .addGroup(layout.createSequentialGroup()
                  .addGap(139, 139, 139)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(lblNomCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnGuardar))))
            .addContainerGap(152, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addGap(41, 41, 41)
            .addComponent(lblNombreReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnCarpeta)
            .addGap(18, 18, 18)
            .addComponent(lblNomCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnGuardar)
            .addContainerGap(80, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarpetaActionPerformed
      // TODO add your handling code here:
      //Creamos el objeto
      JFileChooser jFileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
      
      //Seleccionamos que solo nos muestre los direcctorios
      jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      
      int respuesta = jFileChooser.showSaveDialog(null);
      
      if(respuesta == JFileChooser.APPROVE_OPTION){
         lblNomCarpeta.setText(jFileChooser.getSelectedFile().getAbsolutePath());
      }
      
   }//GEN-LAST:event_btnCarpetaActionPerformed

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
         java.util.logging.Logger.getLogger(GUI_DescargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(GUI_DescargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(GUI_DescargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(GUI_DescargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new GUI_DescargarArchivo().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnCarpeta;
   private javax.swing.JButton btnGuardar;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel lblNomCarpeta;
   private javax.swing.JLabel lblNombreReporte;
   // End of variables declaration//GEN-END:variables
}
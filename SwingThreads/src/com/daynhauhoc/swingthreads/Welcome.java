
package com.daynhauhoc.swingthreads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoangpt
 */
public class Welcome extends javax.swing.JFrame {

  /**
   * Creates new form Welcome
   */
  public Welcome() {
    initComponents();
    
    workerCheck = new WorkerCheck(txtInfo);
    workerCheck.execute();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btnRestart = new javax.swing.JButton();
    txtInfo = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    btnRestart.setText("Restart");
    btnRestart.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRestartActionPerformed(evt);
      }
    });

    txtInfo.setText("Blablablah");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(147, 147, 147)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnRestart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(179, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(184, Short.MAX_VALUE)
        .addComponent(txtInfo)
        .addGap(31, 31, 31)
        .addComponent(btnRestart)
        .addGap(43, 43, 43))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
    btnRestart.setEnabled(false);
    btnRestart.setText("Restarting ...");
  }//GEN-LAST:event_btnRestartActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (Exception ex) {
      java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      
      public void run() {
        w = new Welcome();
        w.setVisible(true);
      }
    });
    
    //w.initThread();
  }
  
  private Thread tcv;
  private WorkerCheck workerCheck;
  private static Welcome w;
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnRestart;
  private javax.swing.JLabel txtInfo;
  // End of variables declaration//GEN-END:variables

  private void initThread() {
    try {
      tcv = new Thread(new ThreadCheck());
      tcv.start();
      tcv.join();
    } catch (InterruptedException ex) {
      Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}

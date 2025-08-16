
package parkingqueuingsystem.messagedialog;

import parkingqueuingsystem.PLATENUMBER;
import parkingqueuingsystem.Selectpark;


public class slotconfirmation extends javax.swing.JFrame {

   
    public slotconfirmation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_YES = new javax.swing.JButton();
        btn_NO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 300, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_YES.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_YES.setContentAreaFilled(false);
        btn_YES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_YESActionPerformed(evt);
            }
        });
        getContentPane().add(btn_YES, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 160, 40));

        btn_NO.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_NO.setContentAreaFilled(false);
        getContentPane().add(btn_NO, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 240, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingqueuingsystem/IMAGE_MD/slotconfirm.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_YESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_YESActionPerformed
       this.setVisible(false);
        
       Selectpark sp = new Selectpark();
       sp.setVisible(false);
       
       PLATENUMBER PN = new PLATENUMBER();
       PN.setVisible(true);
    }//GEN-LAST:event_btn_YESActionPerformed

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
            java.util.logging.Logger.getLogger(slotconfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(slotconfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(slotconfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(slotconfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slotconfirmation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_NO;
    private javax.swing.JButton btn_YES;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

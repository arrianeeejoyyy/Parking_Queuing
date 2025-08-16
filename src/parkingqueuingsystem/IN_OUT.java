
package parkingqueuingsystem;

public class IN_OUT extends javax.swing.JFrame {

    
    public IN_OUT() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        in_btn = new javax.swing.JButton();
        out_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        in_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        in_btn.setContentAreaFilled(false);
        in_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_btnActionPerformed(evt);
            }
        });
        getContentPane().add(in_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 450, 90));

        out_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        out_btn.setContentAreaFilled(false);
        out_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                out_btnActionPerformed(evt);
            }
        });
        getContentPane().add(out_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 450, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingqueuingsystem/IMAGE/IN&OUT_FNL.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void in_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_btnActionPerformed
       this.setVisible(false);
        Selectpark sc = new Selectpark();
        sc.setVisible(true);
    }//GEN-LAST:event_in_btnActionPerformed

    private void out_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_out_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_out_btnActionPerformed

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
            java.util.logging.Logger.getLogger(IN_OUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IN_OUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IN_OUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IN_OUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IN_OUT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton in_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton out_btn;
    // End of variables declaration//GEN-END:variables
}

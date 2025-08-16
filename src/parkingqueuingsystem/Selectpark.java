package parkingqueuingsystem;

import parkingqueuingsystem.messagedialog.slotconfirmation;

public class Selectpark extends javax.swing.JFrame {

    
    public Selectpark() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_R05 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_R01 = new javax.swing.JButton();
        btn_R02 = new javax.swing.JButton();
        btn_R03 = new javax.swing.JButton();
        btn_R04 = new javax.swing.JButton();
        selectpark = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_R05.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_R05.setContentAreaFilled(false);
        getContentPane().add(btn_R05, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 380, 80, 80));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 100, 20));

        btn_R01.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_R01.setContentAreaFilled(false);
        btn_R01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_R01ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_R01, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 383, 80, 80));

        btn_R02.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_R02.setContentAreaFilled(false);
        getContentPane().add(btn_R02, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 80, 80));

        btn_R03.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_R03.setContentAreaFilled(false);
        getContentPane().add(btn_R03, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 80, 80));

        btn_R04.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_R04.setContentAreaFilled(false);
        getContentPane().add(btn_R04, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 80, 80));

        selectpark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingqueuingsystem/IMAGE/IN_FNL.png"))); // NOI18N
        getContentPane().add(selectpark, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_R01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_R01ActionPerformed
       slotconfirmation scf = new slotconfirmation();
       scf.setVisible(true);
       
    }//GEN-LAST:event_btn_R01ActionPerformed

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
            java.util.logging.Logger.getLogger(Selectpark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selectpark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selectpark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selectpark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selectpark().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_R01;
    private javax.swing.JButton btn_R02;
    private javax.swing.JButton btn_R03;
    private javax.swing.JButton btn_R04;
    private javax.swing.JButton btn_R05;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel selectpark;
    // End of variables declaration//GEN-END:variables
}

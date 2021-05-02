package GUI.CustomerGUI;


public class ConfirmationForm extends javax.swing.JDialog 
{
    boolean isCorrectPassword = true;
    
    public ConfirmationForm()
     {
         initComponents();
         setVisible(true);
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pwEnter_Password = new javax.swing.JPasswordField();
        bntConfirm = new javax.swing.JButton();
        lblVerify_password = new javax.swing.JLabel();
        bntCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmation ");
        setLocation(new java.awt.Point(580, 270));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 252, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Please enter your password to verify");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));
        jPanel1.add(pwEnter_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 99, 342, 33));

        bntConfirm.setBackground(new java.awt.Color(32, 172, 216));
        bntConfirm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bntConfirm.setForeground(new java.awt.Color(255, 255, 255));
        bntConfirm.setText("Confirm");
        jPanel1.add(bntConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        lblVerify_password.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblVerify_password.setText("Verify by password");
        jPanel1.add(lblVerify_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        bntCancel.setBackground(new java.awt.Color(32, 172, 216));
        bntCancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bntCancel.setForeground(new java.awt.Color(255, 255, 255));
        bntCancel.setText("Cancel");
        bntCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelActionPerformed(evt);
            }
        });
        jPanel1.add(bntCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bntCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancel;
    private javax.swing.JButton bntConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblVerify_password;
    private javax.swing.JPasswordField pwEnter_Password;
    // End of variables declaration//GEN-END:variables
}

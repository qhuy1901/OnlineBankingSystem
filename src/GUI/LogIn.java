package GUI;

import BUS.UserLogin_BUS;
import DTO.UserLogin_DTO;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame 
{
    UserLogin_BUS busUserLogin = new UserLogin_BUS();
    
    public LogIn() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 250, 252));
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(950, 650));

        jPanel4.setBackground(new java.awt.Color(0, 111, 219));
        jPanel4.setName("Login"); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(239, 250, 252));
        jLabel3.setText("Forget password?");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel4.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 250, 30));
        txtUsername.getAccessibleContext().setAccessibleName("txtUsername");

        jLabel7.setBackground(new java.awt.Color(239, 250, 252));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(239, 250, 252));
        jLabel7.setText("Password:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 110, 40));
        jPanel4.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 250, 30));

        btnLogin.setBackground(new java.awt.Color(239, 250, 252));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 111, 219));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel4.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 130, 40));
        btnLogin.getAccessibleContext().setAccessibleName("btnLogin");

        jLabel9.setBackground(new java.awt.Color(239, 250, 252));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(239, 250, 252));
        jLabel9.setText("Username:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 110, 40));

        jLabel10.setBackground(new java.awt.Color(239, 250, 252));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(239, 250, 252));
        jLabel10.setText("Online Baking System");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 220, 40));

        jLabel8.setBackground(new java.awt.Color(0, 111, 219));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(239, 250, 252));
        jLabel8.setText("By NK Group");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.getAccessibleContext().setAccessibleName("Login_GUI");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean isFormValid()
    {
            if(txtUsername.getText().equals("") || txtPassword.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
            else
                return true;
    }
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(isFormValid())
        {
            UserLogin_DTO dtoUserLogin = new UserLogin_DTO(txtUsername.getText(), txtPassword.getText());
            if(busUserLogin.check(dtoUserLogin))
            {
                if(busUserLogin.isAdmin(dtoUserLogin))
                {
                    Admin_GUI guiAdmin = new Admin_GUI();
                    guiAdmin.setLocationRelativeTo(null);
                }
                else
                {
                    Customer_GUI guiCustomer = new Customer_GUI();
                    guiCustomer.setLocationRelativeTo(null);
                }
                this.setVisible(false);
            }
            else
                JOptionPane.showMessageDialog(this, "Username or password is incorrect", "Incorrect details", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

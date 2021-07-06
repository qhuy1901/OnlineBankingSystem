package GUI;

import BUS.Login_BUS;
import DTO.Employee_DTO;
import DTO.Customer_DTO;
import DTO.User_Login_DTO;
import javax.swing.JOptionPane;

public class LogIn_GUI extends javax.swing.JFrame 
{
    Login_BUS busUserLogin = new Login_BUS();
    
    public LogIn_GUI() 
    {
        initComponents();
        
        /*Set giao diện*/
        setLocationRelativeTo(null); // Căn giữa màn hình 
        this.setResizable(false);
        setTitle("Login"); // Set tiêu đề
        setVisible(true); // Hiển thị giao diện
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(32, 172, 216));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("VIETCOMBANK");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 15, 230, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 172, 216));
        jLabel1.setText("Welcom to");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 370, 270));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 172, 216));
        jLabel7.setText("To keep connected with us please login ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 260, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 172, 216));
        jLabel8.setText("with your personal info");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Online Banking System");
        setBackground(new java.awt.Color(239, 250, 252));
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(950, 650));

        jPanel5.setBackground(new java.awt.Color(32, 172, 210));
        jPanel5.setName("Login"); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(239, 250, 252));
        jLabel11.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 110, 40));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 210, 10));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 210, 10));

        btnLogin.setBackground(new java.awt.Color(239, 250, 252));
        btnLogin.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(32, 172, 210));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel5.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 130, 40));
        btnLogin.getAccessibleContext().setAccessibleName("btnLogin");

        txtPassword.setBackground(new java.awt.Color(32, 172, 216));
        txtPassword.setFont(new java.awt.Font("Javanese Text", 0, 17)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(239, 250, 252));
        txtPassword.setBorder(null);
        jPanel5.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 220, 30));

        jLabel14.setBackground(new java.awt.Color(239, 250, 252));
        jLabel14.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Username:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 110, 40));

        txtUsername.setBackground(new java.awt.Color(32, 172, 216));
        txtUsername.setFont(new java.awt.Font("Javanese Text", 0, 17)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(239, 250, 252));
        txtUsername.setBorder(null);
        jPanel5.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 210, 30));

        jLabel15.setFont(new java.awt.Font("Javanese Text", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Online Banking System");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 160, 50));

        jLabel13.setFont(new java.awt.Font("Javanese Text", 1, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Login Here");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 160, 50));

        jPanel2.setBackground(new java.awt.Color(239, 250, 252));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 150));

        jLabel16.setBackground(new java.awt.Color(32, 172, 210));
        jLabel16.setFont(new java.awt.Font("Javanese Text", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(32, 172, 210));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Login_BankLogo.PNG"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 150));

        jLabel17.setBackground(new java.awt.Color(32, 172, 210));
        jLabel17.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(32, 172, 210));
        jLabel17.setText("T O G E T H E R   W E   G R O W");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 290, 30));

        jLabel18.setBackground(new java.awt.Color(32, 172, 210));
        jLabel18.setFont(new java.awt.Font("Javanese Text", 1, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(32, 172, 210));
        jLabel18.setText("Vietcombank");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 320, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Check if the user input is enough or not
        if(txtUsername.getText().equals("") || txtPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            // Get user login information
            User_Login_DTO dtoUserLogin = busUserLogin.getUserLogin(username);
            
            // Check user login information 
            if(dtoUserLogin == null) 
            {
                JOptionPane.showMessageDialog(this, "Username is incorrect.",  "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                // Check number of failed login
                if(dtoUserLogin.getNumberOfFailedLogin() >= 3) // Kiểm tra số lần nhập sai mật khẩu
                {
                    JOptionPane.showMessageDialog(this, "Your login account has been locked due to failed login more than 3 times.\n Please contact the bank for more information.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    // Check password
                    if(dtoUserLogin.getPassword().equals(password))
                    {
                        // Update last access time
                        if(busUserLogin.updateLastAccessTime(username))
                        {
                            // Identify user role
                            if(busUserLogin.checkRole(dtoUserLogin))
                            {
                                Employee_DTO dtoAdmin = busUserLogin.getAdminInfo(dtoUserLogin);
                                new AdminHome_GUI(dtoAdmin);
                            }
                            else
                            {
                                Customer_DTO dtoCustomer = busUserLogin.getCustomerInfo(dtoUserLogin);
                                new CustomerHome_GUI(dtoCustomer);
                            }
                            this.setVisible(false);
                        }
                        else
                            JOptionPane.showMessageDialog(this, "An error occurred during login.\n Cannot udpate last access time.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        // Increased number of failed login
                        if(busUserLogin.updateNumberOfFailedLogin(username)) // Tăng số lần nhập sai mật khẩu lên
                        {
                            // Calculate the number of remaining login attempts
                            int numberOfRemainingLogin = 3 - dtoUserLogin.getNumberOfFailedLogin();
                            // Show error message
                            JOptionPane.showMessageDialog(this, "Password is incorrect. Account will be locked after "+ numberOfRemainingLogin +" failed login attempts", "Incorrect details", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }  
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

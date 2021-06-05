package GUI;

import BUS.AdminHome_BUS;
import DTO.Admin_DTO;

public class AdminHome_GUI extends javax.swing.JFrame 
{
    AdminHome_BUS busAdmin = new AdminHome_BUS();
    Admin_DTO dtoAdmin = null;
    
    public AdminHome_GUI(Admin_DTO admin) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setResizable(false);
        setVisible(true);
        dtoAdmin = admin;
        lblHelloAdmin.setText("          Hello " + admin.getFirstName() + " " + admin.getLastName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground_Admin = new javax.swing.JPanel();
        pnlWelcome = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        lblHelloAdmin = new javax.swing.JLabel();
        btnAccountManagement = new javax.swing.JButton();
        btnCustomerManagement = new javax.swing.JButton();
        btnSupplierManagement = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnUserLoginManagement = new javax.swing.JButton();
        btnStatement = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Home");
        setBackground(new java.awt.Color(239, 250, 252));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground_Admin.setBackground(new java.awt.Color(239, 250, 252));
        pnlBackground_Admin.setMinimumSize(new java.awt.Dimension(1060, 650));
        pnlBackground_Admin.setPreferredSize(new java.awt.Dimension(1060, 650));
        pnlBackground_Admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlWelcome.setBackground(new java.awt.Color(32, 172, 210));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 200));
        pnlWelcome.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("to");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setFocusTraversalPolicyProvider(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 190));
        pnlWelcome.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Admin Home!");
        jLabel6.setPreferredSize(new java.awt.Dimension(250, 44));
        pnlWelcome.add(jLabel6);

        pnlBackground_Admin.add(pnlWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 310, 400));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/MenuIcon_118px.png"))); // NOI18N
        pnlBackground_Admin.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 130));

        btnLogOut.setBackground(new java.awt.Color(239, 250, 252));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(32, 172, 210));
        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        pnlBackground_Admin.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 150, 40));

        lblHelloAdmin.setBackground(new java.awt.Color(32, 172, 210));
        lblHelloAdmin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblHelloAdmin.setForeground(new java.awt.Color(239, 250, 252));
        lblHelloAdmin.setText("            Admin Portal");
        lblHelloAdmin.setOpaque(true);
        pnlBackground_Admin.add(lblHelloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 35, 1010, 80));

        btnAccountManagement.setBackground(new java.awt.Color(255, 255, 255));
        btnAccountManagement.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAccountManagement.setForeground(new java.awt.Color(32, 172, 210));
        btnAccountManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/admingui_AccountManagement.png"))); // NOI18N
        btnAccountManagement.setText("Account Management");
        btnAccountManagement.setBorder(null);
        btnAccountManagement.setBorderPainted(false);
        btnAccountManagement.setDefaultCapable(false);
        btnAccountManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccountManagement.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnAccountManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAccountManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountManagementActionPerformed(evt);
            }
        });
        pnlBackground_Admin.add(btnAccountManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 200, 190));

        btnCustomerManagement.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomerManagement.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCustomerManagement.setForeground(new java.awt.Color(32, 172, 210));
        btnCustomerManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/admingui_cusmanagement.png"))); // NOI18N
        btnCustomerManagement.setText("Customer Management");
        btnCustomerManagement.setBorder(null);
        btnCustomerManagement.setBorderPainted(false);
        btnCustomerManagement.setDefaultCapable(false);
        btnCustomerManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCustomerManagement.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnCustomerManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCustomerManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerManagementActionPerformed(evt);
            }
        });
        pnlBackground_Admin.add(btnCustomerManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 210, 190));

        btnSupplierManagement.setBackground(new java.awt.Color(255, 255, 255));
        btnSupplierManagement.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSupplierManagement.setForeground(new java.awt.Color(32, 172, 210));
        btnSupplierManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/admingui_PartnerManagement.png"))); // NOI18N
        btnSupplierManagement.setText("Supplier Management");
        btnSupplierManagement.setBorder(null);
        btnSupplierManagement.setBorderPainted(false);
        btnSupplierManagement.setDefaultCapable(false);
        btnSupplierManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSupplierManagement.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnSupplierManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSupplierManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierManagementActionPerformed(evt);
            }
        });
        pnlBackground_Admin.add(btnSupplierManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 210, 190));

        btnDeposit.setBackground(new java.awt.Color(255, 255, 255));
        btnDeposit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeposit.setForeground(new java.awt.Color(32, 172, 210));
        btnDeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/admingui_Deposit2.0.png"))); // NOI18N
        btnDeposit.setText("Deposit");
        btnDeposit.setBorder(null);
        btnDeposit.setBorderPainted(false);
        btnDeposit.setDefaultCapable(false);
        btnDeposit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeposit.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnDeposit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        pnlBackground_Admin.add(btnDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 200, 190));

        btnUserLoginManagement.setBackground(new java.awt.Color(255, 255, 255));
        btnUserLoginManagement.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUserLoginManagement.setForeground(new java.awt.Color(32, 172, 210));
        btnUserLoginManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/admingui_UserLoginManagement.png"))); // NOI18N
        btnUserLoginManagement.setText("User Login Managment");
        btnUserLoginManagement.setBorder(null);
        btnUserLoginManagement.setBorderPainted(false);
        btnUserLoginManagement.setDefaultCapable(false);
        btnUserLoginManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUserLoginManagement.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnUserLoginManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUserLoginManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserLoginManagementActionPerformed(evt);
            }
        });
        pnlBackground_Admin.add(btnUserLoginManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 200, 190));

        btnStatement.setBackground(new java.awt.Color(255, 255, 255));
        btnStatement.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnStatement.setForeground(new java.awt.Color(32, 172, 210));
        btnStatement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/admingui_Statement1.png"))); // NOI18N
        btnStatement.setText("Statement");
        btnStatement.setBorder(null);
        btnStatement.setBorderPainted(false);
        btnStatement.setDefaultCapable(false);
        btnStatement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStatement.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnStatement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatementActionPerformed(evt);
            }
        });
        pnlBackground_Admin.add(btnStatement, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 200, 190));

        getContentPane().add(pnlBackground_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        setVisible(false);
        new LogIn_GUI();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSupplierManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierManagementActionPerformed
        setVisible(false);
        new SupplierManagement_GUI(dtoAdmin);
    }//GEN-LAST:event_btnSupplierManagementActionPerformed

    private void btnAccountManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountManagementActionPerformed
        setVisible(false);
        new AccountManagement_GUI(dtoAdmin);
    }//GEN-LAST:event_btnAccountManagementActionPerformed

    private void btnCustomerManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerManagementActionPerformed
        setVisible(false);
        new CustomerManagement_GUI(dtoAdmin);
    }//GEN-LAST:event_btnCustomerManagementActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        setVisible(false);
        new Deposit_GUI(dtoAdmin);
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnUserLoginManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserLoginManagementActionPerformed
        setVisible(false);
        new UserLoginManagement_GUI(dtoAdmin);
    }//GEN-LAST:event_btnUserLoginManagementActionPerformed

    private void btnStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatementActionPerformed
        setVisible(false);
        new Statement_GUI(dtoAdmin);
    }//GEN-LAST:event_btnStatementActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccountManagement;
    private javax.swing.JButton btnCustomerManagement;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnStatement;
    private javax.swing.JButton btnSupplierManagement;
    private javax.swing.JButton btnUserLoginManagement;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblHelloAdmin;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JPanel pnlBackground_Admin;
    private javax.swing.JPanel pnlWelcome;
    // End of variables declaration//GEN-END:variables
}
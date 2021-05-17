package GUI;

import BUS.Admin_BUS;
import DTO.Admin_DTO;
import GUI.AdminGUI.AccountManagement_GUI;
import GUI.AdminGUI.CustomerManagement_GUI;
import GUI.AdminGUI.SupplierManagement_GUI;

public class AdminMenu_GUI extends javax.swing.JFrame 
{
    Admin_BUS busAdmin = new Admin_BUS();
    Admin_DTO dtoAdmin = null;
    
    public AdminMenu_GUI(Admin_DTO admin) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setVisible(true);
        dtoAdmin = admin;
        lblHelloAdmin.setText("          Hello " + admin.getFirstName() + " " + admin.getLastName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Online Banking System");
        setBackground(new java.awt.Color(239, 250, 252));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(239, 250, 252));
        pnlBackground.setMinimumSize(new java.awt.Dimension(1060, 650));
        pnlBackground.setPreferredSize(new java.awt.Dimension(1060, 650));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel6.setText("Admin Portal!");
        jLabel6.setPreferredSize(new java.awt.Dimension(250, 44));
        pnlWelcome.add(jLabel6);

        pnlBackground.add(pnlWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 330, 400));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/MenuIcon_118px.png"))); // NOI18N
        pnlBackground.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 130));

        btnLogOut.setBackground(new java.awt.Color(239, 250, 252));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(32, 172, 210));
        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        pnlBackground.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 150, 40));

        lblHelloAdmin.setBackground(new java.awt.Color(32, 172, 210));
        lblHelloAdmin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblHelloAdmin.setForeground(new java.awt.Color(239, 250, 252));
        lblHelloAdmin.setText("            Admin Portal");
        lblHelloAdmin.setOpaque(true);
        pnlBackground.add(lblHelloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 35, 1010, 80));

        btnAccountManagement.setBackground(new java.awt.Color(255, 255, 255));
        btnAccountManagement.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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
        pnlBackground.add(btnAccountManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 270, -1));

        btnCustomerManagement.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomerManagement.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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
        pnlBackground.add(btnCustomerManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 270, -1));

        btnSupplierManagement.setBackground(new java.awt.Color(255, 255, 255));
        btnSupplierManagement.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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
        pnlBackground.add(btnSupplierManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 270, -1));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSupplierManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierManagementActionPerformed
        new SupplierManagement_GUI(dtoAdmin);
        this.setVisible(false);
    }//GEN-LAST:event_btnSupplierManagementActionPerformed

    private void btnAccountManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountManagementActionPerformed
        new AccountManagement_GUI(dtoAdmin);
        this.setVisible(false);
    }//GEN-LAST:event_btnAccountManagementActionPerformed

    private void btnCustomerManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerManagementActionPerformed
        new CustomerManagement_GUI(dtoAdmin);
        this.setVisible(false);
    }//GEN-LAST:event_btnCustomerManagementActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccountManagement;
    private javax.swing.JButton btnCustomerManagement;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSupplierManagement;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblHelloAdmin;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlWelcome;
    // End of variables declaration//GEN-END:variables
}
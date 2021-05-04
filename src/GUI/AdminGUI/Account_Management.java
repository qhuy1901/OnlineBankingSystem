package GUI.AdminGUI;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Account_Management extends javax.swing.JFrame 
{
    public Account_Management() 
    {
        initComponents();
        setSize(1064,650);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        tbP_AccountManagement = new javax.swing.JTabbedPane();
        Panel_OpenAccount = new javax.swing.JPanel();
        btnHome_OpenAccount = new javax.swing.JButton();
        btnLogout_OpenAccount = new javax.swing.JButton();
        lbCustomerID_OpenAccount = new javax.swing.JLabel();
        lbAmount_OpenAccount = new javax.swing.JLabel();
        txtID_OpenAccount = new javax.swing.JTextField();
        txtAmount_OpenAccount = new javax.swing.JTextField();
        btnActivate_OpenAccount = new javax.swing.JButton();
        lbIcon_OpenAccount = new javax.swing.JLabel();
        lbOpenAccount = new javax.swing.JLabel();
        Panel_SearchAccount = new javax.swing.JPanel();
        btnLogout_SearchAccount = new javax.swing.JButton();
        btnHome_SearchAccount = new javax.swing.JButton();
        lbSearch_SearchAccount = new javax.swing.JLabel();
        txtSearch_SearchAccount = new javax.swing.JTextField();
        ScroPane_SearchAccount = new javax.swing.JScrollPane();
        tblSearch_SearchAccount = new javax.swing.JTable();
        btnShowAcc_SearchAccount = new javax.swing.JButton();
        btnLockAcc_SearchAccount = new javax.swing.JButton();
        lbIcon_SearchAccount = new javax.swing.JLabel();
        lbSearchAccount = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbP_AccountManagement.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Panel_OpenAccount.setBackground(new java.awt.Color(239, 250, 252));
        Panel_OpenAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome_OpenAccount.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_OpenAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_OpenAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome_OpenAccount.setText("Home");
        btnHome_OpenAccount.setToolTipText("");
        btnHome_OpenAccount.setBorder(null);
        btnHome_OpenAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_OpenAccount.setIconTextGap(1);
        btnHome_OpenAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_OpenAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_OpenAccountActionPerformed(evt);
            }
        });
        Panel_OpenAccount.add(btnHome_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 76, 58));

        btnLogout_OpenAccount.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout_OpenAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout_OpenAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout_OpenAccount.setText("Logout");
        btnLogout_OpenAccount.setToolTipText("");
        btnLogout_OpenAccount.setBorder(null);
        btnLogout_OpenAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout_OpenAccount.setIconTextGap(0);
        btnLogout_OpenAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout_OpenAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout_OpenAccountActionPerformed(evt);
            }
        });
        Panel_OpenAccount.add(btnLogout_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 77, 58));

        lbCustomerID_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lbCustomerID_OpenAccount.setForeground(new java.awt.Color(32, 172, 216));
        lbCustomerID_OpenAccount.setText("Customer ID: ");
        Panel_OpenAccount.add(lbCustomerID_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        lbAmount_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lbAmount_OpenAccount.setForeground(new java.awt.Color(32, 172, 216));
        lbAmount_OpenAccount.setText("Initial Amount:  ");
        Panel_OpenAccount.add(lbAmount_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        txtID_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Panel_OpenAccount.add(txtID_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 350, -1));

        txtAmount_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Panel_OpenAccount.add(txtAmount_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 350, -1));

        btnActivate_OpenAccount.setBackground(new java.awt.Color(32, 172, 216));
        btnActivate_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActivate_OpenAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnActivate_OpenAccount.setText("Activate");
        btnActivate_OpenAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivate_OpenAccountActionPerformed(evt);
            }
        });
        Panel_OpenAccount.add(btnActivate_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        lbIcon_OpenAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/AccountManagement_OpenAccount.png"))); // NOI18N
        Panel_OpenAccount.add(lbIcon_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 110));

        lbOpenAccount.setBackground(new java.awt.Color(32, 172, 216));
        lbOpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbOpenAccount.setForeground(new java.awt.Color(255, 255, 255));
        lbOpenAccount.setText("          Open Account");
        lbOpenAccount.setOpaque(true);
        lbOpenAccount.setPreferredSize(new java.awt.Dimension(34, 50));
        Panel_OpenAccount.add(lbOpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 970, 66));

        tbP_AccountManagement.addTab("Open Account", Panel_OpenAccount);

        Panel_SearchAccount.setBackground(new java.awt.Color(239, 250, 252));
        Panel_SearchAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout_SearchAccount.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout_SearchAccount.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout_SearchAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout_SearchAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout_SearchAccount.setText("Logout");
        btnLogout_SearchAccount.setToolTipText("");
        btnLogout_SearchAccount.setBorder(null);
        btnLogout_SearchAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout_SearchAccount.setIconTextGap(0);
        btnLogout_SearchAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout_SearchAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout_SearchAccountActionPerformed(evt);
            }
        });
        Panel_SearchAccount.add(btnLogout_SearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 77, 58));

        btnHome_SearchAccount.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_SearchAccount.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_SearchAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_SearchAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome_SearchAccount.setText("Home");
        btnHome_SearchAccount.setToolTipText("");
        btnHome_SearchAccount.setBorder(null);
        btnHome_SearchAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_SearchAccount.setIconTextGap(1);
        btnHome_SearchAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_SearchAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_SearchAccountActionPerformed(evt);
            }
        });
        Panel_SearchAccount.add(btnHome_SearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 76, 58));

        lbSearch_SearchAccount.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lbSearch_SearchAccount.setForeground(new java.awt.Color(32, 172, 216));
        lbSearch_SearchAccount.setText("Search: ");
        Panel_SearchAccount.add(lbSearch_SearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        txtSearch_SearchAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Panel_SearchAccount.add(txtSearch_SearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 330, -1));

        tblSearch_SearchAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ScroPane_SearchAccount.setViewportView(tblSearch_SearchAccount);

        Panel_SearchAccount.add(ScroPane_SearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 990, 310));

        btnShowAcc_SearchAccount.setBackground(new java.awt.Color(32, 172, 216));
        btnShowAcc_SearchAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnShowAcc_SearchAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnShowAcc_SearchAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/search_20px.png"))); // NOI18N
        btnShowAcc_SearchAccount.setText("Show Account");
        Panel_SearchAccount.add(btnShowAcc_SearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, -1, -1));

        btnLockAcc_SearchAccount.setBackground(new java.awt.Color(32, 172, 216));
        btnLockAcc_SearchAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLockAcc_SearchAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnLockAcc_SearchAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/AccountManagement_Lock.png"))); // NOI18N
        btnLockAcc_SearchAccount.setText("Lock Account");
        Panel_SearchAccount.add(btnLockAcc_SearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, -1, -1));

        lbIcon_SearchAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/AccountManagement_SearchAccount.png"))); // NOI18N
        Panel_SearchAccount.add(lbIcon_SearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 120));

        lbSearchAccount.setBackground(new java.awt.Color(32, 172, 216));
        lbSearchAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSearchAccount.setForeground(new java.awt.Color(255, 255, 255));
        lbSearchAccount.setText("          Search Account");
        lbSearchAccount.setOpaque(true);
        lbSearchAccount.setPreferredSize(new java.awt.Dimension(34, 50));
        Panel_SearchAccount.add(lbSearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 970, 66));

        tbP_AccountManagement.addTab("Search Account", Panel_SearchAccount);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbP_AccountManagement)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbP_AccountManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHome_OpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_OpenAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome_OpenAccountActionPerformed

    private void btnLogout_OpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout_OpenAccountActionPerformed

    }//GEN-LAST:event_btnLogout_OpenAccountActionPerformed

    private void btnActivate_OpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivate_OpenAccountActionPerformed
        // TODO add your handling code here:
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("/Image/checkmark_yes_45px.png"));
         JOptionPane.showMessageDialog(null, "Successful Activation" , "Notification", JOptionPane.CLOSED_OPTION, icon);
    }//GEN-LAST:event_btnActivate_OpenAccountActionPerformed

    private void btnLogout_SearchAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout_SearchAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogout_SearchAccountActionPerformed

    private void btnHome_SearchAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_SearchAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome_SearchAccountActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_OpenAccount;
    private javax.swing.JPanel Panel_SearchAccount;
    private javax.swing.JScrollPane ScroPane_SearchAccount;
    private javax.swing.JButton btnActivate_OpenAccount;
    private javax.swing.JButton btnHome_OpenAccount;
    private javax.swing.JButton btnHome_SearchAccount;
    private javax.swing.JButton btnLockAcc_SearchAccount;
    private javax.swing.JButton btnLogout_OpenAccount;
    private javax.swing.JButton btnLogout_SearchAccount;
    private javax.swing.JButton btnShowAcc_SearchAccount;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbAmount_OpenAccount;
    private javax.swing.JLabel lbCustomerID_OpenAccount;
    private javax.swing.JLabel lbIcon_OpenAccount;
    private javax.swing.JLabel lbIcon_SearchAccount;
    private javax.swing.JLabel lbOpenAccount;
    private javax.swing.JLabel lbSearchAccount;
    private javax.swing.JLabel lbSearch_SearchAccount;
    private javax.swing.JTabbedPane tbP_AccountManagement;
    private javax.swing.JTable tblSearch_SearchAccount;
    private javax.swing.JTextField txtAmount_OpenAccount;
    private javax.swing.JTextField txtID_OpenAccount;
    private javax.swing.JTextField txtSearch_SearchAccount;
    // End of variables declaration//GEN-END:variables
}

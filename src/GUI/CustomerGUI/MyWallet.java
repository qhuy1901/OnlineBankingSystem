package GUI.CustomerGUI;

import GUI.LogIn;
import javax.swing.table.DefaultTableModel;

public class MyWallet extends javax.swing.JFrame 
{
    public MyWallet()
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setTitle("My Wallet");
        TaoTable();
        setVisible(true);
    }

    DefaultTableModel tblModelTT;
    public void TaoTable () {
        tblModelTT = new DefaultTableModel();
        String title[] = {"Time","Amount of money","Transaction type"};
        tblModelTT.setColumnIdentifiers(title);
        tblBalanceAlert.setModel(tblModelTT);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImage_MyWalletCusGUI = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblCurrentAccount = new javax.swing.JLabel();
        lblCurrentAccountDatabase = new javax.swing.JLabel();
        lblAvailableBalance1 = new javax.swing.JLabel();
        lblAvailableBalanceDatabase = new javax.swing.JLabel();
        lblVND = new javax.swing.JLabel();
        llblBalanceAlert = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblBalanceAlert = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 250, 252));
        jPanel1.setMinimumSize(new java.awt.Dimension(1060, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage_MyWalletCusGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/customergui_vicuatoi.png"))); // NOI18N
        jPanel1.add(lblImage_MyWalletCusGUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 100));

        btnHome.setBackground(new java.awt.Color(32, 172, 216));
        btnHome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setToolTipText("");
        btnHome.setBorder(null);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setIconTextGap(0);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 50, 57));

        btnLogout.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setIconTextGap(0);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 50, 57));

        lblTitle.setBackground(new java.awt.Color(32, 172, 216));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("         My Wallet");
        lblTitle.setOpaque(true);
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 30, 931, 58));

        lblCurrentAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCurrentAccount.setForeground(new java.awt.Color(51, 51, 51));
        lblCurrentAccount.setText("Current account");
        jPanel1.add(lblCurrentAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        lblCurrentAccountDatabase.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCurrentAccountDatabase.setForeground(new java.awt.Color(51, 51, 51));
        lblCurrentAccountDatabase.setPreferredSize(new java.awt.Dimension(125, 25));
        jPanel1.add(lblCurrentAccountDatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 440, 25));

        lblAvailableBalance1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAvailableBalance1.setForeground(new java.awt.Color(51, 51, 51));
        lblAvailableBalance1.setText("Available balance ");
        jPanel1.add(lblAvailableBalance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 25));

        lblAvailableBalanceDatabase.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAvailableBalanceDatabase.setForeground(new java.awt.Color(51, 51, 51));
        lblAvailableBalanceDatabase.setMinimumSize(new java.awt.Dimension(500, 25));
        lblAvailableBalanceDatabase.setPreferredSize(new java.awt.Dimension(1, 1));
        jPanel1.add(lblAvailableBalanceDatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 360, 25));

        lblVND.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVND.setForeground(new java.awt.Color(51, 51, 51));
        lblVND.setText("VNĐ");
        jPanel1.add(lblVND, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, -1, 25));

        llblBalanceAlert.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        llblBalanceAlert.setForeground(new java.awt.Color(51, 51, 51));
        llblBalanceAlert.setText("Transaction History");
        jPanel1.add(llblBalanceAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        tblBalanceAlert.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane.setViewportView(tblBalanceAlert);

        jPanel1.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 600, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblAvailableBalance1;
    private javax.swing.JLabel lblAvailableBalanceDatabase;
    private javax.swing.JLabel lblCurrentAccount;
    private javax.swing.JLabel lblCurrentAccountDatabase;
    private javax.swing.JLabel lblImage_MyWalletCusGUI;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVND;
    private javax.swing.JLabel llblBalanceAlert;
    private javax.swing.JTable tblBalanceAlert;
    // End of variables declaration//GEN-END:variables
}

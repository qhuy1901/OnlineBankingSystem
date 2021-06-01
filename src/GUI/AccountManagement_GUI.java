package GUI;

import BUS.AccountManagement_BUS;
import DTO.Account_DTO;
import DTO.Admin_DTO;
import GUI.AdminHome_GUI;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AccountManagement_GUI extends javax.swing.JFrame 
{
    AccountManagement_BUS busAccount = new AccountManagement_BUS();
    Admin_DTO dtoAdmin = null;
    
    public AccountManagement_GUI(Admin_DTO admin) 
    {
        initComponents();
        setSize(1064,650);
        setLocationRelativeTo(null);
        dtoAdmin = admin;
        createTable();
        setVisible(true);
    }
    
    DefaultTableModel tblAccountModel;
    public void createTable()
    {
        ArrayList<Account_DTO> accountList = busAccount.getAccountList();
        tblAccountModel = new DefaultTableModel();
        String title[] = {"ID", "CurrentBalance", "Open Day","AccountType", "Status", "CustomerID"};
        tblAccountModel.setColumnIdentifiers(title);
        tblAccountModel.setRowCount(0); 
        for(int i = 0; i < accountList.size(); i++)
        {
            Account_DTO dtoAccount = accountList.get(i);
            String[] rows = {String.valueOf(dtoAccount.getId()), String.format("%,d", dtoAccount.getCurrentBalance()),dtoAccount.getOpenDay().toString() , dtoAccount.getAccountTypeID(),dtoAccount.getStatus(),String.valueOf(dtoAccount.getCustomerID())};
            tblAccountModel.addRow(rows);
        }
        tblAccount.setModel(tblAccountModel);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        tbP_AccountManagement = new javax.swing.JTabbedPane();
        Panel_SearchAccount = new javax.swing.JPanel();
        btnHome_SearchAccount = new javax.swing.JButton();
        lbSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        ScroPane_SearchAccount = new javax.swing.JScrollPane();
        tblAccount = new javax.swing.JTable();
        btnLockAccount = new javax.swing.JButton();
        lbIcon_SearchAccount = new javax.swing.JLabel();
        lbSearchAccount = new javax.swing.JLabel();
        btnUnlockAccount = new javax.swing.JButton();
        Panel_OpenAccount = new javax.swing.JPanel();
        btnHome_OpenAccount = new javax.swing.JButton();
        lbCustomerID_OpenAccount = new javax.swing.JLabel();
        lbAmount_OpenAccount = new javax.swing.JLabel();
        txtCustomerID_OpenAccount = new javax.swing.JTextField();
        txtAmount_OpenAccount = new javax.swing.JTextField();
        btnActivate_OpenAccount = new javax.swing.JButton();
        lbIcon_OpenAccount = new javax.swing.JLabel();
        lbOpenAccount = new javax.swing.JLabel();
        lxlInputError_CustomerID = new javax.swing.JLabel();
        lxlInputError_Amount = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Account Management");

        tbP_AccountManagement.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Panel_SearchAccount.setBackground(new java.awt.Color(239, 250, 252));
        Panel_SearchAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Panel_SearchAccount.add(btnHome_SearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 76, 58));

        lbSearch.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lbSearch.setForeground(new java.awt.Color(32, 172, 216));
        lbSearch.setText("Search: ");
        Panel_SearchAccount.add(lbSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        Panel_SearchAccount.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 330, -1));

        tblAccount.setModel(new javax.swing.table.DefaultTableModel(
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
        ScroPane_SearchAccount.setViewportView(tblAccount);

        Panel_SearchAccount.add(ScroPane_SearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 870, 340));

        btnLockAccount.setBackground(new java.awt.Color(32, 172, 216));
        btnLockAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLockAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnLockAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/AccountManagement_Lock.png"))); // NOI18N
        btnLockAccount.setText("Lock Account");
        btnLockAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLockAccountActionPerformed(evt);
            }
        });
        Panel_SearchAccount.add(btnLockAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        lbIcon_SearchAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/AccountManagement_SearchAccount.png"))); // NOI18N
        Panel_SearchAccount.add(lbIcon_SearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 120));

        lbSearchAccount.setBackground(new java.awt.Color(32, 172, 216));
        lbSearchAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSearchAccount.setForeground(new java.awt.Color(255, 255, 255));
        lbSearchAccount.setText("          Search Account");
        lbSearchAccount.setOpaque(true);
        lbSearchAccount.setPreferredSize(new java.awt.Dimension(34, 50));
        Panel_SearchAccount.add(lbSearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 930, 66));

        btnUnlockAccount.setBackground(new java.awt.Color(32, 172, 216));
        btnUnlockAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUnlockAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnUnlockAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/AccountManagement_Unlock.png"))); // NOI18N
        btnUnlockAccount.setText("Unlock Account");
        btnUnlockAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnlockAccountActionPerformed(evt);
            }
        });
        Panel_SearchAccount.add(btnUnlockAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, -1, -1));

        tbP_AccountManagement.addTab("Search Account", Panel_SearchAccount);

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
        Panel_OpenAccount.add(btnHome_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 76, 58));

        lbCustomerID_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lbCustomerID_OpenAccount.setForeground(new java.awt.Color(32, 172, 216));
        lbCustomerID_OpenAccount.setText("Customer ID: ");
        Panel_OpenAccount.add(lbCustomerID_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        lbAmount_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lbAmount_OpenAccount.setForeground(new java.awt.Color(32, 172, 216));
        lbAmount_OpenAccount.setText("Initial Amount:  ");
        Panel_OpenAccount.add(lbAmount_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        txtCustomerID_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCustomerID_OpenAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomerID_OpenAccountKeyTyped(evt);
            }
        });
        Panel_OpenAccount.add(txtCustomerID_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 350, -1));

        txtAmount_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAmount_OpenAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmount_OpenAccountKeyTyped(evt);
            }
        });
        Panel_OpenAccount.add(txtAmount_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 350, -1));

        btnActivate_OpenAccount.setBackground(new java.awt.Color(32, 172, 216));
        btnActivate_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActivate_OpenAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnActivate_OpenAccount.setText("Activate");
        btnActivate_OpenAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivate_OpenAccountActionPerformed(evt);
            }
        });
        Panel_OpenAccount.add(btnActivate_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        lbIcon_OpenAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/AccountManagement_OpenAccount.png"))); // NOI18N
        Panel_OpenAccount.add(lbIcon_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 110));

        lbOpenAccount.setBackground(new java.awt.Color(32, 172, 216));
        lbOpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbOpenAccount.setForeground(new java.awt.Color(255, 255, 255));
        lbOpenAccount.setText("          Open Account");
        lbOpenAccount.setOpaque(true);
        lbOpenAccount.setPreferredSize(new java.awt.Dimension(34, 50));
        Panel_OpenAccount.add(lbOpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 970, 66));

        lxlInputError_CustomerID.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lxlInputError_CustomerID.setForeground(new java.awt.Color(255, 102, 102));
        Panel_OpenAccount.add(lxlInputError_CustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 170, -1));

        lxlInputError_Amount.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lxlInputError_Amount.setForeground(new java.awt.Color(255, 102, 102));
        Panel_OpenAccount.add(lxlInputError_Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 170, -1));

        tbP_AccountManagement.addTab("Open Account", Panel_OpenAccount);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbP_AccountManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbP_AccountManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHome_OpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_OpenAccountActionPerformed
        new AdminHome_GUI(dtoAdmin);
        setVisible(false);
    }//GEN-LAST:event_btnHome_OpenAccountActionPerformed

    private void btnActivate_OpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivate_OpenAccountActionPerformed
        if(txtCustomerID_OpenAccount.getText().equals("") || txtAmount_OpenAccount.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(Long.parseLong(txtAmount_OpenAccount.getText()) > 50000)
            {
                int reply = JOptionPane.showConfirmDialog(null, "Are you sure to open this payment account for customer?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) 
                {
                    if(busAccount.openPaymentAccount(Long.parseLong(txtCustomerID_OpenAccount.getText()), Long.parseLong(txtAmount_OpenAccount.getText())))
                    {
                        JOptionPane.showMessageDialog(this, "Successful Activation" , "Notification", JOptionPane.INFORMATION_MESSAGE);  
                        createTable();
                        // Clear Form
                        txtCustomerID_OpenAccount.setText("");
                        txtAmount_OpenAccount.setText("");
                        lxlInputError_CustomerID.setText("");
                        lxlInputError_Amount.setText("");
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Cannot active", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
               JOptionPane.showMessageDialog(this, "The initial aount must be more than 50,000 VND", "Error", JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_btnActivate_OpenAccountActionPerformed

    private void btnHome_SearchAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_SearchAccountActionPerformed
        new AdminHome_GUI(dtoAdmin);
        this.setVisible(false);
    }//GEN-LAST:event_btnHome_SearchAccountActionPerformed

    private void btnLockAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLockAccountActionPerformed
        int row = tblAccount.getSelectedRow();
        int accountId = Integer.parseInt(tblAccount.getValueAt(row, 0).toString().replaceAll("\\s+",""));
        if(accountId == -1)
        {
                JOptionPane.showMessageDialog(this, "Please select an account.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(tblAccount.getValueAt(row, 3).toString().replaceAll("\\s+","").equals("PA") == false) // phải xóa các khoản trắng khi lấy data từ bảng xuống
        {
            JOptionPane.showMessageDialog(this, "Savings account cannot be locked .", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(tblAccount.getValueAt(row, 4).toString().replaceAll("\\s+","").equals("Locked"))
        {
            JOptionPane.showMessageDialog(this, "This account has been locked already.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure to lock this account?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) 
            {
                if(busAccount.lockAccount(accountId))
                {
                    JOptionPane.showMessageDialog(this, "Locked successfully" , "Notification", JOptionPane.INFORMATION_MESSAGE); 
                    createTable();
                }
            }
        }
    }//GEN-LAST:event_btnLockAccountActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel SearchTable = (DefaultTableModel) tblAccount.getModel();
        String search = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(SearchTable);
        tblAccount.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnUnlockAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnlockAccountActionPerformed
        int row = tblAccount.getSelectedRow();
        int accountId = Integer.parseInt(tblAccount.getValueAt(row, 0).toString().replaceAll("\\s+",""));
        if(accountId == 0)
        {
            JOptionPane.showMessageDialog(this, "Please select an account.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(tblAccount.getValueAt(row, 4).toString().replaceAll("\\s+","").equals("Active"))
        {
            JOptionPane.showMessageDialog(this, "This account is not locked.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure to unlock this account?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) 
            {
                if(busAccount.unlockAccount(accountId))
                {
                    JOptionPane.showMessageDialog(this, "Unlocked successfully" , "Notification", JOptionPane.INFORMATION_MESSAGE); 
                    createTable();
                }
            }
        }
    }//GEN-LAST:event_btnUnlockAccountActionPerformed

    private void txtCustomerID_OpenAccountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerID_OpenAccountKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE))
            evt.consume();
    }//GEN-LAST:event_txtCustomerID_OpenAccountKeyTyped

    private void txtAmount_OpenAccountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmount_OpenAccountKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE))
            evt.consume();
    }//GEN-LAST:event_txtAmount_OpenAccountKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_OpenAccount;
    private javax.swing.JPanel Panel_SearchAccount;
    private javax.swing.JScrollPane ScroPane_SearchAccount;
    private javax.swing.JButton btnActivate_OpenAccount;
    private javax.swing.JButton btnHome_OpenAccount;
    private javax.swing.JButton btnHome_SearchAccount;
    private javax.swing.JButton btnLockAccount;
    private javax.swing.JButton btnUnlockAccount;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbAmount_OpenAccount;
    private javax.swing.JLabel lbCustomerID_OpenAccount;
    private javax.swing.JLabel lbIcon_OpenAccount;
    private javax.swing.JLabel lbIcon_SearchAccount;
    private javax.swing.JLabel lbOpenAccount;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lbSearchAccount;
    private javax.swing.JLabel lxlInputError_Amount;
    private javax.swing.JLabel lxlInputError_CustomerID;
    private javax.swing.JTabbedPane tbP_AccountManagement;
    private javax.swing.JTable tblAccount;
    private javax.swing.JTextField txtAmount_OpenAccount;
    private javax.swing.JTextField txtCustomerID_OpenAccount;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

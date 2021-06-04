package GUI;

import BUS.AccountManagement_BUS;
import DTO.Account_DTO;
import DTO.Admin_DTO;
import GUI.AdminHome_GUI;
import java.util.ArrayList;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class AccountManagement_GUI extends javax.swing.JFrame 
{

    AccountManagement_BUS busAccount = new AccountManagement_BUS();
    Admin_DTO dtoAdmin = null;
    public AccountManagement_GUI(Admin_DTO admin) {
        initComponents();
        setSize(1064,650);
        setLocationRelativeTo(null);
        setResizable(false);
        dtoAdmin = admin;
        createTable();
        setVisible(true);
    }
    
    DefaultTableModel tblAccountModel;
    public void createTable()
    {
        ArrayList<Account_DTO> accountList = busAccount.getAccountList();
        TreeMap<String, String> accountTypeList = busAccount.getAccountTypeList();
        tblAccountModel = new DefaultTableModel();
        String title[] = {"Account ID", "Current Balance", "Open Day","Account Type", "Status", "Customer ID"};
        tblAccountModel.setColumnIdentifiers(title);
        tblAccountModel.setRowCount(0); 
        for(int i = 0; i < accountList.size(); i++)
        {
            Account_DTO dtoAccount = accountList.get(i);
            String accountId = String.valueOf(dtoAccount.getId());
            String currentBalance = String.format("%,d", dtoAccount.getCurrentBalance()) + " VND";
            String openDay = dtoAccount.getOpenDay().toString();
            String accountTypeId =  dtoAccount.getAccountTypeID();
            String accountTypeName = accountTypeList.get(accountTypeId);
            String status = dtoAccount.getStatus();
            String customerId = String.valueOf(dtoAccount.getCustomerID());
            String[] rows = {accountId, currentBalance, openDay ,accountTypeName, status, customerId};
            tblAccountModel.addRow(rows);
            
        }
        tblAccount.setModel(tblAccountModel);
        tblAccount.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblAccount.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblAccount.getColumnModel().getColumn(2).setPreferredWidth(60);
        tblAccount.getColumnModel().getColumn(3).setPreferredWidth(310);
        setVisible(true);
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Account Management");

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
        lbSearchAccount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbSearchAccount.setForeground(new java.awt.Color(255, 255, 255));
        lbSearchAccount.setText("          Account Management");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1048, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel_SearchAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 1048, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel_SearchAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHome_SearchAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_SearchAccountActionPerformed
        new AdminHome_GUI(dtoAdmin);
        this.setVisible(false);
    }//GEN-LAST:event_btnHome_SearchAccountActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel SearchTable = (DefaultTableModel) tblAccount.getModel();
        String search = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(SearchTable);
        tblAccount.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnLockAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLockAccountActionPerformed
        int row = tblAccount.getSelectedRow();
        int accountId = Integer.parseInt(tblAccount.getValueAt(row, 0).toString().replaceAll("\\s+",""));
        if(accountId == 0)
        {
            JOptionPane.showMessageDialog(this, "Please select an account.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(tblAccount.getValueAt(row, 3).toString().contains("Savings Account"))
            {
                JOptionPane.showMessageDialog(this, "Savings account cannot be locked .", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                if(tblAccount.getValueAt(row, 4).toString().contains("Locked"))
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
            }
        }
    }//GEN-LAST:event_btnLockAccountActionPerformed

    private void btnUnlockAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnlockAccountActionPerformed
        int row = tblAccount.getSelectedRow();
        int accountId = Integer.parseInt(tblAccount.getValueAt(row, 0).toString().replaceAll("\\s+",""));
        if(accountId == 0)
        {
            JOptionPane.showMessageDialog(this, "Please select an account.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(tblAccount.getValueAt(row, 3).toString().contains("Savings Account")) // Không được mở khóa tài khoản tiết kiệm
            {
                JOptionPane.showMessageDialog(this, "Cannot unlocked savings account.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                if(tblAccount.getValueAt(row, 4).toString().contains("Active"))
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
            }

        }
    }//GEN-LAST:event_btnUnlockAccountActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_SearchAccount;
    private javax.swing.JScrollPane ScroPane_SearchAccount;
    private javax.swing.JButton btnHome_SearchAccount;
    private javax.swing.JButton btnLockAccount;
    private javax.swing.JButton btnUnlockAccount;
    private javax.swing.JLabel lbIcon_SearchAccount;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lbSearchAccount;
    private javax.swing.JTable tblAccount;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

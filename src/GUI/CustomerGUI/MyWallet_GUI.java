package GUI.CustomerGUI;

import BUS.MyWallet_BUS;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.Transaction_DTO;
import GUI.CustomerHome_GUI;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class MyWallet_GUI extends javax.swing.JFrame 
{
    MyWallet_BUS busTransaction = new MyWallet_BUS();
    
    Customer_DTO dtoCustomer = null; // Người đang đăng nhập
    Account_DTO dtoAccount = null;
    boolean currentBalanceIsShowed;
            
    public MyWallet_GUI(Customer_DTO customer, Account_DTO account)
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        dtoAccount = account;
        dtoCustomer = customer; // customer này là từ form LogIn tryền vào cho form này
        displayAccountInformation();
        currentBalanceIsShowed = false;
        String title[] = {"ID","Transaction Type","Time", "Amount"};
        tblTransactionModel.setColumnIdentifiers(title);
        tblTransactionHistory.setModel(tblTransactionModel);
        
        setVisible(true);
    }
    
    private void displayAccountInformation()
    {
        txtAccountId.setText(String.valueOf(dtoAccount.getId()));
        txtAccountOwner.setText(dtoCustomer.getFirstName() + " " + dtoCustomer.getLastName());
        txtOpenDay.setText(dtoAccount.getOpenDay().toString());
        String accountStatus = dtoAccount.getStatus().toString();
        txtStatus.setText(accountStatus);
        if(accountStatus.equals("Locked"))
            txtStatus.setForeground(Color.RED);
        txtLatestTransactionDate.setText(busTransaction.getLatestTransactionDate(dtoAccount));
    }

    DefaultTableModel tblTransactionModel = new DefaultTableModel();
    public void createTable() 
    {
        ArrayList<Transaction_DTO> list = busTransaction.getTransactionHistory(dtoAccount);
        
        tblTransactionModel.setRowCount(0); 
        for(int i = 0; i < list.size(); i++)
        {
            Transaction_DTO dtoTransaction = list.get(i);
            String transactionId = String.valueOf(dtoTransaction.getId());
            String transactionTypeID = dtoTransaction.getTransactionTypeID();
            String transactionDate =  dtoTransaction.getTrasactionDate().toString();
            String totalTransactionAmount = String.format("%,d", dtoTransaction.getTotalTransactionAmount());
            if(transactionTypeID.equals("NT01") || transactionTypeID.equals("TK02")) // nếu là giao dịch nhận tiền
                totalTransactionAmount = "+" + totalTransactionAmount + " VND";
            else // nếu là giao dịch trừ tiền tài khoản
                totalTransactionAmount = "-" + totalTransactionAmount + " VND";
            String[] rows = {transactionId, transactionTypeID , transactionDate, totalTransactionAmount};
            tblTransactionModel.addRow(rows);
        }
        tblTransactionHistory.setModel(tblTransactionModel);
        
        
        //Set size for table
        resizeColumnWidth(tblTransactionHistory);
        setVisible(true);
    }
    
    // Hàm tự động điều chỉnh kích thước cho các cột trong bảng
    public void resizeColumnWidth(JTable table) 
    {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) 
        {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) 
            {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1 , width);
            }
            if(width > 300)
                width = 300;
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImage_MyWalletCusGUI = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblOpenDay = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblTransactionHistory = new javax.swing.JTable();
        lblTransactionHistory = new javax.swing.JLabel();
        lblCurrentBalance = new javax.swing.JLabel();
        lbllAccountId = new javax.swing.JLabel();
        lblAccountOwner = new javax.swing.JLabel();
        lblPaymentAccountInformation = new javax.swing.JLabel();
        txtAccountOwner = new javax.swing.JTextField();
        txtOpenDay = new javax.swing.JTextField();
        txtLatestTransactionDate = new javax.swing.JTextField();
        txtAccountId = new javax.swing.JTextField();
        btnShowTransactionHistory = new javax.swing.JButton();
        btnShowCurrentBalance = new javax.swing.JButton();
        txtCurrentBalance = new javax.swing.JTextField();
        lblLatestTransactionDate = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        lblTransactionHistoryNote = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Online Banking System");
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
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, 50, 57));

        lblTitle.setBackground(new java.awt.Color(32, 172, 216));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("         My Wallet");
        lblTitle.setOpaque(true);
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 30, 931, 58));

        lblOpenDay.setBackground(new java.awt.Color(32, 172, 216));
        lblOpenDay.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblOpenDay.setForeground(new java.awt.Color(32, 172, 216));
        lblOpenDay.setText("Open day:");
        jPanel1.add(lblOpenDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        tblTransactionHistory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblTransactionHistory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane.setViewportView(tblTransactionHistory);

        jPanel1.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 700, 160));

        lblTransactionHistory.setBackground(new java.awt.Color(32, 172, 216));
        lblTransactionHistory.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTransactionHistory.setForeground(new java.awt.Color(32, 172, 216));
        lblTransactionHistory.setText("Transaction History");
        jPanel1.add(lblTransactionHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        lblCurrentBalance.setBackground(new java.awt.Color(32, 172, 216));
        lblCurrentBalance.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblCurrentBalance.setForeground(new java.awt.Color(32, 172, 216));
        lblCurrentBalance.setText("Current Balance:");
        jPanel1.add(lblCurrentBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        lbllAccountId.setBackground(new java.awt.Color(32, 172, 216));
        lbllAccountId.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbllAccountId.setForeground(new java.awt.Color(32, 172, 216));
        lbllAccountId.setText("Account ID:");
        jPanel1.add(lbllAccountId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        lblAccountOwner.setBackground(new java.awt.Color(32, 172, 216));
        lblAccountOwner.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblAccountOwner.setForeground(new java.awt.Color(32, 172, 216));
        lblAccountOwner.setText("Account owner:");
        jPanel1.add(lblAccountOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        lblPaymentAccountInformation.setBackground(new java.awt.Color(32, 172, 216));
        lblPaymentAccountInformation.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPaymentAccountInformation.setForeground(new java.awt.Color(32, 172, 216));
        lblPaymentAccountInformation.setText("Payment Account Information:");
        jPanel1.add(lblPaymentAccountInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        txtAccountOwner.setEditable(false);
        txtAccountOwner.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        txtAccountOwner.setForeground(new java.awt.Color(32, 172, 216));
        txtAccountOwner.setText("jTextField1");
        jPanel1.add(txtAccountOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 240, 30));

        txtOpenDay.setEditable(false);
        txtOpenDay.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        txtOpenDay.setForeground(new java.awt.Color(32, 172, 216));
        txtOpenDay.setText("jTextField1");
        jPanel1.add(txtOpenDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 240, 30));

        txtLatestTransactionDate.setEditable(false);
        txtLatestTransactionDate.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        txtLatestTransactionDate.setForeground(new java.awt.Color(32, 172, 216));
        txtLatestTransactionDate.setText("jTextField1");
        jPanel1.add(txtLatestTransactionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 240, 30));

        txtAccountId.setEditable(false);
        txtAccountId.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        txtAccountId.setForeground(new java.awt.Color(32, 172, 216));
        txtAccountId.setText("jTextField1");
        jPanel1.add(txtAccountId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 240, 30));

        btnShowTransactionHistory.setBackground(new java.awt.Color(32, 172, 216));
        btnShowTransactionHistory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnShowTransactionHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnShowTransactionHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/plus_25px.png"))); // NOI18N
        btnShowTransactionHistory.setText("Show Transaction History");
        btnShowTransactionHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTransactionHistoryActionPerformed(evt);
            }
        });
        jPanel1.add(btnShowTransactionHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 240, -1));

        btnShowCurrentBalance.setBackground(new java.awt.Color(32, 172, 216));
        btnShowCurrentBalance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnShowCurrentBalance.setForeground(new java.awt.Color(255, 255, 255));
        btnShowCurrentBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/MyWallet_eye.png"))); // NOI18N
        btnShowCurrentBalance.setText("Show Current Balance");
        btnShowCurrentBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowCurrentBalanceActionPerformed(evt);
            }
        });
        jPanel1.add(btnShowCurrentBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 240, -1));

        txtCurrentBalance.setEditable(false);
        txtCurrentBalance.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        txtCurrentBalance.setForeground(new java.awt.Color(32, 172, 216));
        txtCurrentBalance.setText("*************");
        jPanel1.add(txtCurrentBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 240, 30));

        lblLatestTransactionDate.setBackground(new java.awt.Color(32, 172, 216));
        lblLatestTransactionDate.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblLatestTransactionDate.setForeground(new java.awt.Color(32, 172, 216));
        lblLatestTransactionDate.setText("Latest transaction date:");
        jPanel1.add(lblLatestTransactionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        txtStatus.setEditable(false);
        txtStatus.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(32, 172, 216));
        txtStatus.setText("jTextField1");
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 240, 30));

        lblStatus.setBackground(new java.awt.Color(32, 172, 216));
        lblStatus.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(32, 172, 216));
        lblStatus.setText("Status:");
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        lblTransactionHistoryNote.setBackground(new java.awt.Color(32, 172, 216));
        lblTransactionHistoryNote.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblTransactionHistoryNote.setForeground(new java.awt.Color(32, 172, 216));
        lblTransactionHistoryNote.setText("(15 most recent transactions)");
        jPanel1.add(lblTransactionHistoryNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new CustomerHome_GUI(dtoCustomer);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnShowTransactionHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTransactionHistoryActionPerformed
        createTable();
        btnShowTransactionHistory.setVisible(false);
    }//GEN-LAST:event_btnShowTransactionHistoryActionPerformed
    
    
    private void btnShowCurrentBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowCurrentBalanceActionPerformed
        if(currentBalanceIsShowed == false)
        {
            txtCurrentBalance.setText(String.format("%,d", dtoAccount.getCurrentBalance()) + " VND");
            btnShowCurrentBalance.setText("Hide Current Balance");
            currentBalanceIsShowed = true;
        }
        else
        {
            txtCurrentBalance.setText("*************");
            btnShowCurrentBalance.setText("Show Current Balance");
            currentBalanceIsShowed = false;
        }
    }//GEN-LAST:event_btnShowCurrentBalanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnShowCurrentBalance;
    private javax.swing.JButton btnShowTransactionHistory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblAccountOwner;
    private javax.swing.JLabel lblCurrentBalance;
    private javax.swing.JLabel lblImage_MyWalletCusGUI;
    private javax.swing.JLabel lblLatestTransactionDate;
    private javax.swing.JLabel lblOpenDay;
    private javax.swing.JLabel lblPaymentAccountInformation;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTransactionHistory;
    private javax.swing.JLabel lblTransactionHistoryNote;
    private javax.swing.JLabel lbllAccountId;
    private javax.swing.JTable tblTransactionHistory;
    private javax.swing.JTextField txtAccountId;
    private javax.swing.JTextField txtAccountOwner;
    private javax.swing.JTextField txtCurrentBalance;
    private javax.swing.JTextField txtLatestTransactionDate;
    private javax.swing.JTextField txtOpenDay;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}

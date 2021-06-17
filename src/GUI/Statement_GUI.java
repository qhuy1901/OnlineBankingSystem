package GUI;

import BUS.Statement_BUS;
import DTO.Account_DTO;
import DTO.Employee_DTO;
import DTO.Customer_DTO;
import DTO.Transaction_DTO;
import DTO.Transaction_Type_DTO;
import DTO.Transfer_Detail_DTO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Statement_GUI extends javax.swing.JFrame {
    Employee_DTO dtoAdmin = null;
    Statement_BUS busStatement = new Statement_BUS();
    Account_DTO dtoAccount = null;
    
    public Statement_GUI(Employee_DTO admin) 
    {
        initComponents();
        dtoAdmin = admin;
        
        /*Set giao diện*/
        setSize(1064, 650); // Set kích thước giao diện
        setResizable(false); // Không cho phóng to
        setTitle("Statement"); // Set tiêu đề
        setLocation(225,70); // Set vị trí trang
        setVisible(true); // Hiển thị giao diện
        
        createTable();
        btnExport.setVisible(false);
    }
    
    public void createTable() 
    {
        // Set tiêu đề
        String title[] = {"Transaction ID", "Time", "Total Transaction Amount", "Content"};
        tblStatementModel.setColumnIdentifiers(title);
        tblStatement.setModel(tblStatementModel);
        // Set kích thước cột
        tblStatement.getColumnModel().getColumn(0).setPreferredWidth(35);
        tblStatement.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblStatement.getColumnModel().getColumn(3).setPreferredWidth(320);
    }
    
    DefaultTableModel tblStatementModel = new DefaultTableModel();
    public void loadTable() 
    {
        // Get statement information
        ArrayList<Transaction_DTO> list = busStatement.getStatement(dtoAccount, dcFromDate.getDate(), dcToDate.getDate());
        
        // Check statement information
        if(list.size() == 0) // No transactions found
        {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            JOptionPane.showMessageDialog(this, "Customers do not make transactions from " + df.format(dcFromDate.getDate())+ " to " + df.format(dcToDate.getDate()) , "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        else // Transaction information is found
        {
            // Get transaction types information
            TreeMap<String, Transaction_Type_DTO> transactionTypeList = busStatement.getTransactionTypeList();
            tblStatementModel.setRowCount(0); 
            
            // Display each line of transaction information on the table.
            for(int i = 0; i < list.size(); i++) 
            {
                Transaction_DTO dtoTransaction = list.get(i);
                String transactionId = String.valueOf(dtoTransaction.getId());
                String transactionTypeID = dtoTransaction.getTransactionTypeID();
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String transactionDate =  df.format(dtoTransaction.getTrasactionDate());
                String totalTransactionAmount = String.format("%,d", dtoTransaction.getTotalTransactionAmount());
                if(transactionTypeID.equals("NT01") || transactionTypeID.equals("TK02")) // nếu là giao dịch nhận tiền
                    totalTransactionAmount = "+" + totalTransactionAmount + " VND";
                else // nếu là giao dịch trừ tiền tài khoản
                    totalTransactionAmount = "-" + totalTransactionAmount + " VND";
                String transactionContent = transactionTypeList.get(transactionTypeID).getName().toUpperCase();
                
                // Check if it's a transfer transaction or not
                if(transactionTypeID.contains("CT")) // Nếu là giao dịch chuyển tiền
                {
                    // Get transfer details
                    Transfer_Detail_DTO dtoTransferDetail = busStatement.getTransferDetail(dtoTransaction.getId());
                    
                   // Add transfer details to transaction content
                    transactionContent = transactionContent + " \nTRANSFER FROM " + dtoTransferDetail.getReceiverAccount() + " " + dtoTransferDetail.getContent();
                }
                String[] rows = {transactionId, transactionDate , totalTransactionAmount , transactionContent};
                tblStatementModel.addRow(rows);
            }
        }
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblToDate = new javax.swing.JLabel();
        lblAccountOnwer = new javax.swing.JLabel();
        lblFromDate = new javax.swing.JLabel();
        txtAccountID = new javax.swing.JTextField();
        btnExport = new javax.swing.JButton();
        btnStatement = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStatement = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        dcToDate = new com.toedter.calendar.JDateChooser();
        dcFromDate = new com.toedter.calendar.JDateChooser();
        lblAccountID1 = new javax.swing.JLabel();
        txtAccountOnwer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Statement");

        jPanel1.setBackground(new java.awt.Color(239, 250, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblToDate.setBackground(new java.awt.Color(32, 172, 216));
        lblToDate.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblToDate.setForeground(new java.awt.Color(32, 172, 216));
        lblToDate.setText("To:");
        jPanel1.add(lblToDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, -1));

        lblAccountOnwer.setBackground(new java.awt.Color(32, 172, 216));
        lblAccountOnwer.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblAccountOnwer.setForeground(new java.awt.Color(32, 172, 216));
        lblAccountOnwer.setText("Account onwer:");
        jPanel1.add(lblAccountOnwer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        lblFromDate.setBackground(new java.awt.Color(32, 172, 216));
        lblFromDate.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblFromDate.setForeground(new java.awt.Color(32, 172, 216));
        lblFromDate.setText("From:");
        jPanel1.add(lblFromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        txtAccountID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAccountID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAccountIDMouseClicked(evt);
            }
        });
        txtAccountID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtAccountID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 300, 30));

        btnExport.setBackground(new java.awt.Color(32, 172, 216));
        btnExport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Export.png"))); // NOI18N
        btnExport.setText("Export statement report");
        btnExport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExport.setIconTextGap(2);
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });
        jPanel1.add(btnExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 220, 40));

        btnStatement.setBackground(new java.awt.Color(32, 172, 216));
        btnStatement.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnStatement.setForeground(new java.awt.Color(255, 255, 255));
        btnStatement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Statement_Statement.png"))); // NOI18N
        btnStatement.setText(" Statement");
        btnStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatementActionPerformed(evt);
            }
        });
        jPanel1.add(btnStatement, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 140, 40));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Statement.png"))); // NOI18N
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 100));

        tblStatement.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblStatement);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 780, 260));

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
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, 50, 57));

        lblTitle.setBackground(new java.awt.Color(32, 172, 216));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("         Statement");
        lblTitle.setOpaque(true);
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 30, 935, 58));

        dcToDate.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(dcToDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 200, 30));

        dcFromDate.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(dcFromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 200, 30));

        lblAccountID1.setBackground(new java.awt.Color(32, 172, 216));
        lblAccountID1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblAccountID1.setForeground(new java.awt.Color(32, 172, 216));
        lblAccountID1.setText("Account ID:");
        jPanel1.add(lblAccountID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        txtAccountOnwer.setEditable(false);
        txtAccountOnwer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtAccountOnwer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new AdminHome_GUI(dtoAdmin);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed
    private void btnStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatementActionPerformed
        // Check if the user input is enough or not
        if(txtAccountID.getText().equals("") || txtAccountOnwer.getText().equals("") || dcToDate.getDate() == null || dcToDate.getDate() == null)
        {
            JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            // Check statement date 
            if(dcFromDate.getDate().compareTo(dcToDate.getDate()) == 1) // Kiểm tra ngày sao kê: fromDate có lớn hơn toDate không?
            {
                JOptionPane.showMessageDialog(this, "Invalid statement date", "Eroror", JOptionPane.ERROR_MESSAGE);
                dcFromDate.setDate(null);
                dcToDate.setDate(null);
            }
            else
            {
                loadTable();
                
                // Show statement export button
                btnExport.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnStatementActionPerformed

    private void txtAccountIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountIDActionPerformed
        // Get account owner information
        dtoAccount = new Account_DTO(Long.parseLong(txtAccountID.getText()));
        Customer_DTO dtoCustomer = busStatement.getCustomerInfo(dtoAccount);
        
        // Check account owner information
        if(dtoCustomer == null)
        {
            JOptionPane.showMessageDialog(this, "Account ID is invalid", "Error", JOptionPane.ERROR_MESSAGE);
            txtAccountOnwer.setText("");
        }
        else
        {
            // Display the account owner's name 
            txtAccountOnwer.setText(dtoCustomer.getFirstName() + " " + dtoCustomer.getLastName());
        }
    }//GEN-LAST:event_txtAccountIDActionPerformed

    private void txtAccountIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAccountIDMouseClicked
        txtAccountOnwer.setText("");
        tblStatementModel.setRowCount(0); // clear Table
        dtoAccount = null;
        btnExport.setVisible(false);
    }//GEN-LAST:event_txtAccountIDMouseClicked

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        long accountId = dtoAccount.getId();
        Date fromDate = dcFromDate.getDate();
        Date toDate = dcToDate.getDate();
        busStatement.showStatementReport(accountId, fromDate, toDate);
    }//GEN-LAST:event_btnExportActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnStatement;
    private com.toedter.calendar.JDateChooser dcFromDate;
    private com.toedter.calendar.JDateChooser dcToDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccountID1;
    private javax.swing.JLabel lblAccountOnwer;
    private javax.swing.JLabel lblFromDate;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblToDate;
    private javax.swing.JTable tblStatement;
    private javax.swing.JTextField txtAccountID;
    private javax.swing.JTextField txtAccountOnwer;
    // End of variables declaration//GEN-END:variables
}

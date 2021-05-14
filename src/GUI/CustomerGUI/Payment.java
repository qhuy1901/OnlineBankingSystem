package GUI.CustomerGUI;

import BUS.Payment_BUS;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.Bill_DTO;
import DTO.Supplier_DTO;
import DTO.UserLogin_DTO;
import GUI.Customer_GUI;
import GUI.LogIn;
import GUI.Report.Report;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Payment extends javax.swing.JFrame 
{
    Payment_BUS busPayment = new Payment_BUS();
    Account_DTO dtoAccount = null; // Tài khoản của người chuyển tiền
    Customer_DTO dtoCustomer = null;
    
    public Payment(Customer_DTO customer, Account_DTO account) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setVisible(true);
        cboServiceType.setSelectedItem(null);
        dtoCustomer = customer;
        dtoAccount = account; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        WaterBill = new javax.swing.JPanel();
        btnLogout_Water = new javax.swing.JButton();
        btnHome_Water = new javax.swing.JButton();
        lblSupplier = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCustomerID_Water = new javax.swing.JTextField();
        btnConfirm_Water = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cboServiceType = new javax.swing.JComboBox<>();
        lblSupplier1 = new javax.swing.JLabel();
        cboSupplierName = new javax.swing.JComboBox<>();
        TelephoneFee = new javax.swing.JPanel();
        btnLogout_Mobi = new javax.swing.JButton();
        btnHome_Mobi = new javax.swing.JButton();
        lblSupplier_Telephone = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbbValue_Mobi = new javax.swing.JComboBox<>();
        rdbViettel_Mobi = new javax.swing.JRadioButton();
        rdbMobi_Mobi = new javax.swing.JRadioButton();
        rdbVina_Mobi = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtNo_Mobi = new javax.swing.JTextField();
        btnConfirm_Mobi = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Online Banking System");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        WaterBill.setBackground(new java.awt.Color(239, 250, 252));
        WaterBill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout_Water.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout_Water.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout_Water.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout_Water.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout_Water.setText("Logout");
        btnLogout_Water.setToolTipText("");
        btnLogout_Water.setBorder(null);
        btnLogout_Water.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout_Water.setIconTextGap(0);
        btnLogout_Water.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout_Water.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout_WaterActionPerformed(evt);
            }
        });
        WaterBill.add(btnLogout_Water, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 77, 58));

        btnHome_Water.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_Water.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_Water.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_Water.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome_Water.setText("Home");
        btnHome_Water.setToolTipText("");
        btnHome_Water.setBorder(null);
        btnHome_Water.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_Water.setIconTextGap(1);
        btnHome_Water.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_Water.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_WaterActionPerformed(evt);
            }
        });
        WaterBill.add(btnHome_Water, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 76, 58));

        lblSupplier.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblSupplier.setForeground(new java.awt.Color(32, 172, 216));
        lblSupplier.setText("Service Type:");
        WaterBill.add(lblSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(32, 172, 216));
        jLabel19.setText("Customer ID:");
        WaterBill.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        txtCustomerID_Water.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WaterBill.add(txtCustomerID_Water, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 270, -1));

        btnConfirm_Water.setBackground(new java.awt.Color(32, 172, 216));
        btnConfirm_Water.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirm_Water.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm_Water.setText("Payment");
        btnConfirm_Water.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm_WaterActionPerformed(evt);
            }
        });
        WaterBill.add(btnConfirm_Water, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Payment_Water.png"))); // NOI18N
        WaterBill.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 100));

        jLabel17.setBackground(new java.awt.Color(32, 172, 216));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("         Bill Payment");
        jLabel17.setOpaque(true);
        jLabel17.setPreferredSize(new java.awt.Dimension(34, 50));
        WaterBill.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 970, 66));

        cboServiceType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboServiceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Water bill payment", "Internet bill payment", "Electricity bill payment" }));
        cboServiceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboServiceTypeActionPerformed(evt);
            }
        });
        WaterBill.add(cboServiceType, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 270, -1));

        lblSupplier1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblSupplier1.setForeground(new java.awt.Color(32, 172, 216));
        lblSupplier1.setText("Supplier Name:");
        WaterBill.add(lblSupplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        cboSupplierName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboSupplierName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dong Nai Water Supplier", "Thu Duc Water Supplier", "Ben Thanh Water Supplier", "Da Nang Water Supplier", "Clean Water Ha Noi (Hawacom)" }));
        cboSupplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSupplierNameActionPerformed(evt);
            }
        });
        WaterBill.add(cboSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 270, -1));

        jTabbedPane1.addTab("Bill Payment", WaterBill);

        TelephoneFee.setBackground(new java.awt.Color(239, 250, 252));
        TelephoneFee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout_Mobi.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout_Mobi.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout_Mobi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout_Mobi.setText("Logout");
        btnLogout_Mobi.setToolTipText("");
        btnLogout_Mobi.setBorder(null);
        btnLogout_Mobi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout_Mobi.setIconTextGap(0);
        btnLogout_Mobi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout_Mobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout_MobiActionPerformed(evt);
            }
        });
        TelephoneFee.add(btnLogout_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 77, 58));

        btnHome_Mobi.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_Mobi.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_Mobi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome_Mobi.setText("Home");
        btnHome_Mobi.setToolTipText("");
        btnHome_Mobi.setBorder(null);
        btnHome_Mobi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_Mobi.setIconTextGap(1);
        btnHome_Mobi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_Mobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_MobiActionPerformed(evt);
            }
        });
        TelephoneFee.add(btnHome_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 76, 58));

        lblSupplier_Telephone.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblSupplier_Telephone.setForeground(new java.awt.Color(32, 172, 216));
        lblSupplier_Telephone.setText("Network supplier: ");
        TelephoneFee.add(lblSupplier_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(32, 172, 216));
        jLabel11.setText("Value: ");
        TelephoneFee.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        cbbValue_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbValue_Mobi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10.000 VNĐ", "30.000 VNĐ", "50.000 VNĐ", "100.000 VNĐ", "200.000 VNĐ" }));
        cbbValue_Mobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbValue_MobiActionPerformed(evt);
            }
        });
        TelephoneFee.add(cbbValue_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 120, -1));

        rdbViettel_Mobi.setBackground(new java.awt.Color(239, 250, 252));
        buttonGroup1.add(rdbViettel_Mobi);
        rdbViettel_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        rdbViettel_Mobi.setText("Viettel");
        TelephoneFee.add(rdbViettel_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        rdbMobi_Mobi.setBackground(new java.awt.Color(239, 250, 252));
        buttonGroup1.add(rdbMobi_Mobi);
        rdbMobi_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        rdbMobi_Mobi.setText("Mobiphone");
        TelephoneFee.add(rdbMobi_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        rdbVina_Mobi.setBackground(new java.awt.Color(239, 250, 252));
        buttonGroup1.add(rdbVina_Mobi);
        rdbVina_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        rdbVina_Mobi.setText("Vinaphone");
        TelephoneFee.add(rdbVina_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(32, 172, 216));
        jLabel13.setText("Phone No.: ");
        TelephoneFee.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        txtNo_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TelephoneFee.add(txtNo_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 420, -1));

        btnConfirm_Mobi.setBackground(new java.awt.Color(32, 172, 216));
        btnConfirm_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirm_Mobi.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm_Mobi.setText("Confirm");
        btnConfirm_Mobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm_MobiActionPerformed(evt);
            }
        });
        TelephoneFee.add(btnConfirm_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Payment_Telephone.png"))); // NOI18N
        TelephoneFee.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 110));

        jLabel9.setBackground(new java.awt.Color(32, 172, 216));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("          Telephone Fee");
        jLabel9.setOpaque(true);
        jLabel9.setPreferredSize(new java.awt.Dimension(34, 50));
        TelephoneFee.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 970, 66));

        jTabbedPane1.addTab("Telephone Fee", TelephoneFee);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnLogout_WaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout_WaterActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogout_WaterActionPerformed

    private void btnLogout_MobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout_MobiActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogout_MobiActionPerformed

    private void btnHome_WaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_WaterActionPerformed
        new Customer_GUI(dtoCustomer);
        this.setVisible(false);
    }//GEN-LAST:event_btnHome_WaterActionPerformed

    private void btnHome_MobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_MobiActionPerformed
        new Customer_GUI(dtoCustomer);
        this.setVisible(false);
    }//GEN-LAST:event_btnHome_MobiActionPerformed

    private void btnConfirm_MobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm_MobiActionPerformed
        // Mua thẻ điện thoại
        
    }//GEN-LAST:event_btnConfirm_MobiActionPerformed

    private String confirmPassword()
    {
        // Create Password JOptionPane
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Please enter your password:");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[]{"Confirm", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, "Verify by password", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        String password = "";
        if(option == 0) // pressing OK button
        {
            char[] pw = pass.getPassword();
            password = new String(pw);
        }
        else
            return "cancel";
        return password;
    }
    
    private void btnConfirm_WaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm_WaterActionPerformed
        //Thanh toán nước
        long customerId = Long.parseLong(txtCustomerID_Water.getText());
        String supplierName = cboSupplierName.getSelectedItem().toString();
        Bill_DTO dtoWaterBill = busPayment.getBill(new Customer_DTO(customerId), new Supplier_DTO(supplierName));
        if(dtoWaterBill != null) // Hóa đơn tồn tại
        {
            UserLogin_DTO dtoUserLogIn = busPayment.getUserLogin(dtoCustomer); // Lấy password người dùng
            String EnteredPassword = confirmPassword();
            if(EnteredPassword.equals(dtoUserLogIn.getPassword()))// // So sánh password với password người dùng nhập
            {
                if(busPayment.payment(dtoWaterBill, dtoAccount))
                {
                    JOptionPane.showConfirmDialog(null, "Payment is successful", "Successful", JOptionPane.CLOSED_OPTION);

                    Report r = new Report();
                    r.showPaymentBill(dtoWaterBill.getId());
                    //Clear form
                    cboServiceType.setSelectedItem(null);
                    txtCustomerID_Water.setText("");
                }
            }
            else if(EnteredPassword.equals("cancel"))
            {
                // Không làm gì hết
            }
            else
                JOptionPane.showMessageDialog(this, "Password is incorrect", "Incorrect details", JOptionPane.ERROR_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this, "This bill is not exist", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnConfirm_WaterActionPerformed

    private void cbbValue_MobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbValue_MobiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbValue_MobiActionPerformed

    private void cboServiceTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboServiceTypeActionPerformed
        //Chọn loại dịch vụ cần thanh toán
        if(cboServiceType.getSelectedItem() == null)
            cboSupplierName.setSelectedItem(null);
        else if(cboServiceType.getSelectedItem().toString().equals("Water bill payment"))
        {
            cboSupplierName.setModel(new DefaultComboBoxModel<>(new String[]{
                "Dong Nai Water Supplier", "Thu Duc Water Supplier", "Ben Thanh Water Supplier", "Da Nang Water Supplier", "Clean Water Ha Noi"
            }));
        }
        else if(cboServiceType.getSelectedItem().toString().equals("Electricity bill payment"))
        {
            cboSupplierName.setModel(new DefaultComboBoxModel<>(new String[]{
                "Nothern Power Corp", "Southern Power Corp", "Central Power Corp"
            }));
        }
        else // (cboServiceType.getSelectedItem().toString().equals("Internet bill payment"))
        {
            cboSupplierName.setModel(new DefaultComboBoxModel<>(new String[]{
                "FPT Telecom", "Viettel", "VNPT"
            }));
        }
    }//GEN-LAST:event_cboServiceTypeActionPerformed

    private void cboSupplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSupplierNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSupplierNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelephoneFee;
    private javax.swing.JPanel WaterBill;
    private javax.swing.JButton btnConfirm_Mobi;
    private javax.swing.JButton btnConfirm_Water;
    private javax.swing.JButton btnHome_Mobi;
    private javax.swing.JButton btnHome_Water;
    private javax.swing.JButton btnLogout_Mobi;
    private javax.swing.JButton btnLogout_Water;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbValue_Mobi;
    private javax.swing.JComboBox<String> cboServiceType;
    private javax.swing.JComboBox<String> cboSupplierName;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblSupplier1;
    private javax.swing.JLabel lblSupplier_Telephone;
    private javax.swing.JRadioButton rdbMobi_Mobi;
    private javax.swing.JRadioButton rdbViettel_Mobi;
    private javax.swing.JRadioButton rdbVina_Mobi;
    private javax.swing.JTextField txtCustomerID_Water;
    private javax.swing.JTextField txtNo_Mobi;
    // End of variables declaration//GEN-END:variables
}

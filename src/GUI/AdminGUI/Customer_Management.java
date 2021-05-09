package GUI.AdminGUI;

import BUS.Customer_BUS;
import DTO.Customer_DTO;
import GUI.Admin_GUI;
import GUI.LogIn;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Customer_Management extends javax.swing.JFrame 
{
    Customer_BUS customer_BUS = new Customer_BUS();
    
    public Customer_Management() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setVisible(true);
        createTable();
    }
    
    DefaultTableModel tblCustomerModel;
    public void createTable()
    {
        ArrayList<Customer_DTO> list = customer_BUS.getCustomersList();
        tblCustomerModel = new DefaultTableModel();
        String title[] = {"ID", "Full Name", "Gender", "Date of birth", "Address", "Phone number", "ID Card"};
        tblCustomerModel.setColumnIdentifiers(title);
        tblCustomerModel.setRowCount(0); 
        for(int i = 0; i < list.size(); i++)
        {
            Customer_DTO dtoCustomer = list.get(i);
            String[] rows = {String.valueOf(dtoCustomer.getId()), dtoCustomer.getFirstName() + " " + dtoCustomer.getLastName() , dtoCustomer.getGender(),  dtoCustomer.getDateOfBirth().toString(), dtoCustomer.getAddress(), dtoCustomer.getPhoneNumber(), dtoCustomer.getIDCard()};
            tblCustomerModel.addRow(rows);
        }
        tblViewCustomer.setModel(tblCustomerModel);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnHome_ViewCustomer = new javax.swing.JButton();
        btnLogout_ViewCustomer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViewCustomer = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtLastName_AddCustomer = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbGender_AddCustomer = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnHome_AddCustomer = new javax.swing.JButton();
        btnLogout_AddCustomer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtIDCard = new javax.swing.JTextField();
        dcDateOfBirth_AddCustomer = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txtFirstName_AddCustomer = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtLastName_UpdateCustomer = new javax.swing.JTextField();
        txtUpdateID = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cbbUpdateGender = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtUpdateAddress = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtUpdatePhoneNumber = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnHome_UpdateCustomer = new javax.swing.JButton();
        btnLogout_UpdateCustomer = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        btnShowInformation = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        txtUpdateIDCard = new javax.swing.JTextField();
        dcDateOfBirth_UpdateCustomer = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        txtFirstName_UpdateCustomer = new javax.swing.JTextField();

        btnUpdate2.setBackground(new java.awt.Color(32, 172, 216));
        btnUpdate2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate2.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/delete_25px.png"))); // NOI18N
        btnUpdate2.setText("Delete");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Online Banking System");
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(239, 250, 252));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel9.setBackground(new java.awt.Color(239, 250, 252));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setForeground(new java.awt.Color(204, 204, 204));
        txtSearch.setText("Enter ID, Name, ID Card,... to search");
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel9.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 230, 30));

        btnHome_ViewCustomer.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_ViewCustomer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_ViewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_ViewCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/home_25px.png"))); // NOI18N
        btnHome_ViewCustomer.setText("Home");
        btnHome_ViewCustomer.setToolTipText("");
        btnHome_ViewCustomer.setBorder(null);
        btnHome_ViewCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_ViewCustomer.setIconTextGap(1);
        btnHome_ViewCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_ViewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_ViewCustomerActionPerformed(evt);
            }
        });
        jPanel9.add(btnHome_ViewCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 76, 50));

        btnLogout_ViewCustomer.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout_ViewCustomer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout_ViewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout_ViewCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/shutdown_20px.png"))); // NOI18N
        btnLogout_ViewCustomer.setText("Logout");
        btnLogout_ViewCustomer.setToolTipText("");
        btnLogout_ViewCustomer.setBorder(null);
        btnLogout_ViewCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout_ViewCustomer.setIconTextGap(0);
        btnLogout_ViewCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout_ViewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout_ViewCustomerActionPerformed(evt);
            }
        });
        jPanel9.add(btnLogout_ViewCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, 60, 50));

        jLabel1.setText("Search");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/CustomerManagement_ViewCustomer.png"))); // NOI18N
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel7.setBackground(new java.awt.Color(32, 172, 216));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("            View Customer");
        jLabel7.setOpaque(true);
        jLabel7.setPreferredSize(new java.awt.Dimension(34, 50));
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 950, 66));

        tblViewCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblViewCustomer);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 960, 350));

        jTabbedPane1.addTab("View Customer", jPanel9);

        jPanel1.setBackground(new java.awt.Color(239, 250, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 172, 216));
        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 94, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 172, 216));
        jLabel8.setText("Date of birth");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));
        jPanel1.add(txtLastName_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 200, 32));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 172, 216));
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        cbGender_AddCustomer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbGender_AddCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        cbGender_AddCustomer.setSelectedIndex(-1);
        jPanel1.add(cbGender_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 200, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(32, 172, 216));
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 540, 32));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(32, 172, 216));
        jLabel11.setText("Phone No.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));
        jPanel1.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 320, 32));

        btnAdd.setBackground(new java.awt.Color(32, 172, 216));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/plus_25px.png"))); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(948, 94, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/administrator_male_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(47, 47, 47))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(46, 46, 46))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 203, -1, 200));

        btnHome_AddCustomer.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_AddCustomer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_AddCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_AddCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/home_25px.png"))); // NOI18N
        btnHome_AddCustomer.setText("Home");
        btnHome_AddCustomer.setToolTipText("");
        btnHome_AddCustomer.setBorder(null);
        btnHome_AddCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_AddCustomer.setIconTextGap(1);
        btnHome_AddCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_AddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_AddCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 76, 58));

        btnLogout_AddCustomer.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout_AddCustomer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout_AddCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout_AddCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/shutdown_20px.png"))); // NOI18N
        btnLogout_AddCustomer.setText("Logout");
        btnLogout_AddCustomer.setToolTipText("");
        btnLogout_AddCustomer.setBorder(null);
        btnLogout_AddCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout_AddCustomer.setIconTextGap(0);
        btnLogout_AddCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout_AddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout_AddCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 77, 58));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/CustomerManagement_AddCustomer.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 100));

        jLabel4.setBackground(new java.awt.Color(32, 172, 216));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("         Register an online banking account for customer");
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(34, 50));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 19, 970, 66));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(32, 172, 216));
        jLabel34.setText("ID Card");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));
        jPanel1.add(txtIDCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 320, 32));

        dcDateOfBirth_AddCustomer.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(dcDateOfBirth_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 200, 32));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(32, 172, 216));
        jLabel15.setText("First Name");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 94, -1));
        jPanel1.add(txtFirstName_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 200, 32));

        jTabbedPane1.addTab("Add Customer", jPanel1);

        jPanel3.setBackground(new java.awt.Color(239, 250, 252));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/CustomerManagement_Update&DeleteCustomer.png"))); // NOI18N
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, 135, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(32, 172, 216));
        jLabel13.setText("ID");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(32, 172, 216));
        jLabel14.setText("Last Name");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 80, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(32, 172, 216));
        jLabel16.setText("Date of birth");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));
        jPanel3.add(txtLastName_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 180, 32));
        jPanel3.add(txtUpdateID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 230, 32));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(32, 172, 216));
        jLabel17.setText("Gender");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        cbbUpdateGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbUpdateGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        cbbUpdateGender.setSelectedIndex(-1);
        cbbUpdateGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbUpdateGenderActionPerformed(evt);
            }
        });
        jPanel3.add(cbbUpdateGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 220, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(32, 172, 216));
        jLabel18.setText("Address");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 338, -1, -1));

        txtUpdateAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateAddressActionPerformed(evt);
            }
        });
        jPanel3.add(txtUpdateAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 338, 540, 32));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(32, 172, 216));
        jLabel19.setText("Phone No.");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 410, -1, -1));
        jPanel3.add(txtUpdatePhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 330, 32));

        btnUpdate.setBackground(new java.awt.Color(32, 172, 216));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/update_25px.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(934, 104, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/administrator_male_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel20)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel20)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 193, -1, 200));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 168, 1059, 19));

        btnHome_UpdateCustomer.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_UpdateCustomer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_UpdateCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_UpdateCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/home_25px.png"))); // NOI18N
        btnHome_UpdateCustomer.setText("Home");
        btnHome_UpdateCustomer.setToolTipText("");
        btnHome_UpdateCustomer.setBorder(null);
        btnHome_UpdateCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_UpdateCustomer.setIconTextGap(1);
        btnHome_UpdateCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_UpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_UpdateCustomerActionPerformed(evt);
            }
        });
        jPanel3.add(btnHome_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 76, 58));

        btnLogout_UpdateCustomer.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout_UpdateCustomer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout_UpdateCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout_UpdateCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/shutdown_20px.png"))); // NOI18N
        btnLogout_UpdateCustomer.setText("Logout");
        btnLogout_UpdateCustomer.setToolTipText("");
        btnLogout_UpdateCustomer.setBorder(null);
        btnLogout_UpdateCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout_UpdateCustomer.setIconTextGap(0);
        btnLogout_UpdateCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout_UpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout_UpdateCustomerActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogout_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 77, 58));

        jLabel22.setBackground(new java.awt.Color(32, 172, 216));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("             Update/ Delete Customer");
        jLabel22.setOpaque(true);
        jLabel22.setPreferredSize(new java.awt.Dimension(34, 50));
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 19, 960, 66));

        btnShowInformation.setBackground(new java.awt.Color(32, 172, 216));
        btnShowInformation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnShowInformation.setForeground(new java.awt.Color(255, 255, 255));
        btnShowInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/search_20px.png"))); // NOI18N
        btnShowInformation.setText("Show Information");
        btnShowInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowInformationActionPerformed(evt);
            }
        });
        jPanel3.add(btnShowInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        btnDeleteCustomer.setBackground(new java.awt.Color(32, 172, 216));
        btnDeleteCustomer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDeleteCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/delete_25px.png"))); // NOI18N
        btnDeleteCustomer.setText("Delete");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });
        jPanel3.add(btnDeleteCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 104, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(32, 172, 216));
        jLabel35.setText("ID Card");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 488, -1, -1));
        jPanel3.add(txtUpdateIDCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 488, 330, 32));
        jPanel3.add(dcDateOfBirth_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 178, 32));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(32, 172, 216));
        jLabel24.setText("First Name");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 193, 80, -1));
        jPanel3.add(txtFirstName_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 193, 220, 32));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(" Update/ Delete Customer", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHome_AddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_AddCustomerActionPerformed
        // TODO add your handling code here:
        Admin_GUI guiAdmin = new Admin_GUI();
        this.setVisible(false);
    }//GEN-LAST:event_btnHome_AddCustomerActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(isFormValid())
        {
            Customer_DTO ct = new Customer_DTO(0 , txtFirstName_AddCustomer.getText(), txtLastName_AddCustomer.getText(), cbGender_AddCustomer.getSelectedItem().toString(), dcDateOfBirth_AddCustomer.getDate() ,txtAddress.getText(), txtPhoneNumber.getText(), txtIDCard.getText());
            if(customer_BUS.insert(ct))
            {
                JOptionPane.showMessageDialog(this, "Customer added susccessfully...!", "Success", JOptionPane.INFORMATION_MESSAGE);
                createTable();
                
                // Clear Form
                txtFirstName_AddCustomer.setText("");
                txtLastName_AddCustomer.setText("");
                cbGender_AddCustomer.setSelectedItem(null);
                dcDateOfBirth_AddCustomer.setCalendar(null);
                txtAddress.setText("");
                txtPhoneNumber.setText("");
                txtIDCard.setText("");
            }
            else
                JOptionPane.showMessageDialog(this, "Cannot add customers!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel SearchTable = (DefaultTableModel) tblViewCustomer.getModel();
        String search = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(SearchTable);
        tblViewCustomer.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        if(txtSearch.getForeground() != Color.BLACK)
        {
            if(txtSearch.getText().equals("Enter ID, Name, ID Card,... to search"))
            {
                txtSearch.setText("");
            }
            txtSearch.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        // TODO add your handling code here:
        if(txtSearch.getForeground() != Color.BLACK)
        {
            if(txtSearch.getText().equals("Enter ID, Name, ID Card,... to search"))
            {
                txtSearch.setText("");
            }
            txtSearch.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtSearchMouseClicked
    
    private boolean isTxtUpdateIDIsFilled()
    {
            if(txtUpdateID.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Required field are empty", "Please fill required field...!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
            else
                return true;
    }
    
    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed
        // TODO add your handling code here:
        if(isTxtUpdateIDIsFilled())
        {
            Customer_DTO ct = new Customer_DTO(Integer.parseInt(txtUpdateID.getText()));
            if(customer_BUS.delete(ct))
            {
                JOptionPane.showMessageDialog(this, "Customer deleted susccessfully...!", "Success", JOptionPane.INFORMATION_MESSAGE);
                createTable();
                // Clear Form
                txtUpdateID.setText("");
                txtFirstName_UpdateCustomer.setText("");
                txtLastName_UpdateCustomer.setText("");
                cbbUpdateGender.setSelectedItem(null);
                dcDateOfBirth_UpdateCustomer.setDate(null);
                txtUpdateAddress.setText("");
                txtUpdatePhoneNumber.setText("");
                txtUpdateIDCard.setText("");
                
            }
            else
                JOptionPane.showMessageDialog(this, "Cannot delete customers!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void cbbUpdateGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbUpdateGenderActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbbUpdateGenderActionPerformed

    private boolean isValidUpdateForm()
    {
            if(txtLastName_UpdateCustomer.getText().equals("") || txtUpdateID.getText().equals("") || txtUpdateAddress.getText().equals("") || txtUpdatePhoneNumber.getText().equals("") || txtUpdateIDCard.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
            else
                return true;
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        // Làm thêm chức năng xác nhận
        if(isValidUpdateForm())
        {
            Customer_DTO ct = new Customer_DTO(Integer.parseInt(txtUpdateID.getText()) , txtFirstName_UpdateCustomer.getText(), txtLastName_UpdateCustomer.getText(), cbbUpdateGender.getSelectedItem().toString(), dcDateOfBirth_UpdateCustomer.getDate(), txtUpdateAddress.getText(), txtUpdatePhoneNumber.getText(), txtUpdateIDCard.getText());
            if(customer_BUS.update(ct))
            {
                JOptionPane.showMessageDialog(this, "Customer updated susccessfully...!", "Success", JOptionPane.INFORMATION_MESSAGE);
                createTable();
            }
            else
                JOptionPane.showMessageDialog(this, "Cannot update customers!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    
    private void btnShowInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowInformationActionPerformed
        // TODO add your handling code here:
        if(isTxtUpdateIDIsFilled())
        {
            Customer_DTO ct = customer_BUS.getInformation(Integer.parseInt(txtUpdateID.getText()));
            if(ct != null)
            {
                txtFirstName_UpdateCustomer.setText(ct.getFirstName());
                txtLastName_UpdateCustomer.setText(ct.getLastName());
                cbbUpdateGender.setSelectedItem(ct.getGender());
                dcDateOfBirth_UpdateCustomer.setDate(ct.getDateOfBirth());
                txtUpdateAddress.setText(ct.getAddress());
                txtUpdatePhoneNumber.setText(ct.getPhoneNumber());
                txtUpdateIDCard.setText(ct.getIDCard());
            }
            else
                JOptionPane.showMessageDialog(this, "No customer information found!", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnShowInformationActionPerformed

    private void txtUpdateAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateAddressActionPerformed

    private void btnHome_UpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_UpdateCustomerActionPerformed
        Admin_GUI guiAdmin = new Admin_GUI();
        this.setVisible(false);
    }//GEN-LAST:event_btnHome_UpdateCustomerActionPerformed

    private void btnHome_ViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_ViewCustomerActionPerformed
        Admin_GUI guiAdmin = new Admin_GUI();
        this.setVisible(false);
    }//GEN-LAST:event_btnHome_ViewCustomerActionPerformed

    private void btnLogout_AddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout_AddCustomerActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogout_AddCustomerActionPerformed

    private void btnLogout_UpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout_UpdateCustomerActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogout_UpdateCustomerActionPerformed

    private void btnLogout_ViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout_ViewCustomerActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogout_ViewCustomerActionPerformed

    private boolean isFormValid()
    {
            if(txtLastName_AddCustomer.getText().equals("") || txtAddress.getText().equals("") || txtPhoneNumber.getText().equals("") || txtIDCard.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
            else
                return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnHome_AddCustomer;
    private javax.swing.JButton btnHome_UpdateCustomer;
    private javax.swing.JButton btnHome_ViewCustomer;
    private javax.swing.JButton btnLogout_AddCustomer;
    private javax.swing.JButton btnLogout_UpdateCustomer;
    private javax.swing.JButton btnLogout_ViewCustomer;
    private javax.swing.JButton btnShowInformation;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JComboBox<String> cbGender_AddCustomer;
    private javax.swing.JComboBox<String> cbbUpdateGender;
    private com.toedter.calendar.JDateChooser dcDateOfBirth_AddCustomer;
    private com.toedter.calendar.JDateChooser dcDateOfBirth_UpdateCustomer;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblViewCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFirstName_AddCustomer;
    private javax.swing.JTextField txtFirstName_UpdateCustomer;
    private javax.swing.JTextField txtIDCard;
    private javax.swing.JTextField txtLastName_AddCustomer;
    private javax.swing.JTextField txtLastName_UpdateCustomer;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUpdateAddress;
    private javax.swing.JTextField txtUpdateID;
    private javax.swing.JTextField txtUpdateIDCard;
    private javax.swing.JTextField txtUpdatePhoneNumber;
    // End of variables declaration//GEN-END:variables
}

package GUI.AdminGUI;

import BUS.Customer_BUS;
import DTO.Customer_DTO;
import GUI.Admin_GUI;
import GUI.LogIn;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            String[] rows = {String.valueOf(dtoCustomer.getId()), dtoCustomer.getName(), dtoCustomer.getGender(),  dtoCustomer.getDateOfBirth().toString(), dtoCustomer.getAddress(), dtoCustomer.getPhoneNumber(), dtoCustomer.getIDCard()};
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
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViewCustomer = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
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
        txtTest = new javax.swing.JTextField();
        btnTest = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtUpdateName = new javax.swing.JTextField();
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
        jLabel22 = new javax.swing.JLabel();
        btnShowInformation = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        txtUpdateIDCard = new javax.swing.JTextField();
        btnHome_UpdateCustomer = new javax.swing.JButton();
        btnLogout_UpdateCustomer = new javax.swing.JButton();
        dcDateOfBirth_UpdateCustomer = new com.toedter.calendar.JDateChooser();

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

        jLabel7.setBackground(new java.awt.Color(32, 172, 216));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("        View Customer");
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 172, 216));
        jLabel5.setText("ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 124, 94, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 172, 216));
        jLabel6.setText("Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 169, 94, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 172, 216));
        jLabel8.setText("Date of birth");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 232, -1, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 161, 428, 32));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 111, 222, 32));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 172, 216));
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 232, -1, -1));

        cbGender.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        cbGender.setSelectedIndex(-1);
        jPanel1.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 228, 122, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(32, 172, 216));
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 286, -1, -1));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 286, 428, 32));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(32, 172, 216));
        jLabel11.setText("Phone No.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 358, -1, -1));
        jPanel1.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 350, 428, 32));

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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel12)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(35, 35, 35))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 203, -1, -1));

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
        jPanel1.add(btnLogout_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 77, 58));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/add_user_group_man_man_55px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, 125, 77));

        jLabel4.setBackground(new java.awt.Color(32, 172, 216));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("        Add Customer");
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(34, 50));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 19, 970, 66));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(32, 172, 216));
        jLabel34.setText("ID Card");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 409, -1, -1));
        jPanel1.add(txtIDCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 225, 32));

        dcDateOfBirth_AddCustomer.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(dcDateOfBirth_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 228, 178, 32));

        txtTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTestActionPerformed(evt);
            }
        });
        jPanel1.add(txtTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 225, 32));

        btnTest.setText("jButton1");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });
        jPanel1.add(btnTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, -1, -1));

        jTabbedPane1.addTab("Add Customer", jPanel1);

        jPanel3.setBackground(new java.awt.Color(239, 250, 252));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/add_user_group_man_man_55px.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(32, 172, 216));
        jLabel13.setText("ID");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(32, 172, 216));
        jLabel14.setText("Name");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(32, 172, 216));
        jLabel16.setText("Date of birth");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(32, 172, 216));
        jLabel17.setText("Gender");

        cbbUpdateGender.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        cbbUpdateGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        cbbUpdateGender.setSelectedIndex(-1);
        cbbUpdateGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbUpdateGenderActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(32, 172, 216));
        jLabel18.setText("Address");

        txtUpdateAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateAddressActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(32, 172, 216));
        jLabel19.setText("Phone No.");

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

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/administrator_male_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel20)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(35, 35, 35))
        );

        jLabel22.setBackground(new java.awt.Color(32, 172, 216));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("        Update/ Delete Customer");
        jLabel22.setOpaque(true);
        jLabel22.setPreferredSize(new java.awt.Dimension(34, 50));

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

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(32, 172, 216));
        jLabel35.setText("ID Card");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel13)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome_UpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogout_UpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(txtUpdateID, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnShowInformation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)))
                .addGap(18, 18, 18))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel35))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbbUpdateGender, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcDateOfBirth_UpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUpdateName)
                    .addComponent(txtUpdateAddress)
                    .addComponent(txtUpdatePhoneNumber)
                    .addComponent(txtUpdateIDCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGap(0, 106, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogout_UpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHome_UpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowInformation)
                    .addComponent(btnDeleteCustomer)
                    .addComponent(btnUpdate))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUpdateName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(cbbUpdateGender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(dcDateOfBirth_UpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUpdateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUpdatePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(txtUpdateIDCard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(503, Short.MAX_VALUE)))
        );

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
            Customer_DTO ct = new Customer_DTO(Integer.parseInt(txtID.getText()) , txtName.getText(), cbGender.getSelectedItem().toString(), dcDateOfBirth_AddCustomer.getDate() ,txtAddress.getText(), txtPhoneNumber.getText(), txtIDCard.getText());
            if(customer_BUS.insert(ct))
            {
                JOptionPane.showMessageDialog(this, "Customer added susccessfully...!", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Clear Form
                txtID.setText("");
                txtName.setText("");
                cbGender.setSelectedItem(null);
                dcDateOfBirth_AddCustomer.cleanup();
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
                
                // Clear Form
                txtUpdateID.setText("");
                txtUpdateName.setText("");
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
            if(txtUpdateName.getText().equals("") || txtUpdateID.getText().equals("") || txtUpdateAddress.getText().equals("") || txtUpdatePhoneNumber.getText().equals("") || txtUpdateIDCard.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
            else
                return true;
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(isValidUpdateForm())
        {
            Customer_DTO ct = new Customer_DTO(Integer.parseInt(txtUpdateID.getText()) , txtUpdateName.getText(), cbbUpdateGender.getSelectedItem().toString(), dcDateOfBirth_UpdateCustomer.getDate(), txtUpdateAddress.getText(), txtUpdatePhoneNumber.getText(), txtUpdateIDCard.getText());
            if(customer_BUS.update(ct))
            {
                JOptionPane.showMessageDialog(this, "Customer updated susccessfully...!", "Success", JOptionPane.INFORMATION_MESSAGE);
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
                txtUpdateName.setText(ct.getName());
                cbbUpdateGender.setSelectedItem(ct.getGender());
                /*Date date = null;
                try {
                    date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ct.getDateOfBirth());
                } catch (ParseException ex) {
                    Logger.getLogger(Customer_Management.class.getName()).log(Level.SEVERE, null, ex);
                }*/
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

    private void txtTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTestActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtTestActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        // TODO add your handling code here:
       
//        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
//        String date = dcn.format(dcDateOfBirth_UpdateCustomer.getDate());
    }//GEN-LAST:event_btnTestActionPerformed

    private boolean isFormValid()
    {
            if(txtName.getText().equals("") || txtID.getText().equals("") || txtAddress.getText().equals("") || txtPhoneNumber.getText().equals("") || txtIDCard.getText().equals(""))
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
    private javax.swing.JButton btnTest;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JComboBox<String> cbGender;
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDCard;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTest;
    private javax.swing.JTextField txtUpdateAddress;
    private javax.swing.JTextField txtUpdateID;
    private javax.swing.JTextField txtUpdateIDCard;
    private javax.swing.JTextField txtUpdateName;
    private javax.swing.JTextField txtUpdatePhoneNumber;
    // End of variables declaration//GEN-END:variables
}

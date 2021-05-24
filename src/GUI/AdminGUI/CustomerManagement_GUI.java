package GUI.AdminGUI;

import BUS.Customer_BUS;
import DTO.Admin_DTO;
import DTO.Customer_DTO;
import GUI.AdminHome_GUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class CustomerManagement_GUI extends javax.swing.JFrame 
{
    Customer_BUS customer_BUS = new Customer_BUS();
    Admin_DTO dtoAdmin = null;
    
    public CustomerManagement_GUI(Admin_DTO admin) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setVisible(true);
        dtoAdmin = admin;
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
        resizeColumnWidth(tblViewCustomer);
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
    
    private void clearForm()
    {
        txtFirstName_AddCustomer.setText("");
        txtLastName_AddCustomer.setText("");
        cbGender_AddCustomer.setSelectedItem(null);
        dcDateOfBirth_AddCustomer.setCalendar(null);
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        txtIDCard.setText("");
        
        txtUpdateID.setText("");
        txtFirstName_UpdateCustomer.setText("");
        txtLastName_UpdateCustomer.setText("");
        cbbUpdateGender.setSelectedItem(null);
        dcDateOfBirth_UpdateCustomer.setDate(null);
        txtUpdateAddress.setText("");
        txtUpdatePhoneNumber.setText("");
        txtUpdateIDCard.setText("");
        createTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlViewCustomer = new javax.swing.JPanel();
        btnExportCustomerListReport = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnHome_ViewCustomer = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        lblIcon_ViewCustomer = new javax.swing.JLabel();
        lblViewCustomer = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViewCustomer = new javax.swing.JTable();
        pnlAddCustomer = new javax.swing.JPanel();
        lblLastName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtLastName_AddCustomer = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        cbGender_AddCustomer = new javax.swing.JComboBox<>();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPhoneNo = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnHome_AddCustomer = new javax.swing.JButton();
        lblIcon_AddCustomer = new javax.swing.JLabel();
        lblAddCustomer = new javax.swing.JLabel();
        lblIDCard = new javax.swing.JLabel();
        txtIDCard = new javax.swing.JTextField();
        dcDateOfBirth_AddCustomer = new com.toedter.calendar.JDateChooser();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName_AddCustomer = new javax.swing.JTextField();
        lxlInputError_PhoneNumber = new javax.swing.JLabel();
        lxlInputError_IDCard = new javax.swing.JLabel();
        pnlUpdateCustomer = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblIcon_UpdateCustomer = new javax.swing.JLabel();
        lblCustomerID = new javax.swing.JLabel();
        lblLastName_UpdateCustomer = new javax.swing.JLabel();
        lblDateOfBirth_UpdateCustomer = new javax.swing.JLabel();
        txtLastName_UpdateCustomer = new javax.swing.JTextField();
        txtUpdateID = new javax.swing.JTextField();
        lblGender_UpdateCustomer = new javax.swing.JLabel();
        cbbUpdateGender = new javax.swing.JComboBox<>();
        lblAddress_UpdateCustomer = new javax.swing.JLabel();
        txtUpdateAddress = new javax.swing.JTextField();
        lblPhoneNumber_UpdateCustomer = new javax.swing.JLabel();
        txtUpdatePhoneNumber = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnHome_UpdateCustomer = new javax.swing.JButton();
        lblUpdateCustomer = new javax.swing.JLabel();
        btnShowInformation = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        lblIDCard_UpdateCustomer = new javax.swing.JLabel();
        txtUpdateIDCard = new javax.swing.JTextField();
        dcDateOfBirth_UpdateCustomer = new com.toedter.calendar.JDateChooser();
        lblFirstName_UpdateCustomer = new javax.swing.JLabel();
        txtFirstName_UpdateCustomer = new javax.swing.JTextField();
        lxlInputError_UpdatePhoneNumber = new javax.swing.JLabel();
        lxlInputError_UpdateIDCard = new javax.swing.JLabel();

        btnUpdate2.setBackground(new java.awt.Color(32, 172, 216));
        btnUpdate2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate2.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/delete_25px.png"))); // NOI18N
        btnUpdate2.setText("Delete");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Management");
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(239, 250, 252));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pnlViewCustomer.setBackground(new java.awt.Color(239, 250, 252));
        pnlViewCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExportCustomerListReport.setBackground(new java.awt.Color(32, 172, 216));
        btnExportCustomerListReport.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnExportCustomerListReport.setForeground(new java.awt.Color(255, 255, 255));
        btnExportCustomerListReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Export.png"))); // NOI18N
        btnExportCustomerListReport.setText("Export customer list report");
        btnExportCustomerListReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportCustomerListReportActionPerformed(evt);
            }
        });
        pnlViewCustomer.add(btnExportCustomerListReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 250, 40));

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
        pnlViewCustomer.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 230, 30));

        btnHome_ViewCustomer.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_ViewCustomer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_ViewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_ViewCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
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
        pnlViewCustomer.add(btnHome_ViewCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 30, 76, 50));

        lblSearch.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(32, 172, 216));
        lblSearch.setText("Search:");
        pnlViewCustomer.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        lblIcon_ViewCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/CustomerManagement_ViewCustomer.png"))); // NOI18N
        pnlViewCustomer.add(lblIcon_ViewCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        lblViewCustomer.setBackground(new java.awt.Color(32, 172, 216));
        lblViewCustomer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblViewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lblViewCustomer.setText("            View Customer");
        lblViewCustomer.setOpaque(true);
        lblViewCustomer.setPreferredSize(new java.awt.Dimension(34, 50));
        pnlViewCustomer.add(lblViewCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 950, 66));

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

        pnlViewCustomer.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 960, 300));

        jTabbedPane1.addTab("View Customer", pnlViewCustomer);

        pnlAddCustomer.setBackground(new java.awt.Color(239, 250, 252));
        pnlAddCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLastName.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(32, 172, 216));
        lblLastName.setText("Last Name");
        pnlAddCustomer.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 94, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 172, 216));
        jLabel8.setText("Date of birth");
        pnlAddCustomer.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));
        pnlAddCustomer.add(txtLastName_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 200, 32));

        lblGender.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblGender.setForeground(new java.awt.Color(32, 172, 216));
        lblGender.setText("Gender");
        pnlAddCustomer.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        cbGender_AddCustomer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbGender_AddCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        cbGender_AddCustomer.setSelectedIndex(-1);
        pnlAddCustomer.add(cbGender_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 200, -1));

        lblAddress.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(32, 172, 216));
        lblAddress.setText("Address");
        pnlAddCustomer.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));
        pnlAddCustomer.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 540, 32));

        lblPhoneNo.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblPhoneNo.setForeground(new java.awt.Color(32, 172, 216));
        lblPhoneNo.setText("Phone No.");
        pnlAddCustomer.add(lblPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyTyped(evt);
            }
        });
        pnlAddCustomer.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 320, 32));

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
        pnlAddCustomer.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(948, 94, -1, -1));

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

        pnlAddCustomer.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 203, -1, 200));

        btnHome_AddCustomer.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_AddCustomer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_AddCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_AddCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
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
        pnlAddCustomer.add(btnHome_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 76, 58));

        lblIcon_AddCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/CustomerManagement_AddCustomer.png"))); // NOI18N
        pnlAddCustomer.add(lblIcon_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 100));

        lblAddCustomer.setBackground(new java.awt.Color(32, 172, 216));
        lblAddCustomer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAddCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lblAddCustomer.setText("         Add new customer");
        lblAddCustomer.setOpaque(true);
        lblAddCustomer.setPreferredSize(new java.awt.Dimension(34, 50));
        pnlAddCustomer.add(lblAddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 19, 970, 66));

        lblIDCard.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblIDCard.setForeground(new java.awt.Color(32, 172, 216));
        lblIDCard.setText("ID Card");
        pnlAddCustomer.add(lblIDCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        txtIDCard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDCardKeyTyped(evt);
            }
        });
        pnlAddCustomer.add(txtIDCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 320, 32));

        dcDateOfBirth_AddCustomer.setDateFormatString("dd/MM/yyyy");
        pnlAddCustomer.add(dcDateOfBirth_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 200, 32));

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(32, 172, 216));
        lblFirstName.setText("First Name");
        pnlAddCustomer.add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 94, -1));
        pnlAddCustomer.add(txtFirstName_AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 200, 32));

        lxlInputError_PhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lxlInputError_PhoneNumber.setForeground(new java.awt.Color(255, 102, 102));
        pnlAddCustomer.add(lxlInputError_PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 170, 20));

        lxlInputError_IDCard.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lxlInputError_IDCard.setForeground(new java.awt.Color(255, 102, 102));
        pnlAddCustomer.add(lxlInputError_IDCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 170, 20));

        jTabbedPane1.addTab("Add Customer", pnlAddCustomer);

        jPanel3.setBackground(new java.awt.Color(239, 250, 252));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon_UpdateCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/CustomerManagement_Update&DeleteCustomer.png"))); // NOI18N
        jPanel3.add(lblIcon_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, 135, -1));

        lblCustomerID.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblCustomerID.setForeground(new java.awt.Color(32, 172, 216));
        lblCustomerID.setText("ID");
        jPanel3.add(lblCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 20));

        lblLastName_UpdateCustomer.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblLastName_UpdateCustomer.setForeground(new java.awt.Color(32, 172, 216));
        lblLastName_UpdateCustomer.setText("Last Name");
        jPanel3.add(lblLastName_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 80, -1));

        lblDateOfBirth_UpdateCustomer.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblDateOfBirth_UpdateCustomer.setForeground(new java.awt.Color(32, 172, 216));
        lblDateOfBirth_UpdateCustomer.setText("Date of birth");
        jPanel3.add(lblDateOfBirth_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));
        jPanel3.add(txtLastName_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 180, 32));

        txtUpdateID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUpdateIDMouseClicked(evt);
            }
        });
        txtUpdateID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateIDActionPerformed(evt);
            }
        });
        txtUpdateID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUpdateIDKeyTyped(evt);
            }
        });
        jPanel3.add(txtUpdateID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 230, 32));

        lblGender_UpdateCustomer.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblGender_UpdateCustomer.setForeground(new java.awt.Color(32, 172, 216));
        lblGender_UpdateCustomer.setText("Gender");
        jPanel3.add(lblGender_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        cbbUpdateGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbUpdateGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        cbbUpdateGender.setSelectedIndex(-1);
        cbbUpdateGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbUpdateGenderActionPerformed(evt);
            }
        });
        jPanel3.add(cbbUpdateGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 220, -1));

        lblAddress_UpdateCustomer.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblAddress_UpdateCustomer.setForeground(new java.awt.Color(32, 172, 216));
        lblAddress_UpdateCustomer.setText("Address");
        jPanel3.add(lblAddress_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 338, -1, -1));

        txtUpdateAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateAddressActionPerformed(evt);
            }
        });
        jPanel3.add(txtUpdateAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 338, 540, 32));

        lblPhoneNumber_UpdateCustomer.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblPhoneNumber_UpdateCustomer.setForeground(new java.awt.Color(32, 172, 216));
        lblPhoneNumber_UpdateCustomer.setText("Phone No.");
        jPanel3.add(lblPhoneNumber_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 410, -1, -1));

        txtUpdatePhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUpdatePhoneNumberKeyTyped(evt);
            }
        });
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
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, -1, -1));

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
        btnHome_UpdateCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
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
        jPanel3.add(btnHome_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 76, 58));

        lblUpdateCustomer.setBackground(new java.awt.Color(32, 172, 216));
        lblUpdateCustomer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUpdateCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateCustomer.setText("             Update/ Delete Customer");
        lblUpdateCustomer.setOpaque(true);
        lblUpdateCustomer.setPreferredSize(new java.awt.Dimension(34, 50));
        jPanel3.add(lblUpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 19, 960, 66));

        btnShowInformation.setBackground(new java.awt.Color(32, 172, 216));
        btnShowInformation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnShowInformation.setForeground(new java.awt.Color(255, 255, 255));
        btnShowInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Search.png"))); // NOI18N
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
        jPanel3.add(btnDeleteCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, -1, -1));

        lblIDCard_UpdateCustomer.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblIDCard_UpdateCustomer.setForeground(new java.awt.Color(32, 172, 216));
        lblIDCard_UpdateCustomer.setText("ID Card");
        jPanel3.add(lblIDCard_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 488, -1, -1));

        txtUpdateIDCard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUpdateIDCardKeyTyped(evt);
            }
        });
        jPanel3.add(txtUpdateIDCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 488, 330, 32));
        jPanel3.add(dcDateOfBirth_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 178, 32));

        lblFirstName_UpdateCustomer.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblFirstName_UpdateCustomer.setForeground(new java.awt.Color(32, 172, 216));
        lblFirstName_UpdateCustomer.setText("First Name");
        jPanel3.add(lblFirstName_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 193, 80, -1));
        jPanel3.add(txtFirstName_UpdateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 193, 220, 32));

        lxlInputError_UpdatePhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lxlInputError_UpdatePhoneNumber.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.add(lxlInputError_UpdatePhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 170, 20));

        lxlInputError_UpdateIDCard.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lxlInputError_UpdateIDCard.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.add(lxlInputError_UpdateIDCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 170, 20));

        javax.swing.GroupLayout pnlUpdateCustomerLayout = new javax.swing.GroupLayout(pnlUpdateCustomer);
        pnlUpdateCustomer.setLayout(pnlUpdateCustomerLayout);
        pnlUpdateCustomerLayout.setHorizontalGroup(
            pnlUpdateCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlUpdateCustomerLayout.setVerticalGroup(
            pnlUpdateCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(" Update/ Delete Customer", pnlUpdateCustomer);

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
        new AdminHome_GUI(dtoAdmin);
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
                clearForm();
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
            Customer_DTO dtoCustomer = customer_BUS.getInformation(Integer.parseInt(txtUpdateID.getText()));
            if(dtoCustomer != null)
            {
                int ret = JOptionPane.showConfirmDialog(null, "Are you sure to delete this customer and and all information associated with this supplier?", "Confirm", JOptionPane.YES_NO_OPTION);
                if(ret == JOptionPane.YES_OPTION)
                {
                    if(customer_BUS.delete(dtoCustomer ))
                    {
                        JOptionPane.showMessageDialog(this, "Customer deleted susccessfully...!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        clearForm();
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Cannot delete customers!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
                JOptionPane.showMessageDialog(this, "Customer ID is invalid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void cbbUpdateGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbUpdateGenderActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbbUpdateGenderActionPerformed

    private boolean isValidUpdateForm()
    {
            if(txtLastName_UpdateCustomer.getText().equals("") || txtUpdateID.getText().equals("") || txtUpdateAddress.getText().equals("") || txtUpdatePhoneNumber.getText().equals("") || txtUpdateIDCard.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please show customer information in this form.", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
            else
                return true;
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(isTxtUpdateIDIsFilled())
        {
            Customer_DTO dtoCustomer = customer_BUS.getInformation(Integer.parseInt(txtUpdateID.getText()));
            if(dtoCustomer != null)
            {
                if(isValidUpdateForm())
                {
                   int ret = JOptionPane.showConfirmDialog(null, "Are you sure to update this customer information?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if(ret == JOptionPane.YES_OPTION) 
                    {
                        Customer_DTO ct = new Customer_DTO(Integer.parseInt(txtUpdateID.getText()) , txtFirstName_UpdateCustomer.getText(), txtLastName_UpdateCustomer.getText(), cbbUpdateGender.getSelectedItem().toString(), dcDateOfBirth_UpdateCustomer.getDate(), txtUpdateAddress.getText(), txtUpdatePhoneNumber.getText(), txtUpdateIDCard.getText());
                        if(customer_BUS.update(ct))
                        {
                            JOptionPane.showMessageDialog(this, "Customer updated susccessfully...!", "Success", JOptionPane.INFORMATION_MESSAGE);
                            clearForm();
                        }
                        else
                            JOptionPane.showMessageDialog(this, "Cannot update customers!", "Error", JOptionPane.ERROR_MESSAGE);
                    } 
                }
            }
            else
                JOptionPane.showMessageDialog(this, "Customer ID is invalid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
   
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    
    private void btnShowInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowInformationActionPerformed
        // TODO add your handling code here:
        if(isTxtUpdateIDIsFilled())
        {
            Customer_DTO dtoCustomer = customer_BUS.getInformation(Integer.parseInt(txtUpdateID.getText()));
            if(dtoCustomer != null)
            {
                txtFirstName_UpdateCustomer.setText(dtoCustomer.getFirstName());
                txtLastName_UpdateCustomer.setText(dtoCustomer.getLastName());
                cbbUpdateGender.setSelectedItem(dtoCustomer.getGender());
                dcDateOfBirth_UpdateCustomer.setDate(dtoCustomer.getDateOfBirth());
                txtUpdateAddress.setText(dtoCustomer.getAddress());
                txtUpdatePhoneNumber.setText(dtoCustomer.getPhoneNumber());
                txtUpdateIDCard.setText(dtoCustomer.getIDCard());
            }
            else
                JOptionPane.showMessageDialog(this, "No customer information found!", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnShowInformationActionPerformed

    private void txtUpdateAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateAddressActionPerformed

    private void btnHome_UpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_UpdateCustomerActionPerformed
        new AdminHome_GUI(dtoAdmin);
        this.setVisible(false);
    }//GEN-LAST:event_btnHome_UpdateCustomerActionPerformed

    private void btnHome_ViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_ViewCustomerActionPerformed
        new AdminHome_GUI(dtoAdmin);
        this.setVisible(false);
    }//GEN-LAST:event_btnHome_ViewCustomerActionPerformed

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyTyped
       char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)){
            //getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneNumberKeyTyped

    private void txtIDCardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDCardKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)){
            //getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtIDCardKeyTyped

    private void txtUpdatePhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdatePhoneNumberKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)){
            //getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtUpdatePhoneNumberKeyTyped

    private void txtUpdateIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateIDKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)){
            //getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtUpdateIDKeyTyped

    private void txtUpdateIDCardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateIDCardKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)){
            //getToolkit().beep();
            evt.consume();
            lxlInputError_UpdateIDCard.setText("This field only accepts numbers");
        }
        else 
        {
            lxlInputError_UpdateIDCard.setText("");
        }
    }//GEN-LAST:event_txtUpdateIDCardKeyTyped

    private void btnExportCustomerListReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportCustomerListReportActionPerformed
        customer_BUS.showCustomerList();
    }//GEN-LAST:event_btnExportCustomerListReportActionPerformed

    private void txtUpdateIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateIDActionPerformed

    private void txtUpdateIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUpdateIDMouseClicked
        txtFirstName_UpdateCustomer.setText("");
        txtLastName_UpdateCustomer.setText("");
        cbbUpdateGender.setSelectedItem(null);
        dcDateOfBirth_UpdateCustomer.setDate(null);
        txtUpdateAddress.setText("");
        txtUpdatePhoneNumber.setText("");
        txtUpdateIDCard.setText("");
    }//GEN-LAST:event_txtUpdateIDMouseClicked

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
    private javax.swing.JButton btnExportCustomerListReport;
    private javax.swing.JButton btnHome_AddCustomer;
    private javax.swing.JButton btnHome_UpdateCustomer;
    private javax.swing.JButton btnHome_ViewCustomer;
    private javax.swing.JButton btnShowInformation;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JComboBox<String> cbGender_AddCustomer;
    private javax.swing.JComboBox<String> cbbUpdateGender;
    private com.toedter.calendar.JDateChooser dcDateOfBirth_AddCustomer;
    private com.toedter.calendar.JDateChooser dcDateOfBirth_UpdateCustomer;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAddCustomer;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAddress_UpdateCustomer;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblDateOfBirth_UpdateCustomer;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName_UpdateCustomer;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGender_UpdateCustomer;
    private javax.swing.JLabel lblIDCard;
    private javax.swing.JLabel lblIDCard_UpdateCustomer;
    private javax.swing.JLabel lblIcon_AddCustomer;
    private javax.swing.JLabel lblIcon_UpdateCustomer;
    private javax.swing.JLabel lblIcon_ViewCustomer;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLastName_UpdateCustomer;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblPhoneNumber_UpdateCustomer;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblUpdateCustomer;
    private javax.swing.JLabel lblViewCustomer;
    private javax.swing.JLabel lxlInputError_IDCard;
    private javax.swing.JLabel lxlInputError_PhoneNumber;
    private javax.swing.JLabel lxlInputError_UpdateIDCard;
    private javax.swing.JLabel lxlInputError_UpdatePhoneNumber;
    private javax.swing.JPanel pnlAddCustomer;
    private javax.swing.JPanel pnlUpdateCustomer;
    private javax.swing.JPanel pnlViewCustomer;
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

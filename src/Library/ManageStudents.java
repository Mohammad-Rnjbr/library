package Library;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import static net.proteanit.sql.DbUtils.resultSetToTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageStudents extends javax.swing.JFrame {

    public ManageStudents() {
        initComponents();
        showPieChart_Course();
        showPieChart_Branch();
        showData();
    }

    Color mouseEnteredColor = new Color(0,0,0);
    Color mouseExitedColor = new Color(51,51,51);
    Color lblExitedColor = new Color(153,153,153);
    
    int id ;
    boolean flag = false ;
    
    String[] computer = {"Operating System","Computer Networks","Graphics","AI"};
    String[] mechanic = {"Mechatronics","Marine Engineering","Nuclear Engineering","Auto Mechanic"};
    String[] electrical = {"Control Engineering","Electronic Engineering","Power engineering","Electromagnetism"};
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panel_home = new javax.swing.JPanel();
        lbl_home = new javax.swing.JLabel();
        panel_logout = new javax.swing.JPanel();
        lbl_logout = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panel_homePage = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        panel_manageBook = new javax.swing.JPanel();
        lbl_manageBook = new javax.swing.JLabel();
        panel_manageStudent = new javax.swing.JPanel();
        lbl_manageStudent = new javax.swing.JLabel();
        panel_issueBook = new javax.swing.JPanel();
        lbl_issueBook = new javax.swing.JLabel();
        panel_returnBook = new javax.swing.JPanel();
        lbl_returnBook = new javax.swing.JLabel();
        panel_viewRecord = new javax.swing.JPanel();
        lbl_viewrecord = new javax.swing.JLabel();
        panel_viewIssueBook = new javax.swing.JPanel();
        lbl_viewissueBook = new javax.swing.JLabel();
        panel_defaulterList = new javax.swing.JPanel();
        lbl_defaulterList = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_id = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_name = new app.bolivia.swing.JCTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        cmb_course = new javax.swing.JComboBox();
        cmb_branch = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_showStudents = new rojerusan.RSTableMetro();
        panelPieChart_course = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        btn_add = new rojerusan.RSMaterialButtonRectangle();
        btn_delete = new rojerusan.RSMaterialButtonRectangle();
        btn_update = new rojerusan.RSMaterialButtonRectangle();
        btn_clear = new rojerusan.RSMaterialButtonRectangle();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        panelPieChart_branch = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 6, 4, 50));

        lbl_title.setFont(new java.awt.Font("Tunga", 0, 20)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setText("Library Management System");
        jPanel1.add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 14, 210, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/male_user_50px.png"))); // NOI18N
        jLabel3.setText("Welcome , Admin");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 210, 60));

        lbl_close.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_close.setForeground(new java.awt.Color(255, 255, 255));
        lbl_close.setText("X");
        lbl_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_closeMouseExited(evt);
            }
        });
        jPanel1.add(lbl_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 10, 20, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, 60));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_home.setBackground(new java.awt.Color(255, 51, 51));
        panel_home.setToolTipText("");
        panel_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_homeMouseExited(evt);
            }
        });
        panel_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_home.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        lbl_home.setForeground(new java.awt.Color(255, 255, 255));
        lbl_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        lbl_home.setText("   Home Page");
        panel_home.add(lbl_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, -1, -1));

        jPanel2.add(panel_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 290, 50));

        panel_logout.setBackground(new java.awt.Color(102, 102, 255));
        panel_logout.setToolTipText("");
        panel_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_logoutMouseExited(evt);
            }
        });
        panel_logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logout.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        lbl_logout.setForeground(new java.awt.Color(255, 255, 255));
        lbl_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        lbl_logout.setText("   Logout");
        panel_logout.add(lbl_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, -1, -1));

        jPanel2.add(panel_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 290, 50));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Features");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        panel_homePage.setBackground(new java.awt.Color(0, 0, 0));
        panel_homePage.setToolTipText("→");
        panel_homePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_homePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_homePageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_homePageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_homePageMouseExited(evt);
            }
        });
        panel_homePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_dashboard.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        lbl_dashboard.setForeground(new java.awt.Color(153, 153, 153));
        lbl_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Library_26px_1.png"))); // NOI18N
        lbl_dashboard.setText("   LMS Dashboard");
        panel_homePage.add(lbl_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, 180, -1));

        jPanel2.add(panel_homePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 290, 50));

        panel_manageBook.setBackground(new java.awt.Color(51, 51, 51));
        panel_manageBook.setToolTipText("");
        panel_manageBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_manageBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_manageBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_manageBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_manageBookMouseExited(evt);
            }
        });
        panel_manageBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_manageBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        lbl_manageBook.setForeground(new java.awt.Color(153, 153, 153));
        lbl_manageBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Book_26px.png"))); // NOI18N
        lbl_manageBook.setText("   Manage Books");
        panel_manageBook.add(lbl_manageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, -1, -1));

        jPanel2.add(panel_manageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 290, 50));

        panel_manageStudent.setBackground(new java.awt.Color(51, 51, 51));
        panel_manageStudent.setToolTipText("This is the page");
        panel_manageStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_manageStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_manageStudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_manageStudentMouseExited(evt);
            }
        });
        panel_manageStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_manageStudent.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        lbl_manageStudent.setForeground(new java.awt.Color(153, 153, 153));
        lbl_manageStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Read_Online_26px.png"))); // NOI18N
        lbl_manageStudent.setText("   Manage Students");
        panel_manageStudent.add(lbl_manageStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, 180, -1));

        jPanel2.add(panel_manageStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 290, 50));

        panel_issueBook.setBackground(new java.awt.Color(51, 51, 51));
        panel_issueBook.setToolTipText("");
        panel_issueBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_issueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_issueBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_issueBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_issueBookMouseExited(evt);
            }
        });
        panel_issueBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_issueBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        lbl_issueBook.setForeground(new java.awt.Color(153, 153, 153));
        lbl_issueBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        lbl_issueBook.setText("   Issue Book");
        panel_issueBook.add(lbl_issueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, 130, -1));

        jPanel2.add(panel_issueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 290, 50));

        panel_returnBook.setBackground(new java.awt.Color(51, 51, 51));
        panel_returnBook.setToolTipText("");
        panel_returnBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_returnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_returnBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_returnBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_returnBookMouseExited(evt);
            }
        });
        panel_returnBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_returnBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        lbl_returnBook.setForeground(new java.awt.Color(153, 153, 153));
        lbl_returnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Return_Purchase_26px.png"))); // NOI18N
        lbl_returnBook.setText("   Return Book");
        panel_returnBook.add(lbl_returnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, 140, -1));

        jPanel2.add(panel_returnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 290, 50));

        panel_viewRecord.setBackground(new java.awt.Color(51, 51, 51));
        panel_viewRecord.setToolTipText("");
        panel_viewRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_viewRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_viewRecordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_viewRecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_viewRecordMouseExited(evt);
            }
        });
        panel_viewRecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_viewrecord.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        lbl_viewrecord.setForeground(new java.awt.Color(153, 153, 153));
        lbl_viewrecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_View_Details_26px.png"))); // NOI18N
        lbl_viewrecord.setText("   View Records");
        panel_viewRecord.add(lbl_viewrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, 170, -1));

        jPanel2.add(panel_viewRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 290, 50));

        panel_viewIssueBook.setBackground(new java.awt.Color(51, 51, 51));
        panel_viewIssueBook.setToolTipText("");
        panel_viewIssueBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_viewIssueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_viewIssueBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_viewIssueBookMouseExited(evt);
            }
        });
        panel_viewIssueBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_viewissueBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        lbl_viewissueBook.setForeground(new java.awt.Color(153, 153, 153));
        lbl_viewissueBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Books_26px.png"))); // NOI18N
        lbl_viewissueBook.setText("   View Issue Books");
        panel_viewIssueBook.add(lbl_viewissueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, 190, -1));

        jPanel2.add(panel_viewIssueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 290, 50));

        panel_defaulterList.setBackground(new java.awt.Color(51, 51, 51));
        panel_defaulterList.setToolTipText("");
        panel_defaulterList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_defaulterList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_defaulterListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_defaulterListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_defaulterListMouseExited(evt);
            }
        });
        panel_defaulterList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_defaulterList.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 15)); // NOI18N
        lbl_defaulterList.setForeground(new java.awt.Color(153, 153, 153));
        lbl_defaulterList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Conference_26px.png"))); // NOI18N
        lbl_defaulterList.setText("   Defaulter List");
        panel_defaulterList.add(lbl_defaulterList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 12, -1, -1));

        jPanel2.add(panel_defaulterList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 290, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 290, 800));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(102, 102, 255));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Contact_26px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Student ID");

        txt_id.setEditable(false);
        txt_id.setBackground(new java.awt.Color(102, 102, 255));
        txt_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_id.setPlaceholder("Show Book ID ");

        jLabel12.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Student Name");
        jLabel13.setToolTipText("");

        txt_name.setBackground(new java.awt.Color(102, 102, 255));
        txt_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_name.setPlaceholder("Enter Book Name ...");

        jLabel14.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Collaborator_Male_26px.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Course");

        jLabel17.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Unit_26px.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Branch");

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        cmb_course.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        cmb_course.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--No Selected--", "Computer", "Mechanic", "Electrical" }));
        cmb_course.setPreferredSize(new java.awt.Dimension(56, 28));

        cmb_branch.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        cmb_branch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--No Selected--" }));
        cmb_branch.setPreferredSize(new java.awt.Dimension(56, 28));
        cmb_branch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_branchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmb_course, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(59, 59, 59))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(cmb_branch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(59, 59, 59))))))
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel15)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(cmb_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Student_Male_100px.png"))); // NOI18N
        jLabel4.setText("   Manage Students");

        tbl_showStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Course", "Branch"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_showStudents.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        tbl_showStudents.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        tbl_showStudents.setColorFilasBackgound2(new java.awt.Color(217, 217, 246));
        tbl_showStudents.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tbl_showStudents.setColorSelBackgound(new java.awt.Color(224, 99, 99));
        tbl_showStudents.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        tbl_showStudents.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tbl_showStudents.setFuenteHead(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        tbl_showStudents.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_showStudents.setRowHeight(30);
        tbl_showStudents.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tbl_showStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_showStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_showStudents);

        panelPieChart_course.setLayout(new java.awt.BorderLayout());

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Course Details");

        btn_add.setBackground(new java.awt.Color(20, 239, 64));
        btn_add.setText("add");
        btn_add.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 51, 51));
        btn_delete.setText("delete");
        btn_delete.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(9, 191, 191));
        btn_update.setText("update ");
        btn_update.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(204, 204, 0));
        btn_clear.setText("clear");
        btn_clear.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Students Details");

        panelPieChart_branch.setLayout(new java.awt.BorderLayout());

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Branch Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jLabel4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(panelPieChart_course, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel27))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel29)
                                                .addComponent(panelPieChart_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(21, 21, 21))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPieChart_course, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPieChart_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 1300, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseClicked

        System.exit(0);
        
    }//GEN-LAST:event_lbl_closeMouseClicked

    private void lbl_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseEntered

        lbl_close.setForeground(new Color(255,51,51));
        
    }//GEN-LAST:event_lbl_closeMouseEntered

    private void lbl_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseExited

        lbl_close.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_lbl_closeMouseExited

    private void panel_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homeMouseEntered

        panel_home.setBackground(new Color(211,28,28));
    }//GEN-LAST:event_panel_homeMouseEntered

    private void panel_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homeMouseExited

        panel_home.setBackground(new Color(255,51,51));
        
    }//GEN-LAST:event_panel_homeMouseExited

    private void panel_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_logoutMouseClicked

        this.dispose();
        new Login().setVisible(true);
        
    }//GEN-LAST:event_panel_logoutMouseClicked

    private void panel_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_logoutMouseEntered

        panel_logout.setBackground(new Color(51,51,255));
        lbl_logout.setForeground(new Color(180,180,180));
        
    }//GEN-LAST:event_panel_logoutMouseEntered

    private void panel_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_logoutMouseExited

        panel_logout.setBackground(new Color(102,102,255));
        lbl_logout.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_panel_logoutMouseExited

    private void panel_homePageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homePageMouseEntered

        panel_homePage.setBackground(new Color(70,70,70));
        lbl_dashboard.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_panel_homePageMouseEntered

    private void panel_homePageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homePageMouseExited

        panel_homePage.setBackground(mouseEnteredColor);
        lbl_dashboard.setForeground(lblExitedColor);
    }//GEN-LAST:event_panel_homePageMouseExited

    private void panel_manageBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_manageBookMouseEntered

        panel_manageBook.setBackground(mouseEnteredColor);
        lbl_manageBook.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_panel_manageBookMouseEntered

    private void panel_manageBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_manageBookMouseExited

        panel_manageBook.setBackground(mouseExitedColor);
        lbl_manageBook.setForeground(lblExitedColor);
        
    }//GEN-LAST:event_panel_manageBookMouseExited

    private void panel_manageStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_manageStudentMouseEntered

        panel_manageStudent.setBackground(mouseEnteredColor);
        lbl_manageStudent.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_panel_manageStudentMouseEntered

    private void panel_manageStudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_manageStudentMouseExited

        panel_manageStudent.setBackground(mouseExitedColor);
        lbl_manageStudent.setForeground(lblExitedColor);
        
    }//GEN-LAST:event_panel_manageStudentMouseExited

    private void panel_issueBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_issueBookMouseEntered

        panel_issueBook.setBackground(mouseEnteredColor);
        lbl_issueBook.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_panel_issueBookMouseEntered

    private void panel_issueBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_issueBookMouseExited

        panel_issueBook.setBackground(mouseExitedColor);
        lbl_issueBook.setForeground(lblExitedColor);
        
    }//GEN-LAST:event_panel_issueBookMouseExited

    private void panel_returnBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_returnBookMouseEntered

        panel_returnBook.setBackground(mouseEnteredColor);
        lbl_returnBook.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_panel_returnBookMouseEntered

    private void panel_returnBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_returnBookMouseExited

        panel_returnBook.setBackground(mouseExitedColor);
        lbl_returnBook.setForeground(lblExitedColor);
        
    }//GEN-LAST:event_panel_returnBookMouseExited

    private void panel_viewRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_viewRecordMouseEntered

        panel_viewRecord.setBackground(mouseEnteredColor);
        lbl_viewrecord.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_panel_viewRecordMouseEntered

    private void panel_viewRecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_viewRecordMouseExited

        panel_viewRecord.setBackground(mouseExitedColor);
        lbl_viewrecord.setForeground(lblExitedColor);
        
    }//GEN-LAST:event_panel_viewRecordMouseExited

    private void panel_viewIssueBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_viewIssueBookMouseEntered

        panel_viewIssueBook.setBackground(mouseEnteredColor);
        lbl_viewissueBook.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_panel_viewIssueBookMouseEntered

    private void panel_viewIssueBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_viewIssueBookMouseExited

        panel_viewIssueBook.setBackground(mouseExitedColor);
        lbl_viewissueBook.setForeground(lblExitedColor);
        
    }//GEN-LAST:event_panel_viewIssueBookMouseExited

    private void panel_defaulterListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_defaulterListMouseEntered

        panel_defaulterList.setBackground(mouseEnteredColor);
        lbl_defaulterList.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_panel_defaulterListMouseEntered

    private void panel_defaulterListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_defaulterListMouseExited

        panel_defaulterList.setBackground(mouseExitedColor);
        lbl_defaulterList.setForeground(lblExitedColor);
        
    }//GEN-LAST:event_panel_defaulterListMouseExited

    private void tbl_showStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_showStudentsMouseClicked

        DefaultTableModel model = (DefaultTableModel) tbl_showStudents.getModel();
        int myIndex = tbl_showStudents.getSelectedRow();
        
        flag = true ;
        txt_id.setText(model.getValueAt(myIndex,0).toString());
        txt_name.setText(model.getValueAt(myIndex,1).toString());
        cmb_course.setSelectedItem(model.getValueAt(myIndex,2));
        cmb_branch.setSelectedItem(model.getValueAt(myIndex,3));

    }//GEN-LAST:event_tbl_showStudentsMouseClicked

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        if(validateInputs()){
            if(!flag){
                insertStudents();
            } else {
                JOptionPane.showMessageDialog(this,"This student is already registered","Wrong",JOptionPane.ERROR_MESSAGE);
            }    
        }

    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        if(flag){
            int i = JOptionPane.showOptionDialog(this,"Are you sure of deleting this student?","Delete",
                    JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null);
            switch(i){
                
                case 0 :
                    deleteStudents();
                    break;
                case 1 :
                    clear();
                    break;
            }
            
        } else {
            JOptionPane.showMessageDialog(this,"Please select the desired student");
        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        if(flag){
            updateStudents();
        } else {
            JOptionPane.showMessageDialog(this,"Please select the desired student");
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        clear();

    }//GEN-LAST:event_btn_clearActionPerformed

    private void panel_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homeMouseClicked
        
        this.dispose();
        new Home().setVisible(true);
        
    }//GEN-LAST:event_panel_homeMouseClicked

    private void panel_homePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homePageMouseClicked
        
        this.dispose();
        new Home().setVisible(true);
        
    }//GEN-LAST:event_panel_homePageMouseClicked

    private void panel_manageBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_manageBookMouseClicked
        
        this.dispose();
        new ManageBooks().setVisible(true); 
        
    }//GEN-LAST:event_panel_manageBookMouseClicked

    private void cmb_branchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_branchMouseClicked
        
        cmb_branch.removeAllItems();
        cmb_branch.addItem("--No Selected--");
        
        String course = cmb_course.getSelectedItem().toString() ;
        
        switch(course){
            
            case "--No Selected--" :
                cmb_branch.removeAllItems();
                cmb_branch.addItem("--No Selected--");
                break ;
                
            case "Computer" :
                for(String c : computer){
                    cmb_branch.addItem(c); 
                }
                break ;
                
            case "Mechanic" :
                for(String m : mechanic){
                    cmb_branch.addItem(m); 
                }
                break ;
                
            case "Electrical" :
                for(String e : electrical){
                    cmb_branch.addItem(e); 
                }
                break ;
                
        }
        
    }//GEN-LAST:event_cmb_branchMouseClicked

    private void panel_issueBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_issueBookMouseClicked
        
        this.dispose();
        new IssueBook().setVisible(true); 
        
    }//GEN-LAST:event_panel_issueBookMouseClicked

    private void panel_returnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_returnBookMouseClicked
        
        this.dispose();
        new ReturnBook().setVisible(true); 
        
    }//GEN-LAST:event_panel_returnBookMouseClicked

    private void panel_defaulterListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_defaulterListMouseClicked
        
        this.dispose();
        new DefaulterList().setVisible(true);
        
    }//GEN-LAST:event_panel_defaulterListMouseClicked

    private void panel_viewRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_viewRecordMouseClicked
        
        this.dispose();
        new ViewRecords().setVisible(true);
        
    }//GEN-LAST:event_panel_viewRecordMouseClicked

    private void showData(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query = "select * from students" ;
            ResultSet result = state.executeQuery(query);
            
            tbl_showStudents.setModel(resultSetToTableModel(result)); 
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            //ex.printStackTrace();
        }
        
    }
    
    private void showPieChart_Course(){
        
        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );

      try{
          
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          String url = "jdbc:mysql://localhost:3306/library?user=root" ;
          Connection connect = DriverManager.getConnection(url);
          Statement state = connect.createStatement();
          String query = "select Course , count(Course) from students group by Course" ;
          ResultSet result = state.executeQuery(query);
          
          while(result.next()){
              barDataset.setValue(result.getString(1),new Integer(result.getInt(2))); 
          }
          
          state.close();
          connect.close();
          
      }
      catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
          //ex.printStackTrace();       
      }
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("",barDataset,true,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
        piePlot.setBackgroundPaint(new Color(240,240,240));
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelPieChart_course.removeAll();
        panelPieChart_course.add(barChartPanel, BorderLayout.CENTER);
        panelPieChart_course.validate();
        
    }
    
    private void showPieChart_Branch(){
        
        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );

      try{
          
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          String url = "jdbc:mysql://localhost:3306/library?user=root" ;
          Connection connect = DriverManager.getConnection(url);
          Statement state = connect.createStatement();
          String query = "select Branch , count(Branch) from students group by Branch" ;
          ResultSet result = state.executeQuery(query);
          
          while(result.next()){
              barDataset.setValue(result.getString(1),new Integer(result.getInt(2))); 
          }
          
          state.close();
          connect.close();
          
      }
      catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
          //ex.printStackTrace();       
      }
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("",barDataset,true,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
        piePlot.setBackgroundPaint(new Color(240,240,240));
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelPieChart_branch.removeAll();
        panelPieChart_branch.add(barChartPanel, BorderLayout.CENTER);
        panelPieChart_branch.validate();
        
    }
    
    private void clear(){
        
        flag = false ;
        txt_id.setText("");
        txt_name.setText("");
        cmb_course.setSelectedIndex(0);
        cmb_branch.setSelectedIndex(0);
        
    }
    
    private boolean validateInputs(){
        
        String name = txt_name.getText().trim();
        
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter the name of the student");
            return false ;
        }
        if(cmb_course.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this,"Please select a course");
            return false ;
        }
        if(cmb_branch.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this,"Please select a branch");
            return false ;
        }
        
        return true ;
        
    }
    
    private void productionID(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query = "select max(ID) from students " ;
            ResultSet result = state.executeQuery(query);
            
            result.next();
            id = result.getInt(1) + 1 ;
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            //ex.printStackTrace();
        }
        
    }
    
    private void insertStudents(){
        
        productionID();
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query = "insert into students (ID,Name,Course,Branch) values(%s,'%s','%s','%s')" ;
            query = String.format(query,id,txt_name.getText(),cmb_course.getSelectedItem(),cmb_branch.getSelectedItem());
            int result = state.executeUpdate(query);
            
            if(result > 0){
                JOptionPane.showMessageDialog(this,"Student added successfully");
                showPieChart_Course();
                showPieChart_Branch();
                showData();
                clear();
            } else {
                JOptionPane.showMessageDialog(this,"The student was not added");
                clear();
            }
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            //ex.printStackTrace();
        }
        
    }
    
    private void updateStudents(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query = "update students set Name='%s' , Course='%s' , Branch='%s' where ID=%s" ;
            query = String.format(query,txt_name.getText(),cmb_course.getSelectedItem(),cmb_branch.getSelectedItem(),txt_id.getText());
            int result = state.executeUpdate(query);
            
            if(result > 0){
                JOptionPane.showMessageDialog(this,"Student information has been successfully updated");
                showPieChart_Course();
                showPieChart_Branch();
                showData();
                clear();
            } else {
                JOptionPane.showMessageDialog(this,"Student information was not updated","Wrong",JOptionPane.ERROR_MESSAGE);
                clear();
            }
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            //ex.printStackTrace();
        }
        
    }
    
    private void deleteStudents(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query = "delete from students where ID=%s" ;
            query = String.format(query,txt_id.getText());
            int result = state.executeUpdate(query);
            
            if(result > 0){
                JOptionPane.showMessageDialog(this,"The student was successfully removed");
                showPieChart_Course();
                showPieChart_Branch();
                showData();
                clear();
            } else {
                JOptionPane.showMessageDialog(this,"The student was not removed");
                clear();
            }
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            ex.printStackTrace();
        }
        
    }
    
    // main
            
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new ManageStudents().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_add;
    private rojerusan.RSMaterialButtonRectangle btn_clear;
    private rojerusan.RSMaterialButtonRectangle btn_delete;
    private rojerusan.RSMaterialButtonRectangle btn_update;
    private javax.swing.JComboBox cmb_branch;
    private javax.swing.JComboBox cmb_course;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_defaulterList;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_issueBook;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_manageBook;
    private javax.swing.JLabel lbl_manageStudent;
    private javax.swing.JLabel lbl_returnBook;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_viewissueBook;
    private javax.swing.JLabel lbl_viewrecord;
    private javax.swing.JPanel panelPieChart_branch;
    private javax.swing.JPanel panelPieChart_course;
    private javax.swing.JPanel panel_defaulterList;
    private javax.swing.JPanel panel_home;
    private javax.swing.JPanel panel_homePage;
    private javax.swing.JPanel panel_issueBook;
    private javax.swing.JPanel panel_logout;
    private javax.swing.JPanel panel_manageBook;
    private javax.swing.JPanel panel_manageStudent;
    private javax.swing.JPanel panel_returnBook;
    private javax.swing.JPanel panel_viewIssueBook;
    private javax.swing.JPanel panel_viewRecord;
    private rojerusan.RSTableMetro tbl_showStudents;
    private app.bolivia.swing.JCTextField txt_id;
    private app.bolivia.swing.JCTextField txt_name;
    // End of variables declaration//GEN-END:variables
}

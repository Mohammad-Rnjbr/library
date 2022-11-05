package Library;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class ReturnBook extends javax.swing.JFrame {

    public ReturnBook() {
        initComponents();
        showPieChart();
    }

    boolean flag = false ;
    
    Color mouseEnteredColor = new Color(0,0,0);
    Color mouseExitedColor = new Color(51,51,51);
    Color lblExitedColor = new Color(153,153,153);
    
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
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_issueId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_studentId = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_studentName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_bookId = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_bookName = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_issueDate = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_dueDate = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txt_bookId = new app.bolivia.swing.JCTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_studentId = new app.bolivia.swing.JCTextField();
        btn_findDetails = new rojerusan.RSMaterialButtonRectangle();
        btn_return = new rojerusan.RSMaterialButtonRectangle();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbl_book = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbl_student = new javax.swing.JLabel();
        panelPieChart = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();

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
        panel_manageStudent.setToolTipText("");
        panel_manageStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_manageStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_manageStudentMouseClicked(evt);
            }
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
        panel_issueBook.setToolTipText("This is the page");
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
        panel_returnBook.setToolTipText("This is the page");
        panel_returnBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_returnBook.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jPanel9.setBackground(new java.awt.Color(134, 134, 235));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Literature_100px_1.png"))); // NOI18N
        jLabel2.setText("  Issued Details");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Issue ID :");

        lbl_issueId.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_issueId.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student ID :");

        lbl_studentId.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_studentId.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Student Name : ");

        lbl_studentName.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_studentName.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Book ID :");

        lbl_bookId.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_bookId.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Book Name :");

        lbl_bookName.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_bookName.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Issue Date : ");

        lbl_issueDate.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_issueDate.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Due Date : ");

        lbl_dueDate.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_dueDate.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)))
                .addGap(0, 54, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(19, 19, 19)
                            .addComponent(lbl_studentName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(45, 45, 45)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_bookId, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_bookName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(51, 51, 51)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_studentId, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_issueId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(lbl_issueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(lbl_dueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(37, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(296, 296, 296)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lbl_issueId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lbl_studentId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lbl_studentName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(lbl_bookId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(lbl_bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(lbl_issueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(lbl_dueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(135, Short.MAX_VALUE)))
        );

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        jLabel19.setText("  Return Book");

        jPanel7.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jLabel21.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setText("Book ID :");
        jLabel21.setToolTipText("");

        txt_bookId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        txt_bookId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_bookId.setPlaceholder("Enter Book ID ...");

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setText("Student ID :");
        jLabel22.setToolTipText("");

        txt_studentId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        txt_studentId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_studentId.setPlaceholder("Enter Student ID ...");

        btn_findDetails.setBackground(new java.awt.Color(255, 51, 51));
        btn_findDetails.setText("find details");
        btn_findDetails.setFont(new java.awt.Font("Roboto Medium", 1, 17)); // NOI18N
        btn_findDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findDetailsActionPerformed(evt);
            }
        });

        btn_return.setBackground(new java.awt.Color(51, 51, 255));
        btn_return.setText("return book");
        btn_return.setFont(new java.awt.Font("Roboto Medium", 1, 17)); // NOI18N
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("No Of Book Issued");

        jPanel6.setBackground(new java.awt.Color(226, 226, 226));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 51)));
        jPanel6.setPreferredSize(new java.awt.Dimension(164, 99));

        lbl_book.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        lbl_book.setForeground(new java.awt.Color(102, 102, 102));
        lbl_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Sell_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 52, Short.MAX_VALUE)
                    .addComponent(lbl_book, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 53, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_book)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("No Of Student Issued Book");

        jPanel8.setBackground(new java.awt.Color(226, 226, 226));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(102, 102, 255)));
        jPanel8.setPreferredSize(new java.awt.Dimension(164, 99));

        lbl_student.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        lbl_student.setForeground(new java.awt.Color(102, 102, 102));
        lbl_student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Book_Shelf_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 52, Short.MAX_VALUE)
                    .addComponent(lbl_student, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 53, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_student)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelPieChart.setLayout(new java.awt.BorderLayout());

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Issued Book Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_findDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(32, 32, 32)
                                        .addComponent(txt_bookId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_studentId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addGap(41, 41, 41))))))
                            .addComponent(panelPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_bookId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_studentId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_findDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void panel_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homeMouseClicked

        this.dispose();
        new Home().setVisible(true);
        
    }//GEN-LAST:event_panel_homeMouseClicked

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

    private void panel_homePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homePageMouseClicked

        this.dispose();
        new Home().setVisible(true);
        
    }//GEN-LAST:event_panel_homePageMouseClicked

    private void panel_homePageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homePageMouseEntered

        panel_homePage.setBackground(new Color(70,70,70));
        lbl_dashboard.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_panel_homePageMouseEntered

    private void panel_homePageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homePageMouseExited

        panel_homePage.setBackground(mouseEnteredColor);
        lbl_dashboard.setForeground(lblExitedColor);

    }//GEN-LAST:event_panel_homePageMouseExited

    private void panel_manageBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_manageBookMouseClicked

        this.dispose();
        new ManageBooks().setVisible(true);
    }//GEN-LAST:event_panel_manageBookMouseClicked

    private void panel_manageBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_manageBookMouseEntered

        panel_manageBook.setBackground(mouseEnteredColor);
        lbl_manageBook.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_panel_manageBookMouseEntered

    private void panel_manageBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_manageBookMouseExited

        panel_manageBook.setBackground(mouseExitedColor);
        lbl_manageBook.setForeground(lblExitedColor);
        
    }//GEN-LAST:event_panel_manageBookMouseExited

    private void panel_manageStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_manageStudentMouseClicked

        this.dispose();
        new ManageStudents().setVisible(true);

    }//GEN-LAST:event_panel_manageStudentMouseClicked

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

    private void btn_findDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findDetailsActionPerformed

        flag = true ;
        if(validateInputs()){
            findIssuedInformation();
        }

    }//GEN-LAST:event_btn_findDetailsActionPerformed

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        
        if(validateInputs()){
            if(flag){
                retunBooks();
            } else {
                JOptionPane.showMessageDialog(this,"Please make sure the information is correct first\nPress the find details button");
            }
        }
        
    }//GEN-LAST:event_btn_returnActionPerformed

    private void panel_issueBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_issueBookMouseClicked
        
        this.dispose();
        new IssueBook().setVisible(true);
        
    }//GEN-LAST:event_panel_issueBookMouseClicked

    private void panel_defaulterListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_defaulterListMouseClicked
        
        this.dispose();
        new DefaulterList().setVisible(true);
        
    }//GEN-LAST:event_panel_defaulterListMouseClicked

    private void panel_viewRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_viewRecordMouseClicked
        
        this.dispose();
        new ViewRecords().setVisible(true);
        
    }//GEN-LAST:event_panel_viewRecordMouseClicked

    private void showPieChart(){
        
        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );
 
      try{
          
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          String url = "jdbc:mysql://localhost:3306/library?user=root" ;
          Connection connect = DriverManager.getConnection(url);
          Statement state = connect.createStatement();
          String query = "select BookName , count(BookID) from issuebook group by BookID" ;
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
        panelPieChart.removeAll();
        panelPieChart.add(barChartPanel, BorderLayout.CENTER);
        panelPieChart.validate();
        
    }
    
    private boolean validateInputs(){
        
        String bookId = txt_bookId.getText().trim();
        String studentID = txt_studentId.getText().trim();
        
        if(bookId.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter the ID of the book");
            return false ;
        }
        if(!bookId.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this,"The ID of the book can only be a number","Wrong",JOptionPane.ERROR_MESSAGE);
            return false ;
        }
        if(studentID.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter the student ID");
            return false ;
        }
        if(!studentID.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this,"Student ID can only be a number","Wrong",JOptionPane.ERROR_MESSAGE);
            return false ;
        }
        
        return true ;
        
    }
    
    private void clear(){
        
        flag = false ;
        txt_bookId.setText("");
        txt_studentId.setText("");
        lbl_issueId.setText("");
        lbl_bookId.setText("");
        lbl_bookName.setText("");
        lbl_studentId.setText("");
        lbl_studentName.setText("");
        lbl_issueDate.setText("");
        lbl_dueDate.setText("");
        lbl_book.setText("");
        lbl_student.setText(""); 
        
    }
    
    private void findIssuedInformation(){
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query = "select * from issuebook where BookID=%s && StudentID=%s && Status='%s' ";
            query = String.format(query,txt_bookId.getText(),txt_studentId.getText(),"Pending");
            ResultSet result = state.executeQuery(query);
            
            if(result.next()){
                
                lbl_issueId.setText(result.getString(1));
                lbl_bookId.setText(result.getString(2));
                lbl_bookName.setText(result.getString(3));
                lbl_studentId.setText(result.getString(4));
                lbl_studentName.setText(result.getString(5));
                lbl_issueDate.setText(result.getString(6));
                lbl_dueDate.setText(result.getString(7));
                showCountData();
                
            }
            else{
                JOptionPane.showMessageDialog(this,"Nothing found","Wrong",JOptionPane.ERROR_MESSAGE);
                clear();
            }
            
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            //ex.printStackTrace();
        }
        
    }
    
    private void showCountData(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query1 = "select count(ID) from issuebook where StudentID=%s " ;
            query1 = String.format(query1,lbl_studentId.getText());
            String query2 = "select * from issuebook where BookID=%s " ;
            query2 = String.format(query2,lbl_bookId.getText());
            
            ResultSet result = state.executeQuery(query1);
            result.next();
            lbl_student.setText(result.getString(1));   
            
            result = state.executeQuery(query2);
            result.last();
            lbl_book.setText(String.valueOf(result.getRow())); 
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            //ex.printStackTrace();
        }
        
    }
    
    private void retunBooks(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query = "update issuebook set Status='%s' where BookID=%s && StudentID=%s && Status='%s' " ;
            query = String.format(query,"Returned",lbl_bookId.getText(),lbl_studentId.getText(),"Pending");
            int result = state.executeUpdate(query);
            
            if(result > 0){
                JOptionPane.showMessageDialog(this,"Book successfully Returned");
                updateBookQuantity();
                clear();
            } else {
                JOptionPane.showMessageDialog(this,"The book could not be returned","",JOptionPane.ERROR_MESSAGE);
                clear();
            }
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            ex.printStackTrace();
        }
        
    }
    
    private void updateBookQuantity(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query = "update books set Quantity = quantity + 1 where ID=%s " ;
            query = String.format(query,lbl_bookId.getText());
            int result = state.executeUpdate(query);
            
            if(result > 0){
                JOptionPane.showMessageDialog(this,"The quantity of book successfully updated");
            } else {
                JOptionPane.showMessageDialog(this,"The quantity of book was not updated","Wrong",JOptionPane.ERROR_MESSAGE);
            }
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            ex.printStackTrace();
        }
        
    }

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new ReturnBook().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_findDetails;
    private rojerusan.RSMaterialButtonRectangle btn_return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_book;
    private javax.swing.JLabel lbl_bookId;
    private javax.swing.JLabel lbl_bookName;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_defaulterList;
    private javax.swing.JLabel lbl_dueDate;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_issueBook;
    private javax.swing.JLabel lbl_issueDate;
    private javax.swing.JLabel lbl_issueId;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_manageBook;
    private javax.swing.JLabel lbl_manageStudent;
    private javax.swing.JLabel lbl_returnBook;
    private javax.swing.JLabel lbl_student;
    private javax.swing.JLabel lbl_studentId;
    private javax.swing.JLabel lbl_studentName;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_viewissueBook;
    private javax.swing.JLabel lbl_viewrecord;
    private javax.swing.JPanel panelPieChart;
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
    private app.bolivia.swing.JCTextField txt_bookId;
    private app.bolivia.swing.JCTextField txt_studentId;
    // End of variables declaration//GEN-END:variables
}

package Library;

import java.awt.Color;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class IssueBook extends javax.swing.JFrame {

    public IssueBook() {
        initComponents();
    }

    Color mouseEnteredColor = new Color(0,0,0);
    Color mouseExitedColor = new Color(51,51,51);
    Color lblExitedColor = new Color(153,153,153);
    
    int id ;
    java.util.Date utilIssueDate , utilDueDate ;
    java.sql.Date sqlIssueDate , sqlDueDate ;
    
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
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbl_bookId = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_bookName = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_author = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbl_quantity = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_studentId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_studentName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_course = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_branch = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txt_bookId = new app.bolivia.swing.JCTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_studentId = new app.bolivia.swing.JCTextField();
        jLabel23 = new javax.swing.JLabel();
        dtc_issue = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        dtc_due = new com.toedter.calendar.JDateChooser();
        btn_issue = new rojerusan.RSMaterialButtonRectangle();

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

        jPanel9.setBackground(new java.awt.Color(134, 134, 235));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Literature_100px_1.png"))); // NOI18N
        jLabel11.setText("  Book Details");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Book ID :");

        lbl_bookId.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_bookId.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Book Name : ");

        lbl_bookName.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_bookName.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Author :");

        lbl_author.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_author.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Quantity : ");

        lbl_quantity.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_quantity.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel11)))
                .addGap(0, 66, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(lbl_bookId, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(lbl_quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbl_bookName, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(lbl_author, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                    .addContainerGap()))
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
                        .addGap(157, 157, 157)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(433, 433, 433)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(lbl_bookId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(lbl_bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(lbl_author, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(lbl_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(169, Short.MAX_VALUE)))
        );

        jPanel10.setBackground(new java.awt.Color(235, 95, 95));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Student_Registration_100px_2.png"))); // NOI18N
        jLabel2.setText("  Student Details");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student ID :");

        lbl_studentId.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_studentId.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student Name : ");

        lbl_studentName.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_studentName.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Course : ");

        lbl_course.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_course.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Branch : ");

        lbl_branch.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        lbl_branch.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(19, 19, 19)
                            .addComponent(lbl_studentName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(51, 51, 51)
                            .addComponent(lbl_studentId, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(74, 74, 74)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_course, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_branch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap()))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(432, 432, 432)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lbl_studentId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lbl_studentName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lbl_course, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(lbl_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(170, Short.MAX_VALUE)))
        );

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        jLabel19.setText("  Issue Book");

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
        txt_bookId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_bookIdFocusLost(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setText("Student ID :");
        jLabel22.setToolTipText("");

        txt_studentId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 51)));
        txt_studentId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_studentId.setPlaceholder("Enter Student ID ...");
        txt_studentId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_studentIdFocusLost(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 51, 51));
        jLabel23.setText("Issue Date :");
        jLabel23.setToolTipText("");

        jLabel24.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 51, 51));
        jLabel24.setText("Due Date :");
        jLabel24.setToolTipText("");

        btn_issue.setBackground(new java.awt.Color(255, 51, 51));
        btn_issue.setText("issue book");
        btn_issue.setFont(new java.awt.Font("Roboto Medium", 1, 17)); // NOI18N
        btn_issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_issueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dtc_issue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(32, 32, 32)
                                        .addComponent(txt_bookId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_studentId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dtc_due, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_issue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(56, 56, 56)))
                                .addGap(84, 84, 84))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_bookId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_studentId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtc_issue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dtc_due, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(btn_issue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
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

    private void txt_bookIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_bookIdFocusLost

        if(!txt_bookId.getText().trim().isEmpty()){
            fetchBooksData();
        }

    }//GEN-LAST:event_txt_bookIdFocusLost

    private void txt_studentIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_studentIdFocusLost

        if(!txt_studentId.getText().trim().isEmpty()){
            fetchStudentsData();
        }

    }//GEN-LAST:event_txt_studentIdFocusLost

    private void btn_issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_issueActionPerformed
        
        if(validateInputs()){
            if(lbl_quantity.getText().equals("0")){
                JOptionPane.showMessageDialog(this,"This book is not available");
                txt_bookId.setText("");
                lbl_bookId.setText(""); 
                lbl_bookName.setText("");
                lbl_author.setText("");
                lbl_quantity.setText("");
            } else {
                if(isAlreadyIssued()){
                    issueBook();
                } else {
                    JOptionPane.showMessageDialog(this,"This student already has this book","Wrong",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
    }//GEN-LAST:event_btn_issueActionPerformed

    private void panel_manageStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_manageStudentMouseClicked
        
        this.dispose();
        new ManageStudents().setVisible(true);
        
    }//GEN-LAST:event_panel_manageStudentMouseClicked

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

    private void fetchBooksData(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query = "select * from books where ID=%s " ;
            query = String.format(query,txt_bookId.getText());
            ResultSet result = state.executeQuery(query);
            
            if(result.next()){
                lbl_bookId.setText(result.getString(1)); 
                lbl_bookName.setText(result.getString(2));
                lbl_author.setText(result.getString(3));
                lbl_quantity.setText(result.getString(4));
            } else {
                JOptionPane.showMessageDialog(this,"There is no book with this id","Wrong ID",JOptionPane.ERROR_MESSAGE);
                lbl_bookId.setText(""); 
                lbl_bookName.setText("");
                lbl_author.setText("");
                lbl_quantity.setText("");
            }
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            //ex.printStackTrace();
        }
        
    }
    
    private void fetchStudentsData(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query = "select * from students where ID=%s " ;
            query = String.format(query,txt_studentId.getText());
            ResultSet result = state.executeQuery(query);
            
            if(result.next()){
                lbl_studentId.setText(result.getString(1));
                lbl_studentName.setText(result.getString(2));
                lbl_course.setText(result.getString(3));
                lbl_branch.setText(result.getString(4)); 
            } else {
                JOptionPane.showMessageDialog(this,"There is no student with this id","Wrong ID",JOptionPane.ERROR_MESSAGE);
                lbl_studentId.setText("");
                lbl_studentName.setText("");
                lbl_course.setText("");
                lbl_branch.setText("");
            }
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            //ex.printStackTrace();
        }
        
    }
    
    private void clear(){
        
        txt_bookId.setText("");
        txt_studentId.setText("");
        dtc_issue.setDate(null);
        dtc_due.setDate(null);
        lbl_bookId.setText("");
        lbl_bookName.setText("");
        lbl_author.setText("");
        lbl_quantity.setText("");
        lbl_studentId.setText("");
        lbl_studentName.setText("");
        lbl_course.setText("");
        lbl_branch.setText("");
        
    }
    
    private boolean validateInputs(){
        
        String bookID = txt_bookId.getText().trim();
        String studentID = txt_studentId.getText().trim();
        
        if(bookID.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter the ID of the book");
            return false ;
        }
        if(!bookID.matches("[0-9]+")){
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
        if(dtc_issue.getDate() == null){
            JOptionPane.showMessageDialog(this,"Please select a issue date");
            return false ;
        }
        if(dtc_due.getDate() == null){
            JOptionPane.showMessageDialog(this,"please select a due date");
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
            String query = "select max(ID) from issuebook" ;
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
    
    private boolean isAlreadyIssued(){
        
        boolean isAlreadyIssued = false ;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query = "select * from issuebook where BookId=%s && StudentID=%s && Status='%s' " ;
            query = String.format(query,lbl_bookId.getText(),lbl_studentId.getText(),"Pending");
            ResultSet result = state.executeQuery(query);
            
            isAlreadyIssued = !result.next();
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            //ex.printStackTrace();
        }
        
        return isAlreadyIssued ;
        
    }
    
    private void updateBookQuantity(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query = "update books set Quantity = Quantity - 1 where ID=%s " ;
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
        catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            //ex.printStackTrace();
        }
        
    }
    
    private void issueBook(){
        
        productionID();
        utilIssueDate = dtc_issue.getDate();
        utilDueDate = dtc_due.getDate();
        sqlIssueDate = new java.sql.Date(utilIssueDate.getTime());
        sqlDueDate = new java.sql.Date(utilDueDate.getTime());
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            String query = "insert into issuebook values(?,?,?,?,?,?,?,?) " ;
            PreparedStatement state = connect.prepareStatement(query);
            
            state.setInt(1,id);
            state.setInt(2,Integer.valueOf(lbl_bookId.getText()));
            state.setString(3,lbl_bookName.getText());
            state.setInt(4,Integer.valueOf(lbl_studentId.getText()));
            state.setString(5,lbl_studentName.getText());
            state.setDate(6,sqlIssueDate);
            state.setDate(7,sqlDueDate);
            state.setString(8,"Pending");
            
            int result = state.executeUpdate();
            
            if(result > 0){
                JOptionPane.showMessageDialog(this,"The book was successfully issued");
                updateBookQuantity();
                clear();
            } else {
                JOptionPane.showMessageDialog(this,"The book was not issued","Wrong",JOptionPane.ERROR_MESSAGE);
            }
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            //ex.printStackTrace();
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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new IssueBook().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_issue;
    private com.toedter.calendar.JDateChooser dtc_due;
    private com.toedter.calendar.JDateChooser dtc_issue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_bookId;
    private javax.swing.JLabel lbl_bookName;
    private javax.swing.JLabel lbl_branch;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_course;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_defaulterList;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_issueBook;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_manageBook;
    private javax.swing.JLabel lbl_manageStudent;
    private javax.swing.JLabel lbl_quantity;
    private javax.swing.JLabel lbl_returnBook;
    private javax.swing.JLabel lbl_studentId;
    private javax.swing.JLabel lbl_studentName;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_viewissueBook;
    private javax.swing.JLabel lbl_viewrecord;
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

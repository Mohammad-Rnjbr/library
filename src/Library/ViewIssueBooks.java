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

public class ViewIssueBooks extends javax.swing.JFrame {

    public ViewIssueBooks() {
        initComponents();
        showData();
        showCountData();
        showPieChart();
    }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_showIssueBokkData = new rojerusan.RSTableMetro();
        jLabel28 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbl_issue = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbl_allRecords = new javax.swing.JLabel();
        panelPieChart = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();

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
        panel_viewIssueBook.setToolTipText("This is the page");
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

        tbl_showIssueBokkData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "BookId", "BookName", "StudentID", "StudentName", "IssueDate", "DueDate", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_showIssueBokkData.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        tbl_showIssueBokkData.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        tbl_showIssueBokkData.setColorFilasBackgound2(new java.awt.Color(217, 217, 246));
        tbl_showIssueBokkData.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tbl_showIssueBokkData.setColorSelBackgound(new java.awt.Color(224, 99, 99));
        tbl_showIssueBokkData.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        tbl_showIssueBokkData.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tbl_showIssueBokkData.setFuenteHead(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        tbl_showIssueBokkData.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_showIssueBokkData.setRowHeight(30);
        tbl_showIssueBokkData.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(tbl_showIssueBokkData);

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Issued Book Details");

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Issued Books");

        jPanel7.setBackground(new java.awt.Color(226, 226, 226));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 51)));
        jPanel7.setPreferredSize(new java.awt.Dimension(164, 99));

        lbl_issue.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        lbl_issue.setForeground(new java.awt.Color(102, 102, 102));
        lbl_issue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Sell_50px.png"))); // NOI18N
        lbl_issue.setText("10");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_issue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_issue)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("All Records");

        jPanel8.setBackground(new java.awt.Color(226, 226, 226));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(102, 102, 255)));
        jPanel8.setPreferredSize(new java.awt.Dimension(164, 99));

        lbl_allRecords.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        lbl_allRecords.setForeground(new java.awt.Color(102, 102, 102));
        lbl_allRecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Book_Shelf_50px.png"))); // NOI18N
        lbl_allRecords.setText("10");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_allRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_allRecords)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelPieChart.setLayout(new java.awt.BorderLayout());

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Records Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(panelPieChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void panel_issueBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_issueBookMouseClicked

        this.dispose();
        new IssueBook().setVisible(true);

    }//GEN-LAST:event_panel_issueBookMouseClicked

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
            String query = "select * from issuebook where Status='%s' " ;
            query = String.format(query,"Pending");
            ResultSet result = state.executeQuery(query);
            
            tbl_showIssueBokkData.setModel(resultSetToTableModel(result));
            
            state.close();
            connect.close();
                    
        }
        catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            //ex.printStackTrace();
        }
        
    }
    
    private void showCountData(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/library?user=root" ;
            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query1 = "select count(ID) from issuebook where Status='%s' " ;
            query1 = String.format(query1,"Pending");
            String query2 = "select * from issuebook " ;
            
            ResultSet result = state.executeQuery(query1);
            result.next();
            lbl_issue.setText(result.getString(1)); 
            
            result = state.executeQuery(query2);
            result.last();
            lbl_allRecords.setText(String.valueOf(result.getRow())); 
            
            state.close();
            connect.close();
            
        }
        catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            //ex.printStackTrace();
        }
        
    }
    
    private void showPieChart(){
        
        int pending = Integer.valueOf(lbl_issue.getText());
        int allRecords = Integer.valueOf(lbl_allRecords.getText());
        int returned = allRecords - pending ;
        
      //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      barDataset.setValue("Pending", new Integer(pending));  
      barDataset.setValue("Returned", new Integer(returned));   
      
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
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewIssueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewIssueBooks().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_allRecords;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_defaulterList;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_issue;
    private javax.swing.JLabel lbl_issueBook;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_manageBook;
    private javax.swing.JLabel lbl_manageStudent;
    private javax.swing.JLabel lbl_returnBook;
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
    private rojerusan.RSTableMetro tbl_showIssueBokkData;
    // End of variables declaration//GEN-END:variables
}

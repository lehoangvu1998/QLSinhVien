package View;

public class fHome extends javax.swing.JFrame {

    public static int role;

    public fHome() {
        initComponents();
        if (role == 0) {

        }
        if (role == 1) {
            menuStudent.setVisible(false);
        }
        if (role == 2) {
            menuStudent.setVisible(false);
            menuContact.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        menuStudent = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        menuContact = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setForeground(new java.awt.Color(255, 51, 51));
        jMenu1.setText("Chức năng");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jMenuItem1.setText("Quản lý phòng ban");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Quản lý Khoa");
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Quản lý Giảng Viên");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 102, 0));
        jMenu2.setText("Đào tạo");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jMenuItem5.setText("Quản lý lớp");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Quản lý môn học");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Quản lý điểm ");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        menuStudent.setForeground(new java.awt.Color(153, 102, 255));
        menuStudent.setText("Sinh viên");
        menuStudent.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jMenuItem8.setText("Quản lý sinh viên");
        menuStudent.add(jMenuItem8);

        jMenuItem9.setText("Thân nhân sinh viên");
        menuStudent.add(jMenuItem9);

        jMenuBar1.add(menuStudent);

        menuContact.setText("Liên hệ");
        menuContact.setFocusable(false);
        menuContact.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jMenuBar1.add(menuContact);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 868, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new fHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu menuContact;
    private javax.swing.JMenu menuStudent;
    // End of variables declaration//GEN-END:variables
}

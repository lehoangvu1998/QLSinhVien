package View;

import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public final class fHome extends javax.swing.JFrame {

    public static int role;
    Thread clock = new Thread();

    public fHome() {
        initComponents();
        Datehouse();
        clock();
        if (role == 0) {

        }
        if (role == 1) {
            menuStudent.setVisible(false);
            menuclasss.setVisible(false);
            menumonhoc.setVisible(false);
            menufunction.setVisible(false);
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
        datetime = new javax.swing.JLabel();
        so3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menufunction = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        menuclass = new javax.swing.JMenu();
        menuclasss = new javax.swing.JMenuItem();
        menumonhoc = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        menuStudent = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuContact = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datetime.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        datetime.setForeground(new java.awt.Color(51, 51, 51));

        so3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        menufunction.setForeground(new java.awt.Color(255, 51, 51));
        menufunction.setText("Chức năng");
        menufunction.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jMenuItem1.setText("Quản lý phòng ban");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menufunction.add(jMenuItem1);

        jMenuItem2.setText("Quản lý Khoa");
        menufunction.add(jMenuItem2);

        jMenuItem4.setText("Quản lý Giảng Viên");
        menufunction.add(jMenuItem4);

        jMenuItem10.setText("Quản lý Sinh viên");
        menufunction.add(jMenuItem10);

        jMenuBar1.add(menufunction);

        menuclass.setForeground(new java.awt.Color(0, 102, 0));
        menuclass.setText("Đào tạo");
        menuclass.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        menuclasss.setText("Quản lý lớp");
        menuclass.add(menuclasss);

        menumonhoc.setText("Quản lý môn học");
        menuclass.add(menumonhoc);

        jMenuItem7.setText("Quản lý điểm ");
        menuclass.add(jMenuItem7);

        jMenuBar1.add(menuclass);

        menuStudent.setForeground(new java.awt.Color(153, 102, 255));
        menuStudent.setText("Tra cứu");
        menuStudent.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jMenuItem5.setText("Tra cứu sinh viên");
        menuStudent.add(jMenuItem5);

        jMenuItem6.setText("Tra cứu giảng viên");
        menuStudent.add(jMenuItem6);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(585, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(so3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(datetime, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(datetime, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(so3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(415, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        fPhongBan f = new fPhongBan();
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void Datehouse() {
//        DateFormat df = new SimpleDateFormat("dd-M-yyyy hh:mm");
//        Date date = java.util.Calendar.getInstance().getTime();
//        String a = df.format(date);
//        datetime.setText("Hôm nay mà ngày " + a);
    }

    public void clock() {
        Thread Clock;
        Clock = new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Calendar cal = new GregorianCalendar();
                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR_OF_DAY);
                        String thu;
                        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
                        if (dayOfWeek == 1) {
                            thu = "Chủ nhật";
                        } else {
                            thu = "Thứ " + Integer.toString(dayOfWeek);
                        }
                        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH);
                        int year = cal.get(Calendar.YEAR);

                        datetime.setText(hour + ":" + minute + ":" + second);
                        so3.setText(thu + " ngày " + dayOfMonth + " tháng " + (month + 1) + " năm " + year);
                        sleep(1000);
                    }
                } catch (InterruptedException e) {
                }
            }
        };
        Clock.start();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new fHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datetime;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenu menuContact;
    private javax.swing.JMenu menuStudent;
    private javax.swing.JMenu menuclass;
    private javax.swing.JMenuItem menuclasss;
    private javax.swing.JMenu menufunction;
    private javax.swing.JMenuItem menumonhoc;
    private javax.swing.JLabel so3;
    // End of variables declaration//GEN-END:variables
}

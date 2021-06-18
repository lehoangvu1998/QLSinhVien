package View;

import DangNhap.BLL_DangNhap;
import DangNhap.DAL_DangNhap;
import DangNhap.DTO_DangNhap;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class fLogin extends javax.swing.JFrame {

    DTO_DangNhap dto = new DTO_DangNhap();
    DAL_DangNhap dal = new DAL_DangNhap();
    BLL_DangNhap bll = new BLL_DangNhap();

    public fLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txbaccount = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        cb_showpass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ĐĂNG NHẬP HỆ THỐNG HẢI TẶC");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Tài khoản");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Mật khẩu");

        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });

        btnlogin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnlogin.setText("Đăng nhập");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangNhap(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnexit.setText("Thoát");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        cb_showpass.setText("Hiện mật khẩu");
        cb_showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_showpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_showpass)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnlogin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                    .addComponent(btnexit))
                                .addComponent(txbaccount)
                                .addComponent(txtpass)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txbaccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cb_showpass)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlogin)
                            .addComponent(btnexit)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DangNhap(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangNhap
        dto.setTaikhoan(txbaccount.getText());
        dto.setMatkhau(txtpass.getText());

        if (dto.getTaikhoan().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tài khoản không được để trống");
        } else if (dto.getMatkhau().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống");
        } else {
            if (bll.Login(dto)) {
                int role = dal.getRole(dto.getTaikhoan());// Cái này mới đúng nè role nó sẽ biết được manhanvien đó nằm ở role nào
                //Nếu mà manhanvien là 1 thì role là 0
                if (role == 0) {
                    this.dispose();
                    fHome.role = role;
                    new fHome().setVisible(true);
                }
                if (role == 1) {
                    this.dispose();
                    fHome.role = role;
                    new fHome().setVisible(true);
                }
                if (role == 2) {
                    this.dispose();
                    fHome.role = role;
                    new fHome().setVisible(true);
                }

            } else {
                JOptionPane.showMessageDialog(null, "NOT OK");
            }
        }

    }//GEN-LAST:event_DangNhap

    private void cb_showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_showpassActionPerformed
        if (cb_showpass.isSelected()) {
            txtpass.setEchoChar((char) 0);
        } else {
            txtpass.setEchoChar('*');
        }
    }//GEN-LAST:event_cb_showpassActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        int dialogbutton = JOptionPane.YES_NO_OPTION;
        int dialogrESULT = JOptionPane.showConfirmDialog(this, " Bạn có chắc chắn  thoát khỏi đại hải trình one piece", "Thông báo", dialogbutton);
        if (dialogrESULT == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, " Luffy tạm biệt");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(this, " Hãy đăng nhập lại và tiếp tục hành trình trở thành vua hải tặc");
        }
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dto.setTaikhoan(txbaccount.getText());
            dto.setMatkhau(txtpass.getText());
            if (dto.getTaikhoan().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tài khoản không được để trống");
            } else if (dto.getMatkhau().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống");
            } else {
                if (bll.Login(dto)) {
                    int role = dal.getRole(dto.getTaikhoan());
                    if (role == 0) {
                        this.dispose();
                        fHome.role = role;
                        //frmPhongban.maphongban=maphongban
                        new fHome().setVisible(true);
                    }
                    if (role == 1) {
                        this.dispose();
                        fHome.role = role;
                        new fHome().setVisible(true);
                    }
                    if (role == 2) {
                        this.dispose();
                        fHome.role = role;
                        new fHome().setVisible(true);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "NOT OK");
                }
            }
        }
    }//GEN-LAST:event_txtpassKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new fLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlogin;
    private javax.swing.JCheckBox cb_showpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txbaccount;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Khoa.BLL_Khoa;
import Khoa.DALL_Khoa;
import Khoa.DTO_Khoa;
import clsdatabase.DatabaseConnection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public final class fKhoa extends javax.swing.JFrame {
    
    BLL_Khoa bll = new BLL_Khoa();
    DTO_Khoa dto = new DTO_Khoa();
    DALL_Khoa dal = new DALL_Khoa();
    ArrayList<DTO_Khoa> array = new ArrayList<>();
    Random rb = new Random();
    
    PreparedStatement ps = null;
    DatabaseConnection db = null;
    ResultSet rs = null;
    Connection con = null;
    
    public fKhoa() {
        initComponents();
        Combo();
        LoadKhoa();
        RandomKhoa();
    }
    
    public void RandomKhoa() {
        int code = (int) Math.floor(((Math.random() * 1000) + 500));
        String a = Integer.toString(code);
        txbmakhoa.setText(a);
    }
    
    public void LoadKhoa() {
        String header[] = {"Mã Khoa", "Tên Khoa", "Mã Phòng Ban", "Số Điện Thoại"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        array = bll.GetListKhoa();
        for (int i = 0; i < array.size(); i++) {
            dto = array.get(i);
            int a = dto.getMakhoa();
            String b = dto.getTenkhoa();
            int c = dto.getMaphongban();
            String d = dto.getSodienthoai();
            Object[] row = {a, b, c, d};
            model.addRow(row);
        }
        tablekhoa.setModel(model);
        tablekhoa.setDefaultEditor(Object.class, null);
        tablekhoa.getTableHeader().setResizingAllowed(false);
        tablekhoa.getTableHeader().setReorderingAllowed(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablekhoa = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txbmakhoa = new javax.swing.JTextField();
        txbtenkhoa = new javax.swing.JTextField();
        cbbkhoa = new javax.swing.JComboBox<>();
        txbsdt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        BtbReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khoa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(153, 102, 255))); // NOI18N

        tablekhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablekhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablekhoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablekhoa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(102, 102, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("Phòng ban");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("Tên khoa");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 0));
        jLabel3.setText("SDT");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 0));
        jLabel4.setText("Mã khoa");

        txbmakhoa.setEditable(false);

        txbtenkhoa.setToolTipText("Nhập vào tên khoa ");

        cbbkhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn" }));
        cbbkhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbkhoaActionPerformed(evt);
            }
        });

        txbsdt.setToolTipText("Nhập vào số điện thoại");
        txbsdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txbsdtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txbmakhoa)
                    .addComponent(cbbkhoa, 0, 162, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txbtenkhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(txbsdt))
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txbtenkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txbmakhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check(evt);
            }
        });

        btndelete.setText("Xóa");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setText("Cập nhật");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        BtbReset.setText("Làm lại");
        BtbReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtbResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jButton1)
                .addGap(117, 117, 117)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtbReset)
                .addGap(82, 82, 82))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btndelete)
                    .addComponent(btnupdate)
                    .addComponent(BtbReset))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Combo() {
        HashMap<String, Integer> map = bll.Fillcombo();
        for (String str : map.keySet()) {
            cbbkhoa.addItem(str);
            
        }
    }

    private void cbbkhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbkhoaActionPerformed

    }//GEN-LAST:event_cbbkhoaActionPerformed

    private void BtbResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtbResetActionPerformed
        RandomKhoa();
        txbtenkhoa.setText("");
        txbsdt.setText("");
        txbtenkhoa.requestFocus();
    }//GEN-LAST:event_BtbResetActionPerformed

    private void check(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check
        try {
            HashMap<String, Integer> map = bll.Fillcombo();
            dto.setMakhoa(Integer.parseInt(txbmakhoa.getText()));
            dto.setTenkhoa(txbtenkhoa.getText());
            dto.setMaphongban(Integer.parseInt(map.get(cbbkhoa.getSelectedItem().toString()).toString()));
            dto.setSodienthoai(txbsdt.getText());
            if (dto.getTenkhoa().isEmpty()) {
                JOptionPane.showMessageDialog(this, " Tên Khoa không được bỏ trống");
                txbtenkhoa.requestFocus();
            } else if (dto.getSodienthoai().isEmpty()) {
                JOptionPane.showMessageDialog(this, " Số điện thoại Khoa không được bỏ trống");
                txbsdt.requestFocus();
            } else {
                int result = JOptionPane.showConfirmDialog(this, " Bạn có chắc chắn thêm mới khoa này không ", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    bll.InsertKhoa(dto.getMakhoa(), dto.getTenkhoa(), dto.getMaphongban(), dto.getSodienthoai());
                    JOptionPane.showMessageDialog(this, "Thêm Khoa thành công");
                    LoadKhoa();
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, " Không thành công !!!");
        }
    }//GEN-LAST:event_check

    private void tablekhoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablekhoaMouseClicked
        int i = tablekhoa.getSelectedRow();
        TableModel tb = tablekhoa.getModel();
        txbmakhoa.setText(tb.getValueAt(i, 0).toString());
        txbtenkhoa.setText(tb.getValueAt(i, 1).toString());
        txbsdt.setText(tb.getValueAt(i, 3).toString());
    }//GEN-LAST:event_tablekhoaMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            dto.setMakhoa(Integer.parseInt(txbmakhoa.getText()));
            dto.setTenkhoa(txbtenkhoa.getText());
            dto.setSodienthoai(txbsdt.getText());
            if (dto.getTenkhoa().isEmpty()) {
                JOptionPane.showMessageDialog(this, " Tên Khoa không được bỏ trống ");
                txbtenkhoa.requestFocus();
            } else if (dto.getSodienthoai().isEmpty()) {
                JOptionPane.showMessageDialog(this, " Số điện thoại không được bỏ trống ");
                txbsdt.requestFocus();
            } else {
                int result = JOptionPane.showConfirmDialog(this, " Bạn có chắc chắn sửa đổi Khoa này không ", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    bll.Updatekhoa(dto.getTenkhoa(), dto.getSodienthoai(), dto.getMakhoa());
                    JOptionPane.showMessageDialog(this, " Cập nhật thành công ");
                    LoadKhoa();
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, " Lỗi ");
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        dto.setMakhoa(Integer.parseInt(txbmakhoa.getText()));
        int result = JOptionPane.showConfirmDialog(this, " Bạn có chắc chắn muốn xóa phòng ban này không ", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            bll.Delete(dto.getMakhoa());
            txbmakhoa.setText("");
            txbtenkhoa.setText("");
            txbsdt.setText("");
            LoadKhoa();
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txbsdtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbsdtKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            txbsdt.setEditable(false);
        } else {
            txbsdt.setEditable(true);
        }
    }//GEN-LAST:event_txbsdtKeyPressed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new fKhoa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtbReset;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbbkhoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablekhoa;
    private javax.swing.JTextField txbmakhoa;
    private javax.swing.JTextField txbsdt;
    private javax.swing.JTextField txbtenkhoa;
    // End of variables declaration//GEN-END:variables

}

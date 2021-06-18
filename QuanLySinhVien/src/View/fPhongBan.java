package View;

import PhongBan.DAL_PhongBan;
import PhongBan.DTO_PhongBan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public final class fPhongBan extends javax.swing.JFrame {

    DTO_PhongBan dto = new DTO_PhongBan();
    private DAL_PhongBan dal;
    private DefaultTableModel model;

    public fPhongBan() {
        initComponents();
        LoadPhongBan();
    }

    public void LoadPhongBan() {

        dal = new DAL_PhongBan();
        ArrayList<PhongBan.DTO_PhongBan> list = dal.GetPhongbanList();
        model = (DefaultTableModel) tablephongban.getModel();
        model.setRowCount(0);
        Object[] row = new Object[2];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getMaphongban();
            row[1] = list.get(i).getTenphongban();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablephongban = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txbmaphongban = new javax.swing.JTextField();
        txbtenphongban = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablephongban.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã phòng ban", "Tên phòng ban"
            }
        ));
        tablephongban.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablephongbanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablephongban);

        jLabel1.setText("Mã phòng ban");

        jLabel2.setText("Tên phòng ban");

        txbmaphongban.setEditable(false);

        btnadd.setText("THÊM");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btndelete.setText("Xóa");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnedit.setText("CẬP NHẬT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnreset.setText("LÀM LẠI");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txbmaphongban)
                    .addComponent(txbtenphongban, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txbmaphongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd)
                    .addComponent(btndelete))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txbtenphongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnedit)
                    .addComponent(btnreset))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        dto.setTenphongban(txbtenphongban.getText());
        if (dto.getTenphongban().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên phòng ban không được trống");
        } else {
            int dialogbutton = JOptionPane.YES_NO_OPTION;
            int dialogrESULT = JOptionPane.showConfirmDialog(this, " Bạn có chắc chắn thêm mới phòng ban này không ", "Thông báo", dialogbutton);
            if (dialogrESULT == JOptionPane.YES_OPTION) {
                dal.Insert(dto.getTenphongban());
                JOptionPane.showMessageDialog(null, "Thêm phòng ban thành công");
                LoadPhongBan();
            }
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void tablephongbanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablephongbanMouseClicked
        int i = tablephongban.getSelectedRow();
        TableModel tb = tablephongban.getModel();
        txbmaphongban.setText(tb.getValueAt(i, 0).toString());
        txbtenphongban.setText(tb.getValueAt(i, 1).toString());
    }//GEN-LAST:event_tablephongbanMouseClicked

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        txbmaphongban.setText("");
        txbtenphongban.setText("");
        txbtenphongban.requestFocus();
    }//GEN-LAST:event_btnresetActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        dto.setMaphongban(txbmaphongban.getText());
        dto.setTenphongban(txbtenphongban.getText());
        int dialogbutton = JOptionPane.YES_NO_OPTION;
        int dialogrESULT = JOptionPane.showConfirmDialog(this, " Bạn có chắc chắn thay đổi phòng ban này không ", "Thông báo", dialogbutton);
        if (dialogrESULT == JOptionPane.YES_OPTION) {
            dal.Update(dto.getMaphongban(), dto.getTenphongban());
            LoadPhongBan();
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        dto.setMaphongban(txbmaphongban.getText());
        int dialogbutton = JOptionPane.YES_NO_OPTION;
        int dialogrESULT = JOptionPane.showConfirmDialog(this, " Bạn có chắc chắn sẽ xóa phòng ban này không ", "Thông báo", dialogbutton);
        if (dialogrESULT == JOptionPane.YES_OPTION) {
            dal.Delete(dto.getMaphongban());
            LoadPhongBan();
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fPhongBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablephongban;
    private javax.swing.JTextField txbmaphongban;
    private javax.swing.JTextField txbtenphongban;
    // End of variables declaration//GEN-END:variables
}

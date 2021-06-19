package View;

import PhongBan.BLL_PhongBan;
import PhongBan.DAL_PhongBan;
import PhongBan.DTO_PhongBan;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public final class fPhongBan extends javax.swing.JFrame {

    BLL_PhongBan bll = new BLL_PhongBan();
    DAL_PhongBan dal = new DAL_PhongBan();
    DTO_PhongBan dto = new DTO_PhongBan();
    ArrayList<DTO_PhongBan> arr = new ArrayList<>();
    Random rd = new Random();

    public fPhongBan() {
        initComponents();
        LoadPhongBan();
        initalRoom();
        txbtenphongban.requestFocus();
    }

    private void initalRoom() {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yy");
//        String maroom = dateFormat.format(Calendar.getInstance().getTime());
//        int random = rd.nextInt(100) + 900;
//        txbmaphongban.setText(maroom + random);
        int code = (int) Math.floor(((Math.random() * 899999) + 100000));
        String a = Integer.toString(code);
        txbmaphongban.setText(a);
    }

    public void LoadPhongBan() {
        String header[] = {"Mã phòng ban", "Tên phòng ban"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        arr = bll.GetPhongbanList();
        for (int i = 0; i < arr.size(); i++) {
            dto = arr.get(i);
            int maphongban = dto.getMaphongban();
            String tenphongban = dto.getTenphongban();
            Object[] row = {maphongban, tenphongban};
            model.addRow(row);
        }
        tablephongban.setModel(model);
        tablephongban.setDefaultEditor(Object.class, null); //Không cho nhập
        tablephongban.getTableHeader().setResizingAllowed(false);
        tablephongban.getTableHeader().setReorderingAllowed(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPhongBan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablephongban = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txbmaphongban = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txbtenphongban = new javax.swing.JTextField();
        btnedit = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPhongBan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PHÒNG BAN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20), new java.awt.Color(0, 0, 153))); // NOI18N

        tablephongban.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablephongban.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablephongbanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablephongban);

        jLabel1.setText("Mã phòng ban");

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

        jLabel2.setText("Tên phòng ban");

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

        javax.swing.GroupLayout panelPhongBanLayout = new javax.swing.GroupLayout(panelPhongBan);
        panelPhongBan.setLayout(panelPhongBanLayout);
        panelPhongBanLayout.setHorizontalGroup(
            panelPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPhongBanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(panelPhongBanLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(panelPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(panelPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txbmaphongban)
                    .addComponent(txbtenphongban, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(panelPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnedit))
                .addGap(69, 69, 69)
                .addGroup(panelPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panelPhongBanLayout.setVerticalGroup(
            panelPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPhongBanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txbmaphongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd)
                    .addComponent(btndelete))
                .addGap(38, 38, 38)
                .addGroup(panelPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txbtenphongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnedit)
                    .addComponent(btnreset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPhongBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPhongBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try {
            dto.setMaphongban(Integer.parseInt(txbmaphongban.getText()));
            dto.setTenphongban(txbtenphongban.getText());
            if (dto.getTenphongban().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên phòng ban không được trống");
            } else {
                int result = JOptionPane.showConfirmDialog(this, " Bạn có chắc chắn thêm mới phòng ban này không ", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    bll.insertPhongban(dto.getMaphongban(), dto.getTenphongban());
                    JOptionPane.showMessageDialog(null, "Thêm phòng ban thành công");
                    LoadPhongBan();
                }
            }
        } catch (NumberFormatException exception) {
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
        dto.setTenphongban(txbtenphongban.getText());
        if (dto.getTenphongban().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên phòng ban không được trống");
        } else {
            int result = JOptionPane.showConfirmDialog(this, " Bạn có chắc chắn sửa đổi phòng ban này không ", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                bll.Update(dto.getTenphongban(), dto.getMaphongban());
                JOptionPane.showMessageDialog(null, "Cập nhật phòng ban thành công");
                LoadPhongBan();
            }
        }

    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        dto.setMaphongban(Integer.parseInt(txbtenphongban.getText()));
        int result = JOptionPane.showConfirmDialog(this, " Bạn có chắc chắn thêm mới phòng ban này không ", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {

            dal.Delete(dto.getMaphongban());
            txbmaphongban.setText("");
            txbtenphongban.setText("");
            LoadPhongBan();
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new fPhongBan().setVisible(true);
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
    private javax.swing.JPanel panelPhongBan;
    private javax.swing.JTable tablephongban;
    private javax.swing.JTextField txbmaphongban;
    private javax.swing.JTextField txbtenphongban;
    // End of variables declaration//GEN-END:variables
}

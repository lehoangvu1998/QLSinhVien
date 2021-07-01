package View;

import MonHoc.BLL_MONHOC;
import MonHoc.DAL_MONHOC;
import MonHoc.DTO_MONHOC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class fDiem extends javax.swing.JFrame {

    DTO_MONHOC dto = new DTO_MONHOC();
    DAL_MONHOC dal = new DAL_MONHOC();
    BLL_MONHOC bll = new BLL_MONHOC();
    ArrayList<DTO_MONHOC> arr = new ArrayList();
    Random rb = new Random();

    public fDiem() {
        initComponents();
        LoadMonHoc();
        Disable();
    }

    public void LoadMonHoc() {
        String header[] = {"Mã môn học", "Tên môn học", " Số tín chĩ", " Khoa"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        arr = bll.getLISTmONHOC();
        for (int i = 0; i < arr.size(); i++) {
            dto = arr.get(i);
            int a = dto.getMamonhoc();
            String b = dto.getTenmonhoc();
            int c = dto.getSotinchi();
            int d = dto.getMakhoa();
            Object row[] = {a, b, c, d};
            model.addRow(row);
        }
        tablemonhoc.setModel(model);
        tablemonhoc.setDefaultEditor(Object.class, null);
        tablemonhoc.getTableHeader().setReorderingAllowed(false);
        tablemonhoc.getTableHeader().setResizingAllowed(false);
    }

    public void innitMamonhovc() {
        int a = (int) Math.floor(((Math.random() * 1000) + 500));
        String code = Integer.toString(a);
        txbmamon.setText(code);
    }

    private void combo() {
        HashMap<String, Integer> map = bll.fillcombo();
        for (String s : map.keySet()) {
            cbbkhoa.addItem(s);
        }
    }

    private void Disable() {
        txbmamon.setEnabled(false);
        txbtenmonhoc.setEnabled(false);
        txbtinchi.setEnabled(false);
        cbbkhoa.setEnabled(false);
    }

    private void Enable() {
        txbmamon.setEnabled(true);
        txbtenmonhoc.setEnabled(true);
        txbtinchi.setEnabled(true);
        cbbkhoa.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablemonhoc = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbbkhoa = new javax.swing.JComboBox<>();
        txbtinchi = new javax.swing.JTextField();
        txbmamon = new javax.swing.JTextField();
        txbtenmonhoc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnluu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách môn học", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(153, 0, 0))); // NOI18N

        tablemonhoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablemonhoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablemonhocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablemonhoc);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 24), new java.awt.Color(255, 51, 0))); // NOI18N

        jLabel1.setText("Mã môn học");

        jLabel2.setText("Tên môn học");

        jLabel3.setText("Số tín chỉ");

        jLabel4.setText("Khoa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txbmamon)
                    .addComponent(txbtenmonhoc, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbkhoa, 0, 142, Short.MAX_VALUE)
                    .addComponent(txbtinchi))
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txbtinchi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbmamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(cbbkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbtenmonhoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");

        btnupdate.setText("Cập nhật");

        btnreset.setText("Làm lại");

        btnluu.setText("Lưu");
        btnluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnthem)
                .addGap(57, 57, 57)
                .addComponent(btnluu, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnupdate)
                .addGap(60, 60, 60)
                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnxoa)
                    .addComponent(btnsua)
                    .addComponent(btnupdate)
                    .addComponent(btnreset)
                    .addComponent(btnluu))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        innitMamonhovc();
        combo();
        Enable();
        txbmamon.setEditable(false);
        txbtenmonhoc.requestFocus();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluuActionPerformed
        dto.setMamonhoc(Integer.parseInt(txbmamon.getText().trim()));
       dto.setTenmonhoc(txbtenmonhoc.getText().trim());
       dto.setSotinchi(Integer.parseInt(txbtinchi.getText().trim()));
       HashMap<String, Integer> map = bll.fillcombo();
       dto.setMakhoa(map.get(cbbkhoa.getSelectedItem().toString().trim()));
       if (dto.getTenmonhoc().isEmpty()) {
           JOptionPane.showMessageDialog(this, " Tên môn học không được bỏ trống");
           txbtenmonhoc.requestFocus();
       } else {
           bll.InsertMonhoc(dto.getMamonhoc(), dto.getTenmonhoc(), dto.getSotinchi(), dto.getMakhoa());
           LoadMonHoc();
       }
    }//GEN-LAST:event_btnluuActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        dto.setMamonhoc(Integer.parseInt(txbmamon.getText()));
        bll.DeleteMonhoc(dto.getMamonhoc());
        LoadMonHoc();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void tablemonhocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablemonhocMouseClicked
        int i = tablemonhoc.getSelectedRow();
        txbmamon.setText(tablemonhoc.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tablemonhocMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new fDiem().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnluu;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbbkhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablemonhoc;
    private javax.swing.JTextField txbmamon;
    private javax.swing.JTextField txbtenmonhoc;
    private javax.swing.JTextField txbtinchi;
    // End of variables declaration//GEN-END:variables
}

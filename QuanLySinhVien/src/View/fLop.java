package View;

import Lop.BLL_LOP;
import Lop.DTO_LOP;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class fLop extends javax.swing.JFrame {
    
    ArrayList<DTO_LOP> arrayList = new ArrayList<>();
    BLL_LOP bll = new BLL_LOP();
    DTO_LOP dto = new DTO_LOP();
    
    public fLop() {
        initComponents();
        LoadLop();
        combo();
    }
    
    private void Randommalop() {
        int code = (int) Math.floor(((Math.random() * 1000) + 500));
        String a = Integer.toString(code);
        txbmalop.setText(a);
    }
    
    private void combo() {
        HashMap<String, Integer> map = bll.fillcombo();
        for (String s : map.keySet()) {
            cbbkhoa.addItem(s);
        }
    }
    
    public void LoadLop() {
        String header[] = {"Khoa", "Mã lớp", "Tên lớp", "Khóa", "Hệ đào tạo", "Năm"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        arrayList = bll.GetlistLop();
        for (int i = 0; i < arrayList.size(); i++) {
            dto = arrayList.get(i);
            String a = dto.getTenkhoa();
            int b = dto.getMalop();
            String c = dto.getTenlop();
            int d = dto.getKhoa();
            String e = dto.getHedaotao();
            int f = dto.getNam();
            Object[] row = {a, b, c, d, e, f};
            model.addRow(row);
        }
        tablelop.setModel(model);
        tablelop.setDefaultEditor(Object.class, null);
        tablelop.getTableHeader().setReorderingAllowed(false);
        tablelop.getTableHeader().setResizingAllowed(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablelop = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txbmalop = new javax.swing.JTextField();
        txbtenlop = new javax.swing.JTextField();
        txbkhoa = new javax.swing.JTextField();
        txbnam = new javax.swing.JTextField();
        cbbhedaotao = new javax.swing.JComboBox<>();
        cbbkhoa = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Btnadd = new javax.swing.JButton();
        Btndelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BTnsavae = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách lớp", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(204, 0, 255))); // NOI18N

        tablelop.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablelop.setForeground(new java.awt.Color(51, 153, 0));
        tablelop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablelop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablelopMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablelop);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 204, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Mã lớp");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Tên lớp");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Khóa");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("Hệ đào tạo");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Năm");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Khoa");

        txbmalop.setEditable(false);
        txbmalop.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txbmalop.setForeground(new java.awt.Color(51, 0, 255));

        txbtenlop.setEditable(false);
        txbtenlop.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txbtenlop.setForeground(new java.awt.Color(51, 0, 255));

        txbkhoa.setEditable(false);
        txbkhoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txbkhoa.setForeground(new java.awt.Color(51, 0, 255));

        txbnam.setEditable(false);
        txbnam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txbnam.setForeground(new java.awt.Color(51, 0, 255));

        cbbhedaotao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbbhedaotao.setForeground(new java.awt.Color(51, 0, 255));
        cbbhedaotao.setMaximumRowCount(3);
        cbbhedaotao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đại học chính quy", "Cao đẳng", "Hệ vừa học vừa làm", " " }));
        cbbhedaotao.setSelectedIndex(-1);

        cbbkhoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbbkhoa.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbtenlop)
                            .addComponent(txbkhoa))
                        .addGap(125, 125, 125)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txbmalop, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel4)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txbnam)
                            .addComponent(cbbhedaotao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(txbmalop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbhedaotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txbtenlop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbnam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txbkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 102, 0));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 204, 0));
        jLabel7.setText("Nhập vào tên Khoa");

        jButton1.setText("Search");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel7)
                .addGap(37, 37, 37)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jButton1))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(204, 0, 102))); // NOI18N

        Btnadd.setText("Thêm");
        Btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnaddActionPerformed(evt);
            }
        });

        Btndelete.setText("Xóa");
        Btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtndeleteActionPerformed(evt);
            }
        });

        jButton4.setText("Cập nhật");

        btnreset.setText("Làm lại");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");

        BTnsavae.setText("Lưu");
        BTnsavae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTnsavaeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTnsavae, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btnadd)
                    .addComponent(Btndelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreset)
                    .addComponent(BTnsavae)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnaddActionPerformed
        Randommalop();
        EnableText();
        cbbkhoa.setEnabled(true);
        cbbhedaotao.setEnabled(true);
    }//GEN-LAST:event_BtnaddActionPerformed
    
    private void EnableText() {
        txbtenlop.setText("");
        txbnam.setText("");
        txbkhoa.setText("");
        txbtenlop.requestFocus();
        txbtenlop.setEditable(true);
        txbkhoa.setEditable(true);
        txbnam.setEditable(true);
    }
    
    private void DisableText() {
        txbmalop.setText("");
        txbtenlop.setText("");
        txbnam.setText("");
        txbkhoa.setText("");
        txbtenlop.setEditable(false);
        txbkhoa.setEditable(false);
        txbnam.setEditable(false);
    }

    private void tablelopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablelopMouseClicked
        int i = tablelop.getSelectedRow();       
        cbbkhoa.setSelectedItem(tablelop.getValueAt(i, 0).toString());
        txbmalop.setText(tablelop.getValueAt(i, 1).toString());
        txbtenlop.setText(tablelop.getValueAt(i, 2).toString());
        txbkhoa.setText(tablelop.getValueAt(i, 3).toString());
        cbbhedaotao.setSelectedItem(tablelop.getValueAt(i, 4).toString());
        txbnam.setText(tablelop.getValueAt(i, 5).toString());
        cbbkhoa.setEnabled(false);
        cbbhedaotao.setEnabled(false);
    }//GEN-LAST:event_tablelopMouseClicked

    private void BTnsavaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTnsavaeActionPerformed
        HashMap<String, Integer> map = bll.fillcombo();
        dto.setMalop(Integer.parseInt(txbmalop.getText().trim()));
        dto.setTenlop(txbtenlop.getText().trim());
        dto.setKhoa(Integer.parseInt(txbkhoa.getText().trim()));
        dto.setHedaotao(cbbhedaotao.getSelectedItem().toString().trim());
        dto.setNam(Integer.parseInt(txbnam.getText().trim()));
        dto.setTenkhoa(map.get(cbbkhoa.getSelectedItem().toString()).toString().trim());
        if (dto.getTenlop().isEmpty()) {
            JOptionPane.showMessageDialog(this, " Tên Lớp không được rỗng ");
        } else {
            int result = JOptionPane.showConfirmDialog(this, " Bạn có chắc chắn thêm mới Lớp này không ", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                bll.InsertClass(dto.getMalop(), dto.getTenlop(), dto.getKhoa(), dto.getHedaotao(), dto.getNam(), dto.getTenkhoa());
                JOptionPane.showMessageDialog(this, " Thêm Lớp thành công");
                LoadLop();
                DisableText();
            }
        }
    }//GEN-LAST:event_BTnsavaeActionPerformed

    private void BtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtndeleteActionPerformed
        dto.setMalop(Integer.parseInt(txbmalop.getText()));
        int result = JOptionPane.showConfirmDialog(this, " Bạn có chắc chắn xóa Lớp này không ", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            bll.DeleteClass(dto.getMalop());
            LoadLop();
        } else {
            JOptionPane.showMessageDialog(this, " Xóa không thành công ");
        }
    }//GEN-LAST:event_BtndeleteActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        EnableText();
        Randommalop();
    }//GEN-LAST:event_btnresetActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new fLop().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTnsavae;
    private javax.swing.JButton Btnadd;
    private javax.swing.JButton Btndelete;
    private javax.swing.JButton btnreset;
    private javax.swing.JComboBox<String> cbbhedaotao;
    private javax.swing.JComboBox<String> cbbkhoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tablelop;
    private javax.swing.JTextField txbkhoa;
    private javax.swing.JTextField txbmalop;
    private javax.swing.JTextField txbnam;
    private javax.swing.JTextField txbtenlop;
    // End of variables declaration//GEN-END:variables
}

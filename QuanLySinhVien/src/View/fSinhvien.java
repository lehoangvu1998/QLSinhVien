package View;

import SinhVien.BLL_SinhVien;
import SinhVien.DTO_SinhVien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

public final class fSinhvien extends javax.swing.JFrame {
    
    Random rd = new Random();
    ArrayList<DTO_SinhVien> arrayList = new ArrayList<>();
    BLL_SinhVien bll = new BLL_SinhVien();
    DTO_SinhVien dto = new DTO_SinhVien();
    private int maphongban;
    
    public fSinhvien() {
        initComponents();
        LoadSinhvien();
        combophongban();
        combolop();
        Disable();
    }
    
    private void Enable() {
        cbHocvan.setEnabled(true);
        cbPhongban.setEnabled(true);
        cbblop.setEnabled(true);
        txbhoten.setEditable(true);
        txbdiachi.setEditable(true);
        txbemail.setEditable(true);
        txbquanhe.setEditable(true);
        txbsdt.setEditable(true);
        txbsdtthanhan.setEditable(true);
        txbtenthannhan.setEditable(true);
        datebirth.setEnabled(true);
        inschool.setEnabled(true);
    }
    
    private void Disable() {
        cbbkhoa.setEnabled(false);
        cbHocvan.setEnabled(false);
        cbPhongban.setEnabled(false);
        cbblop.setEnabled(false);
        txbhoten.setEditable(false);
        txbdiachi.setEditable(false);
        txbemail.setEditable(false);
        txbquanhe.setEditable(false);
        txbsdt.setEditable(false);
        txbsdtthanhan.setEditable(false);
        txbtenthannhan.setEditable(false);
        datebirth.setEnabled(false);
        inschool.setEnabled(false);
    }
    
    public void LoadSinhvien() {
        String header[] = {"MSSV", "Họ tên ", "Lớp", "Khoa", "Học vấn", "Mât khẩu", "Ngày vào trường ", "Ngày sinh", " Số điện thoại", "Email", "Địa chỉ", " Thân nhân", "Quan hệ", "Số điện thoại thân nhân"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        arrayList = bll.getListSinhvien();
        for (int i = 0; i < arrayList.size(); i++) {
            dto = arrayList.get(i);
            int a = dto.getMssv();
            String b = dto.getHoten();
            String c = dto.getTenlop();
            String d = dto.getTenkhoa();
            String e = dto.getHocvan();
            String q = dto.getPass();
            Date f = dto.getNgayvaotruong();
            Date g = dto.getDate();
            String h = dto.getSdt();
            String k = dto.getEmail();
            String w = dto.getDiachi();
            String r = dto.getTenthannhan();
            String t = dto.getQuanhe();
            String y = dto.getSdtthannhan();
            Object[] row = {a, b, c, d, e, q, f, g, h, k, w, r, t, y};
            model.addRow(row);
        }
        tablesinhvien.setModel(model);
        tablesinhvien.setDefaultEditor(Object.class, null);
        tablesinhvien.getTableHeader().setResizingAllowed(false);
        tablesinhvien.getTableHeader().setReorderingAllowed(false);
    }
    
    private void initalMSSV() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy");
        String mssv = dateFormat.format(Calendar.getInstance().getTime());
        int random = rd.nextInt(100000) + 900000;
        txbmssv.setText(mssv + random);
    }

//    private String convertDateToPass(String password) {
//        try {
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//            String birthday = dateFormat.format(datebirth.getDate());
//            Date date = dateFormat.parse(birthday);
//            password = dateFormat.format(date).replaceAll("/", "");
//
//        } catch (ParseException ex) {
//            Logger.getLogger(fSinhvien.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return password;
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablesinhvien = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        BTNADD = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txbmssv = new javax.swing.JTextField();
        txbemail = new javax.swing.JTextField();
        datebirth = new com.toedter.calendar.JDateChooser();
        txbhoten = new javax.swing.JTextField();
        txbsdt = new javax.swing.JTextField();
        cbbkhoa = new javax.swing.JComboBox<>();
        txbdiachi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txbtenthannhan = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txbquanhe = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txbsdtthanhan = new javax.swing.JTextField();
        inschool = new com.toedter.calendar.JDateChooser();
        cbblop = new javax.swing.JComboBox<>();
        cbPhongban = new javax.swing.JComboBox<>();
        cbHocvan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sinh viên", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(0, 0, 204))); // NOI18N

        tablesinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablesinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesinhvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablesinhvien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1469, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        BTNADD.setText("Thêm");
        BTNADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertStudent(evt);
            }
        });

        btnedit.setText("Sửa");

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        jButton4.setText("Làm lại");

        btnsave.setText("Lưu");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BTNADD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNADD)
                    .addComponent(btnxoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnedit)
                    .addComponent(jButton4)
                    .addComponent(btnsave))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(153, 153, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 153, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Mã số");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Họ tên");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Ngày sinh");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("SDT");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 51));
        jLabel6.setText("Địa chỉ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 51));
        jLabel7.setText("Học vấn");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 51));
        jLabel8.setText("Phong ban");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 51));
        jLabel9.setText("Khoa");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 51));
        jLabel10.setText("Lớp");

        txbmssv.setEditable(false);

        datebirth.setDateFormatString("dd/MM/yyyy");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 51));
        jLabel13.setText("Ngày vào trường");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 51));
        jLabel14.setText("Tên thân nhân");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 51));
        jLabel15.setText("Quan hệ");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 51));
        jLabel16.setText("SDT");

        inschool.setDateFormatString("dd/MM/yyyy");

        cbPhongban.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn" }));
        cbPhongban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPhongban(evt);
            }
        });

        cbHocvan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinh viên" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txbsdt)
                            .addComponent(cbHocvan, javax.swing.GroupLayout.Alignment.TRAILING, 0, 199, Short.MAX_VALUE)
                            .addComponent(txbdiachi)
                            .addComponent(txbmssv))
                        .addGap(149, 149, 149)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txbemail, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txbhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbbkhoa, 0, 190, Short.MAX_VALUE)
                                    .addComponent(cbblop, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(57, 57, 57))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txbtenthannhan, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(txbquanhe, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inschool, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbPhongban, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(datebirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                            .addComponent(txbsdtthanhan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txbhoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(datebirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txbmssv, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txbemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txbsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbPhongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inschool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(cbbkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(cbHocvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbblop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txbdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txbtenthannhan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txbquanhe, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txbsdtthanhan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void combokhoa() {
        HashMap<String, Integer> map_phongban = bll.loadPhongban();
        maphongban = Integer.parseInt(map_phongban.get(cbPhongban.getSelectedItem().toString()).toString());
        HashMap<String, Integer> map = bll.fillcombo(maphongban);
        for (String s : map.keySet()) {
            cbbkhoa.addItem(s);
        }
    }
    
    private void combolop() {
        HashMap<String, Integer> map1 = bll.fillLopMap();
        for (String s : map1.keySet()) {
            cbblop.addItem(s);
        }
    }
    
    private void combophongban() {
        HashMap<String, Integer> map = bll.loadPhongban();
        for (String s : map.keySet()) {
            cbPhongban.addItem(s);
        }
    }
    

    private void insertStudent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertStudent
        txbhoten.requestFocus();
        txbhoten.setText("");
        txbdiachi.setText("");
        txbemail.setText("");
        txbquanhe.setText("");
        txbsdtthanhan.setText("");
        txbtenthannhan.setText("");
        btnedit.setEnabled(false);
        btnxoa.setEnabled(false);
        Enable();
        initalMSSV();
    }//GEN-LAST:event_insertStudent

    private void getPhongban(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPhongban
        if (cbPhongban.getSelectedIndex() == 0) {
            cbbkhoa.setEnabled(false);
            cbbkhoa.removeAllItems();
        } else {
            cbbkhoa.removeAllItems();
            cbbkhoa.setEnabled(true);
            combokhoa();
        }
    }//GEN-LAST:event_getPhongban

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            HashMap<String, Integer> map_phongban = bll.loadPhongban();
            HashMap<String, Integer> makhoa = bll.fillcombo(maphongban);
            HashMap<String, Integer> map1 = bll.fillLopMap();
            dto.setMssv(Integer.parseInt(txbmssv.getText()));
            dto.setHoten(txbhoten.getText());
            dto.setSdt(txbsdt.getText());
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String strBirthday = format.format(datebirth.getDate());
            String strNgayvaotruong = format.format(inschool.getDate());
            Date birthday = format.parse(strBirthday);
            Date atschool = format.parse(strNgayvaotruong);
            dto.setDate(new java.sql.Date(birthday.getTime()));
            dto.setEmail(txbemail.getText());
            dto.setDiachi(txbdiachi.getText());
            dto.setPass(format.format(birthday).replaceAll("/", ""));
            dto.setMakhoa(Integer.parseInt(makhoa.get(cbbkhoa.getSelectedItem().toString()).toString()));
            dto.setMalop(Integer.parseInt(map1.get(cbblop.getSelectedItem().toString()).toString()));
            dto.setHocvan(cbHocvan.getSelectedItem().toString());
            dto.setMaphongban(Integer.parseInt(map_phongban.get(cbPhongban.getSelectedItem().toString()).toString()));
            dto.setRole(2);
            dto.setNgayvaotruong(new java.sql.Date(atschool.getTime()));
            dto.setTenthannhan(txbtenthannhan.getText());
            dto.setQuanhe(txbquanhe.getText());
            dto.setSdtthannhan(txbsdtthanhan.getText());
            dto.setMathannhan(dto.getMssv());
        } catch (NumberFormatException | ParseException e) {
            System.err.println(e);
        }
        
        int result_sinhvien = bll.insertSinhVien(dto.getMssv(), dto.getHoten(), dto.getSdt(), dto.getDate(), dto.getEmail(), dto.getDiachi(), dto.getPass(), dto.getHocvan(), dto.getMakhoa(), dto.getMalop(), dto.getMaphongban(), dto.getRole(), dto.getNgayvaotruong());
        
        int result_thannhan = bll.insertThanNhan(dto.getTenthannhan(), dto.getSdtthannhan(), dto.getQuanhe(), dto.getMathannhan());
        if (result_sinhvien != 0) {
            if (result_thannhan != 0) {
                System.out.println("OK");
                LoadSinhvien();
            }
        } else {
            System.err.println("NOT OK");
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tablesinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesinhvienMouseClicked
        try {
            btnxoa.setEnabled(true);
            int i = tablesinhvien.getSelectedRow();
            txbmssv.setText(tablesinhvien.getValueAt(i, 0).toString());
            txbhoten.setText(tablesinhvien.getValueAt(i, 1).toString());
            cbblop.setSelectedItem(tablesinhvien.getValueAt(i, 2).toString());
            cbbkhoa.setSelectedItem(tablesinhvien.getValueAt(i, 3).toString());
            cbHocvan.setSelectedItem(tablesinhvien.getValueAt(i, 4).toString());
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tablesinhvien.getValueAt(i, 7).toString());
            datebirth.setDate(date);
            Date ne = new SimpleDateFormat("yyy-MM-dd").parse(tablesinhvien.getValueAt(i, 8).toString());
            inschool.setDate(ne);
        } catch (ParseException e) {
        }
    }//GEN-LAST:event_tablesinhvienMouseClicked

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        dto.setMssv(Integer.parseInt(txbmssv.getText()));
        bll.DeleteSV(dto.getMssv());
        LoadSinhvien();
        
    }//GEN-LAST:event_btnxoaActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new fSinhvien().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNADD;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbHocvan;
    private javax.swing.JComboBox<String> cbPhongban;
    private javax.swing.JComboBox<String> cbbkhoa;
    private javax.swing.JComboBox<String> cbblop;
    private com.toedter.calendar.JDateChooser datebirth;
    private com.toedter.calendar.JDateChooser inschool;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablesinhvien;
    private javax.swing.JTextField txbdiachi;
    private javax.swing.JTextField txbemail;
    private javax.swing.JTextField txbhoten;
    private javax.swing.JTextField txbmssv;
    private javax.swing.JTextField txbquanhe;
    private javax.swing.JTextField txbsdt;
    private javax.swing.JTextField txbsdtthanhan;
    private javax.swing.JTextField txbtenthannhan;
    // End of variables declaration//GEN-END:variables
}

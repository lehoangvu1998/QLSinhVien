package SinhVien;

import clsdatabase.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAL_SinhVien {

    DatabaseConnection db = null;
    PreparedStatement ps = null;
    Connection con = null;
    ResultSet rs = null;

    public ArrayList<DTO_SinhVien> getListSinhvien() {
        ArrayList<DTO_SinhVien> list = new ArrayList<>();
        String sql = "SELECT us.MAUSERS, us.HOTEN, us.SDT, us.NGAYSINH, us.EMAIL, us.DIACHI, us.PASS, us.HOCVAN, us.NGAYVAOTRUONG, l.TENLOP, kh.TENKHOA, tn.TENTHANNHAN, tn.SDTTHANNHAN, tn.QUANHE FROM USERS us, KHOA kh, LOP l, THANNHAN tn WHERE (kh.MAKHOA = us.MAKHOA) AND (l.MALOP = us.MALOP) AND (tn.MAUSERS = us.MAUSERS )";
        try {
            db = new  DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            DTO_SinhVien dto ;
            while (rs.next()) {
                dto = new  DTO_SinhVien();
                dto.setMssv(rs.getInt("MAUSERS"));
                dto.setHoten(rs.getString("HOTEN"));
                dto.setSdt(rs.getString("SDT"));
                dto.setDate(rs.getString("NGAYSINH"));
                dto.setEmail(rs.getString("EMAIL"));
                dto.setDiachi(rs.getString("DIACHI"));
                dto.setPass(rs.getString("PASS"));
                dto.setHocvan(rs.getString("HOCVAN"));
                dto.setNgayvaotruong(rs.getString("NGAYVAOTRUONG"));
                dto.setTenkhoa(rs.getString("TENKHOA"));
                dto.setTenlop(rs.getString("TENLOP"));
                dto.setTenthannhan(rs.getString("TENTHANNHAN"));
                dto.setSdtthannhan(rs.getString("SDTTHANNHAN"));
                dto.setQuanhe(rs.getString("QUANHE"));
                list.add(dto);
            }
        } catch (SQLException e) {
        }
        return  list;
    }
    
    public int InsertSinhvien (int mssv, String hoten) {
        
    } 
}

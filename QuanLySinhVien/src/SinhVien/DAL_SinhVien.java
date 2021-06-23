package SinhVien;

import Khoa.DTO_Khoa;
import Lop.DTO_LOP;
import PhongBan.DTO_PhongBan;
import clsdatabase.DatabaseConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class DAL_SinhVien {
    
    DatabaseConnection db = null;
    PreparedStatement ps = null;
    Connection con = null;
    ResultSet rs = null;
    
    public HashMap<String, Integer> fillcombo(int maphongban) {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            String sql = "select kh.MAKHOA, kh.TENKHOA from PHONGBAN pb, KHOA kh where pb.MAPHONGBAN = kh.MAPHONGBAN and pb.MAPHONGBAN = ?";
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, maphongban);
            rs = ps.executeQuery();
            DTO_Khoa dto;
            while (rs.next()) {
                dto = new DTO_Khoa(rs.getInt("MAKHOA"), rs.getString("TENKHOA"));
                map.put(dto.getTenkhoa(), dto.getMakhoa());
            }
        } catch (SQLException e) {
        }
        return map;
    }
    
    public HashMap<String, Integer> fillLopMap() {
        HashMap<String, Integer> map1 = new HashMap<>();
        try {
            String sql = " SELECT MALOP, TENLOP  FROM LOP";
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            DTO_LOP dto;
            while (rs.next()) {
                dto = new DTO_LOP(rs.getInt("MALOP"), rs.getString("TENLOP"));
                map1.put(dto.getTenlop(), dto.getMalop());
            }
        } catch (SQLException e) {
        }
        return map1;
    }
    
    public HashMap<String, Integer> loadPhongban() {
        HashMap<String, Integer> map = new HashMap<>();
        String query = "select MAPHONGBAN, TENPHONGBAN from PHONGBAN";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                DTO_PhongBan dto = new DTO_PhongBan(rs.getInt("MAPHONGBAN"), rs.getString("TENPHONGBAN"));
                map.put(dto.getTenphongban(), dto.getMaphongban());
            }
        } catch (SQLException e) {
            
        }
        return map;
    }
    
    public ArrayList<DTO_SinhVien> getListSinhvien() {
        ArrayList<DTO_SinhVien> list = new ArrayList<>();
        String sql = "SELECT us.MAUSERS, us.HOTEN, us.SDT, us.NGAYSINH, us.EMAIL, us.DIACHI, us.PASS, us.HOCVAN, us.NGAYVAOTRUONG, l.TENLOP, kh.TENKHOA, tn.TENTHANNHAN, tn.SDTTHANNHAN, tn.QUANHE FROM USERS us, KHOA kh, LOP l, THANNHAN tn WHERE (kh.MAKHOA = us.MAKHOA) AND (l.MALOP = us.MALOP) AND (tn.MAUSERS = us.MAUSERS )";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            DTO_SinhVien dto;
            while (rs.next()) {
                dto = new DTO_SinhVien();
                dto.setMssv(rs.getInt("MAUSERS"));
                dto.setHoten(rs.getString("HOTEN"));
                dto.setSdt(rs.getString("SDT"));
                dto.setDate(rs.getDate("NGAYSINH"));
                dto.setEmail(rs.getString("EMAIL"));
                dto.setDiachi(rs.getString("DIACHI"));
                dto.setPass(rs.getString("PASS"));
                dto.setHocvan(rs.getString("HOCVAN"));
                dto.setNgayvaotruong(rs.getDate("NGAYVAOTRUONG"));
                dto.setTenkhoa(rs.getString("TENKHOA"));
                dto.setTenlop(rs.getString("TENLOP"));
                dto.setTenthannhan(rs.getString("TENTHANNHAN"));
                dto.setSdtthannhan(rs.getString("SDTTHANNHAN"));
                dto.setQuanhe(rs.getString("QUANHE"));
                list.add(dto);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    
    public int insertSinhVien(int mssv, String hoten, String dienthoai, Date ngaysinh, String email, String diachi, String matkhau, String hocvan, int makhoa, int malop, int maphongban, int role, Date ngayvaotruong) {
        int result = 0;
        String query_sinhvien = "insert into USERS (MAUSERS, HOTEN, SDT, NGAYSINH, EMAIL, DIACHI, PASS, HOCVAN, MAKHOA, MALOP, MAPHONGBAN, ROLE, NGAYVAOTRUONG) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        //String query_sinhvien = "insert USERS (MAUSERS, HOTEN, SDT, NGAYSINH, EMAIL, DIACHI, PASS, HOCVAN, MAKHOA, MALOP, MAPHONGBAN, ROLE, NGAYVAOTRUONG) values (124, N'Nguyễn Văn A', '021312333', '24/03/1998', 'abc@gmail.com','TP.HCM', '24031998', N'Sinh viên', null, null, null, 2, '24/03/2021')";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(query_sinhvien);
            ps.setInt(1, mssv);
            ps.setString(2, hoten);
            ps.setString(3, dienthoai);
            ps.setDate(4, ngaysinh);
            ps.setString(5, email);
            ps.setString(6, diachi);
            ps.setString(7, matkhau);
            ps.setString(8, hocvan);
            ps.setInt(9, makhoa);
            ps.setInt(10, malop);
            ps.setInt(11, maphongban);
            ps.setInt(12, role);
            ps.setDate(13, ngayvaotruong);
            result = ps.executeUpdate();
        } catch (SQLException e) {
        } finally {
            try {
                con.close();
                ps.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
        return result;
    }
    
    public int insertThanNhan(String hoten, String sodienthoai, String quanhe, int mathannhan) {
        int result = 0;
        
        String query_thannhan = "insert THANNHAN values(?,?,?,?)";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(query_thannhan);
            ps.setString(1, hoten);
            ps.setString(2, sodienthoai);
            ps.setString(3, quanhe);
            ps.setInt(4, mathannhan);
            result = ps.executeUpdate();
        } catch (SQLException e) {
        } finally {
            try {
                con.close();
                ps.close();
                rs.close();
            } catch (SQLException e) {
                
            }
        }
        return result;
    }
}

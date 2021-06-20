package Khoa;

import PhongBan.DTO_PhongBan;
import clsdatabase.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class DALL_Khoa {

    PreparedStatement ps = null;
    DatabaseConnection db = null;
    ResultSet rs = null;
    Connection con = null;

    public HashMap<String, Integer> Fillcombo() {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            String sql = "SELECT MAPHONGBAN, TENPHONGBAN FROM PHONGBAN";
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            DTO_PhongBan dto;
            while (rs.next()) {
                dto = new DTO_PhongBan(rs.getInt("MAPHONGBAN"), rs.getString("TENPHONGBAN"));
                map.put(dto.getTenphongban(), dto.getMaphongban());
            }
        } catch (SQLException e) {
        }
        return map;
    }

    public ArrayList<DTO_Khoa> GetListKhoa() {
        ArrayList<DTO_Khoa> listkhoa = new ArrayList<>();
        String sql = " SELECT MAKHOA, TENKHOA, MAPHONGBAN, SDT FROM KHOA";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DTO_Khoa dto = new DTO_Khoa();
                dto.setMakhoa(rs.getInt("MAKHOA"));
                dto.setTenkhoa(rs.getString("TENKHOA"));
                dto.setMaphongban(rs.getInt("MAPHONGBAN"));
                dto.setSodienthoai(rs.getString("SDT"));
                listkhoa.add(dto);
            }
        } catch (SQLException e) {

        } finally {
            try {
                con.close();
                ps.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
        return listkhoa;
    }

    public int InsertKhoa(int makhoa, String tenkhoa, int maphongban, String sdt) {
        int result = 0;
        String sql = "INSERT INTO KHOA (MAKHOA, TENKHOA, MAPHONGBAN, SDT) VALUES (?,?,?,?)";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, makhoa);
            ps.setString(2, tenkhoa);
            ps.setInt(3, maphongban);
            ps.setString(4, sdt);
            result = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return result;
    }

    public int Updatekhoa(String tenkhoa, String sdt, int maphongban, int makhoa) {
        int result = 0;
        String sql = " UPDATE KHOA SET TENKHOA = ? , SDT = ?, MAPHONGBAN = ? WHERE MAKHOA = ?";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, tenkhoa);
            ps.setString(2, sdt);
            ps.setInt(3, maphongban);
            ps.setInt(4, makhoa);
            result = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return result;
    }

    public int Delete(int makhoa) {
        int result = 0;
        String sql = " DELETE KHOA WHERE MAKHOA = ?";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, makhoa);
            result = ps.executeUpdate();
        } catch (SQLException e) {

        }
        return result;
    }
}

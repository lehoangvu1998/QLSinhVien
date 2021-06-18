package NhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAL_NhanVien {

    private DatabaseConnection db = null;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public boolean Login(String manhanvien, String matkhau, int role) {
        String query = "select MANHANVIEN, PASS, ROLE from NHANVIEN where MANHANVIEN = ?,  PASS = ? AND ROLE = ?";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, manhanvien);
            ps.setString(2, matkhau);
            ps.setInt(3, role);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
        }
        return false;      
    }
}

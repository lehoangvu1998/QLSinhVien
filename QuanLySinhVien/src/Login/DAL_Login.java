package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAL_Login {

    private DatabaseConnection db = null;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public boolean Login(String manhanvien, String matkhau) {
        String query = "select MANHANVIEN, PASS from NHANVIEN where MANHANVIEN = ? and PASS = ?";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, manhanvien);
            ps.setString(2, matkhau);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
        }
        return false;      
    }
}

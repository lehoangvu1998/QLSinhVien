package DangNhap;

import clsdatabase.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAL_DangNhap {

    private DatabaseConnection db = null;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private int role;

    public boolean Login(String taikhoan, String matkhau) {
        String query = "select MAUSERS, PASS from USERS where MAUSERS = ? AND PASS = ? ";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, taikhoan);
            ps.setString(2, matkhau);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
        }
        return false;
    }


    public int getRole(String usr) {
        String query = "select ROLE from USERS where MAUSERS = ?";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            rs = ps.executeQuery();
            while (rs.next()) {
                role = rs.getInt("ROLE");
            }
        } catch (SQLException e) {
        }
        return role;
    }

}

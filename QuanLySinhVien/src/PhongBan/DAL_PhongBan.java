package PhongBan;

import clsdatabase.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAL_PhongBan {

    private ResultSet rs = null;
    private DatabaseConnection db = null;
    private Connection con = null;
    private PreparedStatement ps = null;

    public ArrayList<DTO_PhongBan> GetPhongbanList() {
        ArrayList<DTO_PhongBan> listphongban = new ArrayList<>();
        String sql = " select MAPHONGBAN, TENPHONGBAN from PHONGBAN";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DTO_PhongBan dto = new DTO_PhongBan();
                dto.setMaphongban(rs.getInt("MAPHONGBAN"));
                dto.setTenphongban(rs.getString("TENPHONGBAN"));
                listphongban.add(dto);
            }
        } catch (SQLException ex) {
        }
        return listphongban;
    }

    public int insertPhongban(int maphongban, String tenphongban) {
        int result = 0;
        String sql = "insert into PHONGBAN values(?, ?)";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, maphongban);
            ps.setString(2, tenphongban);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra");
        }
        return result;
    }

    public int Update(String tenphongban, int maphongban) {
        int result = 0;
        String sql = " Update PHONGBAN set TENPHONGBAN= ? WHERE MAPHONGBAN = ? ";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, tenphongban );
            ps.setInt(2, maphongban);
            result = ps.executeUpdate();
        } catch (SQLException ex) {

        }
        return result;
    }

    public void Delete(int maphongban) {

    }

}

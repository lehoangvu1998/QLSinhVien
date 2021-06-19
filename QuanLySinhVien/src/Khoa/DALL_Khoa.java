package Khoa;
import PhongBan.DTO_PhongBan;
import clsdatabase.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class DALL_Khoa {
    
    PreparedStatement ps = null;
    DatabaseConnection db = null;
    ResultSet rs = null;
    Connection con = null ;
    
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
}

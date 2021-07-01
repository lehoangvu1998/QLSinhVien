package MonHoc;

import Khoa.DTO_Khoa;
import clsdatabase.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class DAL_MONHOC {

    DatabaseConnection db = null;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ArrayList<DTO_MONHOC> getLISTmONHOC() {
        ArrayList<DTO_MONHOC> list = new ArrayList<>();
        String sql = "SELECT * FROM MONHOC";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DTO_MONHOC dto = new DTO_MONHOC();
                dto.setMamonhoc(rs.getInt("MAMONHOC"));
                dto.setTenmonhoc(rs.getString("TENMONHOC"));
                dto.setSotinchi(rs.getInt("SODVTINCHI"));
                dto.setMakhoa(rs.getInt("MAKHOA"));
                list.add(dto);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public HashMap<String, Integer> fillcombo() {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            String sql = " SELECT MAKHOA, TENKHOA  FROM KHOA";
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
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

    public int InsertMonhoc(int mamonhoc, String tenmonhoc, int sotinchi, int makhoa) {
        int result = 0;
        String sql = " INSERT MONHOC VALUES (?,?,?,?)";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, mamonhoc);
            ps.setString(2, tenmonhoc);
            ps.setInt(3, sotinchi);
            ps.setInt(4, makhoa);
            result = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return result;
    }

    public int UpdateMonhoc(String tenmonhoc, int sotinchi, int mamonhoc) {
        int result = 0;
        String sql = " UPDATE MONHOC SET TENMONHOC = ? , SODVTINCHI = ? WHERE MAMONHOC = ? ";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, tenmonhoc);
            ps.setInt(2, sotinchi);
            ps.setInt(3, mamonhoc);
            result = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return result;
    }

    public int DeleteMonhoc(int mamonhoc) {
        int result = 0;
        String sql = " DELETE FROM MONHOC WHERE MAMONHOC = ? ";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, mamonhoc);
            result = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return result;
    }
}

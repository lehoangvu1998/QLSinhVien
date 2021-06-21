package Lop;

import Khoa.DTO_Khoa;
import clsdatabase.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class DAL_LOP {

    DatabaseConnection db = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection con = null;

    public HashMap<String, Integer> fillcombo() {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            String sql = " SELECT MAKHOA, TENKHOA  FROM KHOA";
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            DTO_Khoa dto ;
            while (rs.next()) {
               dto = new DTO_Khoa(rs.getInt("MAKHOA"), rs.getString("TENKHOA"));
               map.put(dto.getTenkhoa(), dto.getMakhoa());
            }
        } catch (SQLException e) {
        }
        return map;
    }

    public ArrayList<DTO_LOP> GetlistLop() {
        ArrayList<DTO_LOP> list = new ArrayList<>();
        String sql = "SELECT * FROM LOP ";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DTO_LOP dto = new DTO_LOP();
                dto.setMakhoa(rs.getInt("MAKHOA"));
                dto.setMalop(rs.getInt("MALOP"));
                dto.setTenlop(rs.getString("TENLOP"));
                dto.setHedaotao(rs.getString("HEDAOTAO"));
                dto.setKhoa(rs.getInt("KHOA"));
                dto.setNam(rs.getInt("NAMNHAPHOC"));
                list.add(dto);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public int InsertClass(int malop, String tenlop, int khoa, String hedaotao, int nam, int makhoa) {
        int result = 0;
        String sql = " INSERT INTO LOP ( MALOP, TENLOP, KHOA, HEDAOTAO, NAMNHAPHOC, MAKHOA) VALUES (?,?,?,?,?,?)";
        try {
            db = new DatabaseConnection();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, malop);
            ps.setString(2, tenlop);
            ps.setInt(3, khoa);
            ps.setString(4, hedaotao);
            ps.setInt(5, nam);
            ps.setInt(6, makhoa);
            result = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return result;
    }
}
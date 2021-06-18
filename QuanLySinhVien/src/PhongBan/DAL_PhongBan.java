package PhongBan;

import clsdatabase.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAL_PhongBan {

    public static ResultSet rs = null;
    public static DatabaseConnection db = null;

    public ArrayList<DTO_PhongBan> GetPhongbanList() {
        ArrayList<DTO_PhongBan> listphongban = new ArrayList<>();
        String sql = " select * from PHONGBAN";
        try {
            DatabaseConnection dbn = new DatabaseConnection();
            dbn.getConnection();
            rs = dbn.ExcuteQueryGetTable(sql);
            DTO_PhongBan dto;
            while (rs.next()) {
                dto = new DTO_PhongBan(rs.getString("MAPHONGBAN"), rs.getString("TENPHONGBAN"));
                listphongban.add(dto);
            }
            return listphongban;
        } catch (SQLException ex) {
        }
        return null;
    }

    public void Insert(String tenphongban) {
        try {
            String sql = "insert into PHONGBAN values('" + tenphongban + "')";
            DatabaseConnection cv = new DatabaseConnection();
            cv.getConnection();
            cv.ExcuteQueryDB(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra ");
        }
    }

    public void Update(String maphongban, String tenphongban) {
        try {
            String sql = "Update PHONGBAN set TENPHONGBAN=N'" + tenphongban + "' where MAPHONGBAN ='" + maphongban + "'";
            DatabaseConnection cv = new DatabaseConnection();
            cv.getConnection();
            cv.ExcuteQueryDB(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  " Cập nhật không thành công ");
        }
    }
    
    public void Delete (String maphongban) {
        try {
            String Sql = "Delete from PHONGBAN where MAPHONGBAN='" + maphongban + "'";
            DatabaseConnection cv = new DatabaseConnection();
            cv.getConnection();
            cv.ExcuteQueryDB(Sql);
        } catch (Exception e) {
        }
    }
    
  
}

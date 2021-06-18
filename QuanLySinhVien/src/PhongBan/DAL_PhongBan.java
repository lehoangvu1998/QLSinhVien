package PhongBan;

import clsdatabase.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DAL_PhongBan {

    public static ResultSet rs = null;
    public static DatabaseConnection db = new DatabaseConnection();

    public ArrayList<DTO_PhongBan> GetPhongban() {
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

    public DefaultTableModel getPhongban() {
        DefaultTableModel df = new DefaultTableModel();
        df.addColumn("MAPHONGBAN");
        df.addColumn("TENPHONGBAN");
        String sql = "select * from PHONGBAN";
        try {
            DatabaseConnection dc = new DatabaseConnection();
            dc.getConnection();
            rs = dc.ExcuteQueryGetTable(sql);
            while (rs.next()) {
                String maphongban = rs.getString(1);
                String tenphongban = rs.getString(2);
                df.addRow(new Object[]{maphongban, tenphongban});
            }
            return df;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}

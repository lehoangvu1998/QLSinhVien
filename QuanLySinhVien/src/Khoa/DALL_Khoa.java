package Khoa;
import clsdatabase.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DALL_Khoa {
    
    PreparedStatement ps = null;
    DatabaseConnection db = null;
    ResultSet rs = null;
    Connection con = null ;
    
private void  Fillcombo (String tenphongban){
    try {
        String sql = "SELECT TENPHONGBAN FROM PHONGBAN";
        db = new DatabaseConnection();
        con = db.getConnection();
        ps = con.prepareStatement(sql);
        rs =ps.executeQuery();
        while(rs.next()){
           String name = rs.getString(tenphongban);
        }
    } catch (SQLException e) {
    }
}
}

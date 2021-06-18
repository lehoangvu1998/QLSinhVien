package clsdatabase ;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DatabaseConnection {

    private String dbs = null;
    private String drv = null;
    private String usr = null;
    private String pwd = null;

    Connection con;
    ResultSet rs = null;

    public Connection getConnection() {
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream("database.properties"));
            dbs = pro.getProperty("dbs");
            usr = pro.getProperty("usr");
            pwd = pro.getProperty("pwd");
            drv = pro.getProperty("drv");
            Class.forName(drv);
            con = DriverManager.getConnection(dbs, usr, pwd);
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy tập tin database.properties " + e);
        } catch (IOException e) {
            System.err.println("Có lổi khi thao tác tệp tin " + e);
        } catch (ClassNotFoundException e) {
            System.err.println("Không tìm thấy class " + e);
        } catch (SQLException e) {
            System.err.println("Lỗi kết nối cơ sở dữ liệu " + e);
        }
        if (con == null) {
            throw new NullPointerException("Kết nối không thành công");
        }
        return con;
    }

    public void ExcuteQueryDB(String cauTruyVanSQL) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(cauTruyVanSQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public ResultSet ExcuteQueryGetTable(String cauTruyVanSQL) {
        try {
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(cauTruyVanSQL);
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Luxury
 */
public class DatabaseConnection {

    private String dbs = null;
    private String drv = null;
    private String usr = null;
    private String pwd = null;

    private Connection con;

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
}

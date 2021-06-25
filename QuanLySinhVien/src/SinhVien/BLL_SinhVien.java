package SinhVien;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class BLL_SinhVien {

    DAL_SinhVien dal = new DAL_SinhVien();

    public ArrayList<DTO_SinhVien> getListSinhvien() {
        return dal.getListSinhvien();
    }

    public HashMap<String, Integer> loadPhongban() {
        return dal.loadPhongban();
    }

    public int insertSinhVien(int mssv, String hoten, String dienthoai, Date ngaysinh, String email, String diachi, String matkhau, String hocvan, int makhoa, int malop, int maphongban, int role, Date ngayvaotruong) {
        int result = dal.insertSinhVien(mssv, hoten, dienthoai, ngaysinh, email, diachi, matkhau, hocvan, makhoa, malop, maphongban, role, ngayvaotruong);
        return result;
    }

    public int insertThanNhan(String hoten, String sodienthoai, String quanhe, int mathannhan) {
        int result = dal.insertThanNhan(hoten, sodienthoai, quanhe, mathannhan);
        return result;
    }

    public HashMap<String, Integer> fillcombo(int maphongban) {
        return dal.fillcombo(maphongban);
    }

    public HashMap<String, Integer> fillLopMap() {
        return dal.fillLopMap();
    }
    
    public int DeleteSV(int mssv) {
        return  dal.DeleteSV(mssv);
    }
    
     public int UpdateSV( String hoten, String sdt, Date ngaysinh, String email, String diachi, String matkhau, String hocvan, int makhoa, int malop, int maphongban, int role, Date ngayvaotruong, int mssv) {
         return dal.UpdateSV(hoten, sdt, ngaysinh, email, diachi, matkhau, hocvan, makhoa, malop, maphongban, role, ngayvaotruong, mssv); 
     }
     
      public int UpdateThanNhan(String hoten, String sodienthoai, String quanhe, int mathannhan)  {
          return dal.UpdateThanNhan(hoten, sodienthoai, quanhe, mathannhan);
      }
}

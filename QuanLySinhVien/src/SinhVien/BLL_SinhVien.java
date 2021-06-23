package SinhVien;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class BLL_SinhVien {

    DAL_SinhVien dal = new DAL_SinhVien();

    public ArrayList<DTO_SinhVien> getListSinhvien() {
        return dal.getListSinhvien();
    }

    public int insertSinhVien(int mssv, String hoten, String sodienthoai, Date birthday, String email, String diachi, String matkhau, String hocvan, int makhoa, int malop, int maphongban, int role, Date ngayvaotruong, String hotenthannhan, String sodienthoaithannhan, String quanhe, int mathannhan) {
        return dal.insertSinhVien(mssv, hoten, sodienthoai, birthday, email, diachi, matkhau, hocvan, makhoa, malop, maphongban, role, ngayvaotruong, hotenthannhan, sodienthoaithannhan, quanhe, mathannhan);
    }
    
    public HashMap<String, Integer> fillcombo() {
        return  dal.fillcombo();
    }

     public HashMap<String, Integer> fillLopMap() {
         return dal.fillLopMap();
     }
}

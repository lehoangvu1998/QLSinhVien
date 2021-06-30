package Giangvien;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class BLL_GV {

    DAL_GV dal = new DAL_GV();

    public ArrayList<DTO_GV> GetListGiangVien() {
        return dal.GetListGiangVien();
    }

    public HashMap<String, Integer> fillcombo(int maphongban) {
        return dal.fillcombo(maphongban);
    }

    public HashMap<String, Integer> fillLopMap() {
        return dal.fillLopMap();
    }

    public HashMap<String, Integer> loadPhongban() {
        return dal.loadPhongban();
    }

    public int insertGiangVien(int msnv, String hoten, String dienthoai, Date ngaysinh, String email, String diachi, String matkhau, String hocvan, int makhoa, String malop, int maphongban, int role, Date ngayvaotruong) {
        return dal.insertGiangVien(msnv, hoten, dienthoai, ngaysinh, email, diachi, matkhau, hocvan, makhoa, malop, maphongban, role, ngayvaotruong);
    }

    public int insertThanNhan(String hoten, String sodienthoai, String quanhe, int mathannhan) {
        return dal.insertThanNhan(hoten, sodienthoai, quanhe, mathannhan);
    }

    public int DeleteGV(int msnv) {
        return dal.DeletGV(msnv);
    }

    public int UpdateGV(String hoten, String sdt, Date ngaysinh, String email, String diachi, String matkhau, String hocvan, int makhoa, int maphongban, int role, Date ngayvaotruong, int msnv) {
        return dal.UpdateGV(hoten, sdt, ngaysinh, email, diachi, matkhau, hocvan, makhoa, maphongban, role, ngayvaotruong, msnv);
    }

    public int UpdateThanNhan(String hoten, String sodienthoai, String quanhe, int mathannhan) {
        return dal.UpdateThanNhan(hoten, sodienthoai, quanhe, mathannhan);
    }
}

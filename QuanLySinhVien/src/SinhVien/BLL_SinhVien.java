package SinhVien;

import java.util.ArrayList;

public class BLL_SinhVien {

    DAL_SinhVien dal = new DAL_SinhVien();

    public ArrayList<DTO_SinhVien> getListSinhvien() {
        return dal.getListSinhvien();
    }
}

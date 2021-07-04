package Khoa;

import java.util.ArrayList;
import java.util.HashMap;

public class BLL_Khoa {

    DALL_Khoa dal = new DALL_Khoa();

    public HashMap<String, Integer> Fillcombo() {
        return dal.Fillcombo();
    }

    public ArrayList<DTO_Khoa> GetListKhoa() {
        return dal.GetListKhoa();
    }

    public int InsertKhoa(int makhoa, String tenkhoa, int maphongban, String sdt) {
        return dal.InsertKhoa(makhoa, tenkhoa, maphongban, sdt);
    }

    public int Updatekhoa(String tenkhoa, String sdt, int makhoa) {
        return dal.Updatekhoa(tenkhoa, sdt, makhoa);
    }

    public int Delete(int makhoa) {
        return dal.Delete(makhoa);
    }
}


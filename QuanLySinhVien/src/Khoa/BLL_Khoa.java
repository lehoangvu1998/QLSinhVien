package Khoa;

import java.util.ArrayList;
import java.util.HashMap;

public class BLL_Khoa {

    DALL_Khoa dal = new DALL_Khoa();

//    public HashMap<String, Integer> Fillcombo() {
//        return dal.Fillcombo();
//    }

    public ArrayList<DTO_Khoa> GetListKhoa() {
        return dal.GetListKhoa();
    }

    public int InsertKhoa(int makhoa, int maphongban, String tenkhoa, int sdt){
        return dal.InsertKhoa(makhoa, maphongban, tenkhoa, sdt);
    }
}

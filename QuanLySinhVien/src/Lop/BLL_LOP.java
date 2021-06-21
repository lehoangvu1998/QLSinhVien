package Lop;

import java.util.ArrayList;
import java.util.HashMap;

public class BLL_LOP {

    DAL_LOP dal = new DAL_LOP();

    public ArrayList<DTO_LOP> GetlistLop() {
        return dal.GetlistLop();
    }

    public int InsertClass(int malop, String tenlop, int khoa, String hedaotao, int nam, int makhoa) {
        return dal.InsertClass(malop, tenlop, khoa, hedaotao, nam, makhoa);
    }
    
    public HashMap<String, Integer> fillcombo() {
        return dal.fillcombo();
    }
}

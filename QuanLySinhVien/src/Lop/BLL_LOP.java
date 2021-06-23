package Lop;

import java.util.ArrayList;
import java.util.HashMap;

public class BLL_LOP {

    DAL_LOP dal = new DAL_LOP();

    public ArrayList<DTO_LOP> GetlistLop() {
        return dal.GetlistLop();
    }

    public int InsertClass(int malop, String tenlop, int khoa, String hedaotao, int nam, String makhoa) {
        return dal.InsertClass(malop, tenlop, khoa, hedaotao, nam, makhoa);
    }
    
    public HashMap<String, Integer> fillcombo() {
        return dal.fillcombo();
    }
     public int DeleteClass(int malop) {
         return  dal.DeleteClass(malop);
     }
     
    public int UpdateClass (String tenlop, int khoa, String hedaotao,int nam, int malop) {
        return   dal.UpdateClass(tenlop, khoa, hedaotao, nam, malop);
    }
}

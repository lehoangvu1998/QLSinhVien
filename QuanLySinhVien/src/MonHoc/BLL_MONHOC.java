package MonHoc;

import java.util.ArrayList;
import java.util.HashMap;

public class BLL_MONHOC {

    DAL_MONHOC dal = new DAL_MONHOC();

    public ArrayList<DTO_MONHOC> getLISTmONHOC() {
        return dal.getLISTmONHOC();
    }

    public HashMap<String, Integer> fillcombo() {
        return dal.fillcombo();
    }

    public int InsertMonhoc(int mamonhoc, String tenmonhoc, int sotinchi, int makhoa) {
        return dal.InsertMonhoc(mamonhoc, tenmonhoc, sotinchi, makhoa);
    }

    public int UpdateMonhoc(String tenmonhoc, int sotinchi, int mamonhoc) {
        return dal.UpdateMonhoc(tenmonhoc, sotinchi, mamonhoc);
    }

    public int DeleteMonhoc(int mamonhoc) {
        return dal.DeleteMonhoc(mamonhoc);
    }
}

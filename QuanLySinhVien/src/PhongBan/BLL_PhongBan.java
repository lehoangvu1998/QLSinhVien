package PhongBan;

import java.util.ArrayList;

public class BLL_PhongBan {

    DAL_PhongBan dal = new DAL_PhongBan();

    public ArrayList<DTO_PhongBan> GetPhongbanList() {
        return dal.GetPhongbanList();
    }

    public int insertPhongban(int maphongban, String tenphongban) {
        return dal.insertPhongban(maphongban, tenphongban);
    }

}

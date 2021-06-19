package Khoa;

import java.util.HashMap;

public class BLL_Khoa {

    DALL_Khoa dal = new DALL_Khoa();

   public HashMap<String, Integer> Fillcombo() {
        return dal.Fillcombo();
    }

}

package NhanVien;

public class BLL_NhanVien {

    private final DAL_NhanVien dal = new DAL_NhanVien();

    public boolean Login(DTO_NhanVien dto) {
        return dal.Login(dto.getManhanvien(), dto.getMatkhau());
    }
}

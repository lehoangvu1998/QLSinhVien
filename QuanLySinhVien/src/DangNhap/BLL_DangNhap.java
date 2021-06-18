package DangNhap;

public class BLL_DangNhap {

    private final DAL_DangNhap dal = new DAL_DangNhap();

    public boolean Login(DTO_DangNhap dto) {
        return dal.Login(dto.getTaikhoan(), dto.getMatkhau());
    }
}

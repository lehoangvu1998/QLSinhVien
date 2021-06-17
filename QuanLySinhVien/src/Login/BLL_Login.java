package Login;

public class BLL_Login {

    private final DAL_Login dal = new DAL_Login();

    public boolean Login(DTO_Login dto) {
        return dal.Login(dto.getManhanvien(), dto.getMatkhau());
    }
}

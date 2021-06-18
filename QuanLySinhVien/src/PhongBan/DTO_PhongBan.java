package PhongBan;

public class DTO_PhongBan {
    private String maphongban;
    private String tenphongban;

    public String getMaphongban() {
        return maphongban;
    }

    public DTO_PhongBan(String maphongban, String tenphongban) {
        this.maphongban = maphongban;
        this.tenphongban = tenphongban;
    }

    public void setMaphongban(String maphongban) {
        this.maphongban = maphongban;
    }

    public DTO_PhongBan() {
    }


    public String getTenphongban() {
        return tenphongban;
    }

    public void setTenphongban(String tenphongban) {
        this.tenphongban = tenphongban;
    }
}

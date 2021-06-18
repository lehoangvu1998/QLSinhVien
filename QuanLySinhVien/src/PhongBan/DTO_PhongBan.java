package PhongBan;

public class DTO_PhongBan {
    private int maphongban;
    private String tenphongban;

    public int getMaphongban() {
        return maphongban;
    }

    public void setMaphongban(int maphongban) {
        this.maphongban = maphongban;
    }

    public DTO_PhongBan(int maphongban, String tenphongban) {
        this.maphongban = maphongban;
        this.tenphongban = tenphongban;
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

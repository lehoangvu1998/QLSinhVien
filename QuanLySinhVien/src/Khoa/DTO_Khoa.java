package Khoa;
public class DTO_Khoa {
    private int makhoa;
    private int maphongban;
    private String tenkhoa;
    private String sodienthoai;


    public int getMakhoa() {
        return makhoa;
    }

    public DTO_Khoa() {
    }

    public DTO_Khoa(int makhoa, int maphongban, String tenkhoa, String sodienthoai) {
        this.makhoa = makhoa;
        this.maphongban = maphongban;
        this.tenkhoa = tenkhoa;
        this.sodienthoai = sodienthoai;
    }

    public DTO_Khoa(int makhoa, String tenkhoa) {
        this.makhoa = makhoa;
        this.tenkhoa = tenkhoa;
    }

    public void setMakhoa(int makhoa) {
        this.makhoa = makhoa;
    }

    public int getMaphongban() {
        return maphongban;
    }

    public void setMaphongban(int maphongban) {
        this.maphongban = maphongban;
    }

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
}

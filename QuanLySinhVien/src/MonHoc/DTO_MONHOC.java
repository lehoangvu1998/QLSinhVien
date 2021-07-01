package MonHoc;

public class DTO_MONHOC {

    private int mamonhoc, sotinchi, makhoa;
    private String tenmonhoc;

    public DTO_MONHOC(int mamonhoc, int sotinchi, int makhoa, String tenmonhoc) {
        this.mamonhoc = mamonhoc;
        this.sotinchi = sotinchi;
        this.makhoa = makhoa;
        this.tenmonhoc = tenmonhoc;
    }

    public DTO_MONHOC() {
    }

    public int getMamonhoc() {
        return mamonhoc;
    }

    public void setMamonhoc(int mamonhoc) {
        this.mamonhoc = mamonhoc;
    }

    public int getSotinchi() {
        return sotinchi;
    }

    public void setSotinchi(int sotinchi) {
        this.sotinchi = sotinchi;
    }

    public int getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(int makhoa) {
        this.makhoa = makhoa;
    }

    public String getTenmonhoc() {
        return tenmonhoc;
    }

    public void setTenmonhoc(String tenmonhoc) {
        this.tenmonhoc = tenmonhoc;
    }

}

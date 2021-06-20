package Lop;

public class DTO_LOP {

    private int malop;
    private String tenlop;
    private int makhoa;
    private String hedaotao;
    private int khoa;
    private int nam;

    public DTO_LOP() {
    }

    public DTO_LOP(int malop, String tenlop, int makhoa, String hedaotao, int khoa, int nam) {
        this.malop = malop;
        this.tenlop = tenlop;
        this.makhoa = makhoa;
        this.hedaotao = hedaotao;
        this.khoa = khoa;
        this.nam = nam;
    }

    public int getMalop() {
        return malop;
    }

    public void setMalop(int malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public int getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(int makhoa) {
        this.makhoa = makhoa;
    }

    public String getHedaotao() {
        return hedaotao;
    }

    public void setHedaotao(String hedaotao) {
        this.hedaotao = hedaotao;
    }

    public int getKhoa() {
        return khoa;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
}

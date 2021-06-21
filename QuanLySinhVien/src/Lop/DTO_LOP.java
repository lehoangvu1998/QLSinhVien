package Lop;

public class DTO_LOP {

    private int malop;
    private String tenlop;
    private String tenkhoa;
    private String hedaotao;
    private int khoa;
    private int nam;

    public DTO_LOP() {
    }

    public DTO_LOP(int malop, String tenlop, String tenkhoa, String hedaotao, int khoa, int nam) {
        this.malop = malop;
        this.tenlop = tenlop;
        this.tenkhoa = tenkhoa;
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

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
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

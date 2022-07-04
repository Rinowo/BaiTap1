package Entities;

public class DeTai {
    String maDT;
    String tenDT;
    int kinhPhi;
    String noiThucTap;

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public void setKinhPhi(int kinhPhi) {
        this.kinhPhi = kinhPhi;
    }

    public void setNoiThucTap(String noiThucTap) {
        this.noiThucTap = noiThucTap;
    }

    public DeTai(String maDT, String tenDT, int kinhPhi, String noiThucTap) {
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.kinhPhi = kinhPhi;
        this.noiThucTap = noiThucTap;
    }
}

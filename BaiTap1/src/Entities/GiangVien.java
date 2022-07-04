package Entities;

public class GiangVien {
    int maGV;
    String hoTenGV;
    double luong;
    String maKhoa;

    public void setMaGV(int maGV) {
        this.maGV = maGV;
    }

    public void setHoTenGV(String hoTenGV) {
        this.hoTenGV = hoTenGV;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public GiangVien(int maGV, String hoTenGV, double luong, String maKhoa) {
        this.maGV = maGV;
        this.hoTenGV = hoTenGV;
        this.luong = luong;
        this.maKhoa = maKhoa;
    }
}

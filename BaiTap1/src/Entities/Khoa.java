package Entities;

public class Khoa {
    int maKhoa;
    String tenKhoa;
    String dienthoai;

    public Khoa(int maKhoa, String tenKhoa, String dienthoai) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
        this.dienthoai = dienthoai;
    }

    public void setMaKhoa(int maKhoa) {
        this.maKhoa = maKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }
}

package Entities;

public class SinhVien {
    int maSV;
    String hoTenSV;
    String maKhoa;
    int namSinh;
    String queQuan;

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public SinhVien(int maSV, String hoTenSV, String maKhoa, int namSinh, String queQuan) {
        this.maSV = maSV;
        this.hoTenSV = hoTenSV;
        this.maKhoa = maKhoa;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }
}

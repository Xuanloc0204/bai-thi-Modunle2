

public class Phone {
    private String id;
    private String tenSanPham;
    private String hangSanXuat;
    private double giaTien;
    private int soLuong;

    public Phone(String id, String tenSanPham, double giaTien,  int soLuong, String hangSanXuat) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "id='" + id + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", giaTien=" + giaTien +
                ", soLuong=" + soLuong +
                '}';
    }
}

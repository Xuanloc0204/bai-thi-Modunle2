public class PortablePhone extends Phone{
    private String portableCountry;
    private String status;

    public PortablePhone(String id, String tenSanPham, double giaTien, int soLuong, String hangSanXuat, String portableCountry, String status) {
        super(id, tenSanPham, giaTien, soLuong, hangSanXuat);
        this.portableCountry = portableCountry;
        this.status = status;
    }

    public String getPortableCountry() {
        return portableCountry;
    }

    public void setPortableCountry(String portableCountry) {
        this.portableCountry = portableCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

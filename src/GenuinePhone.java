public class GenuinePhone extends Phone{
    private String warrantyPeriod;
    private String warrantyScope;

    public GenuinePhone(String id, String tenSanPham, double giaTien, int soLuong, String hangSanXuat, String warrantyPeriod, String warrantyScope) {
        super(id, tenSanPham, giaTien, soLuong, hangSanXuat);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyScope = warrantyScope;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyScope() {
        return warrantyScope;
    }

    public void setWarrantyScope(String warrantyScope) {
        this.warrantyScope = warrantyScope;
    }
}

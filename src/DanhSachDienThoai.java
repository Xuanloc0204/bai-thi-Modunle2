import java.util.ArrayList;

public class DanhSachDienThoai {
    private static ArrayList<Phone> danhSach = new ArrayList<>();;


    public static void themSanPham(Phone sp) {
        danhSach.add(sp);
        System.out.println("Thêm sản phẩm thành công.");
    }

    public static void hienThiDanhSachSp() {
        if (danhSach.isEmpty()) {
            System.out.println("Không có sản phẩm nào.");
        } else {
            for (Phone phone : danhSach) {
                System.out.println(phone);
            }
        }
    }


    public static void xoaSanPham(String id) {
        for (Phone sanPham : danhSach) {
            if (sanPham.getId().equals(id)) {
                danhSach.remove(sanPham);
                System.out.println("Xóa sản phẩm thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với id: " + id);
    }

    public static Phone timSanPhamTheoId(String id) {
        for (Phone sanPham : danhSach) {
            if (sanPham.getId().equals(id)) {
                return sanPham;
            }
        }
        return null;
    }

}
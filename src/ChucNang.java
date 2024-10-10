
import java.util.List;
import java.util.Scanner;

public class ChucNang {
    public static void menuChucNang() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI-----");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Thêm mới.");
            System.out.println("2. Xoá.");
            System.out.println("3. Xem danh sách điện thoại.");
            System.out.println("4. Tìm sản phẩm theo ID.");
            System.out.println("5. Thoát.");

            choice = Integer.parseInt(scanner.nextLine());

            FileDanhSach fileDanhSach = new FileDanhSach();

            switch (choice) {
                case 1:
                    System.out.println("1. Điện thoại chính hãng.");
                    System.out.println("2. Điện thoại xách tay.");
                    System.out.println("3. Quay lại.");
                    choice = Integer.parseInt(scanner.nextLine());

                    switch (choice) {
                        case 1:
                            System.out.println("Nhập thông tin sản phẩm:");

                            System.out.println("Nhập ID sản phẩm:");
                            String id = scanner.nextLine();

                            System.out.println("Nhập tên sản phẩm:");
                            String tenSanPham = scanner.nextLine();

                            System.out.println("Nhập giá tiền:");
                            double giaTien = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Nhập số lượng:");
                            int soLuong = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Nhập hãng sản xuất:");
                            String hangSanXuat = scanner.nextLine();

                            System.out.println("Nhập thời gian bảo hành:");
                            String warrantyPeriod = scanner.nextLine();

                            System.out.println("Nhập phạm vi bảo hành:");
                            String warrantyScope = scanner.nextLine();

                            Phone dienThoaiCH = new GenuinePhone(id, tenSanPham, giaTien, soLuong, hangSanXuat, warrantyPeriod, warrantyScope);
                            DanhSachDienThoai.themSanPham(dienThoaiCH);



//                            List<DanhSachDienThoai> list1 = fileDanhSach.ghiFile();

                            break;
                        case 2:
                            System.out.println("Nhập thông tin sản phẩm:");

                            System.out.println("Nhập ID sản phẩm:");
                            id = scanner.nextLine();

                            System.out.println("Nhập tên sản phẩm:");
                            tenSanPham = scanner.nextLine();

                            System.out.println("Nhập giá tiền:");
                            giaTien = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Nhập số lượng:");
                            soLuong = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Nhập hãng sản xuất:");
                            hangSanXuat = scanner.nextLine();

                            System.out.println("Nhập thời gian bảo hành:");
                            String portableCountry = scanner.nextLine();

                            System.out.println("Nhập phạm vi bảo hành:");
                            String status = scanner.nextLine();

                            Phone dienThoaiXT = new GenuinePhone(id, tenSanPham, giaTien, soLuong, hangSanXuat, portableCountry, status);
                            DanhSachDienThoai.themSanPham(dienThoaiXT);

//                            List<DanhSachDienThoai> list2 = fileDanhSach.ghiFile();


                            break;

                        case 3:
                            ChucNang.menuChucNang();
                            break;

                        default:
                            System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                            break;
                    }

                    break;
                case 2:
                    System.out.print("Nhập ID sản phẩm để xóa: ");
                    String idCanXoa = scanner.nextLine();
                    DanhSachDienThoai.xoaSanPham(idCanXoa);
                    break;
                case 3:
                    DanhSachDienThoai.hienThiDanhSachSp();
                    break;
                case 4:
                    System.out.print("Nhập ID sản phẩm để tìm: ");
                    String idCanTim = scanner.nextLine();
                    Phone spCanTim = DanhSachDienThoai.timSanPhamTheoId(idCanTim);
                    if (spCanTim != null) {
                        System.out.println("Sản phẩm tìm thấy: " + spCanTim);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm với mã: " + idCanTim);
                    }
                    break;

                case 5:
                    System.out.println("Tạm biệt");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                    break;
            }
        } while (choice != 5);
    }
}
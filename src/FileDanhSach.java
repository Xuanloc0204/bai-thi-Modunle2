import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileDanhSach {

    private static final String FILE_PATH = "data.csv"; // Path to the file

    public List<DanhSachDienThoai> ghiFile(List<Phone> danhSachDienThoai) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Phone phone : danhSachDienThoai) {
                writer.write(phone.toString()); // Assuming Phone has a proper toString() method
                writer.newLine();
            }
            System.out.println("Đã ghi thành công vào file.");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi vào file: " + e.getMessage());
        }
        return null;
    }
}

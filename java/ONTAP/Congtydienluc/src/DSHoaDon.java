import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DSHoaDon {
    public static void main(String[] args) {
        List<Hoadon> danhSachHoaDon = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng hóa đơn: ");
        int soLuongHoaDon = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới còn sót lại

        for (int i = 0; i < soLuongHoaDon; i++) {
            System.out.println("\nNhập thông tin hóa đơn thứ " + (i + 1) + ":");

            System.out.print("Loại hóa đơn (1 - Kinh doanh, 2 - Bình thường): ");
            int loaiHoaDon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới còn sót lại

            System.out.print("Mã khách hàng: ");
            String maKhachHang = scanner.nextLine();

            System.out.print("Tên khách hàng: ");
            String tenKhachHang = scanner.nextLine();

            System.out.print("Chỉ số cũ: ");
            int chiSoCu = scanner.nextInt();

            System.out.print("Chỉ số mới: ");
            int chiSoMoi = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới còn sót lại

            if (loaiHoaDon == 1) {
                System.out.print("Lĩnh vực kinh doanh: ");
                String linhVucKinhDoanh = scanner.nextLine();
                danhSachHoaDon.add(new Hokd(maKhachHang, tenKhachHang, chiSoCu, chiSoMoi, linhVucKinhDoanh));
            } else if (loaiHoaDon == 2) {
                danhSachHoaDon.add(new Hobt(maKhachHang, tenKhachHang, chiSoCu, chiSoMoi));
            } else {
                System.out.println("Loại hóa đơn không hợp lệ!");
                i--; // Giảm biến đếm để nhập lại thông tin hóa đơn này
            }
        }

        System.out.println("\nDanh sách hóa đơn:");
        for (Hoadon hoaDon : danhSachHoaDon) {
            System.out.println(hoaDon);
        }
    }
}
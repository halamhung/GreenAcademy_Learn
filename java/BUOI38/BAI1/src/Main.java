import BaiTap_DocGia.DanhSachDocGia;
import oop.SinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        SinhVien sv = new SinhVien();
//        sv.xuat();
//        SinhVien sv2 = new SinhVien("Lê lợi", 9 , 8);
//        System.out.println("ĐTB:"+ sv.dtb());
//        System.out.println("ĐTB2 :"+ sv2.dtb());
//        System.out.println("ĐTB của sv 1 và 2: "+ sv.dtb(sv, sv2));
        DanhSachDocGia danhSach = new DanhSachDocGia();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1: Nhập danh sách độc giả");
            System.out.println("2: Xuất danh sách độc giả");
            System.out.println("3: Tính tổng tiền thu được");
            System.out.println("4: Thoát chương trình");
            System.out.print("Mời bạn nhập vào lựa chọn: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    danhSach.nhap();
                    break;
                case 2:
                    System.out.println("Danh sách độc giả:");
                    danhSach.xuat();
                    break;
                case 3:
                    long tongTien = danhSach.tinhtien();
                    System.out.println("Tổng tiền thu được: " + tongTien + " VNĐ");
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
                    break;
            }
            System.out.println("############################");
        }
    }
}
import java.util.Scanner;

public class Main {


    private static int reduceToSingleDigit(int number) {
        while (number > 9 && number != 11 && number != 22 && number != 33) {
            number = sumOfDigits(number);
        }
        return number;
    }

    // Phương thức tính tổng các chữ số
    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static String Cunghoangdao(int day, int month) {
        if (month == 1) {
            return (day <= 19) ? "Ma Kết" : "Bảo Bình";
        } else if (month == 2) {
            return (day <= 18) ? "Bảo Bình" : "Song Ngư";
        } else if (month == 3) {
            return (day <= 20) ? "Song Ngư" : "Bạch Dương";
        } else if (month == 4) {
            return (day <= 19) ? "Bạch Dương" : "Kim Ngưu";
        } else if (month == 5) {
            return (day <= 20) ? "Kim Ngưu" : "Song Tử";
        } else if (month == 6) {
            return (day <= 20) ? "Song Tử" : "Cự Giải";
        } else if (month == 7) {
            return (day <= 22) ? "Cự Giải" : "Sư Tử";
        } else if (month == 8) {
            return (day <= 22) ? "Sư Tử" : "Xử Nữ";
        } else if (month == 9) {
            return (day <= 22) ? "Xử Nữ" : "Thiên Bình";
        } else if (month == 10) {
            return (day <= 22) ? "Thiên Bình" : "Bọ Cạp";
        } else if (month == 11) {
            return (day <= 21) ? "Bọ Cạp" : "Nhân Mã";
        } else if (month == 12) {
            return (day <= 21) ? "Nhân Mã" : "Ma Kết";
        } else {
            return "Ngày hoặc tháng không hợp lệ";
        }
    }

    public static int calculateLifePathNumber(int day, int month, int year) {
        int sum = day + month + year;
        return reduceToSingleDigit(sum);
    }

    // Phương thức rút gọn số đến chữ số duy nhất hoặc số thấy phong


    public static void NhapXuat() {
        Scanner sc = new Scanner(System.in);

        // Nhập tên và tuổi của người dùng
        System.out.println("Nhập tên của bạn:");
        String name = sc.nextLine();

        // Nhập tuổi của người dùng
        System.out.println("Nhập tuổi của bạn:");
        int age = sc.nextInt();

        // Nhập chiều cao của người dùng
        System.out.println("Nhập chiều cao của bạn (cm):");
        int height = sc.nextInt();
        // Nhập ngày sinh và tháng sinh để xác định cung hoàng đạo
        System.out.println("Nhập ngày sinh của bạn:");
        int day = sc.nextInt();
        System.out.println("Nhập tháng sinh của bạn:");
        int month = sc.nextInt();
        System.out.print("Nhập năm sinh (yyyy): ");
        int year = sc.nextInt();

        // Hiển thị thông tin người dùng
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height + " cm");
        System.out.println("Ngày sinh: " + day + "/" + month);
        System.out.println("Năm sinh: " + year);

        // Hiển thị cung hoàng đạo
        String zodiacSign = Cunghoangdao(day, month);
        System.out.println("Cung hoàng đạo của bạn: " + zodiacSign);
        int lifePathNumber = calculateLifePathNumber(day, month, year);
        System.out.println("Số đường đời của bạn là: " + lifePathNumber);
        sc.close();
    }

    public static void main(String[] args) {
//        NhapXuat();
        Hinhchunhat hcn = new Hinhchunhat();

        // Nhập dữ liệu cho hình chữ nhật
        hcn.nhapHCN();

        // Xuất dữ liệu của hình chữ nhật
        hcn.xuatHCN();

        // Tính và in ra diện tích và chu vi của hình chữ nhật
        System.out.println("Diện tích của hình chữ nhật là: " + hcn.dienTich());
        System.out.println("Chu vi của hình chữ nhật là: " + hcn.tinhChuVi());

    }
}

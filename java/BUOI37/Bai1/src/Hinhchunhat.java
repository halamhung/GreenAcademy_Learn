import java.util.Scanner;

public class Hinhchunhat {
    int dai;
    int rong;

    // Constructor không tham số
    public Hinhchunhat() {
        this.dai = 0;
        this.rong = 0;
    }

    // Constructor có tham số
    public Hinhchunhat(int d, int r) {
        this.dai = d;
        this.rong = r;
    }

    // Phương thức nhập chiều dài và chiều rộng của hình chữ nhật
    public void nhapHCN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        this.dai = sc.nextInt();
        System.out.print("Nhập chiều rộng: ");
        this.rong = sc.nextInt();
    }

    // Phương thức xuất thông tin chiều dài và chiều rộng của hình chữ nhật
    public void xuatHCN() {
        System.out.println("Chiều dài: " + this.dai);
        System.out.println("Chiều rộng: " + this.rong);
    }

    // Phương thức tính diện tích hình chữ nhật
    public double dienTich() {
        return dai * rong;
    }

    // Phương thức tính chu vi hình chữ nhật
    public double tinhChuVi() {
        return (dai + rong) * 2;
    }
}
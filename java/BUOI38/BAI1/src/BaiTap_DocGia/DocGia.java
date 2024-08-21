package BaiTap_DocGia;

import java.util.Scanner;

public abstract class DocGia {
    private int thang;
    private long gia;
    public DocGia() {

    }
    public DocGia(int thang, long gia) {
        this.thang = thang;
        this.gia = gia;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tháng:");
        this.thang = sc.nextInt();
    }
    public void xuat(){
        System.out.println("Số Tháng: "+thang+"\nGiá: "+gia);
    }
    abstract long tinhtien();
}

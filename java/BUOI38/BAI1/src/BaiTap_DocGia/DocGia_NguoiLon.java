package BaiTap_DocGia;

import java.util.Scanner;

public class DocGia_NguoiLon extends  DocGia {
    private String So_CCCD;

    public  DocGia_NguoiLon() {
        this.setGia(10000);
    }

    public String getSo_CCCD() {
        return So_CCCD;
    }

    public void setSo_CCCD(String so_CCCD) {
        this.So_CCCD = so_CCCD;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so CCCD: ");
        this.So_CCCD = sc.nextLine();
        super.nhap();
    }
    @Override
    public void xuat(){
        System.out.println("Số CCCD: "+ this.So_CCCD);
        super.xuat();
    }
    @Override
    public long tinhtien() {
        return getGia()*getThang();
    }
}

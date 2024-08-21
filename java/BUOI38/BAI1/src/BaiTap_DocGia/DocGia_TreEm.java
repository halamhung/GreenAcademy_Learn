package BaiTap_DocGia;

import java.util.Scanner;

public class DocGia_TreEm extends DocGia {
    private  String NBH;
    public DocGia_TreEm(){
        this.setGia(5000);
    }



    public String getNBH() {
        return NBH;
    }

    public void setNBH(String NBH) {
        this.NBH = NBH;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên người bảo hộ:");
        this.NBH = sc.nextLine();
        super.nhap();
    }
    @Override
    public void xuat(){
        System.out.println("Tên người bảo hộ: "+ this.NBH);
        super.xuat();
    }
    @Override
    public long tinhtien() {
        return getGia()*getThang();
    }
}

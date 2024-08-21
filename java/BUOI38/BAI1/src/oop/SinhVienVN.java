package oop;

public class SinhVienVN extends SinhVien {
    private float trietHoc ;
    public SinhVienVN(){}
    public SinhVienVN(float trietHoc){
        super();
        this.trietHoc = trietHoc;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Triết học:"+ trietHoc);
    }
}

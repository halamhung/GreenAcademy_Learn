package oop;

public class SinhVien {
    public String ten;
    public float toan;
    public float van;
    public SinhVien(){

    }
    public SinhVien(String ten , float toan , float van){
        this.ten = ten;
        this.toan = toan;
        this.van = van;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }
    public void xuat(){
        System.out.println("Họ tên:" + this.ten + " Toán:" + this.toan + " Van:" + this.van);
    }
    public float dtb(){
        return (this.toan + this.van) / 2;
    }
    //tính điểm 2 học viê
    public float dtb(SinhVien sv){
        return (this.dtb() + sv.dtb()) / 2;
    }
    //3 học sinh
    public  float dtb (SinhVien sv1 , SinhVien sv2){
        return (sv1.dtb() + sv2.dtb() + this.dtb() ) / 3;
    }
}

package Nhommau;

import java.util.Scanner;

public class Nhommau {
    public boolean rh;
    public int loaiMau;
    public static final int _O =1;
    public static final int _A =2;
    public static final int _B =3;
    public static final int _AB =4;

    public Nhommau(){}
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nơi bạn nhận Rh");
        this.rh = sc.nextBoolean();

    }
    public void xuat(){
        System.out.println("########");
        if(this.loaiMau==_O){
            System.out.println("Nhóm Mau O");
        } else if (this.loaiMau==_A) {
            System.out.println("Nhóm máu A");
        }
        else if(this.loaiMau==_B){
            System.out.println("Nhóm Mau B");
        }
        else if(this.loaiMau==_AB){
            System.out.println("Nhóm Mau AB");
        }
        if(rh == false){
            System.out.println("-");
        }
        else {
            System.out.println("+");
        }
        System.out.println("##########");
    }
public abstract boolean KiemTraDiChuyen(Nhommau Cha, Nhommau Con);
    public abstract boolean KiemTraNhomMau(Nhommau nhan);

public boolean kiemTraRh(                                                                                                                                                                                                                                   )



    public boolean isRh(){
        return rh;
    }
    public void setRh(boolean rh){
        this.rh = rh;
    }

}

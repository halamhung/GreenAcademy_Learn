package Nhommau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhsachNM {
    private List<Nhommau> arr ;
    public DanhsachNM(){
       this.arr = new ArrayList<>();
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số lượng:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Nhập thông tin người thứ "+(i+1));
            System.out.println("1. Nhóm O");
            System.out.println("2. Nhóm A");
            System.out.println("3. Nhóm B");
            System.out.println("4. Nhóm AB");
            System.out.println("Mời bạn lựa chọn nhóm máu");
            int flag = sc.nextInt();
            if(flag == 1){
                Nhommau x = new O();
                x.nhap();
                this.arr.add(x);
            }
            else if(flag == 2){
                Nhommau x = new A();
                x.nhap();
                this.arr.add(x);
            }
            else if(flag == 3){
                Nhommau x = new B();
                x.nhap();
                this.arr.add(x);
            }
            else if(flag == 4){
                Nhommau x = new AB();
                x.nhap();
                this.arr.add(x);
            }
        }
    }
    public void xuat(){
        for(Nhommau x : this.arr){
            x.xuat();
        }
    }
    public static void main(String[] args) {
        DanhsachNM ds = new DanhsachNM();
        ds.nhap();
        ds.xuat();
    }
}

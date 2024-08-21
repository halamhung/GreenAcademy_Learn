package BaiTap_DocGia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachDocGia {
    private List<DocGia> arr;
    public DanhSachDocGia() {
        this.arr = new ArrayList<>();
    }
    public void nhap(){
     int flag =1 ;
     System.out.println("1:Nhập DG Trẻ em:");
     System.out.println("2: Nhập DG Người lớn:");
     System.out.println("3:Exit");
     System.out.println("####");
     while (true){
         System.out.println("Mời bạn nhập vào lựa chọn:");
         Scanner sc = new Scanner(System.in);
         flag = sc.nextInt();
         DocGia a;
         if(flag == 1){
             a = new DocGia_TreEm();
         }else if(flag == 2){
             a = new DocGia_NguoiLon();
         }else{
             break;
         }
         a.nhap();
         arr.add(a);
     }

    }
    public void xuat(){
        int stt =1;
        System.out.println("Danh sách đọc giả trẻ em:");
        for(DocGia d : arr){
           if(d instanceof DocGia_TreEm){
               d.xuat();
               stt++;
           }
        }

        System.out.println("Danh sách đọc giả người lớn:");
        for(DocGia d : arr){
            if(d instanceof DocGia_NguoiLon){
                d.xuat();
                stt++;
            }
        }
    }
    public long tinhtien(){
        long sum = 0;
        for(DocGia d : arr){
            sum += d.tinhtien();
        }
        return sum;
    }
}

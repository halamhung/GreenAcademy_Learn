package com.example.bai1.Goithanhvien;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@RequiredArgsConstructor
@Component

public class ThanhVien {
    private String ten ;
    private final GoiDangKi goiDangKi;

//    public void thongTinThanhVien(){
//        System.out.println("ten= mèo");
//        goiDangKi.thongtin();
//    }

}


//public class ThanhVien {
//    private String ten ;
//    @Autowired // dùng 1 trong 3 chỗ (1/3)
//    private GoiDangKi goiDangKi;
//
//    public void thongTinThanhVien(){
//        System.out.println("ten= mèo");
//        goiDangKi.thongtin();
//    }
//    public void thongTinTenThanhVien(){
//        System.out.println("Tên : mèo");
//    }
//
//    //Dùng tight coupling
//    public ThanhVien(){
////        this.goiDangKi = new NonMember();
//        System.out.println("Constructor về thành viên");
//    }
//
//    //dùng loose coupling
//    @Autowired // dùng 1 trong 3 chỗ (2/3)
//    public ThanhVien(GoiDangKi g){
//        this.goiDangKi = g;
//    }
//
//    @Autowired // dùng 1 trong 3 chỗ (3/3)
//    public void setGoiDangKi(GoiDangKi goiDangKi){
//        this.goiDangKi = goiDangKi;
//    }
//
//
//}

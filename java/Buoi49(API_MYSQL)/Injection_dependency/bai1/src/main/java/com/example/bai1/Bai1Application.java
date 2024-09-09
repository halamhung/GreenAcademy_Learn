package com.example.bai1;

import com.example.bai1.Goithanhvien.Basic;
import com.example.bai1.Goithanhvien.GoiDangKi;
import com.example.bai1.Goithanhvien.Meo;
import com.example.bai1.Goithanhvien.ThanhVien;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Bai1Application {

    public static void main(String[] args) {
        System.out.println("Bắt đầu chạy");
        ApplicationContext context = SpringApplication.run(Bai1Application.class,args);
        ThanhVien a = context.getBean(ThanhVien.class);
//        a.thongTinTenThanhVien();
//        a.thongTinThanhVien();
        Meo m = context.getBean(Meo.class);
        m.thongTin();

    }

//    public static void main(String[] args) {
//       GoiDangKi g = new Basic(); // Loose coupling
////        ThanhVien k = new ThanhVien(g);// Loose coupling
//        ThanhVien k = new ThanhVien();
//        k.setGoiDangKi(g);// Loose coupling
//        k.thongTinThanhVien();
//
//
//    }

}

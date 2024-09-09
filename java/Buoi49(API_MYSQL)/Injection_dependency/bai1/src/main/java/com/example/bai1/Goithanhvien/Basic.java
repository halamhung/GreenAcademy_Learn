package com.example.bai1.Goithanhvien;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // tiêm injection

public class Basic implements GoiDangKi{
    @Override
    public void thongtin() {
        System.out.println("Đây là gói basic");
    }
    public Basic(){
        System.out.println("Constructor Basic member");
    }
}

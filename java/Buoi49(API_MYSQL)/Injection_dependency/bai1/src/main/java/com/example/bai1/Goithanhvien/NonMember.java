package com.example.bai1.Goithanhvien;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // tiêm injection
@Primary
public class NonMember implements GoiDangKi{
    public NonMember(){
        System.out.println("Constructor non member");
    }
    @Override
    public void thongtin() {
        System.out.println("Đây là gói non member");
    }
}

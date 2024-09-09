package com.example.swaggerui.models;

public enum XepLoai {
    Gioi("Giỏi"),KHA("Khá"),TRUNG_BINH("Trung bình"),YEU("Yếu");
    private String xl;

    XepLoai(String xl) {
        this.xl = xl;
    }
    public String getXl(){
        return xl;
    }
}

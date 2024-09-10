package com.example.swaggerui.responses;

import com.example.swaggerui.models.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class StudentResonse extends BaseResponse{
    private Long id;
    private String ten;
    private String thanhPho;
    private LocalDate ngaySinh;
    private String xepLoai;
    public static StudentResonse fromStudent(Student student){
        StudentResonse studentResonse = StudentResonse.builder()
                .id(student.getId())
                .ten(student.getTen())
                .thanhPho(student.getThanhPho())
                .ngaySinh(student.getNgaySinh())
                .xepLoai(String.valueOf(student.getXepLoai()))
                .build();
        return studentResonse;
    }
}

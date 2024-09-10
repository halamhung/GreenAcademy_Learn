package com.example.swaggerui.dtos;

import com.example.swaggerui.models.XepLoai;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    @NotBlank(message = "Tên không được trống")
    @Size(min = 2, max = 50, message = "Tên phải từ 2 đến 50 ký tự")
    private String ten;

    @NotBlank(message = "Thành phố không được trống")
    private String thanhPho;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Past(message = "Phải là 1 ngày trong quá khứ")
    private LocalDate ngaySinh;

    @NotNull(message = "Xếp loại không được trống")
    @Enumerated(EnumType.STRING)
    private String xepLoai;
}

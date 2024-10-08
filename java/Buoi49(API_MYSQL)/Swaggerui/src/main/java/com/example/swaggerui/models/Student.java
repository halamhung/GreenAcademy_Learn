package com.example.swaggerui.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.cglib.core.Local;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Data
@Table(name = "student")
public class Student extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    private XepLoai  xepLoai;
}

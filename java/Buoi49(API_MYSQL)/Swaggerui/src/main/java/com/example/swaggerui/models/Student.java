package com.example.swaggerui.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Tên không được trống")
    private String name;

    @NotBlank(message = "Thành phố không được trống")
    private String thanPho;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Past(message = "Phải là 1 ngày trong quá khứ")
    private LocalDate ngaySinh;

    @NotNull(message = "Xếp loại không được trống")
    @Enumerated(EnumType.STRING)
    private XepLoai xepLoai;
}

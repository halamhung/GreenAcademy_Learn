package com.example.swaggerui.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StudentImageDTO {
    @JsonProperty("student_id")
    @Min(value = 1,message = "id student phải lớn hơn 0")
    private Long studentId;

    @Size(min = 5,max = 200,message = "Tên hình ảnh phải có 5 ký tự, không quá hơn 200 ký tự")
    @JsonProperty("image_url")
    private String imageUrl;
}

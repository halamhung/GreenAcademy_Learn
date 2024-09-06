package com.example.api_mysql.dtos;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    @JsonProperty("name")
    @NotEmpty(message = "Tên không được rỗng")
    private String categoryName;
}

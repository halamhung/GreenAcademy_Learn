package com.example.api_mysql.responses;

import com.example.api_mysql.models.Category;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CategoryResponse extends BaseResponse {
    private Long id;
    private String name;
    public static CategoryResponse fromCategory(Category category){
        CategoryResponse categoryResponse = CategoryResponse.builder()
                .name(category.getName())
                .id(category.getId())
                .build();
        categoryResponse.setCreatedAt(category.getCreatedAt());
        categoryResponse.setUpdatedAt(category.getUpdatedAt());
        return categoryResponse;
    }
}

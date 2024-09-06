package com.example.api_mysql.services;

import com.example.api_mysql.dtos.CategoryDTO;
import com.example.api_mysql.models.Category;
import com.example.api_mysql.responses.CategoryResponse;
import org.hibernate.query.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface ICategoryService {
    Category getCategoryById(Long id);
    List<Category> getAllCategories();
    Category saveCategory(CategoryDTO categoryDTO);

    Category updateCategory(Long id, CategoryDTO categoryDTO);

    void deleteCategory(Long id);
    Page<CategoryResponse> getAllCategories(PageRequest pageRequest);
}

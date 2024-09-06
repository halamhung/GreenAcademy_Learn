package com.example.api_mysql.services;

import com.example.api_mysql.dtos.CategoryDTO;
import com.example.api_mysql.models.Category;
import com.example.api_mysql.repositories.CategoryRepository;
import com.example.api_mysql.responses.CategoryResponse;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category saveCategory(CategoryDTO categoryDTO) {
        //category category = new Category();
        //category.setName(categoryDTO.getCategoryName());
        Category category = Category
                .builder()
                .name(categoryDTO.getCategoryName())
                .build();
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Long id, CategoryDTO categoryDTO) {
        Category cate = getCategoryById(id);
        cate.setName(categoryDTO.getCategoryName());
        cate.setUpdatedAt(LocalDateTime.now());
        return categoryRepository.save(cate);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
    @Override
    public Page<CategoryResponse> getAllCategories(PageRequest pageRequest) {
        return categoryRepository.findAll(pageRequest).map(category -> {
            return CategoryResponse.fromCategory(category);
        });
    }

}

package com.example.api_mysql.controller;

import com.example.api_mysql.dtos.CategoryDTO;
import com.example.api_mysql.models.Category;
import com.example.api_mysql.services.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @GetMapping("")
    public List<Category> index(){
        return categoryService.getAllCategories();
    }
    @PostMapping("")
    public ResponseEntity<?> postCategory(@Valid @RequestBody CategoryDTO categoryDTO, BindingResult result){
        if(result.hasErrors()){
            List<String> errors = result.getFieldErrors().stream()
                    .map(FieldError::getDefaultMessage).toList();
            return ResponseEntity.badRequest().body(errors)  ;
        }
        categoryService.saveCategory(categoryDTO);
        return ResponseEntity.ok("insert" + categoryDTO);
    }
    @PostMapping("/insert1")
    public String postCategory1(@Valid @RequestBody CategoryDTO categoryDTO, BindingResult result){
     if(result.hasErrors()){
         List<String> errors = new ArrayList<>();
         for(FieldError fieldError: result.getFieldErrors()){
             errors.add(fieldError.getDefaultMessage());
         }
         return errors.toString();
     }
     categoryService.saveCategory(categoryDTO);
     return "insert" + categoryDTO;
    }

    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
        return "successfully Delete with in " + id;
    }
    @PutMapping("/{id}")
    public Category putCategory(@PathVariable Long id, @RequestBody CategoryDTO categoryDTO){
        return categoryService.updateCategory(id,categoryDTO);

    }
}

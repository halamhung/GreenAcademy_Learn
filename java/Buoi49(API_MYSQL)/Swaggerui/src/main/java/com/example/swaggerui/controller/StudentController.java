package com.example.swaggerui.controller;

import com.example.swaggerui.dtos.StudentDTO;
import com.example.swaggerui.exceptions.ResourceNotFoundException;
import com.example.swaggerui.models.Student;
import com.example.swaggerui.responses.ApiResponse;
import com.example.swaggerui.responses.StudentResonse;
import com.example.swaggerui.services.StudentServices;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/student")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
    private final StudentServices studentService;
    @GetMapping("/list")
    public ResponseEntity<ApiResponse> getStudents1(
        @RequestParam(defaultValue = "0") int page ,
        @RequestParam(defaultValue = "5") int size){
    Pageable pageable = PageRequest.of(
            page, size,
            Sort.by("CreatedAt").descending()
            );
    Page<StudentResonse> studentResonses = studentService.getStudents(pageable);
    int totalPages = studentResonses.getTotalPages();
    List<StudentResonse>
    ApiResponse apiResponse = ApiResponse.builder()
            .data(studentPage.getContent())
            .message("Lấy toàn bộ sinh viên thành công")
            .status(HttpStatus.OK.value())
            .build();
    return ResponseEntity.ok(apiResponse);
        }

    @GetMapping("")
    public ResponseEntity<ApiResponse> index(){
        ApiResponse apiResponse = ApiResponse.builder()
                .data(studentService.getAllStudents())
                .status(HttpStatus.OK.value())
                .message("Lấy toàn bộ sinh viên thành công")
                .build();
        return ResponseEntity.ok().body(apiResponse);
    }
    @PostMapping("")
    public ResponseEntity<ApiResponse> create(@Valid @RequestBody StudentDTO studentDTO , BindingResult result){
        if (result.hasErrors()) {
            List<String> errors = result.getFieldErrors().stream()
                    .map(FieldError::getDefaultMessage).toList();
            ApiResponse apiResponse = ApiResponse.builder()
                            .data(errors)
                                    .message("Validation failed")
                                            .status(HttpStatus.BAD_REQUEST.value())
                                                    .build();
            errors.forEach(System.err::println); // In lỗi ra console
            return ResponseEntity.badRequest().body(apiResponse);
        }
       Student student = studentService.saveStudent(studentDTO);
        ApiResponse apiResponse = ApiResponse.builder()
                .data(student)
                .message("insert successfully")
                .status(HttpStatus.OK.value())
                .build();
        return ResponseEntity.ok(apiResponse);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse> create(@PathVariable Long id,@Valid @RequestBody StudentDTO studentDTO, BindingResult result){
        if(result.hasErrors()){
            List<String> errors = result.getFieldErrors().stream()
                    .map(FieldError::getDefaultMessage).toList();
            ApiResponse apiResponse = ApiResponse.builder()
                    .data(errors)
                    .message("Validation failed")
                    .status(HttpStatus.BAD_REQUEST.value())
                    .build();
            return ResponseEntity.badRequest().body(apiResponse);
            }
        Student student = studentService.updateStudent(id,studentDTO);
        if(student == null){
            throw new ResourceNotFoundException("Student không tìm thấy với id" + id);
        }
        ApiResponse apiResponse = ApiResponse.builder()
                .data(student)
                .message("update successfully")
                .status(HttpStatus.OK.value())
                .build();
        return ResponseEntity.ok(apiResponse);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> delete(@PathVariable Long id){
        Student student = studentService.getStudentById(id);
        if(student == null){
            throw new ResourceNotFoundException("Student không tìm thấy với id" + id);
        }
        studentService.deleteStudent(id);
        ApiResponse apiResponse = ApiResponse.builder()
                .data(null)
                .message("delete successfully")
                .status(HttpStatus.OK.value())
                .build();
        return ResponseEntity.ok(apiResponse);
    }
    @GetMapping("/search1")
    public ResponseEntity<ApiResponse> search1(@RequestParam String name){
        ApiResponse apiResponse = ApiResponse.builder()
                .data(studentService.findByName(name))
                .message("Tìm thành công")
                .status(HttpStatus.OK.value())
                .build();
        return ResponseEntity.ok(apiResponse);
    }
    @GetMapping("/search2")
    public ResponseEntity<ApiResponse> search2(@RequestParam String name){
        ApiResponse apiResponse = ApiResponse.builder()
                .data(studentService.findByThanhPho(name))
                .message("Tìm thành công")
                .status(HttpStatus.OK.value())
                .build();
        return ResponseEntity.ok(apiResponse);
    }
    @GetMapping("/search3")
    public ResponseEntity<ApiResponse> search3(@RequestParam String name){
        ApiResponse apiResponse = ApiResponse.builder()
                .data(studentService.findByThanhPhoAndTen(name))
                .message("Tìm sinh viên từ thành phố và tên thành công")
                .status(HttpStatus.OK.value())
                .build();
        return ResponseEntity.ok(apiResponse);
    }
}

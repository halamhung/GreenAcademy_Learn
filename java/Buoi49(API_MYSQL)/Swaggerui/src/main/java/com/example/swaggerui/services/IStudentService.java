package com.example.swaggerui.services;

import com.example.swaggerui.dtos.StudentDTO;
import com.example.swaggerui.models.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IStudentService {
    Student getStudentById(Long id);
    Page<Student> getStudents(Pageable pageable);
    List<Student> getAllStudents();

    Student saveStudent(StudentDTO studentDTO);
    Student updateStudent(Long id,StudentDTO studentDTO);
    void deleteStudent(Long id);
    List<Student> findByName(String name);
    List<Student> findByThanhPho(String name);
    List<Student> findByThanhPhoAndTen(String name);
}
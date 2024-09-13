package com.example.swaggerui.services;

import com.example.swaggerui.dtos.StudentDTO;
import com.example.swaggerui.dtos.StudentImageDTO;
import com.example.swaggerui.models.Student;
import com.example.swaggerui.models.StudentImage;
import com.example.swaggerui.models.XepLoai;
import com.example.swaggerui.repository.StudentImageRepository;
import com.example.swaggerui.repository.StudentRepository;
import com.example.swaggerui.responses.StudentResonse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServices implements IStudentService{
    private final StudentRepository studentRepository; // nhớ thêm RequiredArgsConstructor giúp tự sinh construster
    private final StudentImageRepository studentImageRepository;

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(()->new RuntimeException("Student không tìm thấy"));
    }

    @Override //convert student thanh studentresonse
    public Page<StudentResonse> getStudents(Pageable pageable) {
        return studentRepository.findAll(pageable).map(student -> {
            return StudentResonse.fromStudent(student);
        });
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(StudentDTO studentDTO) {
        Student student = Student.builder()
                .ten(studentDTO.getTen())
                .thanhPho(studentDTO.getThanhPho())
                .ngaySinh(studentDTO.getNgaySinh())
                .xepLoai(XepLoai.fromTen(studentDTO.getXepLoai())) //đổi xếp loại trong dto là string
                .build();
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, StudentDTO studentDTO) {
        Student studentExiting = getStudentById(id);
        studentExiting.setTen(studentDTO.getTen());
        studentExiting.setThanhPho(studentDTO.getThanhPho());
        studentExiting.setNgaySinh(studentDTO.getNgaySinh());
        studentExiting.setXepLoai(XepLoai.fromTen(studentDTO.getXepLoai()));
        return studentRepository.save(studentExiting);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findByName(String name) {
       return studentRepository.findByTenContainingIgnoreCase(name);
    }

    @Override
    public List<Student> findByThanhPho(String name) {
        return studentRepository.finByThanhPho(name);
    }

    @Override
    public List<Student> findByThanhPhoAndTen(String name) {
        return studentRepository.findByThanhPhoAndTen(name);
    }

    //hình ảnh
    @Override
    public StudentImage saveStudentImage(Long studentId, StudentImageDTO studentImageDTO) {
        Student student = getStudentById(studentId);
        StudentImage studentImage = StudentImage.builder()
                .student(student)
                .imageUrl(studentImageDTO.getImageUrl())
                .build();
        int size = studentImageRepository.findByStudentId(studentId).size();
        if(size >= 4){
            throw new InvalidParameterException("Hình ảnh của sinh viên đã đạt giới hạn 4 hình");
        }
        return studentImageRepository.save(studentImage);
    }

    @Override
    public List<StudentImage> getAllStudentImages(Long studentId) {
        return studentImageRepository.findByStudentId(studentId);
    }


}

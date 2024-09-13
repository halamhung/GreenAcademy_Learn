package com.example.swaggerui.repository;

import com.example.swaggerui.models.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    Page<Student> findAll(Pageable pageable);
    List<Student> findByTenContainingIgnoreCase(String ten);

    @Query("SELECT s FROM Student s WHERE s.thanhPho like LOWER(CONCAT('%',:name,'%'))")
    List<Student> finByThanhPho(String name);

    @Query("SELECT s FROM Student s WHERE s.thanhPho like LOWER(CONCAT('%',:name,'%')) OR s.ten like LOWER(CONCAT('%',:name,'%'))")
    List<Student> findByThanhPhoAndTen(String name);

    @Query("SELECT s FROM Student s WHERE year(s.ngaySinh) BETWEEN :startYear AND :endYear")
    List<Student> findByNgaySinhBetween(int startYear, int endYear);

//    @Query("SELECT s FROM Student s WHERE"+
//    "(:xeploai)"
//            + " BETWEEN s.xepLoai AND (s.xepLoai + 0.1)"
//            + " ORDER BY s.xepLoai DESC")
//    List<Student> findByXepLoaiBetween(double xeploai);"
//    )
}

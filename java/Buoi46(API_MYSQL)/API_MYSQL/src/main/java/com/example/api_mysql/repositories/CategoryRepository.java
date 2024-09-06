package com.example.api_mysql.repositories;

import com.example.api_mysql.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>  {

}

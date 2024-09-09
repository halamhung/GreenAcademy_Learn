package com.example.api_mysql.models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="categories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
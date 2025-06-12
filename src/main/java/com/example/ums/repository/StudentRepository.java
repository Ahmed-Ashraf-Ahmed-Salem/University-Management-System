package com.example.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ums.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}

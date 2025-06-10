package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
public interface StudentService {

    Student save(Student student);
    Page<Student> getAll(Pageable pageable);
    Student getById(Long id);
    void delete(Long id);
}

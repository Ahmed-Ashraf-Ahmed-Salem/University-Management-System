package com.example.ums.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.ums.entity.Student;
import com.example.ums.exception.ResourceNotFoundException;
import com.example.ums.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public ResponseEntity<?> saveAll(List<Student> students) {
        studentRepository.saveAll(students);
        return ResponseEntity.ok("Students added successfully");
    }

    @Override
    public Page<Student> getAll(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    //@SuppressWarnings("deprecation")
    @Override
    public Student getById(Long id) {
     //   return studentRepository.getById(id);
     return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student with this id is not found."));
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }


}

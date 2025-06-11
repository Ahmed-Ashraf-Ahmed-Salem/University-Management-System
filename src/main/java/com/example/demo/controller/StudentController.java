package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student createStudent(@Valid @RequestBody Student student){

        return studentService.save(student);
    }

    @PostMapping("/addStudents")
    public ResponseEntity<?> createAll (@RequestBody List<Student> students){
        return studentService.saveAll(students);
    }

    @GetMapping
    public Page<Student> getAllStudents (@RequestParam(defaultValue = "0") int page
                                        ,@RequestParam(defaultValue = "5") int size){
        return studentService.getAll(PageRequest.of(page, size));
    }

    @GetMapping("/{Id}")
    public Student getStudent (@PathVariable Long Id){
        return studentService.getById(Id);
    }

    @DeleteMapping("/{Id}")
    public void deleteStudent(@PathVariable Long Id){
        studentService.delete(Id);
    }


}

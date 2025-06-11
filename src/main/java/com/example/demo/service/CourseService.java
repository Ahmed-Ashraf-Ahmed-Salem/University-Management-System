package com.example.demo.service;

import com.example.demo.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public interface CourseService {

    Course saveCourse (Course course);
    List<Course> saveAllCourses (List<Course> course);
    Page<Course> getAllCourses (Pageable pageable);
}

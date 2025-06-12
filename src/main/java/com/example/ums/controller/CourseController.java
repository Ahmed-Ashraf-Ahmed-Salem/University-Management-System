package com.example.ums.controller;

import com.example.ums.entity.Course;
import com.example.ums.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/course")
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @PostMapping("addCourses")
    public List<Course> addCourses(@RequestBody List<Course> courses){
        return courseService.saveAllCourses(courses);
    }

    @GetMapping
    public Page<Course> getCourses(@RequestParam(defaultValue = "0") int page,
                                   @RequestParam(defaultValue = "5") int size){
        return courseService.getAllCourses(PageRequest.of(page, size));
    }


}

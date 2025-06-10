package com.example.demo.service;

import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl {

    @Autowired
    private CourseRepository courseRepository;
}

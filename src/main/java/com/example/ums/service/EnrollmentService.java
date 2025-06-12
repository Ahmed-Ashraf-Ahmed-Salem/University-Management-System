package com.example.ums.service;

import com.example.ums.entity.Enrollment;
import org.springframework.stereotype.Service;

@Service
public interface EnrollmentService {
    Enrollment enrollStudent(Long studentId, Long courseId);
}

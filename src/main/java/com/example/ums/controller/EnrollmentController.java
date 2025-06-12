package com.example.ums.controller;

import com.example.ums.dto.EnrollmentRequest;
import com.example.ums.entity.Enrollment;
import com.example.ums.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enroll")
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    @Autowired
    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    @PostMapping
    public ResponseEntity<Enrollment> enrollStudent(@RequestBody EnrollmentRequest request) {
        Enrollment enrollment = enrollmentService.enrollStudent(request.getStudentId(), request.getCourseId());
        return new ResponseEntity<>(enrollment, HttpStatus.CREATED);
    }
}

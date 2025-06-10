package com.example.demo.service;

import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl {

    @Autowired
    private DepartmentRepository departmentRepository;
}

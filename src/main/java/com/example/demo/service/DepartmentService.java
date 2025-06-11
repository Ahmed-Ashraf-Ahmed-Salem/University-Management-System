package com.example.demo.service;

import com.example.demo.entity.Department;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {

    Department saveDepartment (Department department);
    Department getDepartmentById (Long Id);
}

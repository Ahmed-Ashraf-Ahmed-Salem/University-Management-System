package com.example.ums.service;

import com.example.ums.entity.Department;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {

    Department saveDepartment (Department department);
    Department getDepartmentById (Long Id);
}

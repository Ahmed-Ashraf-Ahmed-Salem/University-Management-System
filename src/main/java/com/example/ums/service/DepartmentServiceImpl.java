package com.example.ums.service;

import com.example.ums.entity.Department;
import com.example.ums.exception.ResourceNotFoundException;
import com.example.ums.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long Id) {
        return departmentRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Department with this id is not found."));
    }
}

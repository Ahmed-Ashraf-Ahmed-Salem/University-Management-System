package com.example.ums.controller;

import com.example.ums.entity.Department;
import com.example.ums.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/department")
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/addDepartment")
    public Department addDepartment (@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{Id}")
    public Department getDeptById (@PathVariable Long Id){
        return departmentService.getDepartmentById(Id);
    }

}

package com.example.ums.controller;


import com.example.ums.entity.Grade;
import com.example.ums.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/grade")
@RestController
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @PostMapping("/addGrade")
    public Grade addGrad (@RequestBody Grade grade){
        return gradeService.saveGrade(grade);
    }

    @GetMapping
    public List<Grade> getAllGrades (){
        return gradeService.getAllGrades();
    }

    @GetMapping("/{id}")
    public Grade getGradeById(@PathVariable Long id){
        return gradeService.getGradeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteGrade(@PathVariable Long id){
        gradeService.deleteGradeById(id);
    }
}

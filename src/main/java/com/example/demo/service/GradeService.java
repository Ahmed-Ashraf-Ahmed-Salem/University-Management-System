package com.example.demo.service;

import com.example.demo.entity.Grade;

import java.util.List;

public interface GradeService {
    Grade saveGrade(Grade grade);
    List<Grade> getAllGrades();
    Grade getGradeById(Long id);
    void deleteGradeById(Long id);
}

package com.example.demo.service;

import com.example.demo.entity.Grade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GradeService {
    Grade saveGrade(Grade grade);
    List<Grade> getAllGrades();
    Grade getGradeById(Long id);
    void deleteGradeById(Long id);
}

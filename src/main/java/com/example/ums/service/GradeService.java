package com.example.ums.service;

import com.example.ums.entity.Grade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GradeService {
    Grade saveGrade(Grade grade);
    List<Grade> getAllGrades();
    Grade getGradeById(Long id);
    void deleteGradeById(Long id);
}

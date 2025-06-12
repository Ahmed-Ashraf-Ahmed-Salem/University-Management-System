package com.example.ums.service;

import com.example.ums.entity.Grade;
import com.example.ums.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService{

    @Autowired
    private GradeRepository gradeRepository;

    @Override
    public Grade saveGrade(Grade grade) {
        return gradeRepository.save(grade);
    }

    @Override
    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

    @Override
    public Grade getGradeById(Long id) {
        return gradeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteGradeById(Long id) {
        gradeRepository.deleteById(id);
    }
}

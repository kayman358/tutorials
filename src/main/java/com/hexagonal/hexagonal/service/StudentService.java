/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexagonal.hexagonal.service;

import com.hexagonal.hexagonal.adapter.StudentRepo;
import com.hexagonal.hexagonal.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Arowolo Ibrahim K
 */
@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public void create(String name, String department, long level){
        studentRepo.create(name, department, level);
    }
    public Student view(Integer studentId){
        return studentRepo.getStudent(studentId);
    }
}

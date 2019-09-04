/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexagonal.hexagonal.adapter;

import com.hexagonal.hexagonal.model.Student;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Arowolo Ibrahim K
 */

    
@Service
public class StudentAdapter implements StudentRepo {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    
    @Override
    public void create(String name, String dept, long level) {
        Student student = new Student();
        student.setName(name);
        student.setDepartment(dept);
        student.setLevel(level);
        entityManager.persist(student);
    }
    @Override
    public Student getStudent(Integer studentId) {
        return entityManager.find(Student.class, studentId);
    }

    
}

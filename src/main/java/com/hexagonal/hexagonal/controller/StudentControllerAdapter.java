/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexagonal.hexagonal.controller;

import com.hexagonal.hexagonal.model.Student;
import com.hexagonal.hexagonal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Arowolo Ibrahim K
 */

@RestController
@RequestMapping("/students/")
public class StudentControllerAdapter implements Connector{
    
    @Autowired
    private StudentService studentService;
    
   @Override
    public void create(@RequestBody Student request) {
        studentService.create(request.getName(), request.getDepartment(), request.getLevel());
    }
    @Override
    public Student view(@PathVariable Integer id) {
        Student student = studentService.view(id);
        return student;
    }

   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexagonal.hexagonal.adapter;

import com.hexagonal.hexagonal.model.Student;

/**
 *
 * @author Arowolo Ibrahim K
 */

    

public interface StudentRepo {
    void create(String name, String department, long level);
    Student getStudent(Integer studentId);
}
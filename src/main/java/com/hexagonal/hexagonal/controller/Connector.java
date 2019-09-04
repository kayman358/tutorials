/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexagonal.hexagonal.controller;

import com.hexagonal.hexagonal.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Arowolo Ibrahim K
 */

public interface Connector {
 @PostMapping("create")
    public void create(@RequestBody Student request);
    @GetMapping("view/{id}")
    public Student view(@PathVariable Integer studentId);
 }

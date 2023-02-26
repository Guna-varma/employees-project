package com.springboot.many.to.many.controller;

import com.springboot.many.to.many.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empl")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

}

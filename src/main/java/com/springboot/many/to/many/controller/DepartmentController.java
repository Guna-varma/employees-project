package com.springboot.many.to.many.controller;

import com.springboot.many.to.many.entity.BankDetails;
import com.springboot.many.to.many.entity.Department;
import com.springboot.many.to.many.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/add")
    private Department addDepartment(@RequestBody Department department){
        return service.addDepartment(department);
    }

    @GetMapping("/getAll")
    private List<Department> getAllDepartment(){
        return service.getAllDepartment();
    }

    @GetMapping("/get/{id}")
    private Optional<Department> getDepartmentById(@PathVariable Integer id){
        return service.getDeptById(id);
    }

    @DeleteMapping("/delete/{id}")
    private Boolean deleteDepartment(@PathVariable Integer id){
        return service.deleteDepartment(id);
    }
}

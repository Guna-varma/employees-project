package com.springboot.many.to.many.controller;

import com.springboot.many.to.many.entity.Employees;
import com.springboot.many.to.many.service.EmployeeService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empl")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/add")
    private Employees addEmployee(@RequestBody Employees employees){
        return service.addEmployee(employees);
    }

    @GetMapping("/getAll")
    private List<Employees> getAllEmployees(){
        return service.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    private Optional<Employees> getEmpById(@PathVariable Integer id){
        return service.getEmpById(id);
    }

    @DeleteMapping("/delete/{id}")
    private Boolean deleteEmployee(@PathVariable Integer id){
        return service.deleteEmp(id);
    }

}

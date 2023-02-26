package com.springboot.many.to.many.service;

import com.springboot.many.to.many.entity.Employees;
import com.springboot.many.to.many.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public Employees addEmployee(Employees employees) {
        return repo.save(employees);
    }

    public List<Employees> getAllEmployees() {
        return repo.findAll();
    }

    public Optional<Employees> getEmpById(Integer id) {
        return repo.findById(id);
    }

    public Boolean deleteEmp(Integer id) {
        repo.deleteById(id);
        return true;
    }
}

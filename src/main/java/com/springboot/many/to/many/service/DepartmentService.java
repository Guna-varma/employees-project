package com.springboot.many.to.many.service;

import com.springboot.many.to.many.entity.Department;
import com.springboot.many.to.many.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repo;

    public Department addDepartment(Department department) {
        return repo.save(department);
    }

    public List<Department> getAllDepartment() {
        return repo.findAll();
    }

    public Optional<Department> getDeptById(Integer id) {
        return repo.findById(id);
    }

    public Boolean deleteDepartment(Integer id) {
        repo.deleteById(id);
        return true;
    }

}

package com.springboot.many.to.many.controller;

import com.springboot.many.to.many.entity.Employees;
import com.springboot.many.to.many.entity.Project;
import com.springboot.many.to.many.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/proj")
public class ProjectController {
    @Autowired
    private ProjectService service;

    @PostMapping("/add")
    private Project addProject(@RequestBody Project project){
        return service.addProject(project);
    }

    @GetMapping("/getAll")
    private List<Project> getAllProject(){
        return service.getAllProject();
    }

    @GetMapping("/get/{id}")
    private Optional<Project> getProjById(@PathVariable Integer id){
        return service.getProjById(id);
    }

    @DeleteMapping("/delete/{id}")
    private Boolean deleteProject(@PathVariable Integer id){
        return service.deleteProject(id);
    }
}

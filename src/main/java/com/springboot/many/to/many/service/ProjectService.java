package com.springboot.many.to.many.service;

import com.springboot.many.to.many.entity.Project;
import com.springboot.many.to.many.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository repo;

    public Project addProject(Project project) {
        return repo.save(project);
    }

    public List<Project> getAllProject() {
        return repo.findAll();
    }


    public Optional<Project> getProjById(Integer id) {
        return repo.findById(id);
    }

    public Boolean deleteProject(Integer id) {
        repo.deleteById(id);
        return true;
    }
}

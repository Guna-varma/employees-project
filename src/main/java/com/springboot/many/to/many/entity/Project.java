package com.springboot.many.to.many.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "projects")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Integer id;

    @Column(name = "projectName")
    private String projectName;

    @Column(name = "clientLocation")
    private String clientLocation;

}

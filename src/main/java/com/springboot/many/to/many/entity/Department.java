package com.springboot.many.to.many.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Department")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Integer id;

    @Column(name = "departmentName")
    private String departmentName;

    @Column(name = "location")
    private String location;
}

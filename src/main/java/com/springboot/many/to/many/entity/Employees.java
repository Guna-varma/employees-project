package com.springboot.many.to.many.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Employees")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Column(name = "employeeId")
    private String employeeId;

    @Column(name ="firstName")
    private String firstName;

    @Column(name ="lastName")
    private String lastName;

    @Column(name ="bloodGroup")
    private String bloodGroup;
}

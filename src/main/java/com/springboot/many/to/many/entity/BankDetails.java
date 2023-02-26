package com.springboot.many.to.many.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "BankDetails")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BankDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "ifscCode")
    private String ifscCode;

    @Column(name = "location")
    private String location;



}

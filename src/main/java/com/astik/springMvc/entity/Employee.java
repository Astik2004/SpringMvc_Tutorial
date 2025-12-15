package com.astik.springMvc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
    private double salary;
}

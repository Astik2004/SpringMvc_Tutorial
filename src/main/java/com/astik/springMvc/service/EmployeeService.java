package com.astik.springMvc.service;

import com.astik.springMvc.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployee(Long id);
}

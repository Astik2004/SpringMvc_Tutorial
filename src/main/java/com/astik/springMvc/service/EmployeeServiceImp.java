package com.astik.springMvc.service;

import com.astik.springMvc.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}

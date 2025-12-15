package com.astik.springMvc.service;

import com.astik.springMvc.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
//@Transactional
class EmployeeServiceTest {

    @Autowired
    private EmployeeService empService;

    @Test
    void testSaveEmployee() {
        Employee emp = new Employee();
        emp.setName("Astik");
        emp.setDepartment("SD");
        emp.setSalary(40000);

        Employee saved = empService.saveEmployee(emp);

        assertNotNull(saved.getId());
        assertEquals("Astik", saved.getName());
        assertEquals("SD",saved.getDepartment());
        assertEquals(40000,saved.getSalary());
    }
    @Test
    void testGetEmployeeById()
    {
        Long id=1l;
        Employee emp=empService.getEmployeeById(id);
        assertNotNull(emp.getId());
        assertEquals(1,emp.getId());
    }
    @Test
    void testGetAllEmployees()
    {
        List<Employee>emps=empService.getAllEmployees();
        assertNotNull(emps.size());
    }
    @Test
    void testDeleteEmployee() {
        // Arrange
        Employee emp = empService.saveEmployee(
                new Employee(null,"DeleteMe","QA",15000)
        );

        Long id = emp.getId();

        // Act
        empService.deleteEmployee(id);

        // Assert
        Employee deleted = empService.getEmployeeById(id);
        assertNull(deleted);
    }
}

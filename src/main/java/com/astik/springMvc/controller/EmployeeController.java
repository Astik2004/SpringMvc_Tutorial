package com.astik.springMvc.controller;

import com.astik.springMvc.entity.Employee;
import com.astik.springMvc.service.EmployeeService;
import com.astik.springMvc.service.EmployeeServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public String listEmployee(Model model)
    {
        List<Employee>emp=employeeService.getAllEmployees();
        System.out.println(emp);
        model.addAttribute("employees",emp);
        return "list-employees";
    }
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "add-employee";
    }
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee employee)
    {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }
    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable Long id, Model model) {
        model.addAttribute("employee", employeeService.getEmployeeById(id));
        return "update-employee";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }
}

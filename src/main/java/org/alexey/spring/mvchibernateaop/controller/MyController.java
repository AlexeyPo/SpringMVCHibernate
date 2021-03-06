package org.alexey.spring.mvchibernateaop.controller;

import org.alexey.spring.mvchibernateaop.entity.Employee;
import org.alexey.spring.mvchibernateaop.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    private final EmployeeService employeeService;

    public MyController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> employeeList = employeeService.getAllEmployees();
        model.addAttribute("allEmps", employeeList);
        return "all-employees";
    }
}

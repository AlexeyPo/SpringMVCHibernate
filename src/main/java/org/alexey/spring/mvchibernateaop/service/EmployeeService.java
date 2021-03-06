package org.alexey.spring.mvchibernateaop.service;

import org.alexey.spring.mvchibernateaop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
}

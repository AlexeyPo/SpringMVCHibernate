package org.alexey.spring.mvchibernateaop.service;

import org.alexey.spring.mvchibernateaop.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}

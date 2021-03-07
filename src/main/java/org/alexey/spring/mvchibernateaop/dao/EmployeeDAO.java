package org.alexey.spring.mvchibernateaop.dao;

import org.alexey.spring.mvchibernateaop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
}

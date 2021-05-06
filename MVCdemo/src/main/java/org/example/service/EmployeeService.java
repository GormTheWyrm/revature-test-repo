package org.example.service;

import org.example.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee createEmployee(Employee employee);
    public Employee getEmployeeById(int id);
    public Employee updateEmployee(Employee employee);
    public List<Employee> getEmployeesList();
    public List<Employee> getEmployeesByAge(int age);
    public void removeEmployee(int id);
}

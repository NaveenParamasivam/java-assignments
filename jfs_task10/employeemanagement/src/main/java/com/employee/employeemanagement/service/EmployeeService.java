package com.employee.employeemanagement.service;

import com.employee.employeemanagement.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(String employeeId);

    Employee updateEmployee(String employeeId, Employee employee);

    void deleteEmployee(String employeeId);
}
package com.employee.employeemanagement.service;

import com.employee.employeemanagement.model.Employee;
import com.employee.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployee(String employeeId, Employee employee) {

        Optional<Employee> existingEmployee = employeeRepository.findById(employeeId);

        if (existingEmployee.isPresent()) {
            Employee emp = existingEmployee.get();
            emp.setName(employee.getName());
            emp.setEmail(employee.getEmail());
            emp.setLocation(employee.getLocation());
            return employeeRepository.save(emp);
        } else {
            throw new RuntimeException("Employee not found with ID: " + employeeId);
        }
    }

    @Override
    public void deleteEmployee(String employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}

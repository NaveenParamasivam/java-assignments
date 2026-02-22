package com.employee.employeemanagement.controller;

import com.employee.employeemanagement.model.Employee;
import com.employee.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "*") // allow frontend to call backend
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // CREATE
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    // READ - Get All
    @GetMapping("/displayAll")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // READ - Get By ID
    @GetMapping("/display/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable String id) {

        Optional<Employee> employee = employeeService.getEmployeeById(id);

        if (employee.isPresent()) {
            return ResponseEntity.ok(employee.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // UPDATE
    @PutMapping("/update/{employeeId}")
    public Employee updateEmployee(@PathVariable String employeeId,
                                   @RequestBody Employee employee) {
        return employeeService.updateEmployee(employeeId, employee);
    }

    // DELETE
    @DeleteMapping("/delete/{employeeId}")
    public String deleteEmployee(@PathVariable String employeeId) {
        employeeService.deleteEmployee(employeeId);
        return "Employee deleted successfully";
    }
}
package com.workforces.service.interfaces;

import com.workforces.entities.Employee;

import java.util.Optional;

public interface EmployeeService {
    void addEmployee(Employee employee);
    Optional<Employee> findById(Long id);
}

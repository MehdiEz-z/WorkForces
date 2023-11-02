package com.workforces.service.implementations;

import com.workforces.entities.Employee;
import com.workforces.repository.EmployeeRepository;
import com.workforces.service.interfaces.EmployeeService;

import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }
}

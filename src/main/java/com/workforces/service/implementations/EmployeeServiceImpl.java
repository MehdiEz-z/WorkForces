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
    public void addEmployee(Employee employee) {
        if (employee.getSalaire() >= 4000.0) {
            employeeRepository.save(employee);
            System.out.println("L'employé a été ajouté avec succee.");
        } else {
            System.out.println("Le salaire de l'employé est inférieur à 1000.0. L'employé n'a pas été ajouté.");
        }
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }
}

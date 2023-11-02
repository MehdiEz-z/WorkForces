package com.workforces.service.implementations;

import com.workforces.entities.Department;
import com.workforces.entities.Employee;
import com.workforces.repository.EmployeeRepository;
import com.workforces.service.interfaces.DepartmentService;
import com.workforces.service.interfaces.EmployeeService;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final DepartmentService departmentService;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, DepartmentService departmentService) {
        this.employeeRepository = employeeRepository;
        this.departmentService = departmentService;
    }


    @Override
    public void addEmployee(Employee employee) throws IllegalAccessException {
        if (employee.getId() != null || employee.getDepartment().getNom().isEmpty()|| employee.getDepartment().getNom().isBlank()) {
            System.out.println("L'employé avec cet ID existe déjà. L'employé n'a pas été ajouté.");
        } else if (employee.getSalaire() >= 4000.0) {
            if(employee.getDepartment().getId() == null){
                Optional<Department> department = departmentService.findByNom(employee.getDepartment().getNom());
                if (department.isPresent())
                    employee.setDepartment(department.get());
                else
                    throw new IllegalAccessException("Le nomdu departement n'existe pas");
            }
            employeeRepository.save(employee);
            System.out.println("L'employé a été ajouté avec succee.");
        } else {
            System.out.println("Le salaire de l'employé est inférieur à 4000.0. L'employé n'a pas été ajouté.");
        }
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }
}

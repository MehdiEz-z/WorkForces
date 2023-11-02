package com.workforces.service.implementations;

import com.workforces.entities.Department;
import com.workforces.repository.DepartmentRepository;
import com.workforces.service.interfaces.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    @Override
    public void addDepartment(Department department) {
        departmentRepository.save(department);
        System.out.println("Le departement a été ajouté avec succee.");
    }
}

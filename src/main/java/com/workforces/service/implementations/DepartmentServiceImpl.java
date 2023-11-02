package com.workforces.service.implementations;

import com.workforces.entities.Department;
import com.workforces.repository.DepartmentRepository;
import com.workforces.service.interfaces.DepartmentService;

import java.util.Optional;

public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    @Override
    public void addDepartment(Department department) {
        if (department.getId() != null || findByNom(department.getNom()).isPresent()) {
            System.out.println("Le département avec cet ID existe déjà. Le département n'a pas été ajouté.");
        } else {
            departmentRepository.save(department);
            System.out.println("Le département a été ajouté avec succès.");
        }
    }

    @Override
    public Optional<Department> findByNom(String nom) {
        return departmentRepository.findByNom(nom);
    }
}

package com.workforces.service.interfaces;

import com.workforces.entities.Department;
import com.workforces.entities.Employee;

import java.util.Optional;

public interface DepartmentService {
    void addDepartment(Department department);
    Optional<Department> findByNom(String nom);

}

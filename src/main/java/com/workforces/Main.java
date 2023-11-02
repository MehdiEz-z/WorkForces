package com.workforces;

import com.workforces.entities.Department;
import com.workforces.entities.Employee;
import com.workforces.service.implementations.DepartmentServiceImpl;
import com.workforces.service.implementations.EmployeeServiceImpl;
import com.workforces.service.interfaces.DepartmentService;
import com.workforces.service.interfaces.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Department departmentOne = applicationContext.getBean("department", Department.class);
        departmentOne.setNom("Directeur");

        DepartmentService departmentService = applicationContext.getBean("departmentService", DepartmentServiceImpl.class);
        departmentService.addDepartment(departmentOne);

        Employee employeeOne = applicationContext.getBean("employee", Employee.class);
        employeeOne.setNom("Ilyes");
        employeeOne.setSalaire(4000.0);
        employeeOne.setDepartment(departmentOne);

        EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeServiceImpl.class);
        employeeService.addEmployee(employeeOne);
    }
}
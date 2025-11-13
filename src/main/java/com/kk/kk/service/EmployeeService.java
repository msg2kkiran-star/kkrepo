package com.kk.kk.service;

import com.kk.kk.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeService()
    {
        employeeList.add(new Employee(1,"emp1",1.0));
        employeeList.add(new Employee(2,"emp2",2.0));
    }

    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    // READ
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public Employee getEmployeeById(int id) {
        return employeeList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // UPDATE
    public Employee updateEmployee(int id, Employee updatedEmployee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.set(i, updatedEmployee);
                return updatedEmployee;
            }
        }
        return null;
    }

    // DELETE
    public boolean deleteEmployee(int id) {
        return employeeList.removeIf(e -> e.getId() == id);
    }
}

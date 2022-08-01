package com.example.employeeWithDepAndSalary.service;

import com.example.employeeWithDepAndSalary.demain.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    int maxSalary(Integer department);
    int minSalary(Integer department);
    List<Employee> allDep(Integer department);

    Map<Integer,List<Employee>> all();
}

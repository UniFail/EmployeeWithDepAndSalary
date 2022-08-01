package com.example.employeeWithDepAndSalary.controller;

import com.example.employeeWithDepAndSalary.demain.Employee;
import com.example.employeeWithDepAndSalary.service.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee/departments")
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/max-salary")
    public int maxSalary(Integer department) {
            return employeeService.maxSalary(department);
    }

    @GetMapping(path = "/min-salary")
    public int minSalary(Integer department) {
        return employeeService.minSalary(department);
    }
    @GetMapping(path = "/all")
    public List<Employee> allDep(Integer department) {
        return employeeService.allDep(department);
    }
    @GetMapping(path = "/allEmployee")
    public Map<Integer,List<Employee>> all() {
        return employeeService.all();
    }

}

package com.sampleproject.service;

import java.util.ArrayList;
import java.util.List;
import com.sampleproject.model.EmployeeTax;
import com.sampleproject.repository.EmployeeTaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sampleproject.model.Employee;
import com.sampleproject.repository.EmployeeRepository;

@Service
public class EmployeeService {
    double tax = 0;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeTaxRepository employeeTaxRepository;
    Employee employee = new Employee();

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        employeeRepository.findAll().forEach(emps1 -> employees.add(emps1));
        return employees;
    }
    public List<EmployeeTax> getEmployeetax() {
        List<EmployeeTax> employeestax = new ArrayList<>();
        employeeTaxRepository.findAll().forEach(emp1 -> employeestax.add(emp1));
        return employeestax;
    }



    public void saveOrUpdate(Employee emp) {
        employeeRepository.save(emp);
    }
    public void saveEmpTax(EmployeeTax emp) {
        employeeTaxRepository.save(emp);
    }

}
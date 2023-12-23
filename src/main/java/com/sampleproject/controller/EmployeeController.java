package com.sampleproject.controller;

import com.sampleproject.model.Employee;
import com.sampleproject.model.EmployeeTax;
import com.sampleproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    //Endpoint to Employee Details

    @GetMapping("/emp")
    private List<Employee> getAllEmployee() {
        return employeeService.getAllEmployees();
    }
    //Endpoint to Get Tax details of Employeess
    @GetMapping("/emptax")
    private List<EmployeeTax> getEmployeetax() {
        return employeeService.getEmployeetax();
    }



    @PostMapping("/allemp")
    private int saveEmployee(@Valid() @RequestBody Employee emp1) {
        employeeService.saveOrUpdate(emp1);
        return emp1.getEmpid();

    }
    @PostMapping("/allemptax")
    private int saveEmployee(@Valid() @RequestBody EmployeeTax emp1) {
        employeeService.saveEmpTax(emp1);
        return emp1.getEmpcode();

    }

}

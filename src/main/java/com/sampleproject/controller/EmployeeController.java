package com.sampleproject.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sampleproject.model.Employee;
import com.sampleproject.service.EmployeeService;

import javax.validation.Valid;

@RestController
public class EmployeeController
{
@Autowired
EmployeeService employeeService;
@GetMapping("/emp")
private List<Employee> getAllEmployee()
{
return employeeService.getAllEmployees();
}
//@GetMapping("/emptax/{empid}")
//private double gettaxEmp(@RequestBody  int tax)
//{
//    return employeeService.getempltax(emp, tax);
//}
@GetMapping("/emp/{empid}")
private Employee getemployee(@PathVariable("bookid") int empid)
{
return employeeService.getEmpById(empid);
}

@PostMapping("/allemp")
private int saveEmployee(@Valid ()@RequestBody Employee emp1)
{
employeeService.saveOrUpdate(emp1);
return emp1.getEmpid();
}

}

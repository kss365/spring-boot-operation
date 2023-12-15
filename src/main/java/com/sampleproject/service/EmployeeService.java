package com.sampleproject.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sampleproject.model.Employee;
import com.sampleproject.repository.EmployeeRepository;
@Service
public class EmployeeService
{
    double tax=0;
@Autowired
EmployeeRepository employeeRepository;
Employee employee = new Employee();
public List<Employee> getAllEmployees()
{
List<Employee> employees = new ArrayList<Employee>();
employeeRepository.findAll().forEach(emps1 -> employees.add(emps1));
return employees;
}
public void   getempltax(Employee emp, double tax){
    if(employee.getSalary()>=1000000) {
        tax = (0.2 * (employee.getSalary() - 1000000)) + (0.1 * 500000) + (0.05 * 250000);
    }else if(employee.getSalary()>=500000){
        tax =0.1*(employee.getSalary()-500000) + (0.05*250000);}
        else if(employee.getSalary()>=250000){
            tax = 0.05*(employee.getSalary()-250000);
        employeeRepository.save(tax);
    }
         }



public Employee getEmpById(int id)
{

    return employeeRepository.findById(id).get();
}
public void saveOrUpdate(Employee emp)
{
employeeRepository.save(emp);
}

}
package com.sampleproject.repository;
import org.springframework.data.repository.CrudRepository;
import com.sampleproject.model.Employee;
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
}

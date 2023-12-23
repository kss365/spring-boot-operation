package com.sampleproject.repository;

import com.sampleproject.model.EmployeeTax;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeTaxRepository extends CrudRepository<EmployeeTax, Integer> {
}

package com.sampleproject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table
public class Employee {
    //Defining emp id as primary key
    @Id
    @Column
    @NotNull
    private int Empid;
    @Column
    @NotNull
    //throw error if firstname is less than n2 characters
    @Size(min = 2, message = "Name should have at least 2 characters")
    private String FirstName;
    @Column
    @NotNull
    private String LastName;
    @Column
    @NotNull
    private String Email;
    @Column
    private long PhoneNumber;

    @Column
    private Date DOJ;
    @Column
    @NotNull
    private int Salary;



    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setDOJ(Date DOJ) {
        this.DOJ = DOJ;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public Date getDOJ() {
        return DOJ;
    }

    public int getSalary() {
        return Salary;
    }


}
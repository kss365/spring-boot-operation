package com.sampleproject.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table
public class EmployeeTax {

    @Id
    @Column
    @NotNull
    private int Empcode;
    @Column
    @NotNull
    private String Firstname;
    @Column
    @NotNull
    @Size(min = 2, message = "Name should have at least 5 characters")
    private String lastname;
    @Column
    private double totalSalary;

    public double getTotalSalary() {
        LocalDate date1 = parseDate(DOJ);
        if(date1.isAfter(LocalDate.of(date1.getYear(),5,1))) {
            totalSalary = 11 * monthysalary;
        } else if (date1.isAfter(LocalDate.of(date1.getYear(),5,15))) {
            totalSalary =  0.5 * monthysalary;
        }else{
            totalSalary =12 * monthysalary;
        }
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Column
    private double tax;


    @Column
    private double monthysalary;

    public String getDOJ() {
        return DOJ;
    }

    public void setDOJ(String DOJ) {
        this.DOJ = DOJ;
    }

    @Column
    private String DOJ;
    @Column
    private  double cess;

    public double getCess() {
        if (totalSalary >= 2800000) {
            cess = (0.02 * (totalSalary-2500000));
        }
        return cess;
    }

    public void setCess(double cess) {
        this.cess = cess;
    }

    public int getEmpcode() {
        return Empcode;
    }

    public void setEmpcode(int empcode) {
        Empcode = empcode;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public double getMonthysalary() {
        return monthysalary;
    }

    public void setMonthysalary(double monthysalary) {
        this.monthysalary = monthysalary;
    }




    private LocalDate parseDate(String date){
        DateTimeFormatter FORMATE = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(date,FORMATE);

    }



    public double getTax() {
        if (totalSalary >= 1000000) {
            tax = (0.2 * (totalSalary - 1000000)) + (0.1 * 500000) + (0.05 * 250000);
        } else if (totalSalary >= 500000) {
            tax = 0.1 * (totalSalary - 500000) + (0.05 * 250000);
        } else if (totalSalary >= 250000) {
            tax = 0.05 * (totalSalary - 250000);
        }
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
}

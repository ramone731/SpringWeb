package com.example.demo.model;


//jpa entities and annotations
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="EmpBoot")
public class Employee {
    @Id
    @Column(name="Employeeid")
    private int empid;

    //Employee: getters and setters
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getEmpname() {
        return empname;
    }
    public void setEmpname(String empname) {
        this.empname = empname;
    }

    //Salary: getter and setters
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Column(name="Employeename")
    private String empname;
    @Column(name="Salary")
    private double salary;

}

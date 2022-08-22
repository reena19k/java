package com.aurionpro.model;
import java.lang.*;
import java.util.*;
public class Employee implements Comparable<Employee> {
    int empId;
    String empName;
    double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Employee e1) {
        if(this.getEmpId()> e1.getEmpId())
            return 1;
        else
            return-1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

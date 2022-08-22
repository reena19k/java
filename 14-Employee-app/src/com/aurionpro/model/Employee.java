package com.aurionpro.model;

public abstract class Employee {
    int empID;
    String empName;
    double basicSalary;

    public Employee(int empID, String empName, double basicSalary) {
        super();
        this.empID = empID;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public abstract double calculateAnnualCTC();

    public abstract void printSalarySlip(Employee emp);
}
    






package com.aurionpro.model;

public class Manager extends Employee {
    double hra;
    double da;
    double ta;

    public Manager(int empID, String empName, double basicSalary) {
        super(empID, empName, basicSalary);
        this.hra = basicSalary*0.3;
        this.da = basicSalary*0.2;
        this.ta = basicSalary*0.1;
    }

    public double getHra() {
        return hra;
    }

    public double getDa() {
        return da;
    }

    public double getTa() {
        return ta;
    }

    @Override
    public double calculateAnnualCTC() {
        return (basicSalary +hra +da+ta)*12;
    }

    @Override
    public void printSalarySlip(Employee emp) {
        System.out.println("Employee Id is : " + emp.getEmpID());
        System.out.println("Employee Name is : " + emp.getEmpName());
        System.out.println("Basic Salary is : " + emp.getBasicSalary());
        System.out.println("HRA:  " + getHra());
        System.out.println("DA:  " + getDa());
        System.out.println("TA: "+getTa());
        System.out.println("Annual CTC " +calculateAnnualCTC());
       
    }

    }

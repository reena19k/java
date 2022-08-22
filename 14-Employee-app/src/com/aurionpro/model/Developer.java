package com.aurionpro.model;

public class Developer extends Employee {
    public double pa;
    public double oa;

    public Developer(int empID, String empName, double basicSalary) {
        super(empID, empName, basicSalary);
        this.pa = basicSalary*0.3;
        this.oa = basicSalary*0.2;
    }

    public double getPa() {
        return pa;
    }

    public double getOa() {
        return oa;
    }

    @Override
    public double calculateAnnualCTC() {
        return (basicSalary + pa + oa)*12;
    }

    @Override
    public void printSalarySlip(Employee emp) {
        System.out.println("Employee Id is : "+emp.getEmpID());
        System.out.println("Employee Name is : "+emp.getEmpName());
        System.out.println("Basic Salary is : "+emp.getBasicSalary());
        System.out.println("PA:  "+getPa());
        System.out.println("OA:  "+getOa());
        System.out.println("Annual CTC "+calculateAnnualCTC());
        
    }
}

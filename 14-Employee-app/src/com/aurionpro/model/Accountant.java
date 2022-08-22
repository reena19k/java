package com.aurionpro.model;

public class Accountant extends Employee{
    public double perks;

    public Accountant(int empID,String empName, double basicSalary) {
        super(empID, empName, basicSalary);
        this.perks = basicSalary*0.5;
    }

    public double getPerks() {
        return perks;
    }
    public double calculateAnnualCTC(){
        return (basicSalary+perks)*12;
    }

    @Override
    public void printSalarySlip(Employee emp) {
        System.out.println("Employee Id is : "+emp.getEmpID());
        System.out.println("Employee Name is : "+emp.getEmpName());
        System.out.println("Basic Salary is : "+emp.getBasicSalary());
        System.out.println("Perks :"+getPerks());
        System.out.println("Annual CTC "+calculateAnnualCTC());
       
    }
}

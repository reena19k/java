package com.aurionpro.model;

public class Commission implements IpayClassification{
    @Override
    public void calculateSalary() {
        System.out.println("Commission is 5000 here");
    }
}

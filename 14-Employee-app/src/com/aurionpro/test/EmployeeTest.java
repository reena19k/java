package com.aurionpro.test;

import com.aurionpro.model.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Accountant accountant = new Accountant(1011,"sakshi",20000);
        accountant.printSalarySlip(accountant);

        Manager manager = new Manager(2022,"Noopur",46000);
        manager.printSalarySlip(manager);


        Developer developer=new Developer(3411,"Reena",58000);
        developer.printSalarySlip(developer);
    }
   
	
}

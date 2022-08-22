package com.aurionpro.model;

import java.util.Comparator;

public class SortByName implements Comparator<Employee2> {
    public int compare(Employee2 e1,Employee2 e2){		//comparing to string
        return e1.getEmpName().compareTo(e2.getEmpName());		
    }
}

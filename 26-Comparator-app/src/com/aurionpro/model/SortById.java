package com.aurionpro.model;

import java.util.Comparator;

public class SortById implements Comparator<Employee2> {

    public int compare(Employee2 e1,Employee2 e2){
        if(e1.getEmpId()>e2.getEmpId())
            return 1;
        else
            return -1;
    }
}

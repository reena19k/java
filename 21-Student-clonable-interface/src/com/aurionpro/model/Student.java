package com.aurionpro.model;

public class Student implements Cloneable{
    int stdId;
    String stdName;
    char division;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }
}




//Student ram = new student()
//Student shyam = ram				 shallow copy
//deep copy is clonnable,bit wise copy 
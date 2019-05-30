package com.ashish;

import java.util.Date;

public class Faculty extends Person
{
   private String deptName;
    private String designation;
   private int salary;
   private Date joiningDate;

    public Faculty() {
    }

    public Faculty(String deptName, String designation, int salary, Date joiningDate) {
        this.deptName = deptName;
        this.designation = designation;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;

    }


    @Override
    public void display() {

    }
}

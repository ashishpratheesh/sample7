package com.ashish;

import java.util.Date;

public class Student extends Person
{
    private String coursename;
    private float Marks[];
    private float total;
    private float percentage;
    private String result;

    public Student() {
    }

    public Student(String coursename, float[] marks, float total, float percentage, String result) {
        this.coursename = coursename;
        Marks = marks;
        this.total = total;
        this.percentage = percentage;
        this.result = result;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public float[] getMarks() {
        return Marks;
    }

    public void setMarks(float[] marks) {
        Marks = marks;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public void display()
    {
        System.out.println(" Student Details");
        System.out.println("Mobile Application Design And Development"+ getCoursename());
        System.out.println("ID"+getId());
        System.out.println("Full name"+getfullname() );


    }



}


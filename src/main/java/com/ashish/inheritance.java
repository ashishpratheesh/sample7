package com.ashish;

import com.sun.tools.classfile.StackMapTable_attribute;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class inheritance
{

    public static void main(String[] args) throws ParseException
    {


        Student s1 = new Student();

        s1.setCoursename("Mobile Application Development and Design");
        s1.setFirstname("jack");
        s1.setLastname("sparrow");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy hh:mm:ss");
        String dateInString = "24-10-1998 10:30:44";
        Date s1BirthDate = sdf.parse(dateInString);
        s1.setBirthdate(s1BirthDate);
        float marks[] = {90.5f, 88.0f, 90.3f, 98.6f};
        s1.setMarks(marks);
        s1.setEmailID("itsmeejack@gmail.com");



        Faculty f1 = new Faculty();
        f1.setDeptName("computer science ");
        f1.setFirstname("Mark");
        f1.setLastname("louis");
        f1.setDesignation("professor");
        dateInString = "04-12-1988 11:13:44";
        Date joiningdate = sdf.parse(dateInString);
        f1.setJoiningDate(joiningdate);
        f1.setEmailID("itsmemark@gmail.com");
        f1.setSalary(80000);



    }
      

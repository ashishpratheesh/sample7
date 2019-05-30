package com.ashish;

import other.IDisplay;

import java.util.Date;

public  abstract class Person implements IDisplay
{
     private   int id;
     private String  firstname;
    private String lastname;
    private String gender;
    private Date birthdate;
    private String emailID;
    private Computer computer;

    public Person() {
    }

    public Person(int id, String firstname, String lastname, String gender, Date birthdate, String emailID, Computer computer) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.emailID = emailID;
        this.computer = computer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID)
    {
        this.emailID = emailID;

    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public String getfullname()
    {
        return firstname+" "+lastname;
    }
}

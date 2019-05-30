package com.ashish;

import other.IDisplay;

public  class Computer implements IDisplay
{
   private String iD;
   private String companyName;
  private String model;

    public Computer() {
    }

    public Computer(String iD, String companyName, String model) {
        this.iD = iD;
        this.companyName = companyName;
        this.model = model;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void display() {

    }
}

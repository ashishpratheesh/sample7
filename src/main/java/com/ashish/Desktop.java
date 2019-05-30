package com.ashish;

public class Desktop extends Computer
{
    private String keyboardType;
  private String screenType;

    public Desktop(String keyboardType, String screenType) {
        this.keyboardType = keyboardType;
        this.screenType = screenType;
    }

    public Desktop(String iD, String companyName, String model, String keyboardType, String screenType) {
        super(iD, companyName, model);
        this.keyboardType = keyboardType;
        this.screenType = screenType;
    }

    public Desktop()

  {
      System.out.println("computer constructor");
  }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    @Override
    public void display() {

    }
}

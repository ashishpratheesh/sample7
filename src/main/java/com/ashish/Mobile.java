package com.ashish;

public class Mobile extends Computer
{
    private String oSName;
    private boolean canMakeCall;
    private  String providerName;

    public Mobile() {
    }

    public Mobile(String oSName, boolean canMakeCall, String providerName) {
        this.oSName = oSName;
        this.canMakeCall = canMakeCall;
        this.providerName = providerName;
    }

    public Mobile(String iD, String companyName, String model, String oSName, boolean canMakeCall, String providerName) {
        super(iD, companyName, model);
        this.oSName = oSName;
        this.canMakeCall = canMakeCall;
        this.providerName = providerName;
    }

    public String getoSName() {
        return oSName;
    }

    public void setoSName(String oSName) {
        this.oSName = oSName;
    }

    public boolean isCanMakeCall() {
        return canMakeCall;
    }

    public void setCanMakeCall(boolean canMakeCall) {
        this.canMakeCall = canMakeCall;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}

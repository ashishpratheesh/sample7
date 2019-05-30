package com.ashish;

public class Laptop extends Computer
{
   private float screeenSize;
   private  float  weight;

    public Laptop() {
    }

    public Laptop(float screeenSize, float weight) {
        this.screeenSize = screeenSize;
        this.weight = weight;
    }

    public float getScreeenSize() {
        return screeenSize;
    }

    public void setScreeenSize(float screeenSize) {
        this.screeenSize = screeenSize;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
